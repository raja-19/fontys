
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardThrowPortalMessageEventContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardThrowPortalMessageEventContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortalMessageEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Values" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfThrowPortalMessageEventValue" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardThrowPortalMessageEventContent", propOrder = {
    "portalMessageEvent",
    "values"
})
public class DashboardThrowPortalMessageEventContent
    extends ServiceCallContent
{

    @XmlElement(name = "PortalMessageEvent")
    protected String portalMessageEvent;
    @XmlElement(name = "Values")
    protected ArrayOfThrowPortalMessageEventValue values;

    /**
     * Gets the value of the portalMessageEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalMessageEvent() {
        return portalMessageEvent;
    }

    /**
     * Sets the value of the portalMessageEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalMessageEvent(String value) {
        this.portalMessageEvent = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfThrowPortalMessageEventValue }
     *     
     */
    public ArrayOfThrowPortalMessageEventValue getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfThrowPortalMessageEventValue }
     *     
     */
    public void setValues(ArrayOfThrowPortalMessageEventValue value) {
        this.values = value;
    }

}
