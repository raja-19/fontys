
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
 *         &lt;element name="GetPackageResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}LibraryPackage" minOccurs="0"/&gt;
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
    "getPackageResult"
})
@XmlRootElement(name = "GetPackageResponse")
public class GetPackageResponse {

    @XmlElement(name = "GetPackageResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected LibraryPackage getPackageResult;

    /**
     * Gets the value of the getPackageResult property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryPackage }
     *     
     */
    public LibraryPackage getGetPackageResult() {
        return getPackageResult;
    }

    /**
     * Sets the value of the getPackageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryPackage }
     *     
     */
    public void setGetPackageResult(LibraryPackage value) {
        this.getPackageResult = value;
    }

}
