
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoapServiceConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoapServiceConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}WebServiceConfiguration"&gt;
 *       &lt;attribute name="SoapService" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoapServiceConfiguration")
public class SoapServiceConfiguration
    extends WebServiceConfiguration
{

    @XmlAttribute(name = "SoapService")
    protected String soapService;

    /**
     * Gets the value of the soapService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoapService() {
        return soapService;
    }

    /**
     * Sets the value of the soapService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoapService(String value) {
        this.soapService = value;
    }

}
