
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement"&gt;
 *       &lt;attribute name="ParameterType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalParameterType" /&gt;
 *       &lt;attribute name="PrimitiveDataType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DataType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalParameter")
public class GlobalParameter
    extends GlobalElement
{

    @XmlAttribute(name = "ParameterType", required = true)
    protected GlobalParameterType parameterType;
    @XmlAttribute(name = "PrimitiveDataType", required = true)
    protected DataType primitiveDataType;

    /**
     * Gets the value of the parameterType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalParameterType }
     *     
     */
    public GlobalParameterType getParameterType() {
        return parameterType;
    }

    /**
     * Sets the value of the parameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalParameterType }
     *     
     */
    public void setParameterType(GlobalParameterType value) {
        this.parameterType = value;
    }

    /**
     * Gets the value of the primitiveDataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getPrimitiveDataType() {
        return primitiveDataType;
    }

    /**
     * Sets the value of the primitiveDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setPrimitiveDataType(DataType value) {
        this.primitiveDataType = value;
    }

}
