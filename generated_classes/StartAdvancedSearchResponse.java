
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
 *         &lt;element name="StartAdvancedSearchResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SearchIdentifier" minOccurs="0"/&gt;
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
    "startAdvancedSearchResult"
})
@XmlRootElement(name = "StartAdvancedSearchResponse")
public class StartAdvancedSearchResponse {

    @XmlElement(name = "StartAdvancedSearchResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected SearchIdentifier startAdvancedSearchResult;

    /**
     * Gets the value of the startAdvancedSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchIdentifier }
     *     
     */
    public SearchIdentifier getStartAdvancedSearchResult() {
        return startAdvancedSearchResult;
    }

    /**
     * Sets the value of the startAdvancedSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIdentifier }
     *     
     */
    public void setStartAdvancedSearchResult(SearchIdentifier value) {
        this.startAdvancedSearchResult = value;
    }

}
