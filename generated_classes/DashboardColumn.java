
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Widgets" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDashboardWidget" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardColumn", propOrder = {
    "widgets"
})
public class DashboardColumn {

    @XmlElement(name = "Widgets")
    protected ArrayOfDashboardWidget widgets;

    /**
     * Gets the value of the widgets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDashboardWidget }
     *     
     */
    public ArrayOfDashboardWidget getWidgets() {
        return widgets;
    }

    /**
     * Sets the value of the widgets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDashboardWidget }
     *     
     */
    public void setWidgets(ArrayOfDashboardWidget value) {
        this.widgets = value;
    }

}
