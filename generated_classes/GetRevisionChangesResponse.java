
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
 *         &lt;element name="GetRevisionChangesResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfElementChange" minOccurs="0"/&gt;
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
    "getRevisionChangesResult"
})
@XmlRootElement(name = "GetRevisionChangesResponse")
public class GetRevisionChangesResponse {

    @XmlElement(name = "GetRevisionChangesResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfElementChange getRevisionChangesResult;

    /**
     * Gets the value of the getRevisionChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElementChange }
     *     
     */
    public ArrayOfElementChange getGetRevisionChangesResult() {
        return getRevisionChangesResult;
    }

    /**
     * Sets the value of the getRevisionChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElementChange }
     *     
     */
    public void setGetRevisionChangesResult(ArrayOfElementChange value) {
        this.getRevisionChangesResult = value;
    }

}
