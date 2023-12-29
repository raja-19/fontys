
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ContentItemNode"&gt;
 *       &lt;attribute name="ContentItem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceNode")
public class ReferenceNode
    extends ContentItemNode
{

    @XmlAttribute(name = "ContentItem")
    protected String contentItem;

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

}
