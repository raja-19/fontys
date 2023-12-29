
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
 *         &lt;element name="GetAllModuleElementsResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfModuleElementKey" minOccurs="0"/&gt;
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
    "getAllModuleElementsResult"
})
@XmlRootElement(name = "GetAllModuleElementsResponse")
public class GetAllModuleElementsResponse {

    @XmlElement(name = "GetAllModuleElementsResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfModuleElementKey getAllModuleElementsResult;

    /**
     * Gets the value of the getAllModuleElementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModuleElementKey }
     *     
     */
    public ArrayOfModuleElementKey getGetAllModuleElementsResult() {
        return getAllModuleElementsResult;
    }

    /**
     * Sets the value of the getAllModuleElementsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModuleElementKey }
     *     
     */
    public void setGetAllModuleElementsResult(ArrayOfModuleElementKey value) {
        this.getAllModuleElementsResult = value;
    }

}
