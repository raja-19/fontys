
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Page complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Page"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMultiLingualText" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Containments" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfContainment" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContentStyle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Page", propOrder = {
    "displayName",
    "containments"
})
public class Page
    extends ModuleElement
{

    @XmlElement(name = "DisplayName")
    protected ArrayOfMultiLingualText displayName;
    @XmlElement(name = "Containments")
    protected ArrayOfContainment containments;
    @XmlAttribute(name = "ContentStyle")
    protected String contentStyle;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public ArrayOfMultiLingualText getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public void setDisplayName(ArrayOfMultiLingualText value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the containments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContainment }
     *     
     */
    public ArrayOfContainment getContainments() {
        return containments;
    }

    /**
     * Sets the value of the containments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContainment }
     *     
     */
    public void setContainments(ArrayOfContainment value) {
        this.containments = value;
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

}
