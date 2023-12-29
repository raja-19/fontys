
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementKeyReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementKeyReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Global" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="ModuleElement" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElementKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="Module" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="Project" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProjectKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="Package" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}PackageKeyReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementKeyReference", propOrder = {
    "global",
    "moduleElement",
    "module",
    "project",
    "_package"
})
public class ElementKeyReference {

    @XmlElement(name = "Global", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected GlobalKeyReference global;
    @XmlElement(name = "ModuleElement", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleElementKeyReference moduleElement;
    @XmlElement(name = "Module", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleKeyReference module;
    @XmlElement(name = "Project", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ProjectKeyReference project;
    @XmlElement(name = "Package", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected PackageKeyReference _package;

    /**
     * Gets the value of the global property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalKeyReference }
     *     
     */
    public GlobalKeyReference getGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalKeyReference }
     *     
     */
    public void setGlobal(GlobalKeyReference value) {
        this.global = value;
    }

    /**
     * Gets the value of the moduleElement property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleElementKeyReference }
     *     
     */
    public ModuleElementKeyReference getModuleElement() {
        return moduleElement;
    }

    /**
     * Sets the value of the moduleElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleElementKeyReference }
     *     
     */
    public void setModuleElement(ModuleElementKeyReference value) {
        this.moduleElement = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKeyReference }
     *     
     */
    public ModuleKeyReference getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKeyReference }
     *     
     */
    public void setModule(ModuleKeyReference value) {
        this.module = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectKeyReference }
     *     
     */
    public ProjectKeyReference getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectKeyReference }
     *     
     */
    public void setProject(ProjectKeyReference value) {
        this.project = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link PackageKeyReference }
     *     
     */
    public PackageKeyReference getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageKeyReference }
     *     
     */
    public void setPackage(PackageKeyReference value) {
        this._package = value;
    }

}
