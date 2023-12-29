
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Parameter"&gt;
 *       &lt;attribute name="ExpectedDataType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ExpressionDataType" /&gt;
 *       &lt;attribute name="MultivaluedResult" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionParameter")
public class ExpressionParameter
    extends Parameter
{

    @XmlAttribute(name = "ExpectedDataType", required = true)
    protected ExpressionDataType expectedDataType;
    @XmlAttribute(name = "MultivaluedResult", required = true)
    protected boolean multivaluedResult;

    /**
     * Gets the value of the expectedDataType property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionDataType }
     *     
     */
    public ExpressionDataType getExpectedDataType() {
        return expectedDataType;
    }

    /**
     * Sets the value of the expectedDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionDataType }
     *     
     */
    public void setExpectedDataType(ExpressionDataType value) {
        this.expectedDataType = value;
    }

    /**
     * Gets the value of the multivaluedResult property.
     * 
     */
    public boolean isMultivaluedResult() {
        return multivaluedResult;
    }

    /**
     * Sets the value of the multivaluedResult property.
     * 
     */
    public void setMultivaluedResult(boolean value) {
        this.multivaluedResult = value;
    }

}
