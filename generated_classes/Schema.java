
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Schema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="TargetNamespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ElementFormDefault" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SchemaForm" form="unqualified"/&gt;
 *         &lt;element name="AttributeFormDefault" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SchemaForm" form="unqualified"/&gt;
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Includes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString9" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Elements" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfElementMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Types" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfTypeMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schema", propOrder = {
    "name",
    "targetNamespace",
    "elementFormDefault",
    "attributeFormDefault",
    "content",
    "includes",
    "elements",
    "types"
})
public class Schema {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TargetNamespace")
    protected String targetNamespace;
    @XmlElement(name = "ElementFormDefault", required = true)
    @XmlSchemaType(name = "string")
    protected SchemaForm elementFormDefault;
    @XmlElement(name = "AttributeFormDefault", required = true)
    @XmlSchemaType(name = "string")
    protected SchemaForm attributeFormDefault;
    @XmlElement(name = "Content")
    protected byte[] content;
    @XmlElement(name = "Includes")
    protected ArrayOfString9 includes;
    @XmlElement(name = "Elements")
    protected ArrayOfElementMapping elements;
    @XmlElement(name = "Types")
    protected ArrayOfTypeMapping types;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the targetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Gets the value of the elementFormDefault property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaForm }
     *     
     */
    public SchemaForm getElementFormDefault() {
        return elementFormDefault;
    }

    /**
     * Sets the value of the elementFormDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaForm }
     *     
     */
    public void setElementFormDefault(SchemaForm value) {
        this.elementFormDefault = value;
    }

    /**
     * Gets the value of the attributeFormDefault property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaForm }
     *     
     */
    public SchemaForm getAttributeFormDefault() {
        return attributeFormDefault;
    }

    /**
     * Sets the value of the attributeFormDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaForm }
     *     
     */
    public void setAttributeFormDefault(SchemaForm value) {
        this.attributeFormDefault = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString9 }
     *     
     */
    public ArrayOfString9 getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString9 }
     *     
     */
    public void setIncludes(ArrayOfString9 value) {
        this.includes = value;
    }

    /**
     * Gets the value of the elements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElementMapping }
     *     
     */
    public ArrayOfElementMapping getElements() {
        return elements;
    }

    /**
     * Sets the value of the elements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElementMapping }
     *     
     */
    public void setElements(ArrayOfElementMapping value) {
        this.elements = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypeMapping }
     *     
     */
    public ArrayOfTypeMapping getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypeMapping }
     *     
     */
    public void setTypes(ArrayOfTypeMapping value) {
        this.types = value;
    }

}
