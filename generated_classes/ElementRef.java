
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Element" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}QualifiedName" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ParameterValues" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfParameterValue" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CustomSchemaElement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementRef", propOrder = {
    "element",
    "parameterValues"
})
public class ElementRef {

    @XmlElement(name = "Element")
    protected QualifiedName element;
    @XmlElement(name = "ParameterValues")
    protected ArrayOfParameterValue parameterValues;
    @XmlAttribute(name = "CustomSchemaElement")
    protected String customSchemaElement;

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedName }
     *     
     */
    public QualifiedName getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedName }
     *     
     */
    public void setElement(QualifiedName value) {
        this.element = value;
    }

    /**
     * Gets the value of the parameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParameterValue }
     *     
     */
    public ArrayOfParameterValue getParameterValues() {
        return parameterValues;
    }

    /**
     * Sets the value of the parameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParameterValue }
     *     
     */
    public void setParameterValues(ArrayOfParameterValue value) {
        this.parameterValues = value;
    }

    /**
     * Gets the value of the customSchemaElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomSchemaElement() {
        return customSchemaElement;
    }

    /**
     * Sets the value of the customSchemaElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomSchemaElement(String value) {
        this.customSchemaElement = value;
    }

}
