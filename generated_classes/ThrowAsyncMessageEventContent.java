
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThrowAsyncMessageEventContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThrowAsyncMessageEventContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="SpecificCaseIds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Values" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfThrowAsyncMessageEventValue" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThrowAsyncMessageEventContent", propOrder = {
    "messageEvent",
    "specificCaseIds",
    "values"
})
public class ThrowAsyncMessageEventContent
    extends ServiceCallContent
{

    @XmlElement(name = "MessageEvent")
    protected String messageEvent;
    @XmlElement(name = "SpecificCaseIds")
    protected Expression specificCaseIds;
    @XmlElement(name = "Values")
    protected ArrayOfThrowAsyncMessageEventValue values;

    /**
     * Gets the value of the messageEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageEvent() {
        return messageEvent;
    }

    /**
     * Sets the value of the messageEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageEvent(String value) {
        this.messageEvent = value;
    }

    /**
     * Gets the value of the specificCaseIds property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getSpecificCaseIds() {
        return specificCaseIds;
    }

    /**
     * Sets the value of the specificCaseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setSpecificCaseIds(Expression value) {
        this.specificCaseIds = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfThrowAsyncMessageEventValue }
     *     
     */
    public ArrayOfThrowAsyncMessageEventValue getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfThrowAsyncMessageEventValue }
     *     
     */
    public void setValues(ArrayOfThrowAsyncMessageEventValue value) {
        this.values = value;
    }

}
