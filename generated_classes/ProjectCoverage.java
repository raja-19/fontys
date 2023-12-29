
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectCoverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectCoverage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Module" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0"/&gt;
 *         &lt;element name="UnitTestData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfUnitTestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectCoverage", propOrder = {
    "projectName",
    "module",
    "unitTestData"
})
public class ProjectCoverage {

    @XmlElement(name = "ProjectName", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String projectName;
    @XmlElement(name = "Module", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleKey module;
    @XmlElement(name = "UnitTestData", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfUnitTestData unitTestData;

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
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
     * Gets the value of the unitTestData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitTestData }
     *     
     */
    public ArrayOfUnitTestData getUnitTestData() {
        return unitTestData;
    }

    /**
     * Sets the value of the unitTestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitTestData }
     *     
     */
    public void setUnitTestData(ArrayOfUnitTestData value) {
        this.unitTestData = value;
    }

}
