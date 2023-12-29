
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionTreeNodeChild complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionTreeNodeChild"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Node" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DecisionTreeNode" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionTreeNodeChild", propOrder = {
    "node"
})
public class DecisionTreeNodeChild {

    @XmlElement(name = "Node")
    protected DecisionTreeNode node;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionTreeNode }
     *     
     */
    public DecisionTreeNode getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionTreeNode }
     *     
     */
    public void setNode(DecisionTreeNode value) {
        this.node = value;
    }

}
