
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
 *         &lt;element name="GetUsedByElementsForGlobalElementResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDependency" minOccurs="0"/&gt;
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
    "getUsedByElementsForGlobalElementResult"
})
@XmlRootElement(name = "GetUsedByElementsForGlobalElementResponse")
public class GetUsedByElementsForGlobalElementResponse {

    @XmlElement(name = "GetUsedByElementsForGlobalElementResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfDependency getUsedByElementsForGlobalElementResult;

    /**
     * Gets the value of the getUsedByElementsForGlobalElementResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDependency }
     *     
     */
    public ArrayOfDependency getGetUsedByElementsForGlobalElementResult() {
        return getUsedByElementsForGlobalElementResult;
    }

    /**
     * Sets the value of the getUsedByElementsForGlobalElementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDependency }
     *     
     */
    public void setGetUsedByElementsForGlobalElementResult(ArrayOfDependency value) {
        this.getUsedByElementsForGlobalElementResult = value;
    }

}
