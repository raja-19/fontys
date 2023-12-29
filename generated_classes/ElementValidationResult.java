
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementValidationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementValidationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Element" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementKeyReference" minOccurs="0"/&gt;
 *         &lt;element name="ValidationReport" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfPropertyValidationReport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementValidationResult", propOrder = {
    "element",
    "validationReport"
})
public class ElementValidationResult {

    @XmlElement(name = "Element", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ElementKeyReference element;
    @XmlElement(name = "ValidationReport", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfPropertyValidationReport validationReport;

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyReference }
     *     
     */
    public ElementKeyReference getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyReference }
     *     
     */
    public void setElement(ElementKeyReference value) {
        this.element = value;
    }

    /**
     * Gets the value of the validationReport property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPropertyValidationReport }
     *     
     */
    public ArrayOfPropertyValidationReport getValidationReport() {
        return validationReport;
    }

    /**
     * Sets the value of the validationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPropertyValidationReport }
     *     
     */
    public void setValidationReport(ArrayOfPropertyValidationReport value) {
        this.validationReport = value;
    }

}
