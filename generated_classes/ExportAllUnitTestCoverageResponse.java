
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
 *         &lt;element name="ExportAllUnitTestCoverageResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}UnitTestCoverageResponse" minOccurs="0"/&gt;
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
    "exportAllUnitTestCoverageResult"
})
@XmlRootElement(name = "ExportAllUnitTestCoverageResponse")
public class ExportAllUnitTestCoverageResponse {

    @XmlElement(name = "ExportAllUnitTestCoverageResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected UnitTestCoverageResponse exportAllUnitTestCoverageResult;

    /**
     * Gets the value of the exportAllUnitTestCoverageResult property.
     * 
     * @return
     *     possible object is
     *     {@link UnitTestCoverageResponse }
     *     
     */
    public UnitTestCoverageResponse getExportAllUnitTestCoverageResult() {
        return exportAllUnitTestCoverageResult;
    }

    /**
     * Sets the value of the exportAllUnitTestCoverageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitTestCoverageResponse }
     *     
     */
    public void setExportAllUnitTestCoverageResult(UnitTestCoverageResponse value) {
        this.exportAllUnitTestCoverageResult = value;
    }

}
