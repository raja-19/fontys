
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dependency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dependency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ReferenceType"/&gt;
 *         &lt;element name="From" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="To" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dependency", propOrder = {
    "referenceType",
    "from",
    "to"
})
public class Dependency {

    @XmlElement(name = "ReferenceType", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true)
    @XmlSchemaType(name = "string")
    protected ReferenceType referenceType;
    @XmlElement(name = "From", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference from;
    @XmlElement(name = "To", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference to;

    /**
     * Gets the value of the referenceType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getReferenceType() {
        return referenceType;
    }

    /**
     * Sets the value of the referenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReferenceType(ReferenceType value) {
        this.referenceType = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyReference }
     *     
     */
    public ElementKeyReference getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyReference }
     *     
     */
    public void setFrom(ElementKeyReference value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyReference }
     *     
     */
    public ElementKeyReference getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyReference }
     *     
     */
    public void setTo(ElementKeyReference value) {
        this.to = value;
    }

}
