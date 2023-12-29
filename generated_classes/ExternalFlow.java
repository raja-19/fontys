
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalFlow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalFlow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contract" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Configuration" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="MappedContractEvents" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ContractFlowEventImplementation" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DataMapping" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalFlow", propOrder = {
    "contract",
    "configuration",
    "mappedContractEvents"
})
public class ExternalFlow {

    @XmlElement(name = "Contract")
    protected ModuleKey contract;
    @XmlElement(name = "Configuration")
    protected ModuleKey configuration;
    @XmlElement(name = "MappedContractEvents")
    protected List<ContractFlowEventImplementation> mappedContractEvents;
    @XmlAttribute(name = "DataMapping")
    protected String dataMapping;

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setContract(ModuleKey value) {
        this.contract = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setConfiguration(ModuleKey value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the mappedContractEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mappedContractEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappedContractEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractFlowEventImplementation }
     * 
     * 
     */
    public List<ContractFlowEventImplementation> getMappedContractEvents() {
        if (mappedContractEvents == null) {
            mappedContractEvents = new ArrayList<ContractFlowEventImplementation>();
        }
        return this.mappedContractEvents;
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
