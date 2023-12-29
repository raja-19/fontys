
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowEndNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowEndNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventImplementation" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}EventImplementation" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowEndNode", propOrder = {
    "eventImplementation"
})
public class FlowEndNode
    extends FlowNode
{

    @XmlElement(name = "EventImplementation")
    protected EventImplementation eventImplementation;

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

}
