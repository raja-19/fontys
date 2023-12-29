
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
 *         &lt;element name="ExportProjectRevisionResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}StudioExport" minOccurs="0"/&gt;
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
    "exportProjectRevisionResult"
})
@XmlRootElement(name = "ExportProjectRevisionResponse")
public class ExportProjectRevisionResponse {

    @XmlElement(name = "ExportProjectRevisionResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected StudioExport exportProjectRevisionResult;

    /**
     * Gets the value of the exportProjectRevisionResult property.
     * 
     * @return
     *     possible object is
     *     {@link StudioExport }
     *     
     */
    public StudioExport getExportProjectRevisionResult() {
        return exportProjectRevisionResult;
    }

    /**
     * Sets the value of the exportProjectRevisionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudioExport }
     *     
     */
    public void setExportProjectRevisionResult(StudioExport value) {
        this.exportProjectRevisionResult = value;
    }

}
