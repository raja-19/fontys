
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ModuleElementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Asset"/&gt;
 *     &lt;enumeration value="Attribute"/&gt;
 *     &lt;enumeration value="BusinessRule"/&gt;
 *     &lt;enumeration value="Button"/&gt;
 *     &lt;enumeration value="Container"/&gt;
 *     &lt;enumeration value="ContentItem"/&gt;
 *     &lt;enumeration value="DashboardMenu"/&gt;
 *     &lt;enumeration value="DashboardPage"/&gt;
 *     &lt;enumeration value="DataMapping"/&gt;
 *     &lt;enumeration value="DataRule"/&gt;
 *     &lt;enumeration value="DecisionTable"/&gt;
 *     &lt;enumeration value="DecisionTree"/&gt;
 *     &lt;enumeration value="Document"/&gt;
 *     &lt;enumeration value="Entity"/&gt;
 *     &lt;enumeration value="ERDiagram"/&gt;
 *     &lt;enumeration value="ExternalRule"/&gt;
 *     &lt;enumeration value="Flow"/&gt;
 *     &lt;enumeration value="FlowEvent"/&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="Instance"/&gt;
 *     &lt;enumeration value="Page"/&gt;
 *     &lt;enumeration value="Process"/&gt;
 *     &lt;enumeration value="ProcessEvent"/&gt;
 *     &lt;enumeration value="ProcessTask"/&gt;
 *     &lt;enumeration value="Relation"/&gt;
 *     &lt;enumeration value="ReusableExpression"/&gt;
 *     &lt;enumeration value="RuleGroup"/&gt;
 *     &lt;enumeration value="ServiceCall"/&gt;
 *     &lt;enumeration value="SpecificationDocument"/&gt;
 *     &lt;enumeration value="SpecificationImplementation"/&gt;
 *     &lt;enumeration value="TaskMapping"/&gt;
 *     &lt;enumeration value="TextItem"/&gt;
 *     &lt;enumeration value="UnitTest"/&gt;
 *     &lt;enumeration value="ValidationRule"/&gt;
 *     &lt;enumeration value="ValueList"/&gt;
 *     &lt;enumeration value="SoapService"/&gt;
 *     &lt;enumeration value="SchemaSet"/&gt;
 *     &lt;enumeration value="WebService"/&gt;
 *     &lt;enumeration value="RestService"/&gt;
 *     &lt;enumeration value="MessageEvent"/&gt;
 *     &lt;enumeration value="RoutingAlgorithm"/&gt;
 *     &lt;enumeration value="PriorityAlgorithm"/&gt;
 *     &lt;enumeration value="AuthorizationAlgorithm"/&gt;
 *     &lt;enumeration value="DomainSchema"/&gt;
 *     &lt;enumeration value="Aggregate"/&gt;
 *     &lt;enumeration value="FunctionCall"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModuleElementType")
@XmlEnum
public enum ModuleElementType {

    @XmlEnumValue("Asset")
    ASSET("Asset"),
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute"),
    @XmlEnumValue("BusinessRule")
    BUSINESS_RULE("BusinessRule"),
    @XmlEnumValue("Button")
    BUTTON("Button"),
    @XmlEnumValue("Container")
    CONTAINER("Container"),
    @XmlEnumValue("ContentItem")
    CONTENT_ITEM("ContentItem"),
    @XmlEnumValue("DashboardMenu")
    DASHBOARD_MENU("DashboardMenu"),
    @XmlEnumValue("DashboardPage")
    DASHBOARD_PAGE("DashboardPage"),
    @XmlEnumValue("DataMapping")
    DATA_MAPPING("DataMapping"),
    @XmlEnumValue("DataRule")
    DATA_RULE("DataRule"),
    @XmlEnumValue("DecisionTable")
    DECISION_TABLE("DecisionTable"),
    @XmlEnumValue("DecisionTree")
    DECISION_TREE("DecisionTree"),
    @XmlEnumValue("Document")
    DOCUMENT("Document"),
    @XmlEnumValue("Entity")
    ENTITY("Entity"),
    @XmlEnumValue("ERDiagram")
    ER_DIAGRAM("ERDiagram"),
    @XmlEnumValue("ExternalRule")
    EXTERNAL_RULE("ExternalRule"),
    @XmlEnumValue("Flow")
    FLOW("Flow"),
    @XmlEnumValue("FlowEvent")
    FLOW_EVENT("FlowEvent"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Instance")
    INSTANCE("Instance"),
    @XmlEnumValue("Page")
    PAGE("Page"),
    @XmlEnumValue("Process")
    PROCESS("Process"),
    @XmlEnumValue("ProcessEvent")
    PROCESS_EVENT("ProcessEvent"),
    @XmlEnumValue("ProcessTask")
    PROCESS_TASK("ProcessTask"),
    @XmlEnumValue("Relation")
    RELATION("Relation"),
    @XmlEnumValue("ReusableExpression")
    REUSABLE_EXPRESSION("ReusableExpression"),
    @XmlEnumValue("RuleGroup")
    RULE_GROUP("RuleGroup"),
    @XmlEnumValue("ServiceCall")
    SERVICE_CALL("ServiceCall"),
    @XmlEnumValue("SpecificationDocument")
    SPECIFICATION_DOCUMENT("SpecificationDocument"),
    @XmlEnumValue("SpecificationImplementation")
    SPECIFICATION_IMPLEMENTATION("SpecificationImplementation"),
    @XmlEnumValue("TaskMapping")
    TASK_MAPPING("TaskMapping"),
    @XmlEnumValue("TextItem")
    TEXT_ITEM("TextItem"),
    @XmlEnumValue("UnitTest")
    UNIT_TEST("UnitTest"),
    @XmlEnumValue("ValidationRule")
    VALIDATION_RULE("ValidationRule"),
    @XmlEnumValue("ValueList")
    VALUE_LIST("ValueList"),
    @XmlEnumValue("SoapService")
    SOAP_SERVICE("SoapService"),
    @XmlEnumValue("SchemaSet")
    SCHEMA_SET("SchemaSet"),
    @XmlEnumValue("WebService")
    WEB_SERVICE("WebService"),
    @XmlEnumValue("RestService")
    REST_SERVICE("RestService"),
    @XmlEnumValue("MessageEvent")
    MESSAGE_EVENT("MessageEvent"),
    @XmlEnumValue("RoutingAlgorithm")
    ROUTING_ALGORITHM("RoutingAlgorithm"),
    @XmlEnumValue("PriorityAlgorithm")
    PRIORITY_ALGORITHM("PriorityAlgorithm"),
    @XmlEnumValue("AuthorizationAlgorithm")
    AUTHORIZATION_ALGORITHM("AuthorizationAlgorithm"),
    @XmlEnumValue("DomainSchema")
    DOMAIN_SCHEMA("DomainSchema"),
    @XmlEnumValue("Aggregate")
    AGGREGATE("Aggregate"),
    @XmlEnumValue("FunctionCall")
    FUNCTION_CALL("FunctionCall");
    private final String value;

    ModuleElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModuleElementType fromValue(String v) {
        for (ModuleElementType c: ModuleElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
