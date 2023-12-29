
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPortalMessageMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPortalMessageMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PortalMessageMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}PortalMessageMapping" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPortalMessageMapping", propOrder = {
    "portalMessageMapping"
})
public class ArrayOfPortalMessageMapping {

    @XmlElement(name = "PortalMessageMapping")
    protected List<PortalMessageMapping> portalMessageMapping;

    /**
     * Gets the value of the portalMessageMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the portalMessageMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortalMessageMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortalMessageMapping }
     * 
     * 
     */
    public List<PortalMessageMapping> getPortalMessageMapping() {
        if (portalMessageMapping == null) {
            portalMessageMapping = new ArrayList<PortalMessageMapping>();
        }
        return this.portalMessageMapping;
    }

}
