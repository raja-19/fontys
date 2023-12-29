
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfElementValidationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfElementValidationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementValidationResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementValidationResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfElementValidationResult", propOrder = {
    "elementValidationResult"
})
public class ArrayOfElementValidationResult {

    @XmlElement(name = "ElementValidationResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected List<ElementValidationResult> elementValidationResult;

    /**
     * Gets the value of the elementValidationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the elementValidationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementValidationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementValidationResult }
     * 
     * 
     */
    public List<ElementValidationResult> getElementValidationResult() {
        if (elementValidationResult == null) {
            elementValidationResult = new ArrayList<ElementValidationResult>();
        }
        return this.elementValidationResult;
    }

}
