
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleElementKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleElementKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKey"&gt;
 *       &lt;attribute name="ModuleElementType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElementType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleElementKey")
@XmlSeeAlso({
    AttributeKey.class,
    InstanceKey.class,
    RelationKey.class,
    SpecificationImplementationKey.class
})
public class ModuleElementKey
    extends ElementKey
{

    @XmlAttribute(name = "ModuleElementType", required = true)
    protected ModuleElementType moduleElementType;

    /**
     * Gets the value of the moduleElementType property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleElementType }
     *     
     */
    public ModuleElementType getModuleElementType() {
        return moduleElementType;
    }

    /**
     * Sets the value of the moduleElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleElementType }
     *     
     */
    public void setModuleElementType(ModuleElementType value) {
        this.moduleElementType = value;
    }

}
