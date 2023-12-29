
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VLActionAlternativeRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VLActionAlternativeRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AltRefId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ActionRefId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VLActionAlternativeRef")
public class VLActionAlternativeRef {

    @XmlAttribute(name = "AltRefId", required = true)
    protected int altRefId;
    @XmlAttribute(name = "ActionRefId", required = true)
    protected int actionRefId;

    /**
     * Gets the value of the altRefId property.
     * 
     */
    public int getAltRefId() {
        return altRefId;
    }

    /**
     * Sets the value of the altRefId property.
     * 
     */
    public void setAltRefId(int value) {
        this.altRefId = value;
    }

    /**
     * Gets the value of the actionRefId property.
     * 
     */
    public int getActionRefId() {
        return actionRefId;
    }

    /**
     * Sets the value of the actionRefId property.
     * 
     */
    public void setActionRefId(int value) {
        this.actionRefId = value;
    }

}
