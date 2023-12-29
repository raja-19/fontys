
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticAggregateContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticAggregateContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfStatisticAggregateEntry" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AggregateType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticAggregateContent", propOrder = {
    "entries"
})
public class StatisticAggregateContent
    extends ParameterContent
{

    @XmlElement(name = "Entries")
    protected ArrayOfStatisticAggregateEntry entries;
    @XmlAttribute(name = "AggregateType")
    protected String aggregateType;

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStatisticAggregateEntry }
     *     
     */
    public ArrayOfStatisticAggregateEntry getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStatisticAggregateEntry }
     *     
     */
    public void setEntries(ArrayOfStatisticAggregateEntry value) {
        this.entries = value;
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

}
