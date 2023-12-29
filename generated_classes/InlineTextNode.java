
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InlineTextNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InlineTextNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ContentNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TextItem" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}TextItem" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InlineTextNode", propOrder = {
    "textItem"
})
public class InlineTextNode
    extends ContentNode
{

    @XmlElement(name = "TextItem")
    protected TextItem textItem;

    /**
     * Gets the value of the textItem property.
     * 
     * @return
     *     possible object is
     *     {@link TextItem }
     *     
     */
    public TextItem getTextItem() {
        return textItem;
    }

    /**
     * Sets the value of the textItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextItem }
     *     
     */
    public void setTextItem(TextItem value) {
        this.textItem = value;
    }

}
