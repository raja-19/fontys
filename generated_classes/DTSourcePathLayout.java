
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTSourcePathLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTSourcePathLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DTSourcePathRef" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTSourcePathLayout")
public class DTSourcePathLayout {

    @XmlAttribute(name = "DTSourcePathRef", required = true)
    protected int dtSourcePathRef;
    @XmlAttribute(name = "Width", required = true)
    protected int width;

    /**
     * Gets the value of the dtSourcePathRef property.
     * 
     */
    public int getDTSourcePathRef() {
        return dtSourcePathRef;
    }

    /**
     * Sets the value of the dtSourcePathRef property.
     * 
     */
    public void setDTSourcePathRef(int value) {
        this.dtSourcePathRef = value;
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
