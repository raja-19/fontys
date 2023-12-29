
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFieldEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}WorkListEntry"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilterSettings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FilterSettings" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DisplayData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DisplayData" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CustomField" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldEntry", propOrder = {
    "filterSettings",
    "displayData"
})
public class CustomFieldEntry
    extends WorkListEntry
{

    @XmlElement(name = "FilterSettings")
    protected FilterSettings filterSettings;
    @XmlElement(name = "DisplayData")
    protected DisplayData displayData;
    @XmlAttribute(name = "CustomField")
    protected String customField;

    /**
     * Gets the value of the filterSettings property.
     * 
     * @return
     *     possible object is
     *     {@link FilterSettings }
     *     
     */
    public FilterSettings getFilterSettings() {
        return filterSettings;
    }

    /**
     * Sets the value of the filterSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterSettings }
     *     
     */
    public void setFilterSettings(FilterSettings value) {
        this.filterSettings = value;
    }

    /**
     * Gets the value of the displayData property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayData }
     *     
     */
    public DisplayData getDisplayData() {
        return displayData;
    }

    /**
     * Sets the value of the displayData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayData }
     *     
     */
    public void setDisplayData(DisplayData value) {
        this.displayData = value;
    }

    /**
     * Gets the value of the customField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField() {
        return customField;
    }

    /**
     * Sets the value of the customField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField(String value) {
        this.customField = value;
    }

}
