
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Target" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ValueMappingTarget" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ValueMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfValueMappingEntry" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueMapping", propOrder = {
    "target",
    "valueMappings"
})
public class ValueMapping {

    @XmlElement(name = "Target")
    protected ValueMappingTarget target;
    @XmlElement(name = "ValueMappings")
    protected ArrayOfValueMappingEntry valueMappings;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ValueMappingTarget }
     *     
     */
    public ValueMappingTarget getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueMappingTarget }
     *     
     */
    public void setTarget(ValueMappingTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the valueMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValueMappingEntry }
     *     
     */
    public ArrayOfValueMappingEntry getValueMappings() {
        return valueMappings;
    }

    /**
     * Sets the value of the valueMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValueMappingEntry }
     *     
     */
    public void setValueMappings(ArrayOfValueMappingEntry value) {
        this.valueMappings = value;
    }

}
