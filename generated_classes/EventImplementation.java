
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventImplementation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventImplementation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventParameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString7" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FlowEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EventType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowEventType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventImplementation", propOrder = {
    "eventParameters"
})
public class EventImplementation {

    @XmlElement(name = "EventParameters")
    protected ArrayOfString7 eventParameters;
    @XmlAttribute(name = "FlowEvent")
    protected String flowEvent;
    @XmlAttribute(name = "EventType", required = true)
    protected FlowEventType eventType;

    /**
     * Gets the value of the eventParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString7 }
     *     
     */
    public ArrayOfString7 getEventParameters() {
        return eventParameters;
    }

    /**
     * Sets the value of the eventParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString7 }
     *     
     */
    public void setEventParameters(ArrayOfString7 value) {
        this.eventParameters = value;
    }

    /**
     * Gets the value of the flowEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowEvent() {
        return flowEvent;
    }

    /**
     * Sets the value of the flowEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowEvent(String value) {
        this.flowEvent = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link FlowEventType }
     *     
     */
    public FlowEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowEventType }
     *     
     */
    public void setEventType(FlowEventType value) {
        this.eventType = value;
    }

}
