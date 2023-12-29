
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfValueMappingEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfValueMappingEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValueMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ValueMappingEntry" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfValueMappingEntry", propOrder = {
    "valueMapping"
})
public class ArrayOfValueMappingEntry {

    @XmlElement(name = "ValueMapping")
    protected List<ValueMappingEntry> valueMapping;

    /**
     * Gets the value of the valueMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the valueMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueMappingEntry }
     * 
     * 
     */
    public List<ValueMappingEntry> getValueMapping() {
        if (valueMapping == null) {
            valueMapping = new ArrayList<ValueMappingEntry>();
        }
        return this.valueMapping;
    }

}
