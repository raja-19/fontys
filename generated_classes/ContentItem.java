
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RootNode" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ContentNode" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentItem", propOrder = {
    "rootNode"
})
public class ContentItem
    extends ModuleElement
{

    @XmlElement(name = "RootNode")
    protected ContentNode rootNode;

    /**
     * Gets the value of the rootNode property.
     * 
     * @return
     *     possible object is
     *     {@link ContentNode }
     *     
     */
    public ContentNode getRootNode() {
        return rootNode;
    }

    /**
     * Sets the value of the rootNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentNode }
     *     
     */
    public void setRootNode(ContentNode value) {
        this.rootNode = value;
    }

}
