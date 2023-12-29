
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VLAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VLAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alternatives" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLActionAlternative" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DisplayValue" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMultiLingualText" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="FormatDefinition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ValueListItemReference" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VLAction", propOrder = {
    "alternatives",
    "displayValue",
    "formatDefinition"
})
public class VLAction {

    @XmlElement(name = "Alternatives")
    protected ArrayOfVLActionAlternative alternatives;
    @XmlElement(name = "DisplayValue")
    protected ArrayOfMultiLingualText displayValue;
    @XmlElement(name = "FormatDefinition")
    protected ValueListItemReference formatDefinition;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Gets the value of the alternatives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLActionAlternative }
     *     
     */
    public ArrayOfVLActionAlternative getAlternatives() {
        return alternatives;
    }

    /**
     * Sets the value of the alternatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLActionAlternative }
     *     
     */
    public void setAlternatives(ArrayOfVLActionAlternative value) {
        this.alternatives = value;
    }

    /**
     * Gets the value of the displayValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public ArrayOfMultiLingualText getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public void setDisplayValue(ArrayOfMultiLingualText value) {
        this.displayValue = value;
    }

    /**
     * Gets the value of the formatDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ValueListItemReference }
     *     
     */
    public ValueListItemReference getFormatDefinition() {
        return formatDefinition;
    }

    /**
     * Sets the value of the formatDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueListItemReference }
     *     
     */
    public void setFormatDefinition(ValueListItemReference value) {
        this.formatDefinition = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
