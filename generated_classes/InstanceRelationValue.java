
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceRelationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstanceRelationValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StaticInstances" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInstanceKey" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceRelationValue", propOrder = {
    "staticInstances"
})
public class InstanceRelationValue {

    @XmlElement(name = "StaticInstances")
    protected ArrayOfInstanceKey staticInstances;
    @XmlAttribute(name = "Relation")
    protected String relation;

    /**
     * Gets the value of the staticInstances property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstanceKey }
     *     
     */
    public ArrayOfInstanceKey getStaticInstances() {
        return staticInstances;
    }

    /**
     * Sets the value of the staticInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstanceKey }
     *     
     */
    public void setStaticInstances(ArrayOfInstanceKey value) {
        this.staticInstances = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

}
