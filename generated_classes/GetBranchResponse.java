
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
 *         &lt;element name="GetBranchResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Branch" minOccurs="0"/&gt;
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
    "getBranchResult"
})
@XmlRootElement(name = "GetBranchResponse")
public class GetBranchResponse {

    @XmlElement(name = "GetBranchResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected Branch getBranchResult;

    /**
     * Gets the value of the getBranchResult property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getGetBranchResult() {
        return getBranchResult;
    }

    /**
     * Sets the value of the getBranchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setGetBranchResult(Branch value) {
        this.getBranchResult = value;
    }

}
