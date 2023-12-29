
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMappingEntry" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ProcessModule" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ImplementationModule" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Precondition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskMapping", propOrder = {
    "taskMappings",
    "processModule",
    "implementationModule",
    "precondition"
})
public class TaskMapping
    extends ModuleElement
{

    @XmlElement(name = "TaskMappings")
    protected ArrayOfMappingEntry taskMappings;
    @XmlElement(name = "ProcessModule")
    protected ModuleKey processModule;
    @XmlElement(name = "ImplementationModule")
    protected ModuleKey implementationModule;
    @XmlElement(name = "Precondition")
    protected Expression precondition;

    /**
     * Gets the value of the taskMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMappingEntry }
     *     
     */
    public ArrayOfMappingEntry getTaskMappings() {
        return taskMappings;
    }

    /**
     * Sets the value of the taskMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMappingEntry }
     *     
     */
    public void setTaskMappings(ArrayOfMappingEntry value) {
        this.taskMappings = value;
    }

    /**
     * Gets the value of the processModule property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getProcessModule() {
        return processModule;
    }

    /**
     * Sets the value of the processModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setProcessModule(ModuleKey value) {
        this.processModule = value;
    }

    /**
     * Gets the value of the implementationModule property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getImplementationModule() {
        return implementationModule;
    }

    /**
     * Sets the value of the implementationModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setImplementationModule(ModuleKey value) {
        this.implementationModule = value;
    }

    /**
     * Gets the value of the precondition property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getPrecondition() {
        return precondition;
    }

    /**
     * Sets the value of the precondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setPrecondition(Expression value) {
        this.precondition = value;
    }

}
