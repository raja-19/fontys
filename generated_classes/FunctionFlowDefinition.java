
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionFlowDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionFlowDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="InputParameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FunctionFlowInputParameter" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="OutputParameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FunctionFlowOutputParameter" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionFlowDefinition", propOrder = {
    "documentation",
    "inputParameters",
    "outputParameters"
})
public class FunctionFlowDefinition {

    @XmlElement(name = "Documentation")
    protected String documentation;
    @XmlElement(name = "InputParameters")
    protected List<FunctionFlowInputParameter> inputParameters;
    @XmlElement(name = "OutputParameters")
    protected List<FunctionFlowOutputParameter> outputParameters;

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionFlowInputParameter }
     * 
     * 
     */
    public List<FunctionFlowInputParameter> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<FunctionFlowInputParameter>();
        }
        return this.inputParameters;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionFlowOutputParameter }
     * 
     * 
     */
    public List<FunctionFlowOutputParameter> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<FunctionFlowOutputParameter>();
        }
        return this.outputParameters;
    }

}
