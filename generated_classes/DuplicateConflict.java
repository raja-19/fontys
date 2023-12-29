
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicateConflict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuplicateConflict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="CurrentThis" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="CurrentOther" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateConflict", propOrder = {
    "originalReference",
    "currentThis",
    "currentOther"
})
public class DuplicateConflict {

    @XmlElement(name = "OriginalReference", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference originalReference;
    @XmlElement(name = "CurrentThis", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference currentThis;
    @XmlElement(name = "CurrentOther", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference currentOther;

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
     * Gets the value of the currentThis property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyReference }
     *     
     */
    public ElementKeyReference getCurrentThis() {
        return currentThis;
    }

    /**
     * Sets the value of the currentThis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyReference }
     *     
     */
    public void setCurrentThis(ElementKeyReference value) {
        this.currentThis = value;
    }

    /**
     * Gets the value of the currentOther property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyReference }
     *     
     */
    public ElementKeyReference getCurrentOther() {
        return currentOther;
    }

    /**
     * Sets the value of the currentOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyReference }
     *     
     */
    public void setCurrentOther(ElementKeyReference value) {
        this.currentOther = value;
    }

}
