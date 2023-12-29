
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XsdTypeReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XsdTypeReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComplexType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}QualifiedName" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SimpleType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DataType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XsdTypeReference", propOrder = {
    "complexType"
})
public class XsdTypeReference {

    @XmlElement(name = "ComplexType")
    protected QualifiedName complexType;
    @XmlAttribute(name = "SimpleType")
    protected DataType simpleType;

    /**
     * Gets the value of the complexType property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedName }
     *     
     */
    public QualifiedName getComplexType() {
        return complexType;
    }

    /**
     * Sets the value of the complexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedName }
     *     
     */
    public void setComplexType(QualifiedName value) {
        this.complexType = value;
    }

    /**
     * Gets the value of the simpleType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getSimpleType() {
        return simpleType;
    }

    /**
     * Sets the value of the simpleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setSimpleType(DataType value) {
        this.simpleType = value;
    }

}
