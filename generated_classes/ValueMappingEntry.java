
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueMappingEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueMappingEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Expression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Condition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="JustificationTreeDetails" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}JustificationTreeMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueMappingEntry", propOrder = {
    "expression",
    "condition",
    "justificationTreeDetails"
})
public class ValueMappingEntry {

    @XmlElement(name = "Expression")
    protected Expression expression;
    @XmlElement(name = "Condition")
    protected Expression condition;
    @XmlElement(name = "JustificationTreeDetails")
    protected JustificationTreeMapping justificationTreeDetails;

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setExpression(Expression value) {
        this.expression = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setCondition(Expression value) {
        this.condition = value;
    }

    /**
     * Gets the value of the justificationTreeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JustificationTreeMapping }
     *     
     */
    public JustificationTreeMapping getJustificationTreeDetails() {
        return justificationTreeDetails;
    }

    /**
     * Sets the value of the justificationTreeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JustificationTreeMapping }
     *     
     */
    public void setJustificationTreeDetails(JustificationTreeMapping value) {
        this.justificationTreeDetails = value;
    }

}
