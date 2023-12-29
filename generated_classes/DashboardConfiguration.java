
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProjectConfiguration"&gt;
 *       &lt;attribute name="DashboardModule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EntryPage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardConfiguration")
public class DashboardConfiguration
    extends ProjectConfiguration
{

    @XmlAttribute(name = "DashboardModule")
    protected String dashboardModule;
    @XmlAttribute(name = "EntryPage")
    protected String entryPage;

    /**
     * Gets the value of the dashboardModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDashboardModule() {
        return dashboardModule;
    }

    /**
     * Sets the value of the dashboardModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDashboardModule(String value) {
        this.dashboardModule = value;
    }

    /**
     * Gets the value of the entryPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPage() {
        return entryPage;
    }

    /**
     * Sets the value of the entryPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPage(String value) {
        this.entryPage = value;
    }

}
