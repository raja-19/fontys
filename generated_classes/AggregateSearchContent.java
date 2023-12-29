
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateSearchContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateSearchContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchCriteria" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfAggregateSearchCriteriaEntry" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AggregateType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AggregateIDTargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VersionIDTargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SearchLatestVersionOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaxResults" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateSearchContent", propOrder = {
    "searchCriteria"
})
public class AggregateSearchContent
    extends ServiceCallContent
{

    @XmlElement(name = "SearchCriteria")
    protected ArrayOfAggregateSearchCriteriaEntry searchCriteria;
    @XmlAttribute(name = "AggregateType")
    protected String aggregateType;
    @XmlAttribute(name = "TargetEntity")
    protected String targetEntity;
    @XmlAttribute(name = "AggregateIDTargetAttribute")
    protected String aggregateIDTargetAttribute;
    @XmlAttribute(name = "VersionIDTargetAttribute")
    protected String versionIDTargetAttribute;
    @XmlAttribute(name = "SearchLatestVersionOnly", required = true)
    protected boolean searchLatestVersionOnly;
    @XmlAttribute(name = "MaxResults")
    protected String maxResults;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggregateSearchCriteriaEntry }
     *     
     */
    public ArrayOfAggregateSearchCriteriaEntry getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggregateSearchCriteriaEntry }
     *     
     */
    public void setSearchCriteria(ArrayOfAggregateSearchCriteriaEntry value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the aggregateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregateType() {
        return aggregateType;
    }

    /**
     * Sets the value of the aggregateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregateType(String value) {
        this.aggregateType = value;
    }

    /**
     * Gets the value of the targetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEntity() {
        return targetEntity;
    }

    /**
     * Sets the value of the targetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEntity(String value) {
        this.targetEntity = value;
    }

    /**
     * Gets the value of the aggregateIDTargetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregateIDTargetAttribute() {
        return aggregateIDTargetAttribute;
    }

    /**
     * Sets the value of the aggregateIDTargetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregateIDTargetAttribute(String value) {
        this.aggregateIDTargetAttribute = value;
    }

    /**
     * Gets the value of the versionIDTargetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionIDTargetAttribute() {
        return versionIDTargetAttribute;
    }

    /**
     * Sets the value of the versionIDTargetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionIDTargetAttribute(String value) {
        this.versionIDTargetAttribute = value;
    }

    /**
     * Gets the value of the searchLatestVersionOnly property.
     * 
     */
    public boolean isSearchLatestVersionOnly() {
        return searchLatestVersionOnly;
    }

    /**
     * Sets the value of the searchLatestVersionOnly property.
     * 
     */
    public void setSearchLatestVersionOnly(boolean value) {
        this.searchLatestVersionOnly = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxResults(String value) {
        this.maxResults = value;
    }

}
