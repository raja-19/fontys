
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentItem" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ContentItem" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "contentItem"
})
public class Document
    extends ModuleElement
{

    @XmlElement(name = "ContentItem")
    protected ContentItem contentItem;

    /**
     * Gets the value of the contentItem property.
     * 
     * @return
     *     possible object is
     *     {@link ContentItem }
     *     
     */
    public ContentItem getContentItem() {
        return contentItem;
    }

    /**
     * Sets the value of the contentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentItem }
     *     
     */
    public void setContentItem(ContentItem value) {
        this.contentItem = value;
    }

}
