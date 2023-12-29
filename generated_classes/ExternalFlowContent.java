
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalFlowContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalFlowContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Connection" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ContractModule" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ConfigurationModule" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ContractMappedEvents" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfContractEventDefinitionImplementation" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DataMapping" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalFlowContent", propOrder = {
    "connection",
    "contractModule",
    "configurationModule",
    "contractMappedEvents"
})
public class ExternalFlowContent
    extends ParameterContent
{

    @XmlElement(name = "Connection")
    protected Expression connection;
    @XmlElement(name = "ContractModule")
    protected ModuleKey contractModule;
    @XmlElement(name = "ConfigurationModule")
    protected ModuleKey configurationModule;
    @XmlElement(name = "ContractMappedEvents")
    protected ArrayOfContractEventDefinitionImplementation contractMappedEvents;
    @XmlAttribute(name = "DataMapping")
    protected String dataMapping;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setConnection(Expression value) {
        this.connection = value;
    }

    /**
     * Gets the value of the contractModule property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getContractModule() {
        return contractModule;
    }

    /**
     * Sets the value of the contractModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setContractModule(ModuleKey value) {
        this.contractModule = value;
    }

    /**
     * Gets the value of the configurationModule property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getConfigurationModule() {
        return configurationModule;
    }

    /**
     * Sets the value of the configurationModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setConfigurationModule(ModuleKey value) {
        this.configurationModule = value;
    }

    /**
     * Gets the value of the contractMappedEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContractEventDefinitionImplementation }
     *     
     */
    public ArrayOfContractEventDefinitionImplementation getContractMappedEvents() {
        return contractMappedEvents;
    }

    /**
     * Sets the value of the contractMappedEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContractEventDefinitionImplementation }
     *     
     */
    public void setContractMappedEvents(ArrayOfContractEventDefinitionImplementation value) {
        this.contractMappedEvents = value;
    }

    /**
     * Gets the value of the dataMapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMapping() {
        return dataMapping;
    }

    /**
     * Sets the value of the dataMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMapping(String value) {
        this.dataMapping = value;
    }

}
