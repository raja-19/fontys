
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitTestResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitTestResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessages" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfUnitTestErrorMessage" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedValue" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="SourcedValue" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Succeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitTestResult", propOrder = {
    "errorMessages",
    "expectedValue",
    "sourcedValue",
    "succeeded"
})
public class UnitTestResult {

    @XmlElement(name = "ErrorMessages", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfUnitTestErrorMessage errorMessages;
    @XmlElement(name = "ExpectedValue", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfString expectedValue;
    @XmlElement(name = "SourcedValue", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfString sourcedValue;
    @XmlElement(name = "Succeeded", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean succeeded;

    /**
     * Gets the value of the errorMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitTestErrorMessage }
     *     
     */
    public ArrayOfUnitTestErrorMessage getErrorMessages() {
        return errorMessages;
    }

    /**
     * Sets the value of the errorMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitTestErrorMessage }
     *     
     */
    public void setErrorMessages(ArrayOfUnitTestErrorMessage value) {
        this.errorMessages = value;
    }

    /**
     * Gets the value of the expectedValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getExpectedValue() {
        return expectedValue;
    }

    /**
     * Sets the value of the expectedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setExpectedValue(ArrayOfString value) {
        this.expectedValue = value;
    }

    /**
     * Gets the value of the sourcedValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSourcedValue() {
        return sourcedValue;
    }

    /**
     * Sets the value of the sourcedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSourcedValue(ArrayOfString value) {
        this.sourcedValue = value;
    }

    /**
     * Gets the value of the succeeded property.
     * 
     */
    public boolean isSucceeded() {
        return succeeded;
    }

    /**
     * Sets the value of the succeeded property.
     * 
     */
    public void setSucceeded(boolean value) {
        this.succeeded = value;
    }

}
