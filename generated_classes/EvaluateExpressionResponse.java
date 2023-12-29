
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EvaluateExpressionResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ExpressionEvaluationResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "evaluateExpressionResult"
})
@XmlRootElement(name = "EvaluateExpressionResponse")
public class EvaluateExpressionResponse {

    @XmlElement(name = "EvaluateExpressionResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ExpressionEvaluationResult evaluateExpressionResult;

    /**
     * Gets the value of the evaluateExpressionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionEvaluationResult }
     *     
     */
    public ExpressionEvaluationResult getEvaluateExpressionResult() {
        return evaluateExpressionResult;
    }

    /**
     * Sets the value of the evaluateExpressionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionEvaluationResult }
     *     
     */
    public void setEvaluateExpressionResult(ExpressionEvaluationResult value) {
        this.evaluateExpressionResult = value;
    }

}
