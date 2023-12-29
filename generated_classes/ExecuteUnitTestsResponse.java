
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
 *         &lt;element name="ExecuteUnitTestsResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}UnitTestExecutionResponse" minOccurs="0"/&gt;
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
    "executeUnitTestsResult"
})
@XmlRootElement(name = "ExecuteUnitTestsResponse")
public class ExecuteUnitTestsResponse {

    @XmlElement(name = "ExecuteUnitTestsResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected UnitTestExecutionResponse executeUnitTestsResult;

    /**
     * Gets the value of the executeUnitTestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link UnitTestExecutionResponse }
     *     
     */
    public UnitTestExecutionResponse getExecuteUnitTestsResult() {
        return executeUnitTestsResult;
    }

    /**
     * Sets the value of the executeUnitTestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitTestExecutionResponse }
     *     
     */
    public void setExecuteUnitTestsResult(UnitTestExecutionResponse value) {
        this.executeUnitTestsResult = value;
    }

}
