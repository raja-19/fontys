
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentConflict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentConflict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="CurrentReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="ThisElement" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementReference" minOccurs="0"/&gt;
 *         &lt;element name="OtherElement" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentConflict", propOrder = {
    "originalReference",
    "currentReference",
    "thisElement",
    "otherElement"
})
public class ContentConflict {

    @XmlElement(name = "OriginalReference", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference originalReference;
    @XmlElement(name = "CurrentReference", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference currentReference;
    @XmlElement(name = "ThisElement", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementReference thisElement;
    @XmlElement(name = "OtherElement", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementReference otherElement;

    /**
     * Gets the value of the originalReference property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyReference }
     *     
     */
    public ElementKeyReference getOriginalReference() {
        return originalReference;
    }

    /**
     * Sets the value of the originalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyReference }
     *     
     */
    public void setOriginalReference(ElementKeyReference value) {
        this.originalReference = value;
    }

    /**
     * Gets the value of the currentReference property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyReference }
     *     
     */
    public ElementKeyReference getCurrentReference() {
        return currentReference;
    }

    /**
     * Sets the value of the currentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyReference }
     *     
     */
    public void setCurrentReference(ElementKeyReference value) {
        this.currentReference = value;
    }

    /**
     * Gets the value of the thisElement property.
     * 
     * @return
     *     possible object is
     *     {@link ElementReference }
     *     
     */
    public ElementReference getThisElement() {
        return thisElement;
    }

    /**
     * Sets the value of the thisElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementReference }
     *     
     */
    public void setThisElement(ElementReference value) {
        this.thisElement = value;
    }

    /**
     * Gets the value of the otherElement property.
     * 
     * @return
     *     possible object is
     *     {@link ElementReference }
     *     
     */
    public ElementReference getOtherElement() {
        return otherElement;
    }

    /**
     * Sets the value of the otherElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementReference }
     *     
     */
    public void setOtherElement(ElementReference value) {
        this.otherElement = value;
    }

}
