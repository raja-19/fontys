
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateListActionEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateListActionEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}AggregateListEntry"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventParameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString7" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="PresentationData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}AggregateListItemReference" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Button" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Event" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EventType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowEventType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateListActionEntry", propOrder = {
    "eventParameters",
    "presentationData"
})
public class AggregateListActionEntry
    extends AggregateListEntry
{

    @XmlElement(name = "EventParameters")
    protected ArrayOfString7 eventParameters;
    @XmlElement(name = "PresentationData")
    protected AggregateListItemReference presentationData;
    @XmlAttribute(name = "Button")
    protected String button;
    @XmlAttribute(name = "Event")
    protected String event;
    @XmlAttribute(name = "EventType", required = true)
    protected FlowEventType eventType;

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
     * Gets the value of the presentationData property.
     * 
     * @return
     *     possible object is
     *     {@link AggregateListItemReference }
     *     
     */
    public AggregateListItemReference getPresentationData() {
        return presentationData;
    }

    /**
     * Sets the value of the presentationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateListItemReference }
     *     
     */
    public void setPresentationData(AggregateListItemReference value) {
        this.presentationData = value;
    }

    /**
     * Gets the value of the button property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButton() {
        return button;
    }

    /**
     * Sets the value of the button property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButton(String value) {
        this.button = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
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
