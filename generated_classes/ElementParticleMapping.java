
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementParticleMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementParticleMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParticleMapping"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementRef" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="TypeReference" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}XsdTypeReference" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="InlineType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}TypeMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsNillable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Form" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SchemaForm" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementParticleMapping", propOrder = {
    "elementReference",
    "typeReference",
    "inlineType"
})
public class ElementParticleMapping
    extends ParticleMapping
{

    @XmlElement(name = "ElementReference")
    protected ElementRef elementReference;
    @XmlElement(name = "TypeReference")
    protected XsdTypeReference typeReference;
    @XmlElement(name = "InlineType")
    protected TypeMapping inlineType;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Attribute")
    protected String attribute;
    @XmlAttribute(name = "Relation")
    protected String relation;
    @XmlAttribute(name = "IsNillable", required = true)
    protected boolean isNillable;
    @XmlAttribute(name = "Form")
    protected SchemaForm form;

    /**
     * Gets the value of the elementReference property.
     * 
     * @return
     *     possible object is
     *     {@link ElementRef }
     *     
     */
    public ElementRef getElementReference() {
        return elementReference;
    }

    /**
     * Sets the value of the elementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementRef }
     *     
     */
    public void setElementReference(ElementRef value) {
        this.elementReference = value;
    }

    /**
     * Gets the value of the typeReference property.
     * 
     * @return
     *     possible object is
     *     {@link XsdTypeReference }
     *     
     */
    public XsdTypeReference getTypeReference() {
        return typeReference;
    }

    /**
     * Sets the value of the typeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdTypeReference }
     *     
     */
    public void setTypeReference(XsdTypeReference value) {
        this.typeReference = value;
    }

    /**
     * Gets the value of the inlineType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMapping }
     *     
     */
    public TypeMapping getInlineType() {
        return inlineType;
    }

    /**
     * Sets the value of the inlineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMapping }
     *     
     */
    public void setInlineType(TypeMapping value) {
        this.inlineType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Gets the value of the isNillable property.
     * 
     */
    public boolean isIsNillable() {
        return isNillable;
    }

    /**
     * Sets the value of the isNillable property.
     * 
     */
    public void setIsNillable(boolean value) {
        this.isNillable = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaForm }
     *     
     */
    public SchemaForm getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaForm }
     *     
     */
    public void setForm(SchemaForm value) {
        this.form = value;
    }

}
