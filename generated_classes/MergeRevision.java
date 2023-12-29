
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
 *         &lt;element name="targetBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="revisionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discard" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="preview" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "targetBranch",
    "sourceBranch",
    "revisionId",
    "discard",
    "preview"
})
@XmlRootElement(name = "MergeRevision")
public class MergeRevision {

    @XmlElement(namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String repository;
    @XmlElement(namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String targetBranch;
    @XmlElement(namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String sourceBranch;
    @XmlElement(namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String revisionId;
    @XmlElement(namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean discard;
    @XmlElement(namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean preview;

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
     * Gets the value of the targetBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    /**
     * Sets the value of the targetBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetBranch(String value) {
        this.targetBranch = value;
    }

    /**
     * Gets the value of the sourceBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    /**
     * Sets the value of the sourceBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceBranch(String value) {
        this.sourceBranch = value;
    }

    /**
     * Gets the value of the revisionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * Sets the value of the revisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionId(String value) {
        this.revisionId = value;
    }

    /**
     * Gets the value of the discard property.
     * 
     */
    public boolean isDiscard() {
        return discard;
    }

    /**
     * Sets the value of the discard property.
     * 
     */
    public void setDiscard(boolean value) {
        this.discard = value;
    }

    /**
     * Gets the value of the preview property.
     * 
     */
    public boolean isPreview() {
        return preview;
    }

    /**
     * Sets the value of the preview property.
     * 
     */
    public void setPreview(boolean value) {
        this.preview = value;
    }

}
