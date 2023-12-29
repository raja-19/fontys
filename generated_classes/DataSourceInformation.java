
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSourceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSourceInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuggestedFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackupLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSourceInformation", propOrder = {
    "contentType",
    "suggestedFilename",
    "backupLocation"
})
public class DataSourceInformation {

    @XmlElement(name = "ContentType", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String contentType;
    @XmlElement(name = "SuggestedFilename", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String suggestedFilename;
    @XmlElement(name = "BackupLocation", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String backupLocation;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the suggestedFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedFilename() {
        return suggestedFilename;
    }

    /**
     * Sets the value of the suggestedFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedFilename(String value) {
        this.suggestedFilename = value;
    }

    /**
     * Gets the value of the backupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupLocation() {
        return backupLocation;
    }

    /**
     * Sets the value of the backupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupLocation(String value) {
        this.backupLocation = value;
    }

}
