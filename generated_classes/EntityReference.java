
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OpenBounds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Bounds" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ClosedBounds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Bounds" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Color" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShowAttributes" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityReference", propOrder = {
    "openBounds",
    "closedBounds"
})
public class EntityReference {

    @XmlElement(name = "OpenBounds")
    protected Bounds openBounds;
    @XmlElement(name = "ClosedBounds")
    protected Bounds closedBounds;
    @XmlAttribute(name = "Entity")
    protected String entity;
    @XmlAttribute(name = "Color")
    protected String color;
    @XmlAttribute(name = "ShowAttributes", required = true)
    protected boolean showAttributes;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Gets the value of the openBounds property.
     * 
     * @return
     *     possible object is
     *     {@link Bounds }
     *     
     */
    public Bounds getOpenBounds() {
        return openBounds;
    }

    /**
     * Sets the value of the openBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bounds }
     *     
     */
    public void setOpenBounds(Bounds value) {
        this.openBounds = value;
    }

    /**
     * Gets the value of the closedBounds property.
     * 
     * @return
     *     possible object is
     *     {@link Bounds }
     *     
     */
    public Bounds getClosedBounds() {
        return closedBounds;
    }

    /**
     * Sets the value of the closedBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bounds }
     *     
     */
    public void setClosedBounds(Bounds value) {
        this.closedBounds = value;
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
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the showAttributes property.
     * 
     */
    public boolean isShowAttributes() {
        return showAttributes;
    }

    /**
     * Sets the value of the showAttributes property.
     * 
     */
    public void setShowAttributes(boolean value) {
        this.showAttributes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
