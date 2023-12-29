
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudioExportWithMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudioExportWithMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Export" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}StudioExport" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProjectMetadata" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudioExportWithMetadata", propOrder = {
    "export",
    "metadata"
})
public class StudioExportWithMetadata {

    @XmlElement(name = "Export", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected StudioExport export;
    @XmlElement(name = "Metadata", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ProjectMetadata metadata;

    /**
     * Gets the value of the export property.
     * 
     * @return
     *     possible object is
     *     {@link StudioExport }
     *     
     */
    public StudioExport getExport() {
        return export;
    }

    /**
     * Sets the value of the export property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudioExport }
     *     
     */
    public void setExport(StudioExport value) {
        this.export = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectMetadata }
     *     
     */
    public ProjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectMetadata }
     *     
     */
    public void setMetadata(ProjectMetadata value) {
        this.metadata = value;
    }

}
