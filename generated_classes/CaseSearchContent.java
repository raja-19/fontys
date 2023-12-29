
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseSearchContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseSearchContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CriteriaEntries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfCaseSearchCriteriaEntry" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CaseAggregate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CaseIdTargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CaseIdTargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaxResults" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSearchContent", propOrder = {
    "criteriaEntries"
})
public class CaseSearchContent
    extends ServiceCallContent
{

    @XmlElement(name = "CriteriaEntries")
    protected ArrayOfCaseSearchCriteriaEntry criteriaEntries;
    @XmlAttribute(name = "CaseAggregate")
    protected String caseAggregate;
    @XmlAttribute(name = "CaseIdTargetEntity")
    protected String caseIdTargetEntity;
    @XmlAttribute(name = "CaseIdTargetAttribute")
    protected String caseIdTargetAttribute;
    @XmlAttribute(name = "MaxResults")
    protected String maxResults;

    /**
     * Gets the value of the criteriaEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCaseSearchCriteriaEntry }
     *     
     */
    public ArrayOfCaseSearchCriteriaEntry getCriteriaEntries() {
        return criteriaEntries;
    }

    /**
     * Sets the value of the criteriaEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCaseSearchCriteriaEntry }
     *     
     */
    public void setCriteriaEntries(ArrayOfCaseSearchCriteriaEntry value) {
        this.criteriaEntries = value;
    }

    /**
     * Gets the value of the caseAggregate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseAggregate() {
        return caseAggregate;
    }

    /**
     * Sets the value of the caseAggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseAggregate(String value) {
        this.caseAggregate = value;
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
