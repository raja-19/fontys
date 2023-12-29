
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessActivityEdge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessActivityEdge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessEdge"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimerCondition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReevaluationEvent" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ReevaluationEvent" /&gt;
 *       &lt;attribute name="ProcessEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EventType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessEventType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessActivityEdge", propOrder = {
    "timerCondition"
})
public class ProcessActivityEdge
    extends ProcessEdge
{

    @XmlElement(name = "TimerCondition")
    protected Expression timerCondition;
    @XmlAttribute(name = "ReevaluationEvent", required = true)
    protected ReevaluationEvent reevaluationEvent;
    @XmlAttribute(name = "ProcessEvent")
    protected String processEvent;
    @XmlAttribute(name = "EventType", required = true)
    protected ProcessEventType eventType;

    /**
     * Gets the value of the timerCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getTimerCondition() {
        return timerCondition;
    }

    /**
     * Sets the value of the timerCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setTimerCondition(Expression value) {
        this.timerCondition = value;
    }

    /**
     * Gets the value of the reevaluationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ReevaluationEvent }
     *     
     */
    public ReevaluationEvent getReevaluationEvent() {
        return reevaluationEvent;
    }

    /**
     * Sets the value of the reevaluationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReevaluationEvent }
     *     
     */
    public void setReevaluationEvent(ReevaluationEvent value) {
        this.reevaluationEvent = value;
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

}
