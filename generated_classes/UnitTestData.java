
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitTestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitTestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnitTestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DecisionTableData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDecisionTableData" minOccurs="0"/&gt;
 *         &lt;element name="BusinessRuleData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfBusinessRuleData" minOccurs="0"/&gt;
 *         &lt;element name="ExpressionData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfExpressionData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitTestData", propOrder = {
    "unitTestName",
    "decisionTableData",
    "businessRuleData",
    "expressionData"
})
public class UnitTestData {

    @XmlElement(name = "UnitTestName", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String unitTestName;
    @XmlElement(name = "DecisionTableData", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfDecisionTableData decisionTableData;
    @XmlElement(name = "BusinessRuleData", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfBusinessRuleData businessRuleData;
    @XmlElement(name = "ExpressionData", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfExpressionData expressionData;

    /**
     * Gets the value of the unitTestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTestName() {
        return unitTestName;
    }

    /**
     * Sets the value of the unitTestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTestName(String value) {
        this.unitTestName = value;
    }

    /**
     * Gets the value of the decisionTableData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecisionTableData }
     *     
     */
    public ArrayOfDecisionTableData getDecisionTableData() {
        return decisionTableData;
    }

    /**
     * Sets the value of the decisionTableData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecisionTableData }
     *     
     */
    public void setDecisionTableData(ArrayOfDecisionTableData value) {
        this.decisionTableData = value;
    }

    /**
     * Gets the value of the businessRuleData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBusinessRuleData }
     *     
     */
    public ArrayOfBusinessRuleData getBusinessRuleData() {
        return businessRuleData;
    }

    /**
     * Sets the value of the businessRuleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBusinessRuleData }
     *     
     */
    public void setBusinessRuleData(ArrayOfBusinessRuleData value) {
        this.businessRuleData = value;
    }

    /**
     * Gets the value of the expressionData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExpressionData }
     *     
     */
    public ArrayOfExpressionData getExpressionData() {
        return expressionData;
    }

    /**
     * Sets the value of the expressionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExpressionData }
     *     
     */
    public void setExpressionData(ArrayOfExpressionData value) {
        this.expressionData = value;
    }

}
