package com.cet.cet;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List; 
import java.util.ArrayList; 
import java.util.Map; 
import java.util.HashMap; 
import java.util.Set; 
import java.util.HashSet;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

import org.json.JSONObject;
import org.json.JSONArray;
import org.javatuples.Pair;

import com.cet.managementservice.*;

@RestController
public class CetController {
    @Autowired ManagementServiceClient client;

    @PostMapping("/getQuestionText")
    @CrossOrigin(origins = "http://localhost:8000")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody String getQuestionText(@RequestBody String raw) {
        JSONObject json = new JSONObject(raw);

        String repository = json.getString("repository");
        String branch = foundCET(repository) ? "CET" : json.getString("branch");
        String project = json.getString("project");

        ModuleKey module = new ModuleKey();
        module.setName(json.getString("module"));
        module.setModuleType(ModuleType.fromValue("Interaction"));

        if (foundCET(repository)) {
            branch = "CET";
        }
        AttributeKey key = getAttributeKeyFromV2Name(repository, branch, project, module, json.getString("name"));
        Attribute attribute = (Attribute) client.getModuleElement(repository, branch, project, module, key);

        JSONObject response = new JSONObject();
        Map<String, String> questionText = getQuestionText(attribute);
        response.put("nl", questionText.get("Nederlands"));
        response.put("en", questionText.get("English"));

        return response.toString();
    } 

    
    @PostMapping("/requestChanges")
    @CrossOrigin(origins = "http://localhost:8000")
    @ResponseStatus(HttpStatus.OK)
    public void requestChanges(@RequestBody String raw) {
        JSONObject json = new JSONObject(raw);

        String repository = json.getString("repository");
        String branch = json.getString("branch");
        String project = json.getString("project");

        ModuleKey module = new ModuleKey();
        module.setName(json.getString("module"));
        module.setModuleType(ModuleType.fromValue("Interaction"));

        JSONObject request = json.getJSONObject("request");
        AttributeKey key = getAttributeKeyFromV2Name(repository, branch, project, module, request.getString("name"));

        Attribute attribute = (Attribute)client.getModuleElement(repository, branch, project, module, key);
        JSONObject questionText = request.getJSONObject("questionText");
        setQuestionText(attribute, questionText.getString("nl"), questionText.getString("en"));

        OperationSet operationSet = createOperationSet(project, module, key, attribute);

        if (!foundCET(repository)) {
            Branch cet = new Branch();
            cet.setName("CET");
            client.createFeatureBranch(repository, branch, cet);
        }

        client.applyOperations(repository, "CET", operationSet);

        BranchStatus status = client.getStatus(repository, "CET");
        if (status.isCommitable()) {
            String message = "CET: "+ request.getString("message");
            client.commit(repository, "CET", message);
        }
    }

    private boolean foundCET(String repository) {
        List<String> branches = client.getBranches(repository);
        return branches.contains("CET");
    }

    private OperationSet createOperationSet(String project, ModuleKey module, ModuleElementKey key, ModuleElement element) {
        OperationSet res = new OperationSet();
        ModuleElementOperation operation = new ModuleElementOperation();

        operation.setProject(project);
        operation.setModule(module);
        operation.setOriginalKey(key);
        operation.setModuleElement(element);
        operation.setType(ChangeType.fromValue("Update"));

        OperationEntry operationEntry = new OperationEntry();
        operationEntry.setModuleElementOperation(operation);

        ArrayOfOperationEntry operations = new ArrayOfOperationEntry();
        operations.getOperationEntry().add(operationEntry);

        res.setOperations(operations);
        return res;
    }

    private AttributeKey getAttributeKeyFromV2Name(String repository, String branch, String project, ModuleKey module, String name) {
        Map<String, Set<String>> entityToAttributes = createEntityToAttributesMap(repository, branch, project, module);
        Map<String, ModuleElementKey> entityNameToKey = createEntityNameToKeyMap(repository, branch, project, module);

        String[] split = name.split("\\.", 2);
        String entityName = split[0];
        String attributeName = split[1];

        while (!entityToAttributes.get(entityName).contains(attributeName)) {
            ModuleElementKey key = entityNameToKey.get(entityName);
            Entity entity = (Entity)client.getModuleElement(repository, branch, project, module, key); 
            entityName = entity.getBaseEntity();
        }

        List<ModuleElementKey> keys = client.getModuleElements(repository, branch, project, module, ModuleElementType.fromValue("Attribute"));
        for (ModuleElementKey elementKey: keys) {
            AttributeKey key = (AttributeKey)elementKey;
            if (entityName.equals(key.getEntity()) && attributeName.equals(key.getName())) {
                return key;
            }
        }

        throw new RuntimeException();
    }

    private Map<String, ModuleElementKey> createEntityNameToKeyMap(String repository, String branch, String project, ModuleKey module) {
        Map<String, ModuleElementKey> res = new HashMap<String, ModuleElementKey>();
        List<ModuleElementKey> keys = client.getModuleElements(repository, branch, project, module, ModuleElementType.fromValue("Entity"));

        for (ModuleElementKey key: keys) {
            res.put(key.getName(), key);
        }
        return res;
    }

    private Map<String, Set<String>> createEntityToAttributesMap(String repository, String branch, String project, ModuleKey module) {
        List<ModuleElementKey> keys = client.getModuleElements(repository, branch, project, module, ModuleElementType.fromValue("Attribute"));
        HashMap<String, Set<String>> res = new HashMap<String, Set<String>>();

        for (ModuleElementKey key: keys) {
            String attribute = ((AttributeKey)key).getName();
            String entity = ((AttributeKey)key).getEntity();

            if (!res.containsKey(entity)) {
                res.put(entity, new HashSet<String>());
            }
            res.get(entity).add(attribute);
        }
        return res;
    }

    private Map<String, String> createEntityBaseMap(List<Entity> entities) {
        HashMap<String, String> res = new HashMap<String, String>();

        for (Entity entity: entities) {
            res.put(entity.getName(), entity.getBaseEntity());
        }
        return res;
    }

    private void setQuestionText(Attribute attribute, String nlText, String enText) {
        List<MultiLingualText> mlt = attribute.getQuestionText().getText();

        MultiLingualText nl = new MultiLingualText();
        nl.setLanguage("Nederlands");
        nl.setValue(nlText);

        MultiLingualText en = new MultiLingualText();
        en.setLanguage("English");
        en.setValue(enText);

        mlt.add(nl);
        mlt.add(en);
    }

    private Map<String, String> getQuestionText(Attribute attribute) {
        HashMap<String, String> res = new HashMap<String, String>();
        res.put("Nederlands", "");
        res.put("English", "");

        for (MultiLingualText mlt: attribute.getQuestionText().getText()) {
            res.put(mlt.getLanguage(), mlt.getValue());
        }
        return res;
    }
}
