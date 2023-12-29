
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
 *         &lt;element name="GetRepositoriesResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString" minOccurs="0"/&gt;
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
    "getRepositoriesResult"
})
@XmlRootElement(name = "GetRepositoriesResponse")
public class GetRepositoriesResponse {

    @XmlElement(name = "GetRepositoriesResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfString getRepositoriesResult;

    /**
     * Gets the value of the getRepositoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetRepositoriesResult() {
        return getRepositoriesResult;
    }

    /**
     * Sets the value of the getRepositoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetRepositoriesResult(ArrayOfString value) {
        this.getRepositoriesResult = value;
    }

}
