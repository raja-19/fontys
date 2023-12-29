
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InlineFieldReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InlineFieldReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FormatContainment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadOnly" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="PrimitiveParameterValues" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfGlobalParameterValue" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="TextParameterValues" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfGlobalParameterValue1" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FieldType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DisplayLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Refresh" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InlineFieldReference", propOrder = {
    "readOnly",
    "required",
    "primitiveParameterValues",
    "textParameterValues"
})
public class InlineFieldReference
    extends FormatContainment
{

    @XmlElement(name = "ReadOnly")
    protected Expression readOnly;
    @XmlElement(name = "Required")
    protected Expression required;
    @XmlElement(name = "PrimitiveParameterValues")
    protected ArrayOfGlobalParameterValue primitiveParameterValues;
    @XmlElement(name = "TextParameterValues")
    protected ArrayOfGlobalParameterValue1 textParameterValues;
    @XmlAttribute(name = "FieldName")
    protected String fieldName;
    @XmlAttribute(name = "FieldType")
    protected String fieldType;
    @XmlAttribute(name = "Entity")
    protected String entity;
    @XmlAttribute(name = "Attribute")
    protected String attribute;
    @XmlAttribute(name = "DisplayLength")
    protected Integer displayLength;
    @XmlAttribute(name = "Refresh", required = true)
    protected boolean refresh;

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setReadOnly(Expression value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setRequired(Expression value) {
        this.required = value;
    }

    /**
     * Gets the value of the primitiveParameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGlobalParameterValue }
     *     
     */
    public ArrayOfGlobalParameterValue getPrimitiveParameterValues() {
        return primitiveParameterValues;
    }

    /**
     * Sets the value of the primitiveParameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGlobalParameterValue }
     *     
     */
    public void setPrimitiveParameterValues(ArrayOfGlobalParameterValue value) {
        this.primitiveParameterValues = value;
    }

    /**
     * Gets the value of the textParameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGlobalParameterValue1 }
     *     
     */
    public ArrayOfGlobalParameterValue1 getTextParameterValues() {
        return textParameterValues;
    }

    /**
     * Sets the value of the textParameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGlobalParameterValue1 }
     *     
     */
    public void setTextParameterValues(ArrayOfGlobalParameterValue1 value) {
        this.textParameterValues = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
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
     * Gets the value of the displayLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayLength() {
        return displayLength;
    }

    /**
     * Sets the value of the displayLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayLength(Integer value) {
        this.displayLength = value;
    }

    /**
     * Gets the value of the refresh property.
     * 
     */
    public boolean isRefresh() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     * 
     */
    public void setRefresh(boolean value) {
        this.refresh = value;
    }

}
