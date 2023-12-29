
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
 *         &lt;element name="ExportProjectRevisionWithMetadataResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}StudioExportWithMetadata" minOccurs="0"/&gt;
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
    "exportProjectRevisionWithMetadataResult"
})
@XmlRootElement(name = "ExportProjectRevisionWithMetadataResponse")
public class ExportProjectRevisionWithMetadataResponse {

    @XmlElement(name = "ExportProjectRevisionWithMetadataResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected StudioExportWithMetadata exportProjectRevisionWithMetadataResult;

    /**
     * Gets the value of the exportProjectRevisionWithMetadataResult property.
     * 
     * @return
     *     possible object is
     *     {@link StudioExportWithMetadata }
     *     
     */
    public StudioExportWithMetadata getExportProjectRevisionWithMetadataResult() {
        return exportProjectRevisionWithMetadataResult;
    }

    /**
     * Sets the value of the exportProjectRevisionWithMetadataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudioExportWithMetadata }
     *     
     */
    public void setExportProjectRevisionWithMetadataResult(StudioExportWithMetadata value) {
        this.exportProjectRevisionWithMetadataResult = value;
    }

}
