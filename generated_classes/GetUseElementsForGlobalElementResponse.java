
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetUseElementsForGlobalElementResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDependency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getUseElementsForGlobalElementResult"
})
@XmlRootElement(name = "GetUseElementsForGlobalElementResponse")
public class GetUseElementsForGlobalElementResponse {

    @XmlElement(name = "GetUseElementsForGlobalElementResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfDependency getUseElementsForGlobalElementResult;

    /**
     * Gets the value of the getUseElementsForGlobalElementResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDependency }
     *     
     */
    public ArrayOfDependency getGetUseElementsForGlobalElementResult() {
        return getUseElementsForGlobalElementResult;
    }

    /**
     * Sets the value of the getUseElementsForGlobalElementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDependency }
     *     
     */
    public void setGetUseElementsForGlobalElementResult(ArrayOfDependency value) {
        this.getUseElementsForGlobalElementResult = value;
    }

}
