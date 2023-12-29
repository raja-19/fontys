
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomainProperties" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDomainProperty" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainObject", propOrder = {
    "domainProperties"
})
public class DomainObject {

    @XmlElement(name = "DomainProperties")
    protected ArrayOfDomainProperty domainProperties;

    /**
     * Gets the value of the domainProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomainProperty }
     *     
     */
    public ArrayOfDomainProperty getDomainProperties() {
        return domainProperties;
    }

    /**
     * Sets the value of the domainProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomainProperty }
     *     
     */
    public void setDomainProperties(ArrayOfDomainProperty value) {
        this.domainProperties = value;
    }

}
