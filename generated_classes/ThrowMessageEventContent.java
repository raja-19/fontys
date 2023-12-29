
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThrowMessageEventContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThrowMessageEventContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CaseIdsTargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CaseIdsTargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="SpecificCaseIds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Values" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfThrowMessageEventValue" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThrowMessageEventContent", propOrder = {
    "messageEvent",
    "caseIdsTargetEntity",
    "caseIdsTargetAttribute",
    "specificCaseIds",
    "values"
})
public class ThrowMessageEventContent
    extends ServiceCallContent
{

    @XmlElement(name = "MessageEvent")
    protected String messageEvent;
    @XmlElement(name = "CaseIdsTargetEntity")
    protected String caseIdsTargetEntity;
    @XmlElement(name = "CaseIdsTargetAttribute")
    protected String caseIdsTargetAttribute;
    @XmlElement(name = "SpecificCaseIds")
    protected Expression specificCaseIds;
    @XmlElement(name = "Values")
    protected ArrayOfThrowMessageEventValue values;

    /**
     * Gets the value of the messageEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageEvent() {
        return messageEvent;
    }

    /**
     * Sets the value of the messageEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageEvent(String value) {
        this.messageEvent = value;
    }

    /**
     * Gets the value of the caseIdsTargetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseIdsTargetEntity() {
        return caseIdsTargetEntity;
    }

    /**
     * Sets the value of the caseIdsTargetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseIdsTargetEntity(String value) {
        this.caseIdsTargetEntity = value;
    }

    /**
     * Gets the value of the caseIdsTargetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseIdsTargetAttribute() {
        return caseIdsTargetAttribute;
    }

    /**
     * Sets the value of the caseIdsTargetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseIdsTargetAttribute(String value) {
        this.caseIdsTargetAttribute = value;
    }

    /**
     * Gets the value of the specificCaseIds property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getSpecificCaseIds() {
        return specificCaseIds;
    }

    /**
     * Sets the value of the specificCaseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setSpecificCaseIds(Expression value) {
        this.specificCaseIds = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfThrowMessageEventValue }
     *     
     */
    public ArrayOfThrowMessageEventValue getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfThrowMessageEventValue }
     *     
     */
    public void setValues(ArrayOfThrowMessageEventValue value) {
        this.values = value;
    }

}
