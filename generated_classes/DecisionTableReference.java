
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionTableReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionTableReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}RuleGroupReference"&gt;
 *       &lt;attribute name="DecisionTable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionTableReference")
public class DecisionTableReference
    extends RuleGroupReference
{

    @XmlAttribute(name = "DecisionTable")
    protected String decisionTable;

    /**
     * Gets the value of the decisionTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionTable() {
        return decisionTable;
    }

    /**
     * Sets the value of the decisionTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionTable(String value) {
        this.decisionTable = value;
    }

}
