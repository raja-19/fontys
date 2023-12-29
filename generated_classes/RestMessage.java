
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BodyElement" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementRef" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Headers" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfRestHeader" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ValidationRules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfValidationRuleReference" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BodyAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BodyRelation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DomainSchema" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestMessage", propOrder = {
    "bodyElement",
    "headers",
    "validationRules"
})
@XmlSeeAlso({
    RestRequestMessage.class
})
public class RestMessage {

    @XmlElement(name = "BodyElement")
    protected ElementRef bodyElement;
    @XmlElement(name = "Headers")
    protected ArrayOfRestHeader headers;
    @XmlElement(name = "ValidationRules")
    protected ArrayOfValidationRuleReference validationRules;
    @XmlAttribute(name = "Entity")
    protected String entity;
    @XmlAttribute(name = "BodyAttribute")
    protected String bodyAttribute;
    @XmlAttribute(name = "BodyRelation")
    protected String bodyRelation;
    @XmlAttribute(name = "DomainSchema")
    protected String domainSchema;

    /**
     * Gets the value of the bodyElement property.
     * 
     * @return
     *     possible object is
     *     {@link ElementRef }
     *     
     */
    public ElementRef getBodyElement() {
        return bodyElement;
    }

    /**
     * Sets the value of the bodyElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementRef }
     *     
     */
    public void setBodyElement(ElementRef value) {
        this.bodyElement = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestHeader }
     *     
     */
    public ArrayOfRestHeader getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestHeader }
     *     
     */
    public void setHeaders(ArrayOfRestHeader value) {
        this.headers = value;
    }

    /**
     * Gets the value of the validationRules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationRuleReference }
     *     
     */
    public ArrayOfValidationRuleReference getValidationRules() {
        return validationRules;
    }

    /**
     * Sets the value of the validationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationRuleReference }
     *     
     */
    public void setValidationRules(ArrayOfValidationRuleReference value) {
        this.validationRules = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the bodyAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyAttribute() {
        return bodyAttribute;
    }

    /**
     * Sets the value of the bodyAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyAttribute(String value) {
        this.bodyAttribute = value;
    }

    /**
     * Gets the value of the bodyRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyRelation() {
        return bodyRelation;
    }

    /**
     * Sets the value of the bodyRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyRelation(String value) {
        this.bodyRelation = value;
    }

    /**
     * Gets the value of the domainSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainSchema() {
        return domainSchema;
    }

    /**
     * Sets the value of the domainSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainSchema(String value) {
        this.domainSchema = value;
    }

}
