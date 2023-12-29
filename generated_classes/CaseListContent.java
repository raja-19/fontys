
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseListContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseListContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfCaseListEntry" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PagingSize" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CaseIdTargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CaseIdTargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GroupByEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GroupByAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseListContent", propOrder = {
    "entries"
})
public class CaseListContent
    extends ParameterContent
{

    @XmlElement(name = "Entries")
    protected ArrayOfCaseListEntry entries;
    @XmlAttribute(name = "PagingSize")
    protected String pagingSize;
    @XmlAttribute(name = "CaseIdTargetEntity")
    protected String caseIdTargetEntity;
    @XmlAttribute(name = "CaseIdTargetAttribute")
    protected String caseIdTargetAttribute;
    @XmlAttribute(name = "GroupByEntity")
    protected String groupByEntity;
    @XmlAttribute(name = "GroupByAttribute")
    protected String groupByAttribute;
    @XmlAttribute(name = "DisplayText")
    protected String displayText;

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCaseListEntry }
     *     
     */
    public ArrayOfCaseListEntry getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCaseListEntry }
     *     
     */
    public void setEntries(ArrayOfCaseListEntry value) {
        this.entries = value;
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

    /**
     * Gets the value of the caseIdTargetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseIdTargetEntity() {
        return caseIdTargetEntity;
    }

    /**
     * Sets the value of the caseIdTargetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseIdTargetEntity(String value) {
        this.caseIdTargetEntity = value;
    }

    /**
     * Gets the value of the caseIdTargetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseIdTargetAttribute() {
        return caseIdTargetAttribute;
    }

    /**
     * Sets the value of the caseIdTargetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseIdTargetAttribute(String value) {
        this.caseIdTargetAttribute = value;
    }

    /**
     * Gets the value of the groupByEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupByEntity() {
        return groupByEntity;
    }

    /**
     * Sets the value of the groupByEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupByEntity(String value) {
        this.groupByEntity = value;
    }

    /**
     * Gets the value of the groupByAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupByAttribute() {
        return groupByAttribute;
    }

    /**
     * Sets the value of the groupByAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupByAttribute(String value) {
        this.groupByAttribute = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

}
