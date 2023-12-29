
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortalMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortalMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortalMessageDataFields" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfPortalMessageDataField" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortalMessage", propOrder = {
    "portalMessageDataFields"
})
public class PortalMessage
    extends GlobalElement
{

    @XmlElement(name = "PortalMessageDataFields")
    protected ArrayOfPortalMessageDataField portalMessageDataFields;

    /**
     * Gets the value of the portalMessageDataFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPortalMessageDataField }
     *     
     */
    public ArrayOfPortalMessageDataField getPortalMessageDataFields() {
        return portalMessageDataFields;
    }

    /**
     * Sets the value of the portalMessageDataFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPortalMessageDataField }
     *     
     */
    public void setPortalMessageDataFields(ArrayOfPortalMessageDataField value) {
        this.portalMessageDataFields = value;
    }

}
