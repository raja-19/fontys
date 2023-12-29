
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectImportArguments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectImportArguments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arguments" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProjectImportArgument" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectImportArguments", propOrder = {
    "arguments"
})
public class ProjectImportArguments {

    @XmlElement(name = "Arguments", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfProjectImportArgument arguments;

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectImportArgument }
     *     
     */
    public ArrayOfProjectImportArgument getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectImportArgument }
     *     
     */
    public void setArguments(ArrayOfProjectImportArgument value) {
        this.arguments = value;
    }

}
