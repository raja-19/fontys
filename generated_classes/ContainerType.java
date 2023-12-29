
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfParameter" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="EventDefinitions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfEventDefinition" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DefaultContentStyle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Dynamic" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HasContainment" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ThrowsDefaultEvent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerType", propOrder = {
    "parameters",
    "eventDefinitions"
})
public class ContainerType
    extends GlobalElement
{

    @XmlElement(name = "Parameters")
    protected ArrayOfParameter parameters;
    @XmlElement(name = "EventDefinitions")
    protected ArrayOfEventDefinition eventDefinitions;
    @XmlAttribute(name = "DefaultContentStyle")
    protected String defaultContentStyle;
    @XmlAttribute(name = "Dynamic", required = true)
    protected boolean dynamic;
    @XmlAttribute(name = "HasContainment", required = true)
    protected boolean hasContainment;
    @XmlAttribute(name = "ThrowsDefaultEvent", required = true)
    protected boolean throwsDefaultEvent;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParameter }
     *     
     */
    public ArrayOfParameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParameter }
     *     
     */
    public void setParameters(ArrayOfParameter value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the eventDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventDefinition }
     *     
     */
    public ArrayOfEventDefinition getEventDefinitions() {
        return eventDefinitions;
    }

    /**
     * Sets the value of the eventDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventDefinition }
     *     
     */
    public void setEventDefinitions(ArrayOfEventDefinition value) {
        this.eventDefinitions = value;
    }

    /**
     * Gets the value of the defaultContentStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContentStyle() {
        return defaultContentStyle;
    }

    /**
     * Sets the value of the defaultContentStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultContentStyle(String value) {
        this.defaultContentStyle = value;
    }

    /**
     * Gets the value of the dynamic property.
     * 
     */
    public boolean isDynamic() {
        return dynamic;
    }

    /**
     * Sets the value of the dynamic property.
     * 
     */
    public void setDynamic(boolean value) {
        this.dynamic = value;
    }

    /**
     * Gets the value of the hasContainment property.
     * 
     */
    public boolean isHasContainment() {
        return hasContainment;
    }

    /**
     * Sets the value of the hasContainment property.
     * 
     */
    public void setHasContainment(boolean value) {
        this.hasContainment = value;
    }

    /**
     * Gets the value of the throwsDefaultEvent property.
     * 
     */
    public boolean isThrowsDefaultEvent() {
        return throwsDefaultEvent;
    }

    /**
     * Sets the value of the throwsDefaultEvent property.
     * 
     */
    public void setThrowsDefaultEvent(boolean value) {
        this.throwsDefaultEvent = value;
    }

}
