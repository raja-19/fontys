
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionTreeRefNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionTreeRefNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DecisionTreeNode"&gt;
 *       &lt;attribute name="DecisionTree" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionTreeRefNode")
public class DecisionTreeRefNode
    extends DecisionTreeNode
{

    @XmlAttribute(name = "DecisionTree")
    protected String decisionTree;

    /**
     * Gets the value of the decisionTree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionTree() {
        return decisionTree;
    }

    /**
     * Sets the value of the decisionTree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionTree(String value) {
        this.decisionTree = value;
    }

}
