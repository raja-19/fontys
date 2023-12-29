
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementKey" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKey" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedElement", propOrder = {
    "elementKey"
})
@XmlSeeAlso({
    LinkedProjectElement.class
})
public class LinkedElement {

    @XmlElement(name = "ElementKey")
    protected ElementKey elementKey;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Gets the value of the elementKey property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKey }
     *     
     */
    public ElementKey getElementKey() {
        return elementKey;
    }

    /**
     * Sets the value of the elementKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKey }
     *     
     */
    public void setElementKey(ElementKey value) {
        this.elementKey = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
