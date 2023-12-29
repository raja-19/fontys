
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentationNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}TextItemNode"&gt;
 *       &lt;attribute name="PresentationStyle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentationNode")
public class PresentationNode
    extends TextItemNode
{

    @XmlAttribute(name = "PresentationStyle")
    protected String presentationStyle;

    /**
     * Gets the value of the presentationStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationStyle() {
        return presentationStyle;
    }

    /**
     * Sets the value of the presentationStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationStyle(String value) {
        this.presentationStyle = value;
    }

}
