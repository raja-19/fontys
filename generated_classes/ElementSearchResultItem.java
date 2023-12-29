
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementSearchResultItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementSearchResultItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SearchResultItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Excerpt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementSearchResultItem", propOrder = {
    "excerpt"
})
public class ElementSearchResultItem
    extends SearchResultItem
{

    @XmlElement(name = "Excerpt", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String excerpt;

    /**
     * Gets the value of the excerpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcerpt() {
        return excerpt;
    }

    /**
     * Sets the value of the excerpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcerpt(String value) {
        this.excerpt = value;
    }

}
