
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
 *         &lt;element name="GetLibrariesResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfLibrarySearchResult" minOccurs="0"/&gt;
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
    "getLibrariesResult"
})
@XmlRootElement(name = "GetLibrariesResponse")
public class GetLibrariesResponse {

    @XmlElement(name = "GetLibrariesResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfLibrarySearchResult getLibrariesResult;

    /**
     * Gets the value of the getLibrariesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLibrarySearchResult }
     *     
     */
    public ArrayOfLibrarySearchResult getGetLibrariesResult() {
        return getLibrariesResult;
    }

    /**
     * Sets the value of the getLibrariesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLibrarySearchResult }
     *     
     */
    public void setGetLibrariesResult(ArrayOfLibrarySearchResult value) {
        this.getLibrariesResult = value;
    }

}
