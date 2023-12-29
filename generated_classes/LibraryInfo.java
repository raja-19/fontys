
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LibraryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LibraryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsExternal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibraryInfo", propOrder = {
    "isExternal",
    "name",
    "version",
    "releaseNotes"
})
public class LibraryInfo {

    @XmlElement(name = "IsExternal", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean isExternal;
    @XmlElement(name = "Name", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String name;
    @XmlElement(name = "Version", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String version;
    @XmlElement(name = "ReleaseNotes", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String releaseNotes;

    /**
     * Gets the value of the isExternal property.
     * 
     */
    public boolean isIsExternal() {
        return isExternal;
    }

    /**
     * Sets the value of the isExternal property.
     * 
     */
    public void setIsExternal(boolean value) {
        this.isExternal = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the releaseNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNotes() {
        return releaseNotes;
    }

    /**
     * Sets the value of the releaseNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNotes(String value) {
        this.releaseNotes = value;
    }

}
