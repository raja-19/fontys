
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
 *         &lt;element name="GetGlobalElementResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement" minOccurs="0"/&gt;
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
    "getGlobalElementResult"
})
@XmlRootElement(name = "GetGlobalElementResponse")
public class GetGlobalElementResponse {

    @XmlElement(name = "GetGlobalElementResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected GlobalElement getGlobalElementResult;

    /**
     * Gets the value of the getGlobalElementResult property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalElement }
     *     
     */
    public GlobalElement getGetGlobalElementResult() {
        return getGlobalElementResult;
    }

    /**
     * Sets the value of the getGlobalElementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalElement }
     *     
     */
    public void setGetGlobalElementResult(GlobalElement value) {
        this.getGlobalElementResult = value;
    }

}
