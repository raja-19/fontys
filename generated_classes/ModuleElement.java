
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Element"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleElement")
@XmlSeeAlso({
    Container.class,
    SoapService.class,
    WebService.class,
    RestService.class,
    SchemaSet.class,
    FunctionCall.class,
    ServiceCall.class,
    TextItem.class,
    ContentItem.class,
    Document.class,
    DomainSchema.class,
    Image.class,
    Attribute.class,
    Entity.class,
    Relation.class,
    Aggregate.class,
    StaticInstance.class,
    ERDiagram.class,
    ValidationRule.class,
    ValueList.class,
    Flow.class,
    FlowEvent.class,
    Process.class,
    ProcessTask.class,
    ProcessEvent.class,
    RoutingAlgorithm.class,
    PriorityAlgorithm.class,
    AuthorizationAlgorithm.class,
    MessageEvent.class,
    Asset.class,
    Button.class,
    Page.class,
    BusinessRule.class,
    DataRule.class,
    DecisionTable.class,
    DecisionTree.class,
    ReusableExpression.class,
    ExternalRule.class,
    RuleGroup.class,
    DataMapping.class,
    TaskMapping.class,
    UnitTest.class,
    SpecificationDocument.class,
    SpecificationImplementation.class,
    DashboardPage.class,
    DashboardMenu.class
})
public abstract class ModuleElement
    extends Element
{


}
