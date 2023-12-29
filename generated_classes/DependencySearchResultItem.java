
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DependencySearchResultItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DependencySearchResultItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SearchResultItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ToElement" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DependencySearchResultItem", propOrder = {
    "toElement"
})
public class DependencySearchResultItem
    extends SearchResultItem
{

    @XmlElement(name = "ToElement", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference toElement;

    /**
     * Gets the value of the toElement property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyReference }
     *     
     */
    public ElementKeyReference getToElement() {
        return toElement;
    }

    /**
     * Sets the value of the toElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyReference }
     *     
     */
    public void setToElement(ElementKeyReference value) {
        this.toElement = value;
    }

}
