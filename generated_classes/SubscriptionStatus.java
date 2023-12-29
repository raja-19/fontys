
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Subscribers" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfUserSubscription" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionStatus", propOrder = {
    "subscribers"
})
public class SubscriptionStatus {

    @XmlElement(name = "Subscribers", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfUserSubscription subscribers;

    /**
     * Gets the value of the subscribers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserSubscription }
     *     
     */
    public ArrayOfUserSubscription getSubscribers() {
        return subscribers;
    }

    /**
     * Sets the value of the subscribers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserSubscription }
     *     
     */
    public void setSubscribers(ArrayOfUserSubscription value) {
        this.subscribers = value;
    }

}
