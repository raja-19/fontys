
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessStartNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessStartNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Edge" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessStartEdge" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessStartNode", propOrder = {
    "edge"
})
public class ProcessStartNode
    extends ProcessNode
{

    @XmlElement(name = "Edge")
    protected ProcessStartEdge edge;

    /**
     * Gets the value of the edge property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessStartEdge }
     *     
     */
    public ProcessStartEdge getEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessStartEdge }
     *     
     */
    public void setEdge(ProcessStartEdge value) {
        this.edge = value;
    }

}
