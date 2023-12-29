
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceCreateContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceCreateContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttributeRelations" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInstanceCreateAttributeRelationValue" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InstanceActivationType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}InstanceActivationType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceCreateContent", propOrder = {
    "attributeRelations"
})
public class InstanceCreateContent
    extends ServiceCallContent
{

    @XmlElement(name = "AttributeRelations")
    protected ArrayOfInstanceCreateAttributeRelationValue attributeRelations;
    @XmlAttribute(name = "Entity")
    protected String entity;
    @XmlAttribute(name = "InstanceActivationType", required = true)
    protected InstanceActivationType instanceActivationType;

    /**
     * Gets the value of the attributeRelations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstanceCreateAttributeRelationValue }
     *     
     */
    public ArrayOfInstanceCreateAttributeRelationValue getAttributeRelations() {
        return attributeRelations;
    }

    /**
     * Sets the value of the attributeRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstanceCreateAttributeRelationValue }
     *     
     */
    public void setAttributeRelations(ArrayOfInstanceCreateAttributeRelationValue value) {
        this.attributeRelations = value;
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

    /**
     * Gets the value of the instanceActivationType property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceActivationType }
     *     
     */
    public InstanceActivationType getInstanceActivationType() {
        return instanceActivationType;
    }

    /**
     * Sets the value of the instanceActivationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceActivationType }
     *     
     */
    public void setInstanceActivationType(InstanceActivationType value) {
        this.instanceActivationType = value;
    }

}
