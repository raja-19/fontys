
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificationImplementation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificationImplementation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceImplementations" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfReferenceImplementation" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="LinkedElementSets" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfLinkedElementSet" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SpecificationDocument" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Implemented" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificationImplementation", propOrder = {
    "referenceImplementations",
    "linkedElementSets"
})
public class SpecificationImplementation
    extends ModuleElement
{

    @XmlElement(name = "ReferenceImplementations")
    protected ArrayOfReferenceImplementation referenceImplementations;
    @XmlElement(name = "LinkedElementSets")
    protected ArrayOfLinkedElementSet linkedElementSets;
    @XmlAttribute(name = "SpecificationDocument")
    protected String specificationDocument;
    @XmlAttribute(name = "Implemented")
    protected String implemented;

    /**
     * Gets the value of the referenceImplementations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReferenceImplementation }
     *     
     */
    public ArrayOfReferenceImplementation getReferenceImplementations() {
        return referenceImplementations;
    }

    /**
     * Sets the value of the referenceImplementations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReferenceImplementation }
     *     
     */
    public void setReferenceImplementations(ArrayOfReferenceImplementation value) {
        this.referenceImplementations = value;
    }

    /**
     * Gets the value of the linkedElementSets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLinkedElementSet }
     *     
     */
    public ArrayOfLinkedElementSet getLinkedElementSets() {
        return linkedElementSets;
    }

    /**
     * Sets the value of the linkedElementSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLinkedElementSet }
     *     
     */
    public void setLinkedElementSets(ArrayOfLinkedElementSet value) {
        this.linkedElementSets = value;
    }

    /**
     * Gets the value of the specificationDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationDocument() {
        return specificationDocument;
    }

    /**
     * Sets the value of the specificationDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationDocument(String value) {
        this.specificationDocument = value;
    }

    /**
     * Gets the value of the implemented property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplemented() {
        return implemented;
    }

    /**
     * Sets the value of the implemented property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplemented(String value) {
        this.implemented = value;
    }

}
