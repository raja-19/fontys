
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FlowEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FlowEventType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowEventType" /&gt;
 *       &lt;attribute name="ProcessEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProcessEventType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessEventType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventMapping")
public class EventMapping {

    @XmlAttribute(name = "FlowEvent")
    protected String flowEvent;
    @XmlAttribute(name = "FlowEventType")
    protected FlowEventType flowEventType;
    @XmlAttribute(name = "ProcessEvent")
    protected String processEvent;
    @XmlAttribute(name = "ProcessEventType")
    protected ProcessEventType processEventType;

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
     * Gets the value of the flowEventType property.
     * 
     * @return
     *     possible object is
     *     {@link FlowEventType }
     *     
     */
    public FlowEventType getFlowEventType() {
        return flowEventType;
    }

    /**
     * Sets the value of the flowEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowEventType }
     *     
     */
    public void setFlowEventType(FlowEventType value) {
        this.flowEventType = value;
    }

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
     * Gets the value of the processEventType property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessEventType }
     *     
     */
    public ProcessEventType getProcessEventType() {
        return processEventType;
    }

    /**
     * Sets the value of the processEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessEventType }
     *     
     */
    public void setProcessEventType(ProcessEventType value) {
        this.processEventType = value;
    }

}
