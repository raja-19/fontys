
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMessageEventField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessageEventField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageEventField" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}MessageEventField" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessageEventField", propOrder = {
    "messageEventField"
})
public class ArrayOfMessageEventField {

    @XmlElement(name = "MessageEventField")
    protected List<MessageEventField> messageEventField;

    /**
     * Gets the value of the messageEventField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messageEventField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageEventField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageEventField }
     * 
     * 
     */
    public List<MessageEventField> getMessageEventField() {
        if (messageEventField == null) {
            messageEventField = new ArrayList<MessageEventField>();
        }
        return this.messageEventField;
    }

}
