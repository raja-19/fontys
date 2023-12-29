
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebServiceConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebServiceConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operations" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfWebServiceConfigurationOperation" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Validate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebServiceConfiguration", propOrder = {
    "operations"
})
@XmlSeeAlso({
    RestServiceConfiguration.class,
    SoapServiceConfiguration.class
})
public abstract class WebServiceConfiguration {

    @XmlElement(name = "Operations")
    protected ArrayOfWebServiceConfigurationOperation operations;
    @XmlAttribute(name = "Validate", required = true)
    protected boolean validate;

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWebServiceConfigurationOperation }
     *     
     */
    public ArrayOfWebServiceConfigurationOperation getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWebServiceConfigurationOperation }
     *     
     */
    public void setOperations(ArrayOfWebServiceConfigurationOperation value) {
        this.operations = value;
    }

    /**
     * Gets the value of the validate property.
     * 
     */
    public boolean isValidate() {
        return validate;
    }

    /**
     * Sets the value of the validate property.
     * 
     */
    public void setValidate(boolean value) {
        this.validate = value;
    }

}
