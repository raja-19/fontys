
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVLActionLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVLActionLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionLayout" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}VLActionLayout" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVLActionLayout", propOrder = {
    "actionLayout"
})
public class ArrayOfVLActionLayout {

    @XmlElement(name = "ActionLayout")
    protected List<VLActionLayout> actionLayout;

    /**
     * Gets the value of the actionLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actionLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VLActionLayout }
     * 
     * 
     */
    public List<VLActionLayout> getActionLayout() {
        if (actionLayout == null) {
            actionLayout = new ArrayList<VLActionLayout>();
        }
        return this.actionLayout;
    }

}
