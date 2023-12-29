
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DcmWorkListTaskDataEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcmWorkListTaskDataEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DcmWorkListEntry"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilterSettings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FilterSettings" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DisplayData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DisplayData" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TaskDataType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}TaskDataType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcmWorkListTaskDataEntry", propOrder = {
    "filterSettings",
    "displayData"
})
public class DcmWorkListTaskDataEntry
    extends DcmWorkListEntry
{

    @XmlElement(name = "FilterSettings")
    protected FilterSettings filterSettings;
    @XmlElement(name = "DisplayData")
    protected DisplayData displayData;
    @XmlAttribute(name = "TaskDataType", required = true)
    protected TaskDataType taskDataType;

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
     * Gets the value of the taskDataType property.
     * 
     * @return
     *     possible object is
     *     {@link TaskDataType }
     *     
     */
    public TaskDataType getTaskDataType() {
        return taskDataType;
    }

    /**
     * Sets the value of the taskDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDataType }
     *     
     */
    public void setTaskDataType(TaskDataType value) {
        this.taskDataType = value;
    }

}
