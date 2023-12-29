
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowStartNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowStartNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Edge" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FlowStartEdge" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowStartNode", propOrder = {
    "edge"
})
public class FlowStartNode
    extends FlowNode
{

    @XmlElement(name = "Edge")
    protected FlowStartEdge edge;

    /**
     * Gets the value of the edge property.
     * 
     * @return
     *     possible object is
     *     {@link FlowStartEdge }
     *     
     */
    public FlowStartEdge getEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowStartEdge }
     *     
     */
    public void setEdge(FlowStartEdge value) {
        this.edge = value;
    }

}
