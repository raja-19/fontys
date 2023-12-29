
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateCountContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateCountContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchCriteria" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfAggregateSearchCriteriaEntry" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AggregateType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AggregateCountTargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CountLatestVersionOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateCountContent", propOrder = {
    "searchCriteria"
})
public class AggregateCountContent
    extends ServiceCallContent
{

    @XmlElement(name = "SearchCriteria")
    protected ArrayOfAggregateSearchCriteriaEntry searchCriteria;
    @XmlAttribute(name = "AggregateType")
    protected String aggregateType;
    @XmlAttribute(name = "TargetEntity")
    protected String targetEntity;
    @XmlAttribute(name = "AggregateCountTargetAttribute")
    protected String aggregateCountTargetAttribute;
    @XmlAttribute(name = "CountLatestVersionOnly", required = true)
    protected boolean countLatestVersionOnly;

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
     * Gets the value of the aggregateCountTargetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregateCountTargetAttribute() {
        return aggregateCountTargetAttribute;
    }

    /**
     * Sets the value of the aggregateCountTargetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregateCountTargetAttribute(String value) {
        this.aggregateCountTargetAttribute = value;
    }

    /**
     * Gets the value of the countLatestVersionOnly property.
     * 
     */
    public boolean isCountLatestVersionOnly() {
        return countLatestVersionOnly;
    }

    /**
     * Sets the value of the countLatestVersionOnly property.
     * 
     */
    public void setCountLatestVersionOnly(boolean value) {
        this.countLatestVersionOnly = value;
    }

}
