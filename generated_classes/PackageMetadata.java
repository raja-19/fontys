
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Libraries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfLibraryMetadata" minOccurs="0"/&gt;
 *         &lt;element name="Examples" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProjectKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageMetadata", propOrder = {
    "libraries",
    "examples"
})
public class PackageMetadata {

    @XmlElement(name = "Libraries", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfLibraryMetadata libraries;
    @XmlElement(name = "Examples", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfProjectKey examples;

    /**
     * Gets the value of the libraries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLibraryMetadata }
     *     
     */
    public ArrayOfLibraryMetadata getLibraries() {
        return libraries;
    }

    /**
     * Sets the value of the libraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLibraryMetadata }
     *     
     */
    public void setLibraries(ArrayOfLibraryMetadata value) {
        this.libraries = value;
    }

    /**
     * Gets the value of the examples property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectKey }
     *     
     */
    public ArrayOfProjectKey getExamples() {
        return examples;
    }

    /**
     * Sets the value of the examples property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectKey }
     *     
     */
    public void setExamples(ArrayOfProjectKey value) {
        this.examples = value;
    }

}
