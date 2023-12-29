
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteConflict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteConflict"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="CurrentReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="DeletedThis" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteConflict", propOrder = {
    "originalReference",
    "currentReference",
    "deletedThis"
})
public class DeleteConflict {

    @XmlElement(name = "OriginalReference", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference originalReference;
    @XmlElement(name = "CurrentReference", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference currentReference;
    @XmlElement(name = "DeletedThis", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean deletedThis;

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
     * Gets the value of the deletedThis property.
     * 
     */
    public boolean isDeletedThis() {
        return deletedThis;
    }

    /**
     * Sets the value of the deletedThis property.
     * 
     */
    public void setDeletedThis(boolean value) {
        this.deletedThis = value;
    }

}
