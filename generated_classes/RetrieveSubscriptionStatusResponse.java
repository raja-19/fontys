
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
 *         &lt;element name="RetrieveSubscriptionStatusResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SubscriptionStatus" minOccurs="0"/&gt;
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
    "retrieveSubscriptionStatusResult"
})
@XmlRootElement(name = "RetrieveSubscriptionStatusResponse")
public class RetrieveSubscriptionStatusResponse {

    @XmlElement(name = "RetrieveSubscriptionStatusResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected SubscriptionStatus retrieveSubscriptionStatusResult;

    /**
     * Gets the value of the retrieveSubscriptionStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStatus }
     *     
     */
    public SubscriptionStatus getRetrieveSubscriptionStatusResult() {
        return retrieveSubscriptionStatusResult;
    }

    /**
     * Sets the value of the retrieveSubscriptionStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStatus }
     *     
     */
    public void setRetrieveSubscriptionStatusResult(SubscriptionStatus value) {
        this.retrieveSubscriptionStatusResult = value;
    }

}
