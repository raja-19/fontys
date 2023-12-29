
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardShortcutWidget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardShortcutWidget"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DashboardWidget"&gt;
 *       &lt;attribute name="ShortcutName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardShortcutWidget")
public class DashboardShortcutWidget
    extends DashboardWidget
{

    @XmlAttribute(name = "ShortcutName")
    protected String shortcutName;

    /**
     * Gets the value of the shortcutName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutName() {
        return shortcutName;
    }

    /**
     * Sets the value of the shortcutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutName(String value) {
        this.shortcutName = value;
    }

}
