
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoapServiceMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoapServiceMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfSoapServiceMessagePart" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Body" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfSoapServiceMessagePart" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Wsdl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoapServiceMessage", propOrder = {
    "header",
    "body"
})
public class SoapServiceMessage {

    @XmlElement(name = "Header")
    protected ArrayOfSoapServiceMessagePart header;
    @XmlElement(name = "Body")
    protected ArrayOfSoapServiceMessagePart body;
    @XmlAttribute(name = "Entity")
    protected String entity;
    @XmlAttribute(name = "Wsdl")
    protected String wsdl;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSoapServiceMessagePart }
     *     
     */
    public ArrayOfSoapServiceMessagePart getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSoapServiceMessagePart }
     *     
     */
    public void setHeader(ArrayOfSoapServiceMessagePart value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSoapServiceMessagePart }
     *     
     */
    public ArrayOfSoapServiceMessagePart getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSoapServiceMessagePart }
     *     
     */
    public void setBody(ArrayOfSoapServiceMessagePart value) {
        this.body = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the wsdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdl() {
        return wsdl;
    }

    /**
     * Sets the value of the wsdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdl(String value) {
        this.wsdl = value;
    }

}
