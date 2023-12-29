
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessExternalMessageNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessExternalMessageNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Edge" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessExternalMessageEdge" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="EventMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}IntermediateMessageEventMapping" form="unqualified"/&gt;
 *         &lt;element name="AdHocNodeConfiguration" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}AdHocNodeConfiguration" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MessageType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ExternalMessageNodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessExternalMessageNode", propOrder = {
    "edge",
    "eventMapping",
    "adHocNodeConfiguration"
})
public class ProcessExternalMessageNode
    extends ProcessNode
{

    @XmlElement(name = "Edge")
    protected ProcessExternalMessageEdge edge;
    @XmlElement(name = "EventMapping", required = true, nillable = true)
    protected IntermediateMessageEventMapping eventMapping;
    @XmlElement(name = "AdHocNodeConfiguration", required = true, nillable = true)
    protected AdHocNodeConfiguration adHocNodeConfiguration;
    @XmlAttribute(name = "MessageType", required = true)
    protected ExternalMessageNodeType messageType;

    /**
     * Gets the value of the edge property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessExternalMessageEdge }
     *     
     */
    public ProcessExternalMessageEdge getEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessExternalMessageEdge }
     *     
     */
    public void setEdge(ProcessExternalMessageEdge value) {
        this.edge = value;
    }

    /**
     * Gets the value of the eventMapping property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateMessageEventMapping }
     *     
     */
    public IntermediateMessageEventMapping getEventMapping() {
        return eventMapping;
    }

    /**
     * Sets the value of the eventMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateMessageEventMapping }
     *     
     */
    public void setEventMapping(IntermediateMessageEventMapping value) {
        this.eventMapping = value;
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
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalMessageNodeType }
     *     
     */
    public ExternalMessageNodeType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalMessageNodeType }
     *     
     */
    public void setMessageType(ExternalMessageNodeType value) {
        this.messageType = value;
    }

}
