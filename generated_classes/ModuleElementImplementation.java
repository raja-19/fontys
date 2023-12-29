
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleElementImplementation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleElementImplementation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Module" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0"/&gt;
 *         &lt;element name="ModuleElement" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleElementImplementation", propOrder = {
    "project",
    "module",
    "moduleElement"
})
public class ModuleElementImplementation {

    @XmlElement(name = "Project", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String project;
    @XmlElement(name = "Module", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleKey module;
    @XmlElement(name = "ModuleElement", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleElement moduleElement;

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject(String value) {
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
     * Gets the value of the moduleElement property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleElement }
     *     
     */
    public ModuleElement getModuleElement() {
        return moduleElement;
    }

    /**
     * Sets the value of the moduleElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleElement }
     *     
     */
    public void setModuleElement(ModuleElement value) {
        this.moduleElement = value;
    }

}
