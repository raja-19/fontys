
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
 *         &lt;element name="GetBranchTypeResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}BranchType" minOccurs="0"/&gt;
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
    "getBranchTypeResult"
})
@XmlRootElement(name = "GetBranchTypeResponse")
public class GetBranchTypeResponse {

    @XmlElement(name = "GetBranchTypeResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected BranchType getBranchTypeResult;

    /**
     * Gets the value of the getBranchTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link BranchType }
     *     
     */
    public BranchType getGetBranchTypeResult() {
        return getBranchTypeResult;
    }

    /**
     * Sets the value of the getBranchTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchType }
     *     
     */
    public void setGetBranchTypeResult(BranchType value) {
        this.getBranchTypeResult = value;
    }

}
