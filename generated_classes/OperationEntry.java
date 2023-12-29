
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalOperation" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalOperation" minOccurs="0"/&gt;
 *         &lt;element name="ModuleElementOperation" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElementOperation" minOccurs="0"/&gt;
 *         &lt;element name="ModuleOperation" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleOperation" minOccurs="0"/&gt;
 *         &lt;element name="ProjectOperation" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProjectOperation" minOccurs="0"/&gt;
 *         &lt;element name="PackageOperation" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}PackageOperation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationEntry", propOrder = {
    "globalOperation",
    "moduleElementOperation",
    "moduleOperation",
    "projectOperation",
    "packageOperation"
})
public class OperationEntry {

    @XmlElement(name = "GlobalOperation", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected GlobalOperation globalOperation;
    @XmlElement(name = "ModuleElementOperation", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleElementOperation moduleElementOperation;
    @XmlElement(name = "ModuleOperation", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleOperation moduleOperation;
    @XmlElement(name = "ProjectOperation", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ProjectOperation projectOperation;
    @XmlElement(name = "PackageOperation", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected PackageOperation packageOperation;

    /**
     * Gets the value of the globalOperation property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalOperation }
     *     
     */
    public GlobalOperation getGlobalOperation() {
        return globalOperation;
    }

    /**
     * Sets the value of the globalOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalOperation }
     *     
     */
    public void setGlobalOperation(GlobalOperation value) {
        this.globalOperation = value;
    }

    /**
     * Gets the value of the moduleElementOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleElementOperation }
     *     
     */
    public ModuleElementOperation getModuleElementOperation() {
        return moduleElementOperation;
    }

    /**
     * Sets the value of the moduleElementOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleElementOperation }
     *     
     */
    public void setModuleElementOperation(ModuleElementOperation value) {
        this.moduleElementOperation = value;
    }

    /**
     * Gets the value of the moduleOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleOperation }
     *     
     */
    public ModuleOperation getModuleOperation() {
        return moduleOperation;
    }

    /**
     * Sets the value of the moduleOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleOperation }
     *     
     */
    public void setModuleOperation(ModuleOperation value) {
        this.moduleOperation = value;
    }

    /**
     * Gets the value of the projectOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectOperation }
     *     
     */
    public ProjectOperation getProjectOperation() {
        return projectOperation;
    }

    /**
     * Sets the value of the projectOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectOperation }
     *     
     */
    public void setProjectOperation(ProjectOperation value) {
        this.projectOperation = value;
    }

    /**
     * Gets the value of the packageOperation property.
     * 
     * @return
     *     possible object is
     *     {@link PackageOperation }
     *     
     */
    public PackageOperation getPackageOperation() {
        return packageOperation;
    }

    /**
     * Sets the value of the packageOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageOperation }
     *     
     */
    public void setPackageOperation(PackageOperation value) {
        this.packageOperation = value;
    }

}
