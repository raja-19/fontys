
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedElementSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedElementSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkedElements" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfLinkedElement" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedElementSet", propOrder = {
    "linkedElements"
})
@XmlSeeAlso({
    ModuleLinkSet.class,
    GlobalElementLinkSet.class,
    ModuleElementLinkSet.class
})
public abstract class LinkedElementSet {

    @XmlElement(name = "LinkedElements")
    protected ArrayOfLinkedElement linkedElements;

    /**
     * Gets the value of the linkedElements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLinkedElement }
     *     
     */
    public ArrayOfLinkedElement getLinkedElements() {
        return linkedElements;
    }

    /**
     * Sets the value of the linkedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLinkedElement }
     *     
     */
    public void setLinkedElements(ArrayOfLinkedElement value) {
        this.linkedElements = value;
    }

}
