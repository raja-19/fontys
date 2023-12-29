
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
 *         &lt;element name="ExportProjectWithMetadataResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}StudioExportWithMetadata" minOccurs="0"/&gt;
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
    "exportProjectWithMetadataResult"
})
@XmlRootElement(name = "ExportProjectWithMetadataResponse")
public class ExportProjectWithMetadataResponse {

    @XmlElement(name = "ExportProjectWithMetadataResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected StudioExportWithMetadata exportProjectWithMetadataResult;

    /**
     * Gets the value of the exportProjectWithMetadataResult property.
     * 
     * @return
     *     possible object is
     *     {@link StudioExportWithMetadata }
     *     
     */
    public StudioExportWithMetadata getExportProjectWithMetadataResult() {
        return exportProjectWithMetadataResult;
    }

    /**
     * Sets the value of the exportProjectWithMetadataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudioExportWithMetadata }
     *     
     */
    public void setExportProjectWithMetadataResult(StudioExportWithMetadata value) {
        this.exportProjectWithMetadataResult = value;
    }

}
