
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
 *         &lt;element name="GetMostSpecificModuleElementResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElementImplementation" minOccurs="0"/&gt;
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
    "getMostSpecificModuleElementResult"
})
@XmlRootElement(name = "GetMostSpecificModuleElementResponse")
public class GetMostSpecificModuleElementResponse {

    @XmlElement(name = "GetMostSpecificModuleElementResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleElementImplementation getMostSpecificModuleElementResult;

    /**
     * Gets the value of the getMostSpecificModuleElementResult property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleElementImplementation }
     *     
     */
    public ModuleElementImplementation getGetMostSpecificModuleElementResult() {
        return getMostSpecificModuleElementResult;
    }

    /**
     * Sets the value of the getMostSpecificModuleElementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleElementImplementation }
     *     
     */
    public void setGetMostSpecificModuleElementResult(ModuleElementImplementation value) {
        this.getMostSpecificModuleElementResult = value;
    }

}
