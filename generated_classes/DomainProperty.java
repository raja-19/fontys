
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="RelationObject" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DomainObject" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ValidationRules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfValidationRuleReference" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CustomSchemaElementReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementRef" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Required" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MultiValued" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DataType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DataType" /&gt;
 *       &lt;attribute name="Primitive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DomainSchema" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsDomainSchema" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsCustomSchemaElement" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainProperty", propOrder = {
    "documentation",
    "relationObject",
    "validationRules",
    "customSchemaElementReference"
})
public class DomainProperty {

    @XmlElement(name = "Documentation")
    protected String documentation;
    @XmlElement(name = "RelationObject")
    protected DomainObject relationObject;
    @XmlElement(name = "ValidationRules")
    protected ArrayOfValidationRuleReference validationRules;
    @XmlElement(name = "CustomSchemaElementReference")
    protected ElementRef customSchemaElementReference;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ItemName")
    protected String itemName;
    @XmlAttribute(name = "Required", required = true)
    protected boolean required;
    @XmlAttribute(name = "MultiValued", required = true)
    protected boolean multiValued;
    @XmlAttribute(name = "DataType", required = true)
    protected DataType dataType;
    @XmlAttribute(name = "Primitive", required = true)
    protected boolean primitive;
    @XmlAttribute(name = "Attribute")
    protected String attribute;
    @XmlAttribute(name = "Relation")
    protected String relation;
    @XmlAttribute(name = "DomainSchema")
    protected String domainSchema;
    @XmlAttribute(name = "IsDomainSchema", required = true)
    protected boolean isDomainSchema;
    @XmlAttribute(name = "IsCustomSchemaElement", required = true)
    protected boolean isCustomSchemaElement;

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the relationObject property.
     * 
     * @return
     *     possible object is
     *     {@link DomainObject }
     *     
     */
    public DomainObject getRelationObject() {
        return relationObject;
    }

    /**
     * Sets the value of the relationObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainObject }
     *     
     */
    public void setRelationObject(DomainObject value) {
        this.relationObject = value;
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
     * Gets the value of the customSchemaElementReference property.
     * 
     * @return
     *     possible object is
     *     {@link ElementRef }
     *     
     */
    public ElementRef getCustomSchemaElementReference() {
        return customSchemaElementReference;
    }

    /**
     * Sets the value of the customSchemaElementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementRef }
     *     
     */
    public void setCustomSchemaElementReference(ElementRef value) {
        this.customSchemaElementReference = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the multiValued property.
     * 
     */
    public boolean isMultiValued() {
        return multiValued;
    }

    /**
     * Sets the value of the multiValued property.
     * 
     */
    public void setMultiValued(boolean value) {
        this.multiValued = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the primitive property.
     * 
     */
    public boolean isPrimitive() {
        return primitive;
    }

    /**
     * Sets the value of the primitive property.
     * 
     */
    public void setPrimitive(boolean value) {
        this.primitive = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
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

    /**
     * Gets the value of the isDomainSchema property.
     * 
     */
    public boolean isIsDomainSchema() {
        return isDomainSchema;
    }

    /**
     * Sets the value of the isDomainSchema property.
     * 
     */
    public void setIsDomainSchema(boolean value) {
        this.isDomainSchema = value;
    }

    /**
     * Gets the value of the isCustomSchemaElement property.
     * 
     */
    public boolean isIsCustomSchemaElement() {
        return isCustomSchemaElement;
    }

    /**
     * Sets the value of the isCustomSchemaElement property.
     * 
     */
    public void setIsCustomSchemaElement(boolean value) {
        this.isCustomSchemaElement = value;
    }

}
