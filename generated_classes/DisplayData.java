
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresentationStyles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ListFormatDefinition" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OrderBy" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}OrderOption" /&gt;
 *       &lt;attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayData", propOrder = {
    "presentationStyles"
})
public class DisplayData {

    @XmlElement(name = "PresentationStyles")
    protected ListFormatDefinition presentationStyles;
    @XmlAttribute(name = "OrderBy", required = true)
    protected OrderOption orderBy;
    @XmlAttribute(name = "Mask")
    protected String mask;

    /**
     * Gets the value of the presentationStyles property.
     * 
     * @return
     *     possible object is
     *     {@link ListFormatDefinition }
     *     
     */
    public ListFormatDefinition getPresentationStyles() {
        return presentationStyles;
    }

    /**
     * Sets the value of the presentationStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListFormatDefinition }
     *     
     */
    public void setPresentationStyles(ListFormatDefinition value) {
        this.presentationStyles = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link OrderOption }
     *     
     */
    public OrderOption getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderOption }
     *     
     */
    public void setOrderBy(OrderOption value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

}
