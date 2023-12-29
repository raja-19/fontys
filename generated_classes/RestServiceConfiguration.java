
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestServiceConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestServiceConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}WebServiceConfiguration"&gt;
 *       &lt;attribute name="RestService" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestServiceConfiguration")
public class RestServiceConfiguration
    extends WebServiceConfiguration
{

    @XmlAttribute(name = "RestService")
    protected String restService;

    /**
     * Gets the value of the restService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestService() {
        return restService;
    }

    /**
     * Sets the value of the restService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestService(String value) {
        this.restService = value;
    }

}
