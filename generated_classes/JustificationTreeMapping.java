
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JustificationTreeMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JustificationTreeMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Depth" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}JustificationTreeDepth" form="unqualified"/&gt;
 *         &lt;element name="AssetFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JustificationTreeMapping", propOrder = {
    "entity",
    "attribute",
    "depth",
    "assetFormat"
})
public class JustificationTreeMapping {

    @XmlElement(name = "Entity")
    protected String entity;
    @XmlElement(name = "Attribute")
    protected String attribute;
    @XmlElement(name = "Depth", required = true)
    @XmlSchemaType(name = "string")
    protected JustificationTreeDepth depth;
    @XmlElement(name = "AssetFormat")
    protected String assetFormat;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link JustificationTreeDepth }
     *     
     */
    public JustificationTreeDepth getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JustificationTreeDepth }
     *     
     */
    public void setDepth(JustificationTreeDepth value) {
        this.depth = value;
    }

    /**
     * Gets the value of the assetFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetFormat() {
        return assetFormat;
    }

    /**
     * Sets the value of the assetFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetFormat(String value) {
        this.assetFormat = value;
    }

}
