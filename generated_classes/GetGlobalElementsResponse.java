
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
 *         &lt;element name="GetGlobalElementsResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfGlobalElementKey" minOccurs="0"/&gt;
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
    "getGlobalElementsResult"
})
@XmlRootElement(name = "GetGlobalElementsResponse")
public class GetGlobalElementsResponse {

    @XmlElement(name = "GetGlobalElementsResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfGlobalElementKey getGlobalElementsResult;

    /**
     * Gets the value of the getGlobalElementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGlobalElementKey }
     *     
     */
    public ArrayOfGlobalElementKey getGetGlobalElementsResult() {
        return getGlobalElementsResult;
    }

    /**
     * Sets the value of the getGlobalElementsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGlobalElementKey }
     *     
     */
    public void setGetGlobalElementsResult(ArrayOfGlobalElementKey value) {
        this.getGlobalElementsResult = value;
    }

}
