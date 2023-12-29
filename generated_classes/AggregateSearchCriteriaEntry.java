
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateSearchCriteriaEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateSearchCriteriaEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Metadata" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Operator" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SearchOperator" /&gt;
 *       &lt;attribute name="Type" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SearchEntryMetadataType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateSearchCriteriaEntry", propOrder = {
    "value"
})
@XmlSeeAlso({
    StandardMetadataSearchEntry.class,
    CustomMetadataSearchEntry.class
})
public class AggregateSearchCriteriaEntry {

    @XmlElement(name = "Value")
    protected Expression value;
    @XmlAttribute(name = "Metadata")
    protected String metadata;
    @XmlAttribute(name = "Operator", required = true)
    protected SearchOperator operator;
    @XmlAttribute(name = "Type", required = true)
    protected SearchEntryMetadataType type;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setValue(Expression value) {
        this.value = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata(String value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOperator }
     *     
     */
    public SearchOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOperator }
     *     
     */
    public void setOperator(SearchOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEntryMetadataType }
     *     
     */
    public SearchEntryMetadataType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEntryMetadataType }
     *     
     */
    public void setType(SearchEntryMetadataType value) {
        this.type = value;
    }

}
