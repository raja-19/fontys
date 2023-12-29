
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingAlgorithm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingAlgorithm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalSource" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="UserOverwritingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReevaluationEvent" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ReevaluationEvent" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingAlgorithm", propOrder = {
    "externalSource",
    "userOverwritingEnabled"
})
public class RoutingAlgorithm
    extends ModuleElement
{

    @XmlElement(name = "ExternalSource")
    protected boolean externalSource;
    @XmlElement(name = "UserOverwritingEnabled")
    protected boolean userOverwritingEnabled;
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
     * Gets the value of the userOverwritingEnabled property.
     * 
     */
    public boolean isUserOverwritingEnabled() {
        return userOverwritingEnabled;
    }

    /**
     * Sets the value of the userOverwritingEnabled property.
     * 
     */
    public void setUserOverwritingEnabled(boolean value) {
        this.userOverwritingEnabled = value;
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
