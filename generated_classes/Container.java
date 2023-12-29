
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Container complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Container"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParameterContent" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DisplayName" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMultiLingualText" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Roles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString1" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Channels" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString6" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="MappedEvents" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfEventDefinitionImplementation" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CustomEvents" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfEventImplementation" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContentStyle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContainerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Container", propOrder = {
    "parameterContent",
    "displayName",
    "roles",
    "channels",
    "mappedEvents",
    "customEvents"
})
public class Container
    extends ModuleElement
{

    @XmlElement(name = "ParameterContent")
    protected ParameterContent parameterContent;
    @XmlElement(name = "DisplayName")
    protected ArrayOfMultiLingualText displayName;
    @XmlElement(name = "Roles")
    protected ArrayOfString1 roles;
    @XmlElement(name = "Channels")
    protected ArrayOfString6 channels;
    @XmlElement(name = "MappedEvents")
    protected ArrayOfEventDefinitionImplementation mappedEvents;
    @XmlElement(name = "CustomEvents")
    protected ArrayOfEventImplementation customEvents;
    @XmlAttribute(name = "ContentStyle")
    protected String contentStyle;
    @XmlAttribute(name = "ContainerType")
    protected String containerType;

    /**
     * Gets the value of the parameterContent property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterContent }
     *     
     */
    public ParameterContent getParameterContent() {
        return parameterContent;
    }

    /**
     * Sets the value of the parameterContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterContent }
     *     
     */
    public void setParameterContent(ParameterContent value) {
        this.parameterContent = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public ArrayOfMultiLingualText getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public void setDisplayName(ArrayOfMultiLingualText value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setRoles(ArrayOfString1 value) {
        this.roles = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString6 }
     *     
     */
    public ArrayOfString6 getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString6 }
     *     
     */
    public void setChannels(ArrayOfString6 value) {
        this.channels = value;
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
     * Gets the value of the customEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventImplementation }
     *     
     */
    public ArrayOfEventImplementation getCustomEvents() {
        return customEvents;
    }

    /**
     * Sets the value of the customEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventImplementation }
     *     
     */
    public void setCustomEvents(ArrayOfEventImplementation value) {
        this.customEvents = value;
    }

    /**
     * Gets the value of the contentStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentStyle() {
        return contentStyle;
    }

    /**
     * Sets the value of the contentStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentStyle(String value) {
        this.contentStyle = value;
    }

    /**
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerType(String value) {
        this.containerType = value;
    }

}
