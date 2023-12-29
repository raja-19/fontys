
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessEventStartNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessEventStartNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageEvent" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}MessageEventMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Edge" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessStartEdge" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessEventStartNode", propOrder = {
    "messageEvent",
    "edge"
})
public class ProcessEventStartNode
    extends ProcessNode
{

    @XmlElement(name = "MessageEvent")
    protected MessageEventMapping messageEvent;
    @XmlElement(name = "Edge")
    protected ProcessStartEdge edge;

    /**
     * Gets the value of the messageEvent property.
     * 
     * @return
     *     possible object is
     *     {@link MessageEventMapping }
     *     
     */
    public MessageEventMapping getMessageEvent() {
        return messageEvent;
    }

    /**
     * Sets the value of the messageEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageEventMapping }
     *     
     */
    public void setMessageEvent(MessageEventMapping value) {
        this.messageEvent = value;
    }

    /**
     * Gets the value of the edge property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessStartEdge }
     *     
     */
    public ProcessStartEdge getEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessStartEdge }
     *     
     */
    public void setEdge(ProcessStartEdge value) {
        this.edge = value;
    }

}
