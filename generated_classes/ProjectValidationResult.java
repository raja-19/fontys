
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectValidationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectValidationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidationMessages" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfElementValidationResult" minOccurs="0"/&gt;
 *         &lt;element name="InteractionMessages" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfExecutionValidationResult" minOccurs="0"/&gt;
 *         &lt;element name="HasBlockingValidation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectValidationResult", propOrder = {
    "validationMessages",
    "interactionMessages",
    "hasBlockingValidation"
})
public class ProjectValidationResult {

    @XmlElement(name = "ValidationMessages", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfElementValidationResult validationMessages;
    @XmlElement(name = "InteractionMessages", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfExecutionValidationResult interactionMessages;
    @XmlElement(name = "HasBlockingValidation", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean hasBlockingValidation;

    /**
     * Gets the value of the validationMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElementValidationResult }
     *     
     */
    public ArrayOfElementValidationResult getValidationMessages() {
        return validationMessages;
    }

    /**
     * Sets the value of the validationMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElementValidationResult }
     *     
     */
    public void setValidationMessages(ArrayOfElementValidationResult value) {
        this.validationMessages = value;
    }

    /**
     * Gets the value of the interactionMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExecutionValidationResult }
     *     
     */
    public ArrayOfExecutionValidationResult getInteractionMessages() {
        return interactionMessages;
    }

    /**
     * Sets the value of the interactionMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExecutionValidationResult }
     *     
     */
    public void setInteractionMessages(ArrayOfExecutionValidationResult value) {
        this.interactionMessages = value;
    }

    /**
     * Gets the value of the hasBlockingValidation property.
     * 
     */
    public boolean isHasBlockingValidation() {
        return hasBlockingValidation;
    }

    /**
     * Sets the value of the hasBlockingValidation property.
     * 
     */
    public void setHasBlockingValidation(boolean value) {
        this.hasBlockingValidation = value;
    }

}
