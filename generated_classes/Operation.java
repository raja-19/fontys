
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Type" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ChangeType" /&gt;
 *       &lt;attribute name="GenerateLayout" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operation")
@XmlSeeAlso({
    GlobalOperation.class,
    PackageOperation.class,
    ProjectOperation.class,
    ModuleOperation.class,
    ModuleElementOperation.class
})
public abstract class Operation {

    @XmlAttribute(name = "Type", required = true)
    protected ChangeType type;
    @XmlAttribute(name = "GenerateLayout", required = true)
    protected boolean generateLayout;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeType }
     *     
     */
    public ChangeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeType }
     *     
     */
    public void setType(ChangeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the generateLayout property.
     * 
     */
    public boolean isGenerateLayout() {
        return generateLayout;
    }

    /**
     * Sets the value of the generateLayout property.
     * 
     */
    public void setGenerateLayout(boolean value) {
        this.generateLayout = value;
    }

}
