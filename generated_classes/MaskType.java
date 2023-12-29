
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaskType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseTypes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDataType" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Parameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMaskTypeParameter" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaskType", propOrder = {
    "baseTypes",
    "parameters"
})
public class MaskType
    extends GlobalElement
{

    @XmlElement(name = "BaseTypes")
    protected ArrayOfDataType baseTypes;
    @XmlElement(name = "Parameters")
    protected ArrayOfMaskTypeParameter parameters;

    /**
     * Gets the value of the baseTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDataType }
     *     
     */
    public ArrayOfDataType getBaseTypes() {
        return baseTypes;
    }

    /**
     * Sets the value of the baseTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDataType }
     *     
     */
    public void setBaseTypes(ArrayOfDataType value) {
        this.baseTypes = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMaskTypeParameter }
     *     
     */
    public ArrayOfMaskTypeParameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMaskTypeParameter }
     *     
     */
    public void setParameters(ArrayOfMaskTypeParameter value) {
        this.parameters = value;
    }

}
