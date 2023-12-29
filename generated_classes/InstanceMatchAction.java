
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceMatchAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceMatchAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="NoMatchingTargetAction" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}InstanceMatchingType" /&gt;
 *       &lt;attribute name="MatchingInstanceAction" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}InstanceMatchingType" /&gt;
 *       &lt;attribute name="NoMatchingSourceAction" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}InstanceMatchingType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceMatchAction")
public class InstanceMatchAction {

    @XmlAttribute(name = "NoMatchingTargetAction", required = true)
    protected InstanceMatchingType noMatchingTargetAction;
    @XmlAttribute(name = "MatchingInstanceAction", required = true)
    protected InstanceMatchingType matchingInstanceAction;
    @XmlAttribute(name = "NoMatchingSourceAction", required = true)
    protected InstanceMatchingType noMatchingSourceAction;

    /**
     * Gets the value of the noMatchingTargetAction property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceMatchingType }
     *     
     */
    public InstanceMatchingType getNoMatchingTargetAction() {
        return noMatchingTargetAction;
    }

    /**
     * Sets the value of the noMatchingTargetAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceMatchingType }
     *     
     */
    public void setNoMatchingTargetAction(InstanceMatchingType value) {
        this.noMatchingTargetAction = value;
    }

    /**
     * Gets the value of the matchingInstanceAction property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceMatchingType }
     *     
     */
    public InstanceMatchingType getMatchingInstanceAction() {
        return matchingInstanceAction;
    }

    /**
     * Sets the value of the matchingInstanceAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceMatchingType }
     *     
     */
    public void setMatchingInstanceAction(InstanceMatchingType value) {
        this.matchingInstanceAction = value;
    }

    /**
     * Gets the value of the noMatchingSourceAction property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceMatchingType }
     *     
     */
    public InstanceMatchingType getNoMatchingSourceAction() {
        return noMatchingSourceAction;
    }

    /**
     * Sets the value of the noMatchingSourceAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceMatchingType }
     *     
     */
    public void setNoMatchingSourceAction(InstanceMatchingType value) {
        this.noMatchingSourceAction = value;
    }

}
