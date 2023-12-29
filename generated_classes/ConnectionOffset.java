
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionOffset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionOffset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Waypoints" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfWaypoint" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FromOffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="FromOffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ToOffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ToOffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionOffset", propOrder = {
    "waypoints"
})
public class ConnectionOffset {

    @XmlElement(name = "Waypoints")
    protected ArrayOfWaypoint waypoints;
    @XmlAttribute(name = "FromOffsetX", required = true)
    protected int fromOffsetX;
    @XmlAttribute(name = "FromOffsetY", required = true)
    protected int fromOffsetY;
    @XmlAttribute(name = "ToOffsetX", required = true)
    protected int toOffsetX;
    @XmlAttribute(name = "ToOffsetY", required = true)
    protected int toOffsetY;

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
     * Gets the value of the fromOffsetX property.
     * 
     */
    public int getFromOffsetX() {
        return fromOffsetX;
    }

    /**
     * Sets the value of the fromOffsetX property.
     * 
     */
    public void setFromOffsetX(int value) {
        this.fromOffsetX = value;
    }

    /**
     * Gets the value of the fromOffsetY property.
     * 
     */
    public int getFromOffsetY() {
        return fromOffsetY;
    }

    /**
     * Sets the value of the fromOffsetY property.
     * 
     */
    public void setFromOffsetY(int value) {
        this.fromOffsetY = value;
    }

    /**
     * Gets the value of the toOffsetX property.
     * 
     */
    public int getToOffsetX() {
        return toOffsetX;
    }

    /**
     * Sets the value of the toOffsetX property.
     * 
     */
    public void setToOffsetX(int value) {
        this.toOffsetX = value;
    }

    /**
     * Gets the value of the toOffsetY property.
     * 
     */
    public int getToOffsetY() {
        return toOffsetY;
    }

    /**
     * Sets the value of the toOffsetY property.
     * 
     */
    public void setToOffsetY(int value) {
        this.toOffsetY = value;
    }

}
