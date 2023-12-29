
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfNodeLayout" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="EdgeLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfEdgeLayout" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="GroupLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfGroupLayout" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowLayout", propOrder = {
    "nodeLayouts",
    "edgeLayouts",
    "groupLayouts"
})
public class FlowLayout {

    @XmlElement(name = "NodeLayouts")
    protected ArrayOfNodeLayout nodeLayouts;
    @XmlElement(name = "EdgeLayouts")
    protected ArrayOfEdgeLayout edgeLayouts;
    @XmlElement(name = "GroupLayouts")
    protected ArrayOfGroupLayout groupLayouts;

    /**
     * Gets the value of the nodeLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNodeLayout }
     *     
     */
    public ArrayOfNodeLayout getNodeLayouts() {
        return nodeLayouts;
    }

    /**
     * Sets the value of the nodeLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNodeLayout }
     *     
     */
    public void setNodeLayouts(ArrayOfNodeLayout value) {
        this.nodeLayouts = value;
    }

    /**
     * Gets the value of the edgeLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEdgeLayout }
     *     
     */
    public ArrayOfEdgeLayout getEdgeLayouts() {
        return edgeLayouts;
    }

    /**
     * Sets the value of the edgeLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEdgeLayout }
     *     
     */
    public void setEdgeLayouts(ArrayOfEdgeLayout value) {
        this.edgeLayouts = value;
    }

    /**
     * Gets the value of the groupLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroupLayout }
     *     
     */
    public ArrayOfGroupLayout getGroupLayouts() {
        return groupLayouts;
    }

    /**
     * Sets the value of the groupLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroupLayout }
     *     
     */
    public void setGroupLayouts(ArrayOfGroupLayout value) {
        this.groupLayouts = value;
    }

}
