
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConflictReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConflictReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentConflict" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ContentConflict" minOccurs="0"/&gt;
 *         &lt;element name="DuplicateConflict" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DuplicateConflict" minOccurs="0"/&gt;
 *         &lt;element name="DeleteConflict" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DeleteConflict" minOccurs="0"/&gt;
 *         &lt;element name="ModuleConflict" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleConflict" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConflictReference", propOrder = {
    "contentConflict",
    "duplicateConflict",
    "deleteConflict",
    "moduleConflict"
})
public class ConflictReference {

    @XmlElement(name = "ContentConflict", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ContentConflict contentConflict;
    @XmlElement(name = "DuplicateConflict", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected DuplicateConflict duplicateConflict;
    @XmlElement(name = "DeleteConflict", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected DeleteConflict deleteConflict;
    @XmlElement(name = "ModuleConflict", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleConflict moduleConflict;

    /**
     * Gets the value of the contentConflict property.
     * 
     * @return
     *     possible object is
     *     {@link ContentConflict }
     *     
     */
    public ContentConflict getContentConflict() {
        return contentConflict;
    }

    /**
     * Sets the value of the contentConflict property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentConflict }
     *     
     */
    public void setContentConflict(ContentConflict value) {
        this.contentConflict = value;
    }

    /**
     * Gets the value of the duplicateConflict property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateConflict }
     *     
     */
    public DuplicateConflict getDuplicateConflict() {
        return duplicateConflict;
    }

    /**
     * Sets the value of the duplicateConflict property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateConflict }
     *     
     */
    public void setDuplicateConflict(DuplicateConflict value) {
        this.duplicateConflict = value;
    }

    /**
     * Gets the value of the deleteConflict property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteConflict }
     *     
     */
    public DeleteConflict getDeleteConflict() {
        return deleteConflict;
    }

    /**
     * Sets the value of the deleteConflict property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteConflict }
     *     
     */
    public void setDeleteConflict(DeleteConflict value) {
        this.deleteConflict = value;
    }

    /**
     * Gets the value of the moduleConflict property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleConflict }
     *     
     */
    public ModuleConflict getModuleConflict() {
        return moduleConflict;
    }

    /**
     * Sets the value of the moduleConflict property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleConflict }
     *     
     */
    public void setModuleConflict(ModuleConflict value) {
        this.moduleConflict = value;
    }

}
