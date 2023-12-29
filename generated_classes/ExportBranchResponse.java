
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
 *         &lt;element name="ExportBranchResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}StudioExport" minOccurs="0"/&gt;
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
    "exportBranchResult"
})
@XmlRootElement(name = "ExportBranchResponse")
public class ExportBranchResponse {

    @XmlElement(name = "ExportBranchResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected StudioExport exportBranchResult;

    /**
     * Gets the value of the exportBranchResult property.
     * 
     * @return
     *     possible object is
     *     {@link StudioExport }
     *     
     */
    public StudioExport getExportBranchResult() {
        return exportBranchResult;
    }

    /**
     * Sets the value of the exportBranchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudioExport }
     *     
     */
    public void setExportBranchResult(StudioExport value) {
        this.exportBranchResult = value;
    }

}
