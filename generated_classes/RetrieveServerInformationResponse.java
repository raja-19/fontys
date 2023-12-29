
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
 *         &lt;element name="RetrieveServerInformationResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServerInformation" minOccurs="0"/&gt;
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
    "retrieveServerInformationResult"
})
@XmlRootElement(name = "RetrieveServerInformationResponse")
public class RetrieveServerInformationResponse {

    @XmlElement(name = "RetrieveServerInformationResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ServerInformation retrieveServerInformationResult;

    /**
     * Gets the value of the retrieveServerInformationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServerInformation }
     *     
     */
    public ServerInformation getRetrieveServerInformationResult() {
        return retrieveServerInformationResult;
    }

    /**
     * Sets the value of the retrieveServerInformationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerInformation }
     *     
     */
    public void setRetrieveServerInformationResult(ServerInformation value) {
        this.retrieveServerInformationResult = value;
    }

}
