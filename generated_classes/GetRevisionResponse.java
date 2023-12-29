
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
 *         &lt;element name="GetRevisionResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Revision" minOccurs="0"/&gt;
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
    "getRevisionResult"
})
@XmlRootElement(name = "GetRevisionResponse")
public class GetRevisionResponse {

    @XmlElement(name = "GetRevisionResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected Revision getRevisionResult;

    /**
     * Gets the value of the getRevisionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Revision }
     *     
     */
    public Revision getGetRevisionResult() {
        return getRevisionResult;
    }

    /**
     * Sets the value of the getRevisionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revision }
     *     
     */
    public void setGetRevisionResult(Revision value) {
        this.getRevisionResult = value;
    }

}
