
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutomaticConfiguration" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}AutomaticConfiguration" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMultiLingualText" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Roles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString1" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="EventKeys" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProcessEventKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DueDate" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CustomFields" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProcessTaskCustomField" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReevaluationEvent" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ReevaluationEvent" /&gt;
 *       &lt;attribute name="CaseLock" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AuthorizationAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoutingAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PriorityAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessTask", propOrder = {
    "automaticConfiguration",
    "displayName",
    "roles",
    "eventKeys",
    "dueDate",
    "customFields"
})
public class ProcessTask
    extends ModuleElement
{

    @XmlElement(name = "AutomaticConfiguration")
    protected AutomaticConfiguration automaticConfiguration;
    @XmlElement(name = "DisplayName")
    protected ArrayOfMultiLingualText displayName;
    @XmlElement(name = "Roles")
    protected ArrayOfString1 roles;
    @XmlElement(name = "EventKeys")
    protected ArrayOfProcessEventKey eventKeys;
    @XmlElement(name = "DueDate")
    protected Expression dueDate;
    @XmlElement(name = "CustomFields")
    protected ArrayOfProcessTaskCustomField customFields;
    @XmlAttribute(name = "ReevaluationEvent", required = true)
    protected ReevaluationEvent reevaluationEvent;
    @XmlAttribute(name = "CaseLock", required = true)
    protected boolean caseLock;
    @XmlAttribute(name = "AuthorizationAlgorithm")
    protected String authorizationAlgorithm;
    @XmlAttribute(name = "RoutingAlgorithm")
    protected String routingAlgorithm;
    @XmlAttribute(name = "PriorityAlgorithm")
    protected String priorityAlgorithm;

    /**
     * Gets the value of the automaticConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticConfiguration }
     *     
     */
    public AutomaticConfiguration getAutomaticConfiguration() {
        return automaticConfiguration;
    }

    /**
     * Sets the value of the automaticConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticConfiguration }
     *     
     */
    public void setAutomaticConfiguration(AutomaticConfiguration value) {
        this.automaticConfiguration = value;
    }

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
     * Gets the value of the eventKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessEventKey }
     *     
     */
    public ArrayOfProcessEventKey getEventKeys() {
        return eventKeys;
    }

    /**
     * Sets the value of the eventKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessEventKey }
     *     
     */
    public void setEventKeys(ArrayOfProcessEventKey value) {
        this.eventKeys = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setDueDate(Expression value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessTaskCustomField }
     *     
     */
    public ArrayOfProcessTaskCustomField getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessTaskCustomField }
     *     
     */
    public void setCustomFields(ArrayOfProcessTaskCustomField value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the reevaluationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ReevaluationEvent }
     *     
     */
    public ReevaluationEvent getReevaluationEvent() {
        return reevaluationEvent;
    }

    /**
     * Sets the value of the reevaluationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReevaluationEvent }
     *     
     */
    public void setReevaluationEvent(ReevaluationEvent value) {
        this.reevaluationEvent = value;
    }

    /**
     * Gets the value of the caseLock property.
     * 
     */
    public boolean isCaseLock() {
        return caseLock;
    }

    /**
     * Sets the value of the caseLock property.
     * 
     */
    public void setCaseLock(boolean value) {
        this.caseLock = value;
    }

    /**
     * Gets the value of the authorizationAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationAlgorithm() {
        return authorizationAlgorithm;
    }

    /**
     * Sets the value of the authorizationAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationAlgorithm(String value) {
        this.authorizationAlgorithm = value;
    }

    /**
     * Gets the value of the routingAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingAlgorithm() {
        return routingAlgorithm;
    }

    /**
     * Sets the value of the routingAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingAlgorithm(String value) {
        this.routingAlgorithm = value;
    }

    /**
     * Gets the value of the priorityAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityAlgorithm() {
        return priorityAlgorithm;
    }

    /**
     * Sets the value of the priorityAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityAlgorithm(String value) {
        this.priorityAlgorithm = value;
    }

}
