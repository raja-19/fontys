
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}XsdTypeReference" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="InlineType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}TypeMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LineNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="IsNillable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementMapping", propOrder = {
    "typeReference",
    "inlineType"
})
public class ElementMapping {

    @XmlElement(name = "TypeReference")
    protected XsdTypeReference typeReference;
    @XmlElement(name = "InlineType")
    protected TypeMapping inlineType;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "LineNumber", required = true)
    protected int lineNumber;
    @XmlAttribute(name = "IsNillable", required = true)
    protected boolean isNillable;

    /**
     * Gets the value of the typeReference property.
     * 
     * @return
     *     possible object is
     *     {@link XsdTypeReference }
     *     
     */
    public XsdTypeReference getTypeReference() {
        return typeReference;
    }

    /**
     * Sets the value of the typeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdTypeReference }
     *     
     */
    public void setTypeReference(XsdTypeReference value) {
        this.typeReference = value;
    }

    /**
     * Gets the value of the inlineType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMapping }
     *     
     */
    public TypeMapping getInlineType() {
        return inlineType;
    }

    /**
     * Sets the value of the inlineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMapping }
     *     
     */
    public void setInlineType(TypeMapping value) {
        this.inlineType = value;
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
     * Gets the value of the isNillable property.
     * 
     */
    public boolean isIsNillable() {
        return isNillable;
    }

    /**
     * Sets the value of the isNillable property.
     * 
     */
    public void setIsNillable(boolean value) {
        this.isNillable = value;
    }

}
