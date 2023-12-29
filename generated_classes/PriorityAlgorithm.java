
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityAlgorithm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorityAlgorithm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalSource" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="StartTimeExpression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReevaluationTime" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ReevaluationTime" /&gt;
 *       &lt;attribute name="ReevaluationEvent" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ReevaluationEvent" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityAlgorithm", propOrder = {
    "externalSource",
    "startTimeExpression"
})
public class PriorityAlgorithm
    extends ModuleElement
{

    @XmlElement(name = "ExternalSource")
    protected boolean externalSource;
    @XmlElement(name = "StartTimeExpression")
    protected Expression startTimeExpression;
    @XmlAttribute(name = "ReevaluationTime", required = true)
    protected ReevaluationTime reevaluationTime;
    @XmlAttribute(name = "ReevaluationEvent", required = true)
    protected ReevaluationEvent reevaluationEvent;

    /**
     * Gets the value of the externalSource property.
     * 
     */
    public boolean isExternalSource() {
        return externalSource;
    }

    /**
     * Sets the value of the externalSource property.
     * 
     */
    public void setExternalSource(boolean value) {
        this.externalSource = value;
    }

    /**
     * Gets the value of the startTimeExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getStartTimeExpression() {
        return startTimeExpression;
    }

    /**
     * Sets the value of the startTimeExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setStartTimeExpression(Expression value) {
        this.startTimeExpression = value;
    }

    /**
     * Gets the value of the reevaluationTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReevaluationTime }
     *     
     */
    public ReevaluationTime getReevaluationTime() {
        return reevaluationTime;
    }

    /**
     * Sets the value of the reevaluationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReevaluationTime }
     *     
     */
    public void setReevaluationTime(ReevaluationTime value) {
        this.reevaluationTime = value;
    }

    /**
     * Gets the value of the reevaluationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ReevaluationEvent }
     *     
     */
    public ReevaluationEvent getReevaluationEvent() {
        return reevaluationEvent;
    }

    /**
     * Sets the value of the reevaluationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReevaluationEvent }
     *     
     */
    public void setReevaluationEvent(ReevaluationEvent value) {
        this.reevaluationEvent = value;
    }

}
