
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleElementKeyReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleElementKeyReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProjectKey" minOccurs="0"/&gt;
 *         &lt;element name="Module" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0"/&gt;
 *         &lt;element name="Key" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElementKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleElementKeyReference", propOrder = {
    "project",
    "module",
    "key"
})
public class ModuleElementKeyReference {

    @XmlElement(name = "Project", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ProjectKey project;
    @XmlElement(name = "Module", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleKey module;
    @XmlElement(name = "Key", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleElementKey key;

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
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setModule(ModuleKey value) {
        this.module = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleElementKey }
     *     
     */
    public ModuleElementKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleElementKey }
     *     
     */
    public void setKey(ModuleElementKey value) {
        this.key = value;
    }

}