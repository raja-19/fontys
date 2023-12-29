
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseListCaseDataEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseListCaseDataEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CaseListEntry"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilterSettings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FilterSettings" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DisplayData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DisplayData" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CaseDataType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CaseDataType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseListCaseDataEntry", propOrder = {
    "filterSettings",
    "displayData"
})
public class CaseListCaseDataEntry
    extends CaseListEntry
{

    @XmlElement(name = "FilterSettings")
    protected FilterSettings filterSettings;
    @XmlElement(name = "DisplayData")
    protected DisplayData displayData;
    @XmlAttribute(name = "CaseDataType", required = true)
    protected CaseDataType caseDataType;

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
     * Gets the value of the caseDataType property.
     * 
     * @return
     *     possible object is
     *     {@link CaseDataType }
     *     
     */
    public CaseDataType getCaseDataType() {
        return caseDataType;
    }

    /**
     * Sets the value of the caseDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseDataType }
     *     
     */
    public void setCaseDataType(CaseDataType value) {
        this.caseDataType = value;
    }

}
