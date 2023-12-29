
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProjectConfiguration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImplementationModules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString17" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ConfigurationModules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString18" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ContractModules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString19" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ExternalContractModules" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString20" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RootModule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProcessModule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SpecificationModule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DefaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunConfiguration", propOrder = {
    "implementationModules",
    "configurationModules",
    "contractModules",
    "externalContractModules"
})
public class RunConfiguration
    extends ProjectConfiguration
{

    @XmlElement(name = "ImplementationModules")
    protected ArrayOfString17 implementationModules;
    @XmlElement(name = "ConfigurationModules")
    protected ArrayOfString18 configurationModules;
    @XmlElement(name = "ContractModules")
    protected ArrayOfString19 contractModules;
    @XmlElement(name = "ExternalContractModules")
    protected ArrayOfString20 externalContractModules;
    @XmlAttribute(name = "RootModule")
    protected String rootModule;
    @XmlAttribute(name = "ProcessModule")
    protected String processModule;
    @XmlAttribute(name = "SpecificationModule")
    protected String specificationModule;
    @XmlAttribute(name = "DefaultLanguage")
    protected String defaultLanguage;

    /**
     * Gets the value of the implementationModules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString17 }
     *     
     */
    public ArrayOfString17 getImplementationModules() {
        return implementationModules;
    }

    /**
     * Sets the value of the implementationModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString17 }
     *     
     */
    public void setImplementationModules(ArrayOfString17 value) {
        this.implementationModules = value;
    }

    /**
     * Gets the value of the configurationModules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString18 }
     *     
     */
    public ArrayOfString18 getConfigurationModules() {
        return configurationModules;
    }

    /**
     * Sets the value of the configurationModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString18 }
     *     
     */
    public void setConfigurationModules(ArrayOfString18 value) {
        this.configurationModules = value;
    }

    /**
     * Gets the value of the contractModules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString19 }
     *     
     */
    public ArrayOfString19 getContractModules() {
        return contractModules;
    }

    /**
     * Sets the value of the contractModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString19 }
     *     
     */
    public void setContractModules(ArrayOfString19 value) {
        this.contractModules = value;
    }

    /**
     * Gets the value of the externalContractModules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString20 }
     *     
     */
    public ArrayOfString20 getExternalContractModules() {
        return externalContractModules;
    }

    /**
     * Sets the value of the externalContractModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString20 }
     *     
     */
    public void setExternalContractModules(ArrayOfString20 value) {
        this.externalContractModules = value;
    }

    /**
     * Gets the value of the rootModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootModule() {
        return rootModule;
    }

    /**
     * Sets the value of the rootModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootModule(String value) {
        this.rootModule = value;
    }

    /**
     * Gets the value of the processModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessModule() {
        return processModule;
    }

    /**
     * Sets the value of the processModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessModule(String value) {
        this.processModule = value;
    }

    /**
     * Gets the value of the specificationModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationModule() {
        return specificationModule;
    }

    /**
     * Sets the value of the specificationModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationModule(String value) {
        this.specificationModule = value;
    }

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

}
