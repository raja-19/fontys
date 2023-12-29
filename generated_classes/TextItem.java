
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeSets" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfNodeSet" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextItem", propOrder = {
    "nodeSets"
})
public class TextItem
    extends ModuleElement
{

    @XmlElement(name = "NodeSets")
    protected ArrayOfNodeSet nodeSets;

    /**
     * Gets the value of the nodeSets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNodeSet }
     *     
     */
    public ArrayOfNodeSet getNodeSets() {
        return nodeSets;
    }

    /**
     * Sets the value of the nodeSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNodeSet }
     *     
     */
    public void setNodeSets(ArrayOfNodeSet value) {
        this.nodeSets = value;
    }

}
