
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionValidationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionValidationMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ExpressionValidationType"/&gt;
 *         &lt;element name="StartPosition" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EndPosition" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionValidationMessage", propOrder = {
    "type",
    "startPosition",
    "endPosition",
    "message"
})
public class ExpressionValidationMessage {

    @XmlElement(name = "Type", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true)
    @XmlSchemaType(name = "string")
    protected ExpressionValidationType type;
    @XmlElement(name = "StartPosition", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected int startPosition;
    @XmlElement(name = "EndPosition", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected int endPosition;
    @XmlElement(name = "Message", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String message;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionValidationType }
     *     
     */
    public ExpressionValidationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionValidationType }
     *     
     */
    public void setType(ExpressionValidationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     */
    public int getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     */
    public void setStartPosition(int value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the endPosition property.
     * 
     */
    public int getEndPosition() {
        return endPosition;
    }

    /**
     * Sets the value of the endPosition property.
     * 
     */
    public void setEndPosition(int value) {
        this.endPosition = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
