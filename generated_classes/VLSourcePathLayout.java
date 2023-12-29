
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VLSourcePathLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VLSourcePathLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="VLSourcePathRef" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VLSourcePathLayout")
public class VLSourcePathLayout {

    @XmlAttribute(name = "VLSourcePathRef", required = true)
    protected int vlSourcePathRef;
    @XmlAttribute(name = "Width", required = true)
    protected int width;

    /**
     * Gets the value of the vlSourcePathRef property.
     * 
     */
    public int getVLSourcePathRef() {
        return vlSourcePathRef;
    }

    /**
     * Sets the value of the vlSourcePathRef property.
     * 
     */
    public void setVLSourcePathRef(int value) {
        this.vlSourcePathRef = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

}
