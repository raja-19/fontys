
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalLibraryConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalLibraryConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProjectConfiguration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documents" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfLibraryDocument" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ReleaseNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalLibraryConfiguration", propOrder = {
    "documents",
    "version",
    "releaseNotes"
})
public class InternalLibraryConfiguration
    extends ProjectConfiguration
{

    @XmlElement(name = "Documents")
    protected ArrayOfLibraryDocument documents;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "ReleaseNotes")
    protected String releaseNotes;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLibraryDocument }
     *     
     */
    public ArrayOfLibraryDocument getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLibraryDocument }
     *     
     */
    public void setDocuments(ArrayOfLibraryDocument value) {
        this.documents = value;
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
