
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ElementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsInExposedFlow" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSpecialized" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDetails", propOrder = {
    "elementName",
    "elementType",
    "module",
    "isInExposedFlow",
    "isSpecialized"
})
public class ElementDetails {

    @XmlElement(name = "ElementName", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String elementName;
    @XmlElement(name = "ElementType", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String elementType;
    @XmlElement(name = "Module", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String module;
    @XmlElement(name = "IsInExposedFlow", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true, type = Boolean.class, nillable = true)
    protected Boolean isInExposedFlow;
    @XmlElement(name = "IsSpecialized", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true, type = Boolean.class, nillable = true)
    protected Boolean isSpecialized;

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName(String value) {
        this.elementName = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementType(String value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the isInExposedFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInExposedFlow() {
        return isInExposedFlow;
    }

    /**
     * Sets the value of the isInExposedFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInExposedFlow(Boolean value) {
        this.isInExposedFlow = value;
    }

    /**
     * Gets the value of the isSpecialized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecialized() {
        return isSpecialized;
    }

    /**
     * Sets the value of the isSpecialized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecialized(Boolean value) {
        this.isSpecialized = value;
    }

}
