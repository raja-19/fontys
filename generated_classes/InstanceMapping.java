
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreCondition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="SourceExpression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="InstanceMatchAction" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}InstanceMatchAction" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ContextExpressions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMappingContextExpression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="MatchingConditions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMatchingCondition" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ValueMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfValueMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SourceLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AutomaticMatching" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceMapping", propOrder = {
    "preCondition",
    "sourceExpression",
    "instanceMatchAction",
    "contextExpressions",
    "matchingConditions",
    "valueMappings"
})
public class InstanceMapping {

    @XmlElement(name = "PreCondition")
    protected Expression preCondition;
    @XmlElement(name = "SourceExpression")
    protected Expression sourceExpression;
    @XmlElement(name = "InstanceMatchAction")
    protected InstanceMatchAction instanceMatchAction;
    @XmlElement(name = "ContextExpressions")
    protected ArrayOfMappingContextExpression contextExpressions;
    @XmlElement(name = "MatchingConditions")
    protected ArrayOfMatchingCondition matchingConditions;
    @XmlElement(name = "ValueMappings")
    protected ArrayOfValueMapping valueMappings;
    @XmlAttribute(name = "TargetEntity")
    protected String targetEntity;
    @XmlAttribute(name = "SourceLabel")
    protected String sourceLabel;
    @XmlAttribute(name = "AutomaticMatching", required = true)
    protected boolean automaticMatching;

    /**
     * Gets the value of the preCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getPreCondition() {
        return preCondition;
    }

    /**
     * Sets the value of the preCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setPreCondition(Expression value) {
        this.preCondition = value;
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
     * Gets the value of the instanceMatchAction property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceMatchAction }
     *     
     */
    public InstanceMatchAction getInstanceMatchAction() {
        return instanceMatchAction;
    }

    /**
     * Sets the value of the instanceMatchAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceMatchAction }
     *     
     */
    public void setInstanceMatchAction(InstanceMatchAction value) {
        this.instanceMatchAction = value;
    }

    /**
     * Gets the value of the contextExpressions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMappingContextExpression }
     *     
     */
    public ArrayOfMappingContextExpression getContextExpressions() {
        return contextExpressions;
    }

    /**
     * Sets the value of the contextExpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMappingContextExpression }
     *     
     */
    public void setContextExpressions(ArrayOfMappingContextExpression value) {
        this.contextExpressions = value;
    }

    /**
     * Gets the value of the matchingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchingCondition }
     *     
     */
    public ArrayOfMatchingCondition getMatchingConditions() {
        return matchingConditions;
    }

    /**
     * Sets the value of the matchingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchingCondition }
     *     
     */
    public void setMatchingConditions(ArrayOfMatchingCondition value) {
        this.matchingConditions = value;
    }

    /**
     * Gets the value of the valueMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValueMapping }
     *     
     */
    public ArrayOfValueMapping getValueMappings() {
        return valueMappings;
    }

    /**
     * Sets the value of the valueMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValueMapping }
     *     
     */
    public void setValueMappings(ArrayOfValueMapping value) {
        this.valueMappings = value;
    }

    /**
     * Gets the value of the targetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEntity() {
        return targetEntity;
    }

    /**
     * Sets the value of the targetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEntity(String value) {
        this.targetEntity = value;
    }

    /**
     * Gets the value of the sourceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLabel() {
        return sourceLabel;
    }

    /**
     * Sets the value of the sourceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLabel(String value) {
        this.sourceLabel = value;
    }

    /**
     * Gets the value of the automaticMatching property.
     * 
     */
    public boolean isAutomaticMatching() {
        return automaticMatching;
    }

    /**
     * Sets the value of the automaticMatching property.
     * 
     */
    public void setAutomaticMatching(boolean value) {
        this.automaticMatching = value;
    }

}
