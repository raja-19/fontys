
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
 *         &lt;element name="GetModuleElementsResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfModuleElementKey" minOccurs="0"/&gt;
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
    "getModuleElementsResult"
})
@XmlRootElement(name = "GetModuleElementsResponse")
public class GetModuleElementsResponse {

    @XmlElement(name = "GetModuleElementsResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfModuleElementKey getModuleElementsResult;

    /**
     * Gets the value of the getModuleElementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModuleElementKey }
     *     
     */
    public ArrayOfModuleElementKey getGetModuleElementsResult() {
        return getModuleElementsResult;
    }

    /**
     * Sets the value of the getModuleElementsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModuleElementKey }
     *     
     */
    public void setGetModuleElementsResult(ArrayOfModuleElementKey value) {
        this.getModuleElementsResult = value;
    }

}
