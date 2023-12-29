
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessEventKeyPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessEventKeyPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ProcessEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EventType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessEventType" /&gt;
 *       &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessEventKeyPosition")
public class ProcessEventKeyPosition {

    @XmlAttribute(name = "ProcessEvent")
    protected String processEvent;
    @XmlAttribute(name = "EventType", required = true)
    protected ProcessEventType eventType;
    @XmlAttribute(name = "X", required = true)
    protected int x;
    @XmlAttribute(name = "Y", required = true)
    protected int y;

    /**
     * Gets the value of the processEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessEvent() {
        return processEvent;
    }

    /**
     * Sets the value of the processEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessEvent(String value) {
        this.processEvent = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessEventType }
     *     
     */
    public ProcessEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessEventType }
     *     
     */
    public void setEventType(ProcessEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the x property.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

}
