
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VLCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VLCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Expression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Alternatives" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLConditionAlternative" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VLCondition", propOrder = {
    "expression",
    "alternatives"
})
public class VLCondition {

    @XmlElement(name = "Expression")
    protected Expression expression;
    @XmlElement(name = "Alternatives")
    protected ArrayOfVLConditionAlternative alternatives;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

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
     * Gets the value of the alternatives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLConditionAlternative }
     *     
     */
    public ArrayOfVLConditionAlternative getAlternatives() {
        return alternatives;
    }

    /**
     * Sets the value of the alternatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLConditionAlternative }
     *     
     */
    public void setAlternatives(ArrayOfVLConditionAlternative value) {
        this.alternatives = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}