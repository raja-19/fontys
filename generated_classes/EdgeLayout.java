
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EdgeLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EdgeLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Offset" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ConnectionOffset" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EdgeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdgeLayout", propOrder = {
    "offset"
})
@XmlSeeAlso({
    ConditionEdgeLayout.class
})
public class EdgeLayout {

    @XmlElement(name = "Offset")
    protected ConnectionOffset offset;
    @XmlAttribute(name = "EdgeRef", required = true)
    protected int edgeRef;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionOffset }
     *     
     */
    public ConnectionOffset getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionOffset }
     *     
     */
    public void setOffset(ConnectionOffset value) {
        this.offset = value;
    }

    /**
     * Gets the value of the edgeRef property.
     * 
     */
    public int getEdgeRef() {
        return edgeRef;
    }

    /**
     * Sets the value of the edgeRef property.
     * 
     */
    public void setEdgeRef(int value) {
        this.edgeRef = value;
    }

}
