
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;attribute name="BaseEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Singleton" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Abstract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity")
public class Entity
    extends ModuleElement
{

    @XmlAttribute(name = "BaseEntity")
    protected String baseEntity;
    @XmlAttribute(name = "Singleton", required = true)
    protected boolean singleton;
    @XmlAttribute(name = "Abstract", required = true)
    protected boolean _abstract;

    /**
     * Gets the value of the baseEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseEntity() {
        return baseEntity;
    }

    /**
     * Sets the value of the baseEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseEntity(String value) {
        this.baseEntity = value;
    }

    /**
     * Gets the value of the singleton property.
     * 
     */
    public boolean isSingleton() {
        return singleton;
    }

    /**
     * Sets the value of the singleton property.
     * 
     */
    public void setSingleton(boolean value) {
        this.singleton = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     */
    public boolean isAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     */
    public void setAbstract(boolean value) {
        this._abstract = value;
    }

}
