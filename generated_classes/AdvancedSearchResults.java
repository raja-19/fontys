
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvancedSearchResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvancedSearchResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultEntries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfResultEntry" minOccurs="0"/&gt;
 *         &lt;element name="IsSearchFinished" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancedSearchResults", propOrder = {
    "resultEntries",
    "isSearchFinished"
})
public class AdvancedSearchResults {

    @XmlElement(name = "ResultEntries", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfResultEntry resultEntries;
    @XmlElement(name = "IsSearchFinished", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean isSearchFinished;

    /**
     * Gets the value of the resultEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResultEntry }
     *     
     */
    public ArrayOfResultEntry getResultEntries() {
        return resultEntries;
    }

    /**
     * Sets the value of the resultEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResultEntry }
     *     
     */
    public void setResultEntries(ArrayOfResultEntry value) {
        this.resultEntries = value;
    }

    /**
     * Gets the value of the isSearchFinished property.
     * 
     */
    public boolean isIsSearchFinished() {
        return isSearchFinished;
    }

    /**
     * Sets the value of the isSearchFinished property.
     * 
     */
    public void setIsSearchFinished(boolean value) {
        this.isSearchFinished = value;
    }

}
