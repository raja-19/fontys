
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
 *         &lt;element name="GetModuleResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Module" minOccurs="0"/&gt;
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
    "getModuleResult"
})
@XmlRootElement(name = "GetModuleResponse")
public class GetModuleResponse {

    @XmlElement(name = "GetModuleResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected Module getModuleResult;

    /**
     * Gets the value of the getModuleResult property.
     * 
     * @return
     *     possible object is
     *     {@link Module }
     *     
     */
    public Module getGetModuleResult() {
        return getModuleResult;
    }

    /**
     * Sets the value of the getModuleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Module }
     *     
     */
    public void setGetModuleResult(Module value) {
        this.getModuleResult = value;
    }

}
