
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextItemReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextItemReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FormatContainment"&gt;
 *       &lt;attribute name="TextItem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContentStyle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextItemReference")
public class TextItemReference
    extends FormatContainment
{

    @XmlAttribute(name = "TextItem")
    protected String textItem;
    @XmlAttribute(name = "ContentStyle")
    protected String contentStyle;

    /**
     * Gets the value of the textItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextItem() {
        return textItem;
    }

    /**
     * Sets the value of the textItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextItem(String value) {
        this.textItem = value;
    }

    /**
     * Gets the value of the contentStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentStyle() {
        return contentStyle;
    }

    /**
     * Sets the value of the contentStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentStyle(String value) {
        this.contentStyle = value;
    }

}
