
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionEvaluationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionEvaluationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DataType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ExpressionDataType"/&gt;
 *         &lt;element name="Messages" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfExpressionValidationMessage" minOccurs="0"/&gt;
 *         &lt;element name="References" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfModuleElementIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionEvaluationResult", propOrder = {
    "isValid",
    "dataType",
    "messages",
    "references"
})
public class ExpressionEvaluationResult {

    @XmlElement(name = "IsValid", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean isValid;
    @XmlElement(name = "DataType", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true)
    @XmlSchemaType(name = "string")
    protected ExpressionDataType dataType;
    @XmlElement(name = "Messages", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfExpressionValidationMessage messages;
    @XmlElement(name = "References", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfModuleElementIdentifier references;

    /**
     * Gets the value of the isValid property.
     * 
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     */
    public void setIsValid(boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionDataType }
     *     
     */
    public ExpressionDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionDataType }
     *     
     */
    public void setDataType(ExpressionDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExpressionValidationMessage }
     *     
     */
    public ArrayOfExpressionValidationMessage getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExpressionValidationMessage }
     *     
     */
    public void setMessages(ArrayOfExpressionValidationMessage value) {
        this.messages = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModuleElementIdentifier }
     *     
     */
    public ArrayOfModuleElementIdentifier getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModuleElementIdentifier }
     *     
     */
    public void setReferences(ArrayOfModuleElementIdentifier value) {
        this.references = value;
    }

}
