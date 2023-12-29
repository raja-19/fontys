
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProcessNodeLayout" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="EdgeLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProcessEdgeLayout" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="GroupLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProcessGroupLayout" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessLayout", propOrder = {
    "nodeLayouts",
    "edgeLayouts",
    "groupLayouts"
})
public class ProcessLayout {

    @XmlElement(name = "NodeLayouts")
    protected ArrayOfProcessNodeLayout nodeLayouts;
    @XmlElement(name = "EdgeLayouts")
    protected ArrayOfProcessEdgeLayout edgeLayouts;
    @XmlElement(name = "GroupLayouts")
    protected ArrayOfProcessGroupLayout groupLayouts;

    /**
     * Gets the value of the nodeLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessNodeLayout }
     *     
     */
    public ArrayOfProcessNodeLayout getNodeLayouts() {
        return nodeLayouts;
    }

    /**
     * Sets the value of the nodeLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessNodeLayout }
     *     
     */
    public void setNodeLayouts(ArrayOfProcessNodeLayout value) {
        this.nodeLayouts = value;
    }

    /**
     * Gets the value of the edgeLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessEdgeLayout }
     *     
     */
    public ArrayOfProcessEdgeLayout getEdgeLayouts() {
        return edgeLayouts;
    }

    /**
     * Sets the value of the edgeLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessEdgeLayout }
     *     
     */
    public void setEdgeLayouts(ArrayOfProcessEdgeLayout value) {
        this.edgeLayouts = value;
    }

    /**
     * Gets the value of the groupLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessGroupLayout }
     *     
     */
    public ArrayOfProcessGroupLayout getGroupLayouts() {
        return groupLayouts;
    }

    /**
     * Sets the value of the groupLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessGroupLayout }
     *     
     */
    public void setGroupLayouts(ArrayOfProcessGroupLayout value) {
        this.groupLayouts = value;
    }

}
