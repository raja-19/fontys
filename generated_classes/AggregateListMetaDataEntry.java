
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateListMetaDataEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateListMetaDataEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}AggregateListEntry"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilterSettings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FilterSettings" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="PresentationData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ExtendedPresentationData" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Field" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}MetaDataType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateListMetaDataEntry", propOrder = {
    "filterSettings",
    "presentationData"
})
public class AggregateListMetaDataEntry
    extends AggregateListEntry
{

    @XmlElement(name = "FilterSettings")
    protected FilterSettings filterSettings;
    @XmlElement(name = "PresentationData")
    protected ExtendedPresentationData presentationData;
    @XmlAttribute(name = "Field", required = true)
    protected MetaDataType field;

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
     * Gets the value of the presentationData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPresentationData }
     *     
     */
    public ExtendedPresentationData getPresentationData() {
        return presentationData;
    }

    /**
     * Sets the value of the presentationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPresentationData }
     *     
     */
    public void setPresentationData(ExtendedPresentationData value) {
        this.presentationData = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataType }
     *     
     */
    public MetaDataType getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataType }
     *     
     */
    public void setField(MetaDataType value) {
        this.field = value;
    }

}
