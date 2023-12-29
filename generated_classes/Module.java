
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Module complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Module"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Includes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString9" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ModuleType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleType" /&gt;
 *       &lt;attribute name="ContractType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ContractType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Module", propOrder = {
    "includes"
})
public class Module
    extends Element
{

    @XmlElement(name = "Includes")
    protected ArrayOfString9 includes;
    @XmlAttribute(name = "ModuleType", required = true)
    protected ModuleType moduleType;
    @XmlAttribute(name = "ContractType", required = true)
    protected ContractType contractType;

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString9 }
     *     
     */
    public ArrayOfString9 getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString9 }
     *     
     */
    public void setIncludes(ArrayOfString9 value) {
        this.includes = value;
    }

    /**
     * Gets the value of the moduleType property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleType }
     *     
     */
    public ModuleType getModuleType() {
        return moduleType;
    }

    /**
     * Sets the value of the moduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleType }
     *     
     */
    public void setModuleType(ModuleType value) {
        this.moduleType = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContractType(ContractType value) {
        this.contractType = value;
    }

}
