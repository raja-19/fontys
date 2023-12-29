
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessTimerNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessTimerNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimerCondition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Edge" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessTimerEdge" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="AdHocNodeConfiguration" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}AdHocNodeConfiguration" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReevaluationEvent" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ReevaluationEvent" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessTimerNode", propOrder = {
    "timerCondition",
    "edge",
    "adHocNodeConfiguration"
})
public class ProcessTimerNode
    extends ProcessNode
{

    @XmlElement(name = "TimerCondition")
    protected Expression timerCondition;
    @XmlElement(name = "Edge")
    protected ProcessTimerEdge edge;
    @XmlElement(name = "AdHocNodeConfiguration", required = true, nillable = true)
    protected AdHocNodeConfiguration adHocNodeConfiguration;
    @XmlAttribute(name = "ReevaluationEvent", required = true)
    protected ReevaluationEvent reevaluationEvent;

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
     * Gets the value of the edge property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTimerEdge }
     *     
     */
    public ProcessTimerEdge getEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTimerEdge }
     *     
     */
    public void setEdge(ProcessTimerEdge value) {
        this.edge = value;
    }

    /**
     * Gets the value of the adHocNodeConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link AdHocNodeConfiguration }
     *     
     */
    public AdHocNodeConfiguration getAdHocNodeConfiguration() {
        return adHocNodeConfiguration;
    }

    /**
     * Sets the value of the adHocNodeConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdHocNodeConfiguration }
     *     
     */
    public void setAdHocNodeConfiguration(AdHocNodeConfiguration value) {
        this.adHocNodeConfiguration = value;
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

}
