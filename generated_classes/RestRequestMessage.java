
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}RestMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fragments" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfRestUrnFragment" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Arguments" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfRestUrnArgument" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HttpMethod" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Get"/&gt;
 *             &lt;enumeration value="Post"/&gt;
 *             &lt;enumeration value="Put"/&gt;
 *             &lt;enumeration value="Delete"/&gt;
 *             &lt;enumeration value="Patch"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestRequestMessage", propOrder = {
    "fragments",
    "arguments"
})
public class RestRequestMessage
    extends RestMessage
{

    @XmlElement(name = "Fragments")
    protected ArrayOfRestUrnFragment fragments;
    @XmlElement(name = "Arguments")
    protected ArrayOfRestUrnArgument arguments;
    @XmlAttribute(name = "HttpMethod", required = true)
    protected String httpMethod;

    /**
     * Gets the value of the fragments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestUrnFragment }
     *     
     */
    public ArrayOfRestUrnFragment getFragments() {
        return fragments;
    }

    /**
     * Sets the value of the fragments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestUrnFragment }
     *     
     */
    public void setFragments(ArrayOfRestUrnFragment value) {
        this.fragments = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestUrnArgument }
     *     
     */
    public ArrayOfRestUrnArgument getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestUrnArgument }
     *     
     */
    public void setArguments(ArrayOfRestUrnArgument value) {
        this.arguments = value;
    }

    /**
     * Gets the value of the httpMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * Sets the value of the httpMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpMethod(String value) {
        this.httpMethod = value;
    }

}
