
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourcingAttributes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfSourceAttribute" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="JustificationAsset" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRule", propOrder = {
    "sourcingAttributes"
})
public class ExternalRule
    extends ModuleElement
{

    @XmlElement(name = "SourcingAttributes")
    protected ArrayOfSourceAttribute sourcingAttributes;
    @XmlAttribute(name = "JustificationAsset")
    protected String justificationAsset;

    /**
     * Gets the value of the sourcingAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceAttribute }
     *     
     */
    public ArrayOfSourceAttribute getSourcingAttributes() {
        return sourcingAttributes;
    }

    /**
     * Sets the value of the sourcingAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceAttribute }
     *     
     */
    public void setSourcingAttributes(ArrayOfSourceAttribute value) {
        this.sourcingAttributes = value;
    }

    /**
     * Gets the value of the justificationAsset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificationAsset() {
        return justificationAsset;
    }

    /**
     * Sets the value of the justificationAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificationAsset(String value) {
        this.justificationAsset = value;
    }

}
