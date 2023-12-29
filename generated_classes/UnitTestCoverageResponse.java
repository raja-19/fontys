
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitTestCoverageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitTestCoverageResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectCoverage" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProjectCoverage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitTestCoverageResponse", propOrder = {
    "projectCoverage"
})
public class UnitTestCoverageResponse {

    @XmlElement(name = "ProjectCoverage", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfProjectCoverage projectCoverage;

    /**
     * Gets the value of the projectCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectCoverage }
     *     
     */
    public ArrayOfProjectCoverage getProjectCoverage() {
        return projectCoverage;
    }

    /**
     * Sets the value of the projectCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectCoverage }
     *     
     */
    public void setProjectCoverage(ArrayOfProjectCoverage value) {
        this.projectCoverage = value;
    }

}
