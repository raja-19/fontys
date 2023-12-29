
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
 *         &lt;element name="IsInRoleResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isInRoleResult"
})
@XmlRootElement(name = "IsInRoleResponse")
public class IsInRoleResponse {

    @XmlElement(name = "IsInRoleResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean isInRoleResult;

    /**
     * Gets the value of the isInRoleResult property.
     * 
     */
    public boolean isIsInRoleResult() {
        return isInRoleResult;
    }

    /**
     * Sets the value of the isInRoleResult property.
     * 
     */
    public void setIsInRoleResult(boolean value) {
        this.isInRoleResult = value;
    }

}
