
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
 *         &lt;element name="GetAllGlobalElementsResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfGlobalElementKey" minOccurs="0"/&gt;
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
    "getAllGlobalElementsResult"
})
@XmlRootElement(name = "GetAllGlobalElementsResponse")
public class GetAllGlobalElementsResponse {

    @XmlElement(name = "GetAllGlobalElementsResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfGlobalElementKey getAllGlobalElementsResult;

    /**
     * Gets the value of the getAllGlobalElementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGlobalElementKey }
     *     
     */
    public ArrayOfGlobalElementKey getGetAllGlobalElementsResult() {
        return getAllGlobalElementsResult;
    }

    /**
     * Sets the value of the getAllGlobalElementsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGlobalElementKey }
     *     
     */
    public void setGetAllGlobalElementsResult(ArrayOfGlobalElementKey value) {
        this.getAllGlobalElementsResult = value;
    }

}
