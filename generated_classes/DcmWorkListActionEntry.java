
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DcmWorkListActionEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcmWorkListActionEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DcmWorkListEntry"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventParameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString7" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="PresentationStyles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ListFormatDefinition" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Button" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Event" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcmWorkListActionEntry", propOrder = {
    "eventParameters",
    "presentationStyles"
})
public class DcmWorkListActionEntry
    extends DcmWorkListEntry
{

    @XmlElement(name = "EventParameters")
    protected ArrayOfString7 eventParameters;
    @XmlElement(name = "PresentationStyles")
    protected ListFormatDefinition presentationStyles;
    @XmlAttribute(name = "Button")
    protected String button;
    @XmlAttribute(name = "Event")
    protected String event;

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
     * Gets the value of the presentationStyles property.
     * 
     * @return
     *     possible object is
     *     {@link ListFormatDefinition }
     *     
     */
    public ListFormatDefinition getPresentationStyles() {
        return presentationStyles;
    }

    /**
     * Sets the value of the presentationStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListFormatDefinition }
     *     
     */
    public void setPresentationStyles(ListFormatDefinition value) {
        this.presentationStyles = value;
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

}
