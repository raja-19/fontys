
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UnitTestResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}UnitTestResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileResult", propOrder = {
    "profileId",
    "unitTestResult"
})
public class ProfileResult {

    @XmlElement(name = "ProfileId", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected int profileId;
    @XmlElement(name = "UnitTestResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected UnitTestResult unitTestResult;

    /**
     * Gets the value of the profileId property.
     * 
     */
    public int getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     */
    public void setProfileId(int value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the unitTestResult property.
     * 
     * @return
     *     possible object is
     *     {@link UnitTestResult }
     *     
     */
    public UnitTestResult getUnitTestResult() {
        return unitTestResult;
    }

    /**
     * Sets the value of the unitTestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitTestResult }
     *     
     */
    public void setUnitTestResult(UnitTestResult value) {
        this.unitTestResult = value;
    }

}
