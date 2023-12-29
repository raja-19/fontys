
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Libraries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfLibraryInfo" minOccurs="0"/&gt;
 *         &lt;element name="WebServices" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfWebServiceInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectMetadata", propOrder = {
    "libraries",
    "webServices"
})
public class ProjectMetadata {

    @XmlElement(name = "Libraries", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfLibraryInfo libraries;
    @XmlElement(name = "WebServices", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfWebServiceInfo webServices;

    /**
     * Gets the value of the libraries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLibraryInfo }
     *     
     */
    public ArrayOfLibraryInfo getLibraries() {
        return libraries;
    }

    /**
     * Sets the value of the libraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLibraryInfo }
     *     
     */
    public void setLibraries(ArrayOfLibraryInfo value) {
        this.libraries = value;
    }

    /**
     * Gets the value of the webServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWebServiceInfo }
     *     
     */
    public ArrayOfWebServiceInfo getWebServices() {
        return webServices;
    }

    /**
     * Sets the value of the webServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWebServiceInfo }
     *     
     */
    public void setWebServices(ArrayOfWebServiceInfo value) {
        this.webServices = value;
    }

}
