
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalParameterValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalParameterValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalParameterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="GlobalParameterType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalParameterType" form="unqualified"/&gt;
 *         &lt;element name="Expression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalParameterExpression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContentItem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalParameterValue", propOrder = {
    "globalParameterName",
    "globalParameterType",
    "expression"
})
public class GlobalParameterValue {

    @XmlElement(name = "GlobalParameterName")
    protected String globalParameterName;
    @XmlElement(name = "GlobalParameterType", required = true)
    @XmlSchemaType(name = "string")
    protected GlobalParameterType globalParameterType;
    @XmlElement(name = "Expression")
    protected GlobalParameterExpression expression;
    @XmlAttribute(name = "ContentItem")
    protected String contentItem;

    /**
     * Gets the value of the globalParameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalParameterName() {
        return globalParameterName;
    }

    /**
     * Sets the value of the globalParameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalParameterName(String value) {
        this.globalParameterName = value;
    }

    /**
     * Gets the value of the globalParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalParameterType }
     *     
     */
    public GlobalParameterType getGlobalParameterType() {
        return globalParameterType;
    }

    /**
     * Sets the value of the globalParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalParameterType }
     *     
     */
    public void setGlobalParameterType(GlobalParameterType value) {
        this.globalParameterType = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalParameterExpression }
     *     
     */
    public GlobalParameterExpression getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalParameterExpression }
     *     
     */
    public void setExpression(GlobalParameterExpression value) {
        this.expression = value;
    }

    /**
     * Gets the value of the contentItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentItem() {
        return contentItem;
    }

    /**
     * Sets the value of the contentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentItem(String value) {
        this.contentItem = value;
    }

}
