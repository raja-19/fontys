
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InheritanceConnection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InheritanceConnection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Waypoints" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfWaypoint" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BaseEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DerivedEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InheritanceConnection", propOrder = {
    "waypoints"
})
public class InheritanceConnection {

    @XmlElement(name = "Waypoints")
    protected ArrayOfWaypoint waypoints;
    @XmlAttribute(name = "BaseEntity")
    protected String baseEntity;
    @XmlAttribute(name = "DerivedEntity")
    protected String derivedEntity;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Gets the value of the waypoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaypoint }
     *     
     */
    public ArrayOfWaypoint getWaypoints() {
        return waypoints;
    }

    /**
     * Sets the value of the waypoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaypoint }
     *     
     */
    public void setWaypoints(ArrayOfWaypoint value) {
        this.waypoints = value;
    }

    /**
     * Gets the value of the baseEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseEntity() {
        return baseEntity;
    }

    /**
     * Sets the value of the baseEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseEntity(String value) {
        this.baseEntity = value;
    }

    /**
     * Gets the value of the derivedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedEntity() {
        return derivedEntity;
    }

    /**
     * Sets the value of the derivedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedEntity(String value) {
        this.derivedEntity = value;
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
