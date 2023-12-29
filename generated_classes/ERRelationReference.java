
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ERRelationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ERRelationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Waypoints" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfWaypoint" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FromEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ToEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShowName" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ERRelationReference", propOrder = {
    "waypoints"
})
public class ERRelationReference {

    @XmlElement(name = "Waypoints")
    protected ArrayOfWaypoint waypoints;
    @XmlAttribute(name = "Relation")
    protected String relation;
    @XmlAttribute(name = "FromEntity")
    protected String fromEntity;
    @XmlAttribute(name = "ToEntity")
    protected String toEntity;
    @XmlAttribute(name = "ShowName", required = true)
    protected boolean showName;
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
     * Gets the value of the fromEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEntity() {
        return fromEntity;
    }

    /**
     * Sets the value of the fromEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEntity(String value) {
        this.fromEntity = value;
    }

    /**
     * Gets the value of the toEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEntity() {
        return toEntity;
    }

    /**
     * Sets the value of the toEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEntity(String value) {
        this.toEntity = value;
    }

    /**
     * Gets the value of the showName property.
     * 
     */
    public boolean isShowName() {
        return showName;
    }

    /**
     * Sets the value of the showName property.
     * 
     */
    public void setShowName(boolean value) {
        this.showName = value;
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
