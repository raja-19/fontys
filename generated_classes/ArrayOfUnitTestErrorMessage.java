
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnitTestErrorMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnitTestErrorMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnitTestErrorMessage" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}UnitTestErrorMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnitTestErrorMessage", propOrder = {
    "unitTestErrorMessage"
})
public class ArrayOfUnitTestErrorMessage {

    @XmlElement(name = "UnitTestErrorMessage", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", nillable = true)
    protected List<UnitTestErrorMessage> unitTestErrorMessage;

    /**
     * Gets the value of the unitTestErrorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unitTestErrorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitTestErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitTestErrorMessage }
     * 
     * 
     */
    public List<UnitTestErrorMessage> getUnitTestErrorMessage() {
        if (unitTestErrorMessage == null) {
            unitTestErrorMessage = new ArrayList<UnitTestErrorMessage>();
        }
        return this.unitTestErrorMessage;
    }

}
