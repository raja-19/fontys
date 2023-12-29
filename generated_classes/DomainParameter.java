
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Parameter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomainValues" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString14" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainParameter", propOrder = {
    "domainValues"
})
public class DomainParameter
    extends Parameter
{

    @XmlElement(name = "DomainValues")
    protected ArrayOfString14 domainValues;

    /**
     * Gets the value of the domainValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString14 }
     *     
     */
    public ArrayOfString14 getDomainValues() {
        return domainValues;
    }

    /**
     * Sets the value of the domainValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString14 }
     *     
     */
    public void setDomainValues(ArrayOfString14 value) {
        this.domainValues = value;
    }

}
