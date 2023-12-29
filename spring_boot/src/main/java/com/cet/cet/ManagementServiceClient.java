package com.cet.cet;

import java.lang.RuntimeException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.util.List;
import java.util.ArrayList;

import com.cet.managementservice.*;

public class ManagementServiceClient extends WebServiceGatewaySupport {
    private String endpoint = "https://meet-encore.blueriq.com/Studio/Server/Services/ManagementService"; 

    public List<ModuleKey> getModules(String repository, String branch, String project) {
        GetModules request = new GetModules();
        request.setRepository(repository);
        request.setBranch(branch);
        request.setProject(project);

        GetModulesResponse response = (GetModulesResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request, new SoapActionCallback("GetModules"));
        return response.getGetModulesResult().getModuleKey();
    }

    public ModuleElement getModuleElement(String repository, String branch, String project, ModuleKey module, ModuleElementKey element) {
        GetModuleElement request = new GetModuleElement();
        request.setRepository(repository);
        request.setBranch(branch);
        request.setProject(project);
        request.setModule(module);
        request.setModuleElement(element);

        GetModuleElementResponse response = (GetModuleElementResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request, new SoapActionCallback("GetModuleElement"));
        return response.getGetModuleElementResult();
    }

    public List<ModuleElementKey> getModuleElements(String repository, String branch, String project, ModuleKey module, ModuleElementType type) {
        GetModuleElements request = new GetModuleElements();
        request.setRepository(repository);
        request.setBranch(branch);
        request.setProject(project);
        request.setModule(module);
        request.setElementType(type);

        GetModuleElementsResponse response = (GetModuleElementsResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request, new SoapActionCallback("GetModuleElements"));
        return response.getGetModuleElementsResult().getModuleElementKey();
    }

    public void applyOperations(String repository, String branch, OperationSet operationSet) {
        ApplyOperations request = new ApplyOperations();
        request.setRepository(repository);
        request.setBranch(branch);
        request.setOperations(operationSet);

        getWebServiceTemplate().marshalSendAndReceive(endpoint, request, new SoapActionCallback("ApplyOperations"));
    }

    public void commit(String repository, String branch, String message) {
        Commit request = new Commit();
        request.setRepository(repository);
        request.setBranch(branch);
        request.setCommitMessage(message);

        getWebServiceTemplate().marshalSendAndReceive(endpoint, request, new SoapActionCallback("Commit"));
    } 

    public void createFeatureBranch(String repository, String basedOnBranch, Branch branch) {
        CreateFeatureBranch request = new CreateFeatureBranch();
        request.setRepository(repository);
        request.setBasedOnBranch(basedOnBranch);
        request.setBranch(branch);

        getWebServiceTemplate().marshalSendAndReceive(endpoint, request, new SoapActionCallback("CreateFeatureBranch"));
    }

    public List<String> getBranches(String repository) {
        GetBranches request = new GetBranches();
        request.setRepository(repository);

        GetBranchesResponse response = (GetBranchesResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request, new SoapActionCallback("GetBranches"));
        return response.getGetBranchesResult().getString();
    }

    public BranchStatus getStatus(String repository, String branch) {
        GetStatus request=  new GetStatus();
        request.setRepository(repository);
        request.setBranch(branch);

        GetStatusResponse response = (GetStatusResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request, new SoapActionCallback("GetStatus"));
        return response.getGetStatusResult();
    }
}

