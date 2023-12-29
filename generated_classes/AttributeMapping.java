
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttributeReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}QualifiedName" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ValidationRules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfValidationRuleReference" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DataType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DataType" /&gt;
 *       &lt;attribute name="LineNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Form" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SchemaForm" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeMapping", propOrder = {
    "attributeReference",
    "validationRules"
})
public class AttributeMapping {

    @XmlElement(name = "AttributeReference")
    protected QualifiedName attributeReference;
    @XmlElement(name = "ValidationRules")
    protected ArrayOfValidationRuleReference validationRules;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Attribute")
    protected String attribute;
    @XmlAttribute(name = "DataType", required = true)
    protected DataType dataType;
    @XmlAttribute(name = "LineNumber", required = true)
    protected int lineNumber;
    @XmlAttribute(name = "Form")
    protected SchemaForm form;

    /**
     * Gets the value of the attributeReference property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedName }
     *     
     */
    public QualifiedName getAttributeReference() {
        return attributeReference;
    }

    /**
     * Sets the value of the attributeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedName }
     *     
     */
    public void setAttributeReference(QualifiedName value) {
        this.attributeReference = value;
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

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaForm }
     *     
     */
    public SchemaForm getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaForm }
     *     
     */
    public void setForm(SchemaForm value) {
        this.form = value;
    }

}
