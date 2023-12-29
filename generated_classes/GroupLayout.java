
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollapsedBounds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Bounds" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ExpandedBounds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Bounds" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GroupRef" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupLayout", propOrder = {
    "collapsedBounds",
    "expandedBounds"
})
public class GroupLayout {

    @XmlElement(name = "CollapsedBounds")
    protected Bounds collapsedBounds;
    @XmlElement(name = "ExpandedBounds")
    protected Bounds expandedBounds;
    @XmlAttribute(name = "GroupRef", required = true)
    protected int groupRef;

    /**
     * Gets the value of the collapsedBounds property.
     * 
     * @return
     *     possible object is
     *     {@link Bounds }
     *     
     */
    public Bounds getCollapsedBounds() {
        return collapsedBounds;
    }

    /**
     * Sets the value of the collapsedBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bounds }
     *     
     */
    public void setCollapsedBounds(Bounds value) {
        this.collapsedBounds = value;
    }

    /**
     * Gets the value of the expandedBounds property.
     * 
     * @return
     *     possible object is
     *     {@link Bounds }
     *     
     */
    public Bounds getExpandedBounds() {
        return expandedBounds;
    }

    /**
     * Sets the value of the expandedBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bounds }
     *     
     */
    public void setExpandedBounds(Bounds value) {
        this.expandedBounds = value;
    }

    /**
     * Gets the value of the groupRef property.
     * 
     */
    public int getGroupRef() {
        return groupRef;
    }

    /**
     * Sets the value of the groupRef property.
     * 
     */
    public void setGroupRef(int value) {
        this.groupRef = value;
    }

}
