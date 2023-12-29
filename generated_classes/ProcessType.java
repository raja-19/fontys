
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Restrictions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString13" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AllowImplementation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsRestricted" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessType", propOrder = {
    "restrictions"
})
public class ProcessType
    extends GlobalElement
{

    @XmlElement(name = "Restrictions")
    protected ArrayOfString13 restrictions;
    @XmlAttribute(name = "AllowImplementation", required = true)
    protected boolean allowImplementation;
    @XmlAttribute(name = "IsRestricted", required = true)
    protected boolean isRestricted;

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString13 }
     *     
     */
    public ArrayOfString13 getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString13 }
     *     
     */
    public void setRestrictions(ArrayOfString13 value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the allowImplementation property.
     * 
     */
    public boolean isAllowImplementation() {
        return allowImplementation;
    }

    /**
     * Sets the value of the allowImplementation property.
     * 
     */
    public void setAllowImplementation(boolean value) {
        this.allowImplementation = value;
    }

    /**
     * Gets the value of the isRestricted property.
     * 
     */
    public boolean isIsRestricted() {
        return isRestricted;
    }

    /**
     * Sets the value of the isRestricted property.
     * 
     */
    public void setIsRestricted(boolean value) {
        this.isRestricted = value;
    }

}
