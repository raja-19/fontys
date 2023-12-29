
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
 *         &lt;element name="GetModuleElementResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement" minOccurs="0"/&gt;
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
    "getModuleElementResult"
})
@XmlRootElement(name = "GetModuleElementResponse")
public class GetModuleElementResponse {

    @XmlElement(name = "GetModuleElementResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleElement getModuleElementResult;

    /**
     * Gets the value of the getModuleElementResult property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleElement }
     *     
     */
    public ModuleElement getGetModuleElementResult() {
        return getModuleElementResult;
    }

    /**
     * Sets the value of the getModuleElementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleElement }
     *     
     */
    public void setGetModuleElementResult(ModuleElement value) {
        this.getModuleElementResult = value;
    }

}
