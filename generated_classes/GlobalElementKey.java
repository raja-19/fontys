
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalElementKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalElementKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKey"&gt;
 *       &lt;attribute name="GlobalElementType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElementType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalElementKey")
public class GlobalElementKey
    extends ElementKey
{

    @XmlAttribute(name = "GlobalElementType", required = true)
    protected GlobalElementType globalElementType;

    /**
     * Gets the value of the globalElementType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalElementType }
     *     
     */
    public GlobalElementType getGlobalElementType() {
        return globalElementType;
    }

    /**
     * Sets the value of the globalElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalElementType }
     *     
     */
    public void setGlobalElementType(GlobalElementType value) {
        this.globalElementType = value;
    }

}
