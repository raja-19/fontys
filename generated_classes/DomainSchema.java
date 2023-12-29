
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainSchema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RootObject" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DomainObject" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RootName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RootEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsRootElementHidden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainSchema", propOrder = {
    "rootObject"
})
public class DomainSchema
    extends ModuleElement
{

    @XmlElement(name = "RootObject")
    protected DomainObject rootObject;
    @XmlAttribute(name = "RootName")
    protected String rootName;
    @XmlAttribute(name = "RootEntity")
    protected String rootEntity;
    @XmlAttribute(name = "IsRootElementHidden", required = true)
    protected boolean isRootElementHidden;

    /**
     * Gets the value of the rootObject property.
     * 
     * @return
     *     possible object is
     *     {@link DomainObject }
     *     
     */
    public DomainObject getRootObject() {
        return rootObject;
    }

    /**
     * Sets the value of the rootObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainObject }
     *     
     */
    public void setRootObject(DomainObject value) {
        this.rootObject = value;
    }

    /**
     * Gets the value of the rootName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootName() {
        return rootName;
    }

    /**
     * Sets the value of the rootName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootName(String value) {
        this.rootName = value;
    }

    /**
     * Gets the value of the rootEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootEntity() {
        return rootEntity;
    }

    /**
     * Sets the value of the rootEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootEntity(String value) {
        this.rootEntity = value;
    }

    /**
     * Gets the value of the isRootElementHidden property.
     * 
     */
    public boolean isIsRootElementHidden() {
        return isRootElementHidden;
    }

    /**
     * Sets the value of the isRootElementHidden property.
     * 
     */
    public void setIsRootElementHidden(boolean value) {
        this.isRootElementHidden = value;
    }

}
