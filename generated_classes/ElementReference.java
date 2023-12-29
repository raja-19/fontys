
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Global" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement" minOccurs="0"/&gt;
 *         &lt;element name="ModuleElement" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement" minOccurs="0"/&gt;
 *         &lt;element name="Module" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Module" minOccurs="0"/&gt;
 *         &lt;element name="Project" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Project" minOccurs="0"/&gt;
 *         &lt;element name="Package" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}LibraryPackage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementReference", propOrder = {
    "global",
    "moduleElement",
    "module",
    "project",
    "_package"
})
public class ElementReference {

    @XmlElement(name = "Global", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected GlobalElement global;
    @XmlElement(name = "ModuleElement", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleElement moduleElement;
    @XmlElement(name = "Module", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected Module module;
    @XmlElement(name = "Project", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected Project project;
    @XmlElement(name = "Package", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected LibraryPackage _package;

    /**
     * Gets the value of the global property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalElement }
     *     
     */
    public GlobalElement getGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalElement }
     *     
     */
    public void setGlobal(GlobalElement value) {
        this.global = value;
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

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link Module }
     *     
     */
    public Module getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link Module }
     *     
     */
    public void setModule(Module value) {
        this.module = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryPackage }
     *     
     */
    public LibraryPackage getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryPackage }
     *     
     */
    public void setPackage(LibraryPackage value) {
        this._package = value;
    }

}
