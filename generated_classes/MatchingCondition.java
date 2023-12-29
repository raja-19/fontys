
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchingCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchingCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetExpression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="SourceExpression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Operator" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}MatchingOperator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingCondition", propOrder = {
    "targetExpression",
    "sourceExpression"
})
public class MatchingCondition {

    @XmlElement(name = "TargetExpression")
    protected Expression targetExpression;
    @XmlElement(name = "SourceExpression")
    protected Expression sourceExpression;
    @XmlAttribute(name = "Operator", required = true)
    protected MatchingOperator operator;

    /**
     * Gets the value of the targetExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getTargetExpression() {
        return targetExpression;
    }

    /**
     * Sets the value of the targetExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setTargetExpression(Expression value) {
        this.targetExpression = value;
    }

    /**
     * Gets the value of the sourceExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getSourceExpression() {
        return sourceExpression;
    }

    /**
     * Sets the value of the sourceExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setSourceExpression(Expression value) {
        this.sourceExpression = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingOperator }
     *     
     */
    public MatchingOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingOperator }
     *     
     */
    public void setOperator(MatchingOperator value) {
        this.operator = value;
    }

}
