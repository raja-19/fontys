
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetModule" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="SourceModule" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ForwardMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInstanceMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ReversedMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInstanceMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataMapping", propOrder = {
    "targetModule",
    "sourceModule",
    "forwardMappings",
    "reversedMappings"
})
public class DataMapping
    extends ModuleElement
{

    @XmlElement(name = "TargetModule")
    protected ModuleKey targetModule;
    @XmlElement(name = "SourceModule")
    protected ModuleKey sourceModule;
    @XmlElement(name = "ForwardMappings")
    protected ArrayOfInstanceMapping forwardMappings;
    @XmlElement(name = "ReversedMappings")
    protected ArrayOfInstanceMapping reversedMappings;

    /**
     * Gets the value of the targetModule property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getTargetModule() {
        return targetModule;
    }

    /**
     * Sets the value of the targetModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setTargetModule(ModuleKey value) {
        this.targetModule = value;
    }

    /**
     * Gets the value of the sourceModule property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getSourceModule() {
        return sourceModule;
    }

    /**
     * Sets the value of the sourceModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setSourceModule(ModuleKey value) {
        this.sourceModule = value;
    }

    /**
     * Gets the value of the forwardMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstanceMapping }
     *     
     */
    public ArrayOfInstanceMapping getForwardMappings() {
        return forwardMappings;
    }

    /**
     * Sets the value of the forwardMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstanceMapping }
     *     
     */
    public void setForwardMappings(ArrayOfInstanceMapping value) {
        this.forwardMappings = value;
    }

    /**
     * Gets the value of the reversedMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstanceMapping }
     *     
     */
    public ArrayOfInstanceMapping getReversedMappings() {
        return reversedMappings;
    }

    /**
     * Sets the value of the reversedMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstanceMapping }
     *     
     */
    public void setReversedMappings(ArrayOfInstanceMapping value) {
        this.reversedMappings = value;
    }

}
