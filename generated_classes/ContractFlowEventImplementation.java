
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractFlowEventImplementation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractFlowEventImplementation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="EventType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowEventType" /&gt;
 *       &lt;attribute name="ContractEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FlowEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractFlowEventImplementation")
public class ContractFlowEventImplementation {

    @XmlAttribute(name = "EventType", required = true)
    protected FlowEventType eventType;
    @XmlAttribute(name = "ContractEvent")
    protected String contractEvent;
    @XmlAttribute(name = "FlowEvent")
    protected String flowEvent;

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

    /**
     * Gets the value of the contractEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractEvent() {
        return contractEvent;
    }

    /**
     * Sets the value of the contractEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractEvent(String value) {
        this.contractEvent = value;
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

}
