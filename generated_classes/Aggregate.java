
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aggregate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aggregate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityReferences" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString8" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="RelationReferences" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfAggregateRelationReference" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Metadata" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfAggregateMetadata" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Roles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString1" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HasExcludedRelations" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aggregate", propOrder = {
    "entityReferences",
    "relationReferences",
    "metadata",
    "roles"
})
public class Aggregate
    extends ModuleElement
{

    @XmlElement(name = "EntityReferences")
    protected ArrayOfString8 entityReferences;
    @XmlElement(name = "RelationReferences")
    protected ArrayOfAggregateRelationReference relationReferences;
    @XmlElement(name = "Metadata")
    protected ArrayOfAggregateMetadata metadata;
    @XmlElement(name = "Roles")
    protected ArrayOfString1 roles;
    @XmlAttribute(name = "HasExcludedRelations", required = true)
    protected boolean hasExcludedRelations;

    /**
     * Gets the value of the entityReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString8 }
     *     
     */
    public ArrayOfString8 getEntityReferences() {
        return entityReferences;
    }

    /**
     * Sets the value of the entityReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString8 }
     *     
     */
    public void setEntityReferences(ArrayOfString8 value) {
        this.entityReferences = value;
    }

    /**
     * Gets the value of the relationReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggregateRelationReference }
     *     
     */
    public ArrayOfAggregateRelationReference getRelationReferences() {
        return relationReferences;
    }

    /**
     * Sets the value of the relationReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggregateRelationReference }
     *     
     */
    public void setRelationReferences(ArrayOfAggregateRelationReference value) {
        this.relationReferences = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggregateMetadata }
     *     
     */
    public ArrayOfAggregateMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggregateMetadata }
     *     
     */
    public void setMetadata(ArrayOfAggregateMetadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setRoles(ArrayOfString1 value) {
        this.roles = value;
    }

    /**
     * Gets the value of the hasExcludedRelations property.
     * 
     */
    public boolean isHasExcludedRelations() {
        return hasExcludedRelations;
    }

    /**
     * Sets the value of the hasExcludedRelations property.
     * 
     */
    public void setHasExcludedRelations(boolean value) {
        this.hasExcludedRelations = value;
    }

}
