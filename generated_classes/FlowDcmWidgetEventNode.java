
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDcmWidgetEventNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowDcmWidgetEventNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Event" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DcmWidgetEvent" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDcmWidgetEventNode", propOrder = {
    "event"
})
public class FlowDcmWidgetEventNode
    extends FlowNode
{

    @XmlElement(name = "Event")
    protected DcmWidgetEvent event;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link DcmWidgetEvent }
     *     
     */
    public DcmWidgetEvent getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link DcmWidgetEvent }
     *     
     */
    public void setEvent(DcmWidgetEvent value) {
        this.event = value;
    }

}
