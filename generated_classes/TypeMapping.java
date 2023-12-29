
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}QualifiedName" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Type" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}TypeMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="RootGroup" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GroupParticleMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Attributes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfAttributeMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ValidationRules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfValidationRuleReference" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContentAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContentType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DataType" /&gt;
 *       &lt;attribute name="LineNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeMapping", propOrder = {
    "baseType",
    "type",
    "rootGroup",
    "attributes",
    "validationRules"
})
public class TypeMapping {

    @XmlElement(name = "BaseType")
    protected QualifiedName baseType;
    @XmlElement(name = "Type")
    protected TypeMapping type;
    @XmlElement(name = "RootGroup")
    protected GroupParticleMapping rootGroup;
    @XmlElement(name = "Attributes")
    protected ArrayOfAttributeMapping attributes;
    @XmlElement(name = "ValidationRules")
    protected ArrayOfValidationRuleReference validationRules;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Entity")
    protected String entity;
    @XmlAttribute(name = "ContentAttribute")
    protected String contentAttribute;
    @XmlAttribute(name = "ContentType")
    protected DataType contentType;
    @XmlAttribute(name = "LineNumber", required = true)
    protected int lineNumber;

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedName }
     *     
     */
    public QualifiedName getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedName }
     *     
     */
    public void setBaseType(QualifiedName value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMapping }
     *     
     */
    public TypeMapping getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMapping }
     *     
     */
    public void setType(TypeMapping value) {
        this.type = value;
    }

    /**
     * Gets the value of the rootGroup property.
     * 
     * @return
     *     possible object is
     *     {@link GroupParticleMapping }
     *     
     */
    public GroupParticleMapping getRootGroup() {
        return rootGroup;
    }

    /**
     * Sets the value of the rootGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupParticleMapping }
     *     
     */
    public void setRootGroup(GroupParticleMapping value) {
        this.rootGroup = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributeMapping }
     *     
     */
    public ArrayOfAttributeMapping getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributeMapping }
     *     
     */
    public void setAttributes(ArrayOfAttributeMapping value) {
        this.attributes = value;
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
     * Gets the value of the contentAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentAttribute() {
        return contentAttribute;
    }

    /**
     * Sets the value of the contentAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentAttribute(String value) {
        this.contentAttribute = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setContentType(DataType value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

}
