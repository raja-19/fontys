
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
 *         &lt;element name="HasModuleWriteAccessResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "hasModuleWriteAccessResult"
})
@XmlRootElement(name = "HasModuleWriteAccessResponse")
public class HasModuleWriteAccessResponse {

    @XmlElement(name = "HasModuleWriteAccessResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean hasModuleWriteAccessResult;

    /**
     * Gets the value of the hasModuleWriteAccessResult property.
     * 
     */
    public boolean isHasModuleWriteAccessResult() {
        return hasModuleWriteAccessResult;
    }

    /**
     * Sets the value of the hasModuleWriteAccessResult property.
     * 
     */
    public void setHasModuleWriteAccessResult(boolean value) {
        this.hasModuleWriteAccessResult = value;
    }

}