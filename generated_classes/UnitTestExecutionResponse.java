
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitTestExecutionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitTestExecutionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Succeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Results" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfUnitTestReport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitTestExecutionResponse", propOrder = {
    "succeeded",
    "results"
})
public class UnitTestExecutionResponse {

    @XmlElement(name = "Succeeded", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean succeeded;
    @XmlElement(name = "Results", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfUnitTestReport results;

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

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitTestReport }
     *     
     */
    public ArrayOfUnitTestReport getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitTestReport }
     *     
     */
    public void setResults(ArrayOfUnitTestReport value) {
        this.results = value;
    }

}
