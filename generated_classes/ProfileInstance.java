
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attributes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProfileAttribute" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Relations" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProfileRelation" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReferenceId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileInstance", propOrder = {
    "attributes",
    "relations"
})
public class ProfileInstance {

    @XmlElement(name = "Attributes")
    protected ArrayOfProfileAttribute attributes;
    @XmlElement(name = "Relations")
    protected ArrayOfProfileRelation relations;
    @XmlAttribute(name = "ReferenceId", required = true)
    protected int referenceId;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Entity")
    protected String entity;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileAttribute }
     *     
     */
    public ArrayOfProfileAttribute getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileAttribute }
     *     
     */
    public void setAttributes(ArrayOfProfileAttribute value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the relations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileRelation }
     *     
     */
    public ArrayOfProfileRelation getRelations() {
        return relations;
    }

    /**
     * Sets the value of the relations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileRelation }
     *     
     */
    public void setRelations(ArrayOfProfileRelation value) {
        this.relations = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     */
    public int getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     */
    public void setReferenceId(int value) {
        this.referenceId = value;
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
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

}
