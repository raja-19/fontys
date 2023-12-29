
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitTestReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitTestReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnitTestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileResults" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProfileResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitTestReport", propOrder = {
    "unitTestName",
    "profileResults"
})
public class UnitTestReport {

    @XmlElement(name = "UnitTestName", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String unitTestName;
    @XmlElement(name = "ProfileResults", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfProfileResult profileResults;

    /**
     * Gets the value of the unitTestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTestName() {
        return unitTestName;
    }

    /**
     * Sets the value of the unitTestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTestName(String value) {
        this.unitTestName = value;
    }

    /**
     * Gets the value of the profileResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileResult }
     *     
     */
    public ArrayOfProfileResult getProfileResults() {
        return profileResults;
    }

    /**
     * Sets the value of the profileResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileResult }
     *     
     */
    public void setProfileResults(ArrayOfProfileResult value) {
        this.profileResults = value;
    }

}
