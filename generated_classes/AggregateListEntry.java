
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateListEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateListEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Visible" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Header" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateListEntry", propOrder = {
    "visible"
})
@XmlSeeAlso({
    AggregateListActionEntry.class,
    AggregateListMetaDataEntry.class,
    AggregateListCustomMetaDataEntry.class
})
public abstract class AggregateListEntry {

    @XmlElement(name = "Visible")
    protected Expression visible;
    @XmlAttribute(name = "Header")
    protected String header;

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setVisible(Expression value) {
        this.visible = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

}
