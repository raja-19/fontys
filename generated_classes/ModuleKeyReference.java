
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleKeyReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleKeyReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProjectKey" minOccurs="0"/&gt;
 *         &lt;element name="Key" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleKeyReference", propOrder = {
    "project",
    "key"
})
public class ModuleKeyReference {

    @XmlElement(name = "Project", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ProjectKey project;
    @XmlElement(name = "Key", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleKey key;

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectKey }
     *     
     */
    public ProjectKey getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectKey }
     *     
     */
    public void setProject(ProjectKey value) {
        this.project = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setKey(ModuleKey value) {
        this.key = value;
    }

}
