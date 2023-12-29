
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCall"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Content" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="MappedEvents" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfEventDefinitionImplementation" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCall", propOrder = {
    "content",
    "mappedEvents"
})
public class ServiceCall
    extends ModuleElement
{

    @XmlElement(name = "Content")
    protected ServiceCallContent content;
    @XmlElement(name = "MappedEvents")
    protected ArrayOfEventDefinitionImplementation mappedEvents;
    @XmlAttribute(name = "ServiceType")
    protected String serviceType;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCallContent }
     *     
     */
    public ServiceCallContent getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCallContent }
     *     
     */
    public void setContent(ServiceCallContent value) {
        this.content = value;
    }

    /**
     * Gets the value of the mappedEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventDefinitionImplementation }
     *     
     */
    public ArrayOfEventDefinitionImplementation getMappedEvents() {
        return mappedEvents;
    }

    /**
     * Sets the value of the mappedEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventDefinitionImplementation }
     *     
     */
    public void setMappedEvents(ArrayOfEventDefinitionImplementation value) {
        this.mappedEvents = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

}
