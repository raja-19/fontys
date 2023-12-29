
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
 *         &lt;element name="GetAdvancedSearchResultsResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}AdvancedSearchResults" minOccurs="0"/&gt;
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
    "getAdvancedSearchResultsResult"
})
@XmlRootElement(name = "GetAdvancedSearchResultsResponse")
public class GetAdvancedSearchResultsResponse {

    @XmlElement(name = "GetAdvancedSearchResultsResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected AdvancedSearchResults getAdvancedSearchResultsResult;

    /**
     * Gets the value of the getAdvancedSearchResultsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AdvancedSearchResults }
     *     
     */
    public AdvancedSearchResults getGetAdvancedSearchResultsResult() {
        return getAdvancedSearchResultsResult;
    }

    /**
     * Sets the value of the getAdvancedSearchResultsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvancedSearchResults }
     *     
     */
    public void setGetAdvancedSearchResultsResult(AdvancedSearchResults value) {
        this.getAdvancedSearchResultsResult = value;
    }

}
