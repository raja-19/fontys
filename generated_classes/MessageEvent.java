
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageEventFields" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMessageEventField" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageEvent", propOrder = {
    "messageEventFields"
})
public class MessageEvent
    extends ModuleElement
{

    @XmlElement(name = "MessageEventFields")
    protected ArrayOfMessageEventField messageEventFields;

    /**
     * Gets the value of the messageEventFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessageEventField }
     *     
     */
    public ArrayOfMessageEventField getMessageEventFields() {
        return messageEventFields;
    }

    /**
     * Sets the value of the messageEventFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessageEventField }
     *     
     */
    public void setMessageEventFields(ArrayOfMessageEventField value) {
        this.messageEventFields = value;
    }

}
