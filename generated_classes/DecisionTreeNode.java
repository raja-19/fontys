
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionTreeNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionTreeNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alternative" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Children" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDecisionTreeNodeChild" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionTreeNode", propOrder = {
    "alternative",
    "children"
})
@XmlSeeAlso({
    DTConditionNode.class,
    DecisionTreeRefNode.class,
    ContainerRefNode.class,
    AssetRefNode.class,
    ActionNode.class
})
public abstract class DecisionTreeNode {

    @XmlElement(name = "Alternative")
    protected Expression alternative;
    @XmlElement(name = "Children")
    protected ArrayOfDecisionTreeNodeChild children;

    /**
     * Gets the value of the alternative property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getAlternative() {
        return alternative;
    }

    /**
     * Sets the value of the alternative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setAlternative(Expression value) {
        this.alternative = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecisionTreeNodeChild }
     *     
     */
    public ArrayOfDecisionTreeNodeChild getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecisionTreeNodeChild }
     *     
     */
    public void setChildren(ArrayOfDecisionTreeNodeChild value) {
        this.children = value;
    }

}
