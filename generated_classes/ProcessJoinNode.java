
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessJoinNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessJoinNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessGatewayNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Edges" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProcessJoinEdge" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessJoinNode", propOrder = {
    "edges"
})
public class ProcessJoinNode
    extends ProcessGatewayNode
{

    @XmlElement(name = "Edges")
    protected ArrayOfProcessJoinEdge edges;

    /**
     * Gets the value of the edges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessJoinEdge }
     *     
     */
    public ArrayOfProcessJoinEdge getEdges() {
        return edges;
    }

    /**
     * Sets the value of the edges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessJoinEdge }
     *     
     */
    public void setEdges(ArrayOfProcessJoinEdge value) {
        this.edges = value;
    }

}
