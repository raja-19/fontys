
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResultItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResultItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Element" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultItem", propOrder = {
    "element"
})
@XmlSeeAlso({
    DependencySearchResultItem.class,
    ElementSearchResultItem.class
})
public class SearchResultItem {

    @XmlElement(name = "Element", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference element;

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyReference }
     *     
     */
    public ElementKeyReference getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyReference }
     *     
     */
    public void setElement(ElementKeyReference value) {
        this.element = value;
    }

}
