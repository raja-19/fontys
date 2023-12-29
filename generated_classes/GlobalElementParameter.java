
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalElementParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalElementParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Parameter"&gt;
 *       &lt;attribute name="GlobalElementType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalElementParameter")
public class GlobalElementParameter
    extends Parameter
{

    @XmlAttribute(name = "GlobalElementType")
    protected String globalElementType;

    /**
     * Gets the value of the globalElementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalElementType() {
        return globalElementType;
    }

    /**
     * Sets the value of the globalElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalElementType(String value) {
        this.globalElementType = value;
    }

}
