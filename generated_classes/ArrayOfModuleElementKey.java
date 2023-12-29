
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfModuleElementKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfModuleElementKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModuleElementKey" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElementKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfModuleElementKey", propOrder = {
    "moduleElementKey"
})
public class ArrayOfModuleElementKey {

    @XmlElement(name = "ModuleElementKey", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", nillable = true)
    protected List<ModuleElementKey> moduleElementKey;

    /**
     * Gets the value of the moduleElementKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the moduleElementKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleElementKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleElementKey }
     * 
     * 
     */
    public List<ModuleElementKey> getModuleElementKey() {
        if (moduleElementKey == null) {
            moduleElementKey = new ArrayList<ModuleElementKey>();
        }
        return this.moduleElementKey;
    }

}
