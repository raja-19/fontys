
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaticInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaticInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttributeValues" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInstanceAttributeValue" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="RelationValues" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInstanceRelationValue" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticInstance", propOrder = {
    "attributeValues",
    "relationValues"
})
public class StaticInstance
    extends ModuleElement
{

    @XmlElement(name = "AttributeValues")
    protected ArrayOfInstanceAttributeValue attributeValues;
    @XmlElement(name = "RelationValues")
    protected ArrayOfInstanceRelationValue relationValues;
    @XmlAttribute(name = "Entity")
    protected String entity;

    /**
     * Gets the value of the attributeValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstanceAttributeValue }
     *     
     */
    public ArrayOfInstanceAttributeValue getAttributeValues() {
        return attributeValues;
    }

    /**
     * Sets the value of the attributeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstanceAttributeValue }
     *     
     */
    public void setAttributeValues(ArrayOfInstanceAttributeValue value) {
        this.attributeValues = value;
    }

    /**
     * Gets the value of the relationValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstanceRelationValue }
     *     
     */
    public ArrayOfInstanceRelationValue getRelationValues() {
        return relationValues;
    }

    /**
     * Sets the value of the relationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstanceRelationValue }
     *     
     */
    public void setRelationValues(ArrayOfInstanceRelationValue value) {
        this.relationValues = value;
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
