
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Relation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultValue" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DefaultValue" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="QuestionText" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMultiLingualText" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ExplainText" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMultiLingualText" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ValidationRules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfValidationRuleReference" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FromEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ToEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReverseName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MultiValued" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReverseMultiValued" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relation", propOrder = {
    "defaultValue",
    "questionText",
    "explainText",
    "validationRules"
})
public class Relation
    extends ModuleElement
{

    @XmlElement(name = "DefaultValue")
    protected DefaultValue defaultValue;
    @XmlElement(name = "QuestionText")
    protected ArrayOfMultiLingualText questionText;
    @XmlElement(name = "ExplainText")
    protected ArrayOfMultiLingualText explainText;
    @XmlElement(name = "ValidationRules")
    protected ArrayOfValidationRuleReference validationRules;
    @XmlAttribute(name = "FromEntity")
    protected String fromEntity;
    @XmlAttribute(name = "ToEntity")
    protected String toEntity;
    @XmlAttribute(name = "ReverseName")
    protected String reverseName;
    @XmlAttribute(name = "MultiValued", required = true)
    protected boolean multiValued;
    @XmlAttribute(name = "ReverseMultiValued", required = true)
    protected boolean reverseMultiValued;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultValue }
     *     
     */
    public DefaultValue getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValue }
     *     
     */
    public void setDefaultValue(DefaultValue value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public ArrayOfMultiLingualText getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public void setQuestionText(ArrayOfMultiLingualText value) {
        this.questionText = value;
    }

    /**
     * Gets the value of the explainText property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public ArrayOfMultiLingualText getExplainText() {
        return explainText;
    }

    /**
     * Sets the value of the explainText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public void setExplainText(ArrayOfMultiLingualText value) {
        this.explainText = value;
    }

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
     * Gets the value of the fromEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEntity() {
        return fromEntity;
    }

    /**
     * Sets the value of the fromEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEntity(String value) {
        this.fromEntity = value;
    }

    /**
     * Gets the value of the toEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEntity() {
        return toEntity;
    }

    /**
     * Sets the value of the toEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEntity(String value) {
        this.toEntity = value;
    }

    /**
     * Gets the value of the reverseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseName() {
        return reverseName;
    }

    /**
     * Sets the value of the reverseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseName(String value) {
        this.reverseName = value;
    }

    /**
     * Gets the value of the multiValued property.
     * 
     */
    public boolean isMultiValued() {
        return multiValued;
    }

    /**
     * Sets the value of the multiValued property.
     * 
     */
    public void setMultiValued(boolean value) {
        this.multiValued = value;
    }

    /**
     * Gets the value of the reverseMultiValued property.
     * 
     */
    public boolean isReverseMultiValued() {
        return reverseMultiValued;
    }

    /**
     * Sets the value of the reverseMultiValued property.
     * 
     */
    public void setReverseMultiValued(boolean value) {
        this.reverseMultiValued = value;
    }

}
