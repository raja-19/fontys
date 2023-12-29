
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventDefinitionImplementation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDefinitionImplementation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventParameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString7" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EventDefinition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FlowEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDefinitionImplementation", propOrder = {
    "eventParameters"
})
@XmlSeeAlso({
    ContractEventDefinitionImplementation.class
})
public class EventDefinitionImplementation {

    @XmlElement(name = "EventParameters")
    protected ArrayOfString7 eventParameters;
    @XmlAttribute(name = "EventDefinition")
    protected String eventDefinition;
    @XmlAttribute(name = "FlowEvent")
    protected String flowEvent;

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
     * Gets the value of the eventDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDefinition() {
        return eventDefinition;
    }

    /**
     * Sets the value of the eventDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDefinition(String value) {
        this.eventDefinition = value;
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
