
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionCall"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlowModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Flow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="InputMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfFunctionCallInputMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="OutputMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfFunctionCallOutputMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionCall", propOrder = {
    "flowModule",
    "flow",
    "inputMappings",
    "outputMappings"
})
public class FunctionCall
    extends ModuleElement
{

    @XmlElement(name = "FlowModule")
    protected String flowModule;
    @XmlElement(name = "Flow")
    protected String flow;
    @XmlElement(name = "InputMappings")
    protected ArrayOfFunctionCallInputMapping inputMappings;
    @XmlElement(name = "OutputMappings")
    protected ArrayOfFunctionCallOutputMapping outputMappings;

    /**
     * Gets the value of the flowModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowModule() {
        return flowModule;
    }

    /**
     * Sets the value of the flowModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowModule(String value) {
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
     * Gets the value of the inputMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFunctionCallInputMapping }
     *     
     */
    public ArrayOfFunctionCallInputMapping getInputMappings() {
        return inputMappings;
    }

    /**
     * Sets the value of the inputMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFunctionCallInputMapping }
     *     
     */
    public void setInputMappings(ArrayOfFunctionCallInputMapping value) {
        this.inputMappings = value;
    }

    /**
     * Gets the value of the outputMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFunctionCallOutputMapping }
     *     
     */
    public ArrayOfFunctionCallOutputMapping getOutputMappings() {
        return outputMappings;
    }

    /**
     * Sets the value of the outputMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFunctionCallOutputMapping }
     *     
     */
    public void setOutputMappings(ArrayOfFunctionCallOutputMapping value) {
        this.outputMappings = value;
    }

}
