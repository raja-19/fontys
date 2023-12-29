
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileRelationValueValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileRelationValueValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ProfileInstanceReference" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="StaticInstanceEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StaticInstanceReference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileRelationValueValue")
public class ProfileRelationValueValue {

    @XmlAttribute(name = "ProfileInstanceReference", required = true)
    protected int profileInstanceReference;
    @XmlAttribute(name = "StaticInstanceEntity")
    protected String staticInstanceEntity;
    @XmlAttribute(name = "StaticInstanceReference")
    protected String staticInstanceReference;

    /**
     * Gets the value of the profileInstanceReference property.
     * 
     */
    public int getProfileInstanceReference() {
        return profileInstanceReference;
    }

    /**
     * Sets the value of the profileInstanceReference property.
     * 
     */
    public void setProfileInstanceReference(int value) {
        this.profileInstanceReference = value;
    }

    /**
     * Gets the value of the staticInstanceEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticInstanceEntity() {
        return staticInstanceEntity;
    }

    /**
     * Sets the value of the staticInstanceEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticInstanceEntity(String value) {
        this.staticInstanceEntity = value;
    }

    /**
     * Gets the value of the staticInstanceReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticInstanceReference() {
        return staticInstanceReference;
    }

    /**
     * Sets the value of the staticInstanceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticInstanceReference(String value) {
        this.staticInstanceReference = value;
    }

}
