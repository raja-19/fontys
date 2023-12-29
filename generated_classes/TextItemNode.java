
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextItemNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextItemNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Children" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfTextItemNode" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextItemNode", propOrder = {
    "children"
})
@XmlSeeAlso({
    ConditionNode.class,
    FieldNode.class,
    TextNode.class,
    PresentationNode.class
})
public abstract class TextItemNode {

    @XmlElement(name = "Children")
    protected ArrayOfTextItemNode children;

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTextItemNode }
     *     
     */
    public ArrayOfTextItemNode getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTextItemNode }
     *     
     */
    public void setChildren(ArrayOfTextItemNode value) {
        this.children = value;
    }

}
