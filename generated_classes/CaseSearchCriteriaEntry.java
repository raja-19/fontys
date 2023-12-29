
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseSearchCriteriaEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseSearchCriteriaEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FilterSettings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FilterSettings" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSearchCriteriaEntry", propOrder = {
    "filterSettings"
})
@XmlSeeAlso({
    CaseSearchDataEntry.class,
    CaseSearchCaseDataEntry.class,
    CaseSearchCaseMetadataEntry.class,
    CaseSearchDossierMetadataEntry.class
})
public abstract class CaseSearchCriteriaEntry {

    @XmlElement(name = "FilterSettings")
    protected FilterSettings filterSettings;

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

}
