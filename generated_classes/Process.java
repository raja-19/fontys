
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Process complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Process"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMultiLingualText" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Roles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString1" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Nodes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProcessNode" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Groups" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessGroup" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Layout" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessLayout" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PersistencyName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProcessType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Process", propOrder = {
    "displayName",
    "roles",
    "nodes",
    "groups",
    "layout"
})
public class Process
    extends ModuleElement
{

    @XmlElement(name = "DisplayName")
    protected ArrayOfMultiLingualText displayName;
    @XmlElement(name = "Roles")
    protected ArrayOfString1 roles;
    @XmlElement(name = "Nodes")
    protected ArrayOfProcessNode nodes;
    @XmlElement(name = "Groups")
    protected List<ProcessGroup> groups;
    @XmlElement(name = "Layout")
    protected ProcessLayout layout;
    @XmlAttribute(name = "PersistencyName")
    protected String persistencyName;
    @XmlAttribute(name = "ProcessType")
    protected String processType;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public ArrayOfMultiLingualText getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public void setDisplayName(ArrayOfMultiLingualText value) {
        this.displayName = value;
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
     *     {@link ArrayOfProcessNode }
     *     
     */
    public ArrayOfProcessNode getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessNode }
     *     
     */
    public void setNodes(ArrayOfProcessNode value) {
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
     * {@link ProcessGroup }
     * 
     * 
     */
    public List<ProcessGroup> getGroups() {
        if (groups == null) {
            groups = new ArrayList<ProcessGroup>();
        }
        return this.groups;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessLayout }
     *     
     */
    public ProcessLayout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessLayout }
     *     
     */
    public void setLayout(ProcessLayout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the persistencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistencyName() {
        return persistencyName;
    }

    /**
     * Sets the value of the persistencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistencyName(String value) {
        this.persistencyName = value;
    }

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessType(String value) {
        this.processType = value;
    }

}
