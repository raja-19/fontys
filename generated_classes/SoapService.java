
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoapService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoapService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Wsdls" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfWsdl" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="MainWsdl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="WsiCompliant" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="SoapVersion" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SoapVersion" form="unqualified"/&gt;
 *         &lt;element name="TargetNamespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="SchemaSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Operations" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfSoapServiceOperation" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoapService", propOrder = {
    "wsdls",
    "mainWsdl",
    "wsiCompliant",
    "soapVersion",
    "targetNamespace",
    "location",
    "schemaSet",
    "operations"
})
public class SoapService
    extends ModuleElement
{

    @XmlElement(name = "Wsdls")
    protected ArrayOfWsdl wsdls;
    @XmlElement(name = "MainWsdl")
    protected String mainWsdl;
    @XmlElement(name = "WsiCompliant")
    protected boolean wsiCompliant;
    @XmlElement(name = "SoapVersion", required = true)
    @XmlSchemaType(name = "string")
    protected SoapVersion soapVersion;
    @XmlElement(name = "TargetNamespace")
    protected String targetNamespace;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "SchemaSet")
    protected String schemaSet;
    @XmlElement(name = "Operations")
    protected ArrayOfSoapServiceOperation operations;

    /**
     * Gets the value of the wsdls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWsdl }
     *     
     */
    public ArrayOfWsdl getWsdls() {
        return wsdls;
    }

    /**
     * Sets the value of the wsdls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWsdl }
     *     
     */
    public void setWsdls(ArrayOfWsdl value) {
        this.wsdls = value;
    }

    /**
     * Gets the value of the mainWsdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainWsdl() {
        return mainWsdl;
    }

    /**
     * Sets the value of the mainWsdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainWsdl(String value) {
        this.mainWsdl = value;
    }

    /**
     * Gets the value of the wsiCompliant property.
     * 
     */
    public boolean isWsiCompliant() {
        return wsiCompliant;
    }

    /**
     * Sets the value of the wsiCompliant property.
     * 
     */
    public void setWsiCompliant(boolean value) {
        this.wsiCompliant = value;
    }

    /**
     * Gets the value of the soapVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SoapVersion }
     *     
     */
    public SoapVersion getSoapVersion() {
        return soapVersion;
    }

    /**
     * Sets the value of the soapVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapVersion }
     *     
     */
    public void setSoapVersion(SoapVersion value) {
        this.soapVersion = value;
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
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSoapServiceOperation }
     *     
     */
    public ArrayOfSoapServiceOperation getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSoapServiceOperation }
     *     
     */
    public void setOperations(ArrayOfSoapServiceOperation value) {
        this.operations = value;
    }

}
