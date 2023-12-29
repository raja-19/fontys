
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceUpdateContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceUpdateContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttributeRelations" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInstanceCreateAttributeRelationValue" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="EntityExpression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HasValue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ClearBeforeExecute" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceUpdateContent", propOrder = {
    "attributeRelations",
    "entityExpression"
})
public class InstanceUpdateContent
    extends ServiceCallContent
{

    @XmlElement(name = "AttributeRelations")
    protected ArrayOfInstanceCreateAttributeRelationValue attributeRelations;
    @XmlElement(name = "EntityExpression")
    protected Expression entityExpression;
    @XmlAttribute(name = "Entity")
    protected String entity;
    @XmlAttribute(name = "HasValue", required = true)
    protected boolean hasValue;
    @XmlAttribute(name = "ClearBeforeExecute")
    protected Boolean clearBeforeExecute;

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
     * Gets the value of the entityExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getEntityExpression() {
        return entityExpression;
    }

    /**
     * Sets the value of the entityExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setEntityExpression(Expression value) {
        this.entityExpression = value;
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
     * Gets the value of the hasValue property.
     * 
     */
    public boolean isHasValue() {
        return hasValue;
    }

    /**
     * Sets the value of the hasValue property.
     * 
     */
    public void setHasValue(boolean value) {
        this.hasValue = value;
    }

    /**
     * Gets the value of the clearBeforeExecute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClearBeforeExecute() {
        return clearBeforeExecute;
    }

    /**
     * Sets the value of the clearBeforeExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClearBeforeExecute(Boolean value) {
        this.clearBeforeExecute = value;
    }

}
