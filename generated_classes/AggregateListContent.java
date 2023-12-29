
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateListContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateListContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfAggregateListEntry" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="SearchQuery" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AggregateType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EmptyText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetVersionEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetVersionAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShowLatestVersionOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PagingSize" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateListContent", propOrder = {
    "entries",
    "searchQuery"
})
public class AggregateListContent
    extends ParameterContent
{

    @XmlElement(name = "Entries")
    protected ArrayOfAggregateListEntry entries;
    @XmlElement(name = "SearchQuery")
    protected Expression searchQuery;
    @XmlAttribute(name = "AggregateType")
    protected String aggregateType;
    @XmlAttribute(name = "EmptyText")
    protected String emptyText;
    @XmlAttribute(name = "TargetEntity")
    protected String targetEntity;
    @XmlAttribute(name = "TargetAttribute")
    protected String targetAttribute;
    @XmlAttribute(name = "TargetVersionEntity")
    protected String targetVersionEntity;
    @XmlAttribute(name = "TargetVersionAttribute")
    protected String targetVersionAttribute;
    @XmlAttribute(name = "ShowLatestVersionOnly", required = true)
    protected boolean showLatestVersionOnly;
    @XmlAttribute(name = "PagingSize")
    protected String pagingSize;

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggregateListEntry }
     *     
     */
    public ArrayOfAggregateListEntry getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggregateListEntry }
     *     
     */
    public void setEntries(ArrayOfAggregateListEntry value) {
        this.entries = value;
    }

    /**
     * Gets the value of the searchQuery property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getSearchQuery() {
        return searchQuery;
    }

    /**
     * Sets the value of the searchQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setSearchQuery(Expression value) {
        this.searchQuery = value;
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
     * Gets the value of the emptyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyText() {
        return emptyText;
    }

    /**
     * Sets the value of the emptyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyText(String value) {
        this.emptyText = value;
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
     * Gets the value of the targetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAttribute() {
        return targetAttribute;
    }

    /**
     * Sets the value of the targetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAttribute(String value) {
        this.targetAttribute = value;
    }

    /**
     * Gets the value of the targetVersionEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetVersionEntity() {
        return targetVersionEntity;
    }

    /**
     * Sets the value of the targetVersionEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetVersionEntity(String value) {
        this.targetVersionEntity = value;
    }

    /**
     * Gets the value of the targetVersionAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetVersionAttribute() {
        return targetVersionAttribute;
    }

    /**
     * Sets the value of the targetVersionAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetVersionAttribute(String value) {
        this.targetVersionAttribute = value;
    }

    /**
     * Gets the value of the showLatestVersionOnly property.
     * 
     */
    public boolean isShowLatestVersionOnly() {
        return showLatestVersionOnly;
    }

    /**
     * Sets the value of the showLatestVersionOnly property.
     * 
     */
    public void setShowLatestVersionOnly(boolean value) {
        this.showLatestVersionOnly = value;
    }

    /**
     * Gets the value of the pagingSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagingSize() {
        return pagingSize;
    }

    /**
     * Sets the value of the pagingSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagingSize(String value) {
        this.pagingSize = value;
    }

}
