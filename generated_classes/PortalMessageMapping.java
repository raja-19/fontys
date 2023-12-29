
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortalMessageMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortalMessageMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="FieldMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfPortalMessageFieldMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortalMessageMapping", propOrder = {
    "portalMessage",
    "fieldMappings"
})
public class PortalMessageMapping {

    @XmlElement(name = "PortalMessage")
    protected String portalMessage;
    @XmlElement(name = "FieldMappings")
    protected ArrayOfPortalMessageFieldMapping fieldMappings;

    /**
     * Gets the value of the portalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalMessage() {
        return portalMessage;
    }

    /**
     * Sets the value of the portalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalMessage(String value) {
        this.portalMessage = value;
    }

    /**
     * Gets the value of the fieldMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPortalMessageFieldMapping }
     *     
     */
    public ArrayOfPortalMessageFieldMapping getFieldMappings() {
        return fieldMappings;
    }

    /**
     * Sets the value of the fieldMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPortalMessageFieldMapping }
     *     
     */
    public void setFieldMappings(ArrayOfPortalMessageFieldMapping value) {
        this.fieldMappings = value;
    }

}
