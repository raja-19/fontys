
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowActionEdge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowActionEdge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowEdge"&gt;
 *       &lt;attribute name="FlowEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EventType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowEventType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowActionEdge")
public class FlowActionEdge
    extends FlowEdge
{

    @XmlAttribute(name = "FlowEvent")
    protected String flowEvent;
    @XmlAttribute(name = "EventType", required = true)
    protected FlowEventType eventType;

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
