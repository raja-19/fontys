
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSourceAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSourceAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourcingAttribute" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SourceAttribute" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSourceAttribute", propOrder = {
    "sourcingAttribute"
})
public class ArrayOfSourceAttribute {

    @XmlElement(name = "SourcingAttribute")
    protected List<SourceAttribute> sourcingAttribute;

    /**
     * Gets the value of the sourcingAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sourcingAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourcingAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceAttribute }
     * 
     * 
     */
    public List<SourceAttribute> getSourcingAttribute() {
        if (sourcingAttribute == null) {
            sourcingAttribute = new ArrayList<SourceAttribute>();
        }
        return this.sourcingAttribute;
    }

}