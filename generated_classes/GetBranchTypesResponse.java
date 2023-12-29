
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
 *         &lt;element name="GetBranchTypesResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString" minOccurs="0"/&gt;
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
    "getBranchTypesResult"
})
@XmlRootElement(name = "GetBranchTypesResponse")
public class GetBranchTypesResponse {

    @XmlElement(name = "GetBranchTypesResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfString getBranchTypesResult;

    /**
     * Gets the value of the getBranchTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetBranchTypesResult() {
        return getBranchTypesResult;
    }

    /**
     * Sets the value of the getBranchTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetBranchTypesResult(ArrayOfString value) {
        this.getBranchTypesResult = value;
    }

}
