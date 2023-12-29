
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ButtonReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ButtonReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FormatContainment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadOnly" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ButtonEvent" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ButtonEvent" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Button" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Refresh" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ButtonReference", propOrder = {
    "readOnly",
    "buttonEvent"
})
public class ButtonReference
    extends FormatContainment
{

    @XmlElement(name = "ReadOnly")
    protected Expression readOnly;
    @XmlElement(name = "ButtonEvent")
    protected ButtonEvent buttonEvent;
    @XmlAttribute(name = "Button")
    protected String button;
    @XmlAttribute(name = "Refresh", required = true)
    protected boolean refresh;

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setReadOnly(Expression value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the buttonEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ButtonEvent }
     *     
     */
    public ButtonEvent getButtonEvent() {
        return buttonEvent;
    }

    /**
     * Sets the value of the buttonEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonEvent }
     *     
     */
    public void setButtonEvent(ButtonEvent value) {
        this.buttonEvent = value;
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
     * Gets the value of the refresh property.
     * 
     */
    public boolean isRefresh() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     * 
     */
    public void setRefresh(boolean value) {
        this.refresh = value;
    }

}
