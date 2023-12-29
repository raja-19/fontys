
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleElementLinkSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleElementLinkSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}LinkedElementSet"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModuleKey" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleElementLinkSet", propOrder = {
    "moduleKey"
})
public class ModuleElementLinkSet
    extends LinkedElementSet
{

    @XmlElement(name = "ModuleKey")
    protected ModuleKey moduleKey;

    /**
     * Gets the value of the moduleKey property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getModuleKey() {
        return moduleKey;
    }

    /**
     * Sets the value of the moduleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setModuleKey(ModuleKey value) {
        this.moduleKey = value;
    }

}
