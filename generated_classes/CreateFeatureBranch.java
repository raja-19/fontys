
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="repository" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="basedOnBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branch" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Branch" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "repository",
    "basedOnBranch",
    "branch"
})
@XmlRootElement(name = "CreateFeatureBranch")
public class CreateFeatureBranch {

    @XmlElement(namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String repository;
    @XmlElement(namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String basedOnBranch;
    @XmlElement(namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected Branch branch;

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepository(String value) {
        this.repository = value;
    }

    /**
     * Gets the value of the basedOnBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasedOnBranch() {
        return basedOnBranch;
    }

    /**
     * Sets the value of the basedOnBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasedOnBranch(String value) {
        this.basedOnBranch = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
    }

}