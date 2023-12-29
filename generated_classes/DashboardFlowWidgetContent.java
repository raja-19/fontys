
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardFlowWidgetContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardFlowWidgetContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlowModule" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Flow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="MappingModule" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Mapping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="MessageMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfPortalMessageMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardFlowWidgetContent", propOrder = {
    "flowModule",
    "flow",
    "mappingModule",
    "mapping",
    "messageMappings"
})
public class DashboardFlowWidgetContent
    extends ParameterContent
{

    @XmlElement(name = "FlowModule")
    protected ModuleKey flowModule;
    @XmlElement(name = "Flow")
    protected String flow;
    @XmlElement(name = "MappingModule")
    protected ModuleKey mappingModule;
    @XmlElement(name = "Mapping")
    protected String mapping;
    @XmlElement(name = "MessageMappings")
    protected ArrayOfPortalMessageMapping messageMappings;

    /**
     * Gets the value of the flowModule property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getFlowModule() {
        return flowModule;
    }

    /**
     * Sets the value of the flowModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setFlowModule(ModuleKey value) {
        this.flowModule = value;
    }

    /**
     * Gets the value of the flow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlow() {
        return flow;
    }

    /**
     * Sets the value of the flow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlow(String value) {
        this.flow = value;
    }

    /**
     * Gets the value of the mappingModule property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getMappingModule() {
        return mappingModule;
    }

    /**
     * Sets the value of the mappingModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setMappingModule(ModuleKey value) {
        this.mappingModule = value;
    }

    /**
     * Gets the value of the mapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapping() {
        return mapping;
    }

    /**
     * Sets the value of the mapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapping(String value) {
        this.mapping = value;
    }

    /**
     * Gets the value of the messageMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPortalMessageMapping }
     *     
     */
    public ArrayOfPortalMessageMapping getMessageMappings() {
        return messageMappings;
    }

    /**
     * Sets the value of the messageMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPortalMessageMapping }
     *     
     */
    public void setMessageMappings(ArrayOfPortalMessageMapping value) {
        this.messageMappings = value;
    }

}
