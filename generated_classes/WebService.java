
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Module" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="RestService" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}RestServiceConfiguration" minOccurs="0" form="unqualified"/&gt;
 *           &lt;element name="SoapService" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SoapServiceConfiguration" minOccurs="0" form="unqualified"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebService", propOrder = {
    "module",
    "restService",
    "soapService"
})
public class WebService
    extends ModuleElement
{

    @XmlElement(name = "Module")
    protected ModuleKey module;
    @XmlElement(name = "RestService")
    protected RestServiceConfiguration restService;
    @XmlElement(name = "SoapService")
    protected SoapServiceConfiguration soapService;

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setModule(ModuleKey value) {
        this.module = value;
    }

    /**
     * Gets the value of the restService property.
     * 
     * @return
     *     possible object is
     *     {@link RestServiceConfiguration }
     *     
     */
    public RestServiceConfiguration getRestService() {
        return restService;
    }

    /**
     * Sets the value of the restService property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestServiceConfiguration }
     *     
     */
    public void setRestService(RestServiceConfiguration value) {
        this.restService = value;
    }

    /**
     * Gets the value of the soapService property.
     * 
     * @return
     *     possible object is
     *     {@link SoapServiceConfiguration }
     *     
     */
    public SoapServiceConfiguration getSoapService() {
        return soapService;
    }

    /**
     * Sets the value of the soapService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapServiceConfiguration }
     *     
     */
    public void setSoapService(SoapServiceConfiguration value) {
        this.soapService = value;
    }

}
