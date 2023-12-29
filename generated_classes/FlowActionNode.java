
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowActionNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowActionNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RepeatExpression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SortableRepeatExpression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Edges" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfFlowActionEdge" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActionType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ActionNodeType" /&gt;
 *       &lt;attribute name="Page" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Flow" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Service" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Function" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowActionNode", propOrder = {
    "repeatExpression",
    "edges"
})
public class FlowActionNode
    extends FlowNode
{

    @XmlElement(name = "RepeatExpression")
    protected SortableRepeatExpression repeatExpression;
    @XmlElement(name = "Edges")
    protected ArrayOfFlowActionEdge edges;
    @XmlAttribute(name = "ActionType", required = true)
    protected ActionNodeType actionType;
    @XmlAttribute(name = "Page")
    protected String page;
    @XmlAttribute(name = "Flow")
    protected String flow;
    @XmlAttribute(name = "Service")
    protected String service;
    @XmlAttribute(name = "Function")
    protected String function;

    /**
     * Gets the value of the repeatExpression property.
     * 
     * @return
     *     possible object is
     *     {@link SortableRepeatExpression }
     *     
     */
    public SortableRepeatExpression getRepeatExpression() {
        return repeatExpression;
    }

    /**
     * Sets the value of the repeatExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortableRepeatExpression }
     *     
     */
    public void setRepeatExpression(SortableRepeatExpression value) {
        this.repeatExpression = value;
    }

    /**
     * Gets the value of the edges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlowActionEdge }
     *     
     */
    public ArrayOfFlowActionEdge getEdges() {
        return edges;
    }

    /**
     * Sets the value of the edges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlowActionEdge }
     *     
     */
    public void setEdges(ArrayOfFlowActionEdge value) {
        this.edges = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ActionNodeType }
     *     
     */
    public ActionNodeType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionNodeType }
     *     
     */
    public void setActionType(ActionNodeType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the flow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlow() {
        return flow;
    }

    /**
     * Sets the value of the flow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlow(String value) {
        this.flow = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

}
