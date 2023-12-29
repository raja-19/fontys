
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionTree complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionTree"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfMultiLingualText" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="RootNode" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DTConditionNode" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Symptoms" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfArrayOfMultiLingualText" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ExposedAsWebservice" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionTree", propOrder = {
    "displayName",
    "rootNode",
    "symptoms"
})
public class DecisionTree
    extends ModuleElement
{

    @XmlElement(name = "DisplayName")
    protected ArrayOfMultiLingualText displayName;
    @XmlElement(name = "RootNode")
    protected DTConditionNode rootNode;
    @XmlElement(name = "Symptoms")
    protected ArrayOfArrayOfMultiLingualText symptoms;
    @XmlAttribute(name = "ExposedAsWebservice", required = true)
    protected boolean exposedAsWebservice;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public ArrayOfMultiLingualText getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMultiLingualText }
     *     
     */
    public void setDisplayName(ArrayOfMultiLingualText value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the rootNode property.
     * 
     * @return
     *     possible object is
     *     {@link DTConditionNode }
     *     
     */
    public DTConditionNode getRootNode() {
        return rootNode;
    }

    /**
     * Sets the value of the rootNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTConditionNode }
     *     
     */
    public void setRootNode(DTConditionNode value) {
        this.rootNode = value;
    }

    /**
     * Gets the value of the symptoms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfMultiLingualText }
     *     
     */
    public ArrayOfArrayOfMultiLingualText getSymptoms() {
        return symptoms;
    }

    /**
     * Sets the value of the symptoms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfMultiLingualText }
     *     
     */
    public void setSymptoms(ArrayOfArrayOfMultiLingualText value) {
        this.symptoms = value;
    }

    /**
     * Gets the value of the exposedAsWebservice property.
     * 
     */
    public boolean isExposedAsWebservice() {
        return exposedAsWebservice;
    }

    /**
     * Sets the value of the exposedAsWebservice property.
     * 
     */
    public void setExposedAsWebservice(boolean value) {
        this.exposedAsWebservice = value;
    }

}
