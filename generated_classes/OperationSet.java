
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operations" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfOperationEntry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationSet", propOrder = {
    "operations"
})
public class OperationSet {

    @XmlElement(name = "Operations", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfOperationEntry operations;

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationEntry }
     *     
     */
    public ArrayOfOperationEntry getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationEntry }
     *     
     */
    public void setOperations(ArrayOfOperationEntry value) {
        this.operations = value;
    }

}
