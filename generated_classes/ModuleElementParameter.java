
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleElementParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleElementParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Parameter"&gt;
 *       &lt;attribute name="ModuleElementType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ModuleType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AllowsInteractionModuleSelection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleElementParameter")
public class ModuleElementParameter
    extends Parameter
{

    @XmlAttribute(name = "ModuleElementType")
    protected String moduleElementType;
    @XmlAttribute(name = "ModuleType")
    protected String moduleType;
    @XmlAttribute(name = "AllowsInteractionModuleSelection", required = true)
    protected boolean allowsInteractionModuleSelection;

    /**
     * Gets the value of the moduleElementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleElementType() {
        return moduleElementType;
    }

    /**
     * Sets the value of the moduleElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleElementType(String value) {
        this.moduleElementType = value;
    }

    /**
     * Gets the value of the moduleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleType() {
        return moduleType;
    }

    /**
     * Sets the value of the moduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleType(String value) {
        this.moduleType = value;
    }

    /**
     * Gets the value of the allowsInteractionModuleSelection property.
     * 
     */
    public boolean isAllowsInteractionModuleSelection() {
        return allowsInteractionModuleSelection;
    }

    /**
     * Sets the value of the allowsInteractionModuleSelection property.
     * 
     */
    public void setAllowsInteractionModuleSelection(boolean value) {
        this.allowsInteractionModuleSelection = value;
    }

}
