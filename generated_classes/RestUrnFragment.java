
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestUrnFragment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestUrnFragment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidationRules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfValidationRuleReference" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}RestUrnFragmentType" /&gt;
 *       &lt;attribute name="Constant" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestUrnFragment", propOrder = {
    "validationRules"
})
public class RestUrnFragment {

    @XmlElement(name = "ValidationRules")
    protected ArrayOfValidationRuleReference validationRules;
    @XmlAttribute(name = "Type", required = true)
    protected RestUrnFragmentType type;
    @XmlAttribute(name = "Constant")
    protected String constant;
    @XmlAttribute(name = "Attribute")
    protected String attribute;

    /**
     * Gets the value of the validationRules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationRuleReference }
     *     
     */
    public ArrayOfValidationRuleReference getValidationRules() {
        return validationRules;
    }

    /**
     * Sets the value of the validationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationRuleReference }
     *     
     */
    public void setValidationRules(ArrayOfValidationRuleReference value) {
        this.validationRules = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RestUrnFragmentType }
     *     
     */
    public RestUrnFragmentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestUrnFragmentType }
     *     
     */
    public void setType(RestUrnFragmentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the constant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstant() {
        return constant;
    }

    /**
     * Sets the value of the constant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstant(String value) {
        this.constant = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

}
