
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operations" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfRestOperation" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Direction" default="Both"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Both"/&gt;
 *             &lt;enumeration value="Incoming"/&gt;
 *             &lt;enumeration value="Outgoing"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SchemaSet" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CommunicationType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CommunicationType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestService", propOrder = {
    "operations"
})
public class RestService
    extends ModuleElement
{

    @XmlElement(name = "Operations")
    protected ArrayOfRestOperation operations;
    @XmlAttribute(name = "Direction")
    protected String direction;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "SchemaSet")
    protected String schemaSet;
    @XmlAttribute(name = "CommunicationType")
    protected CommunicationType communicationType;

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestOperation }
     *     
     */
    public ArrayOfRestOperation getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestOperation }
     *     
     */
    public void setOperations(ArrayOfRestOperation value) {
        this.operations = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        if (direction == null) {
            return "Both";
        } else {
            return direction;
        }
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the schemaSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaSet() {
        return schemaSet;
    }

    /**
     * Sets the value of the schemaSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaSet(String value) {
        this.schemaSet = value;
    }

    /**
     * Gets the value of the communicationType property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationType }
     *     
     */
    public CommunicationType getCommunicationType() {
        return communicationType;
    }

    /**
     * Sets the value of the communicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationType }
     *     
     */
    public void setCommunicationType(CommunicationType value) {
        this.communicationType = value;
    }

}
