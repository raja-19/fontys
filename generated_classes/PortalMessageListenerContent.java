
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortalMessageListenerContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortalMessageListenerContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfPortalMessageMapping1" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortalMessageListenerContent", propOrder = {
    "entries"
})
public class PortalMessageListenerContent
    extends ParameterContent
{

    @XmlElement(name = "Entries")
    protected ArrayOfPortalMessageMapping1 entries;

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPortalMessageMapping1 }
     *     
     */
    public ArrayOfPortalMessageMapping1 getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPortalMessageMapping1 }
     *     
     */
    public void setEntries(ArrayOfPortalMessageMapping1 value) {
        this.entries = value;
    }

}
