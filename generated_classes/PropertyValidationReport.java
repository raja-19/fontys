
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyValidationReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyValidationReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HasBlockingValidation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Messages" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyValidationReport", propOrder = {
    "hasBlockingValidation",
    "property",
    "messages"
})
public class PropertyValidationReport {

    @XmlElement(name = "HasBlockingValidation", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean hasBlockingValidation;
    @XmlElement(name = "Property", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String property;
    @XmlElement(name = "Messages", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfString messages;

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

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setMessages(ArrayOfString value) {
        this.messages = value;
    }

}
