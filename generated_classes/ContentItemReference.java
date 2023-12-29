
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentItemReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentItemReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FormatContainment"&gt;
 *       &lt;attribute name="ContentItem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContentStyle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentItemReference")
public class ContentItemReference
    extends FormatContainment
{

    @XmlAttribute(name = "ContentItem")
    protected String contentItem;
    @XmlAttribute(name = "ContentStyle")
    protected String contentStyle;

    /**
     * Gets the value of the contentItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentItem() {
        return contentItem;
    }

    /**
     * Sets the value of the contentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentItem(String value) {
        this.contentItem = value;
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
