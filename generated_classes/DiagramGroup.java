
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagramGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagramGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Elements" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInt2" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CollapsedBounds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Bounds" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ExpandedBounds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Bounds" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Collapsed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramGroup", propOrder = {
    "elements",
    "collapsedBounds",
    "expandedBounds"
})
public class DiagramGroup {

    @XmlElement(name = "Elements")
    protected ArrayOfInt2 elements;
    @XmlElement(name = "CollapsedBounds")
    protected Bounds collapsedBounds;
    @XmlElement(name = "ExpandedBounds")
    protected Bounds expandedBounds;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Collapsed", required = true)
    protected boolean collapsed;

    /**
     * Gets the value of the elements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt2 }
     *     
     */
    public ArrayOfInt2 getElements() {
        return elements;
    }

    /**
     * Sets the value of the elements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt2 }
     *     
     */
    public void setElements(ArrayOfInt2 value) {
        this.elements = value;
    }

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
     * Gets the value of the collapsed property.
     * 
     */
    public boolean isCollapsed() {
        return collapsed;
    }

    /**
     * Sets the value of the collapsed property.
     * 
     */
    public void setCollapsed(boolean value) {
        this.collapsed = value;
    }

}
