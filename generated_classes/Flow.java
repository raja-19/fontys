
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Channels" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString6" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Roles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString1" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Nodes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfFlowNode" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Groups" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowGroup" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Layout" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowLayout" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="FunctionDefinition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FunctionFlowDefinition" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ExternalFlowDefinition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ExternalFlow" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DcmWidgetDefinition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDcmWidgetFlowParameter" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FlowType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Exposed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Transactional" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", propOrder = {
    "channels",
    "roles",
    "nodes",
    "groups",
    "layout",
    "functionDefinition",
    "externalFlowDefinition",
    "dcmWidgetDefinition"
})
public class Flow
    extends ModuleElement
{

    @XmlElement(name = "Channels")
    protected ArrayOfString6 channels;
    @XmlElement(name = "Roles")
    protected ArrayOfString1 roles;
    @XmlElement(name = "Nodes")
    protected ArrayOfFlowNode nodes;
    @XmlElement(name = "Groups")
    protected List<FlowGroup> groups;
    @XmlElement(name = "Layout")
    protected FlowLayout layout;
    @XmlElement(name = "FunctionDefinition")
    protected FunctionFlowDefinition functionDefinition;
    @XmlElement(name = "ExternalFlowDefinition")
    protected ExternalFlow externalFlowDefinition;
    @XmlElement(name = "DcmWidgetDefinition")
    protected ArrayOfDcmWidgetFlowParameter dcmWidgetDefinition;
    @XmlAttribute(name = "FlowType")
    protected String flowType;
    @XmlAttribute(name = "Exposed", required = true)
    protected boolean exposed;
    @XmlAttribute(name = "Transactional", required = true)
    protected boolean transactional;

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString6 }
     *     
     */
    public ArrayOfString6 getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString6 }
     *     
     */
    public void setChannels(ArrayOfString6 value) {
        this.channels = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setRoles(ArrayOfString1 value) {
        this.roles = value;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlowNode }
     *     
     */
    public ArrayOfFlowNode getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlowNode }
     *     
     */
    public void setNodes(ArrayOfFlowNode value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowGroup }
     * 
     * 
     */
    public List<FlowGroup> getGroups() {
        if (groups == null) {
            groups = new ArrayList<FlowGroup>();
        }
        return this.groups;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link FlowLayout }
     *     
     */
    public FlowLayout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowLayout }
     *     
     */
    public void setLayout(FlowLayout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the functionDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionFlowDefinition }
     *     
     */
    public FunctionFlowDefinition getFunctionDefinition() {
        return functionDefinition;
    }

    /**
     * Sets the value of the functionDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionFlowDefinition }
     *     
     */
    public void setFunctionDefinition(FunctionFlowDefinition value) {
        this.functionDefinition = value;
    }

    /**
     * Gets the value of the externalFlowDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalFlow }
     *     
     */
    public ExternalFlow getExternalFlowDefinition() {
        return externalFlowDefinition;
    }

    /**
     * Sets the value of the externalFlowDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalFlow }
     *     
     */
    public void setExternalFlowDefinition(ExternalFlow value) {
        this.externalFlowDefinition = value;
    }

    /**
     * Gets the value of the dcmWidgetDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDcmWidgetFlowParameter }
     *     
     */
    public ArrayOfDcmWidgetFlowParameter getDcmWidgetDefinition() {
        return dcmWidgetDefinition;
    }

    /**
     * Sets the value of the dcmWidgetDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDcmWidgetFlowParameter }
     *     
     */
    public void setDcmWidgetDefinition(ArrayOfDcmWidgetFlowParameter value) {
        this.dcmWidgetDefinition = value;
    }

    /**
     * Gets the value of the flowType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowType() {
        return flowType;
    }

    /**
     * Sets the value of the flowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowType(String value) {
        this.flowType = value;
    }

    /**
     * Gets the value of the exposed property.
     * 
     */
    public boolean isExposed() {
        return exposed;
    }

    /**
     * Sets the value of the exposed property.
     * 
     */
    public void setExposed(boolean value) {
        this.exposed = value;
    }

    /**
     * Gets the value of the transactional property.
     * 
     */
    public boolean isTransactional() {
        return transactional;
    }

    /**
     * Sets the value of the transactional property.
     * 
     */
    public void setTransactional(boolean value) {
        this.transactional = value;
    }

}
