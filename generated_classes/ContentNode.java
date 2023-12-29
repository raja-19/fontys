
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ContentItemNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Children" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfContentItemNode" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContentStyle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PresentationStyle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentNode", propOrder = {
    "children"
})
@XmlSeeAlso({
    ImageRefNode.class,
    TextRefNode.class,
    InlineTextNode.class
})
public abstract class ContentNode
    extends ContentItemNode
{

    @XmlElement(name = "Children")
    protected ArrayOfContentItemNode children;
    @XmlAttribute(name = "ContentStyle")
    protected String contentStyle;
    @XmlAttribute(name = "PresentationStyle")
    protected String presentationStyle;

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContentItemNode }
     *     
     */
    public ArrayOfContentItemNode getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContentItemNode }
     *     
     */
    public void setChildren(ArrayOfContentItemNode value) {
        this.children = value;
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
