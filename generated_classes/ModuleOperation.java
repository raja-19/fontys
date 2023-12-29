
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Operation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalKey" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0"/&gt;
 *         &lt;element name="Module" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Module" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleOperation", propOrder = {
    "project",
    "originalKey",
    "module"
})
public class ModuleOperation
    extends Operation
{

    @XmlElement(name = "Project", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String project;
    @XmlElement(name = "OriginalKey", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleKey originalKey;
    @XmlElement(name = "Module", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected Module module;

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
     * Gets the value of the originalKey property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getOriginalKey() {
        return originalKey;
    }

    /**
     * Sets the value of the originalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setOriginalKey(ModuleKey value) {
        this.originalKey = value;
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

}
