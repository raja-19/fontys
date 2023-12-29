
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchemaSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchemaSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Schemas" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfSchema" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaSet", propOrder = {
    "schemas"
})
public class SchemaSet
    extends ModuleElement
{

    @XmlElement(name = "Schemas")
    protected ArrayOfSchema schemas;

    /**
     * Gets the value of the schemas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSchema }
     *     
     */
    public ArrayOfSchema getSchemas() {
        return schemas;
    }

    /**
     * Sets the value of the schemas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSchema }
     *     
     */
    public void setSchemas(ArrayOfSchema value) {
        this.schemas = value;
    }

}
