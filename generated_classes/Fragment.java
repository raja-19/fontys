
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fragment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fragment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Specifications" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfSpecification" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Children" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfFragmentChild" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fragment", propOrder = {
    "specifications",
    "children"
})
public class Fragment {

    @XmlElement(name = "Specifications")
    protected ArrayOfSpecification specifications;
    @XmlElement(name = "Children")
    protected ArrayOfFragmentChild children;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the specifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecification }
     *     
     */
    public ArrayOfSpecification getSpecifications() {
        return specifications;
    }

    /**
     * Sets the value of the specifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecification }
     *     
     */
    public void setSpecifications(ArrayOfSpecification value) {
        this.specifications = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFragmentChild }
     *     
     */
    public ArrayOfFragmentChild getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFragmentChild }
     *     
     */
    public void setChildren(ArrayOfFragmentChild value) {
        this.children = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}