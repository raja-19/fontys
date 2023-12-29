
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ButtonEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ButtonEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventImplementation" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}EventImplementation" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ButtonEvent", propOrder = {
    "eventImplementation"
})
public class ButtonEvent {

    @XmlElement(name = "EventImplementation")
    protected EventImplementation eventImplementation;
    @XmlAttribute(name = "Action")
    protected String action;

    /**
     * Gets the value of the eventImplementation property.
     * 
     * @return
     *     possible object is
     *     {@link EventImplementation }
     *     
     */
    public EventImplementation getEventImplementation() {
        return eventImplementation;
    }

    /**
     * Sets the value of the eventImplementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventImplementation }
     *     
     */
    public void setEventImplementation(EventImplementation value) {
        this.eventImplementation = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
