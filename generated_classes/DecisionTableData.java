
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionTableData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionTableData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConditionIds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="Passed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionTableData", propOrder = {
    "name",
    "conditionIds",
    "passed"
})
public class DecisionTableData {

    @XmlElement(name = "Name", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String name;
    @XmlElement(name = "ConditionIds", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfInt conditionIds;
    @XmlElement(name = "Passed", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean passed;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the conditionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getConditionIds() {
        return conditionIds;
    }

    /**
     * Sets the value of the conditionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setConditionIds(ArrayOfInt value) {
        this.conditionIds = value;
    }

    /**
     * Gets the value of the passed property.
     * 
     */
    public boolean isPassed() {
        return passed;
    }

    /**
     * Sets the value of the passed property.
     * 
     */
    public void setPassed(boolean value) {
        this.passed = value;
    }

}
