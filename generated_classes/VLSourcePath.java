
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VLSourcePath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VLSourcePath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CondAlts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLConditionAlternativeRef" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ActionAlts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLActionAlternativeRef" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VLSourcePath", propOrder = {
    "condAlts",
    "actionAlts"
})
public class VLSourcePath {

    @XmlElement(name = "CondAlts")
    protected ArrayOfVLConditionAlternativeRef condAlts;
    @XmlElement(name = "ActionAlts")
    protected ArrayOfVLActionAlternativeRef actionAlts;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Gets the value of the condAlts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLConditionAlternativeRef }
     *     
     */
    public ArrayOfVLConditionAlternativeRef getCondAlts() {
        return condAlts;
    }

    /**
     * Sets the value of the condAlts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLConditionAlternativeRef }
     *     
     */
    public void setCondAlts(ArrayOfVLConditionAlternativeRef value) {
        this.condAlts = value;
    }

    /**
     * Gets the value of the actionAlts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLActionAlternativeRef }
     *     
     */
    public ArrayOfVLActionAlternativeRef getActionAlts() {
        return actionAlts;
    }

    /**
     * Sets the value of the actionAlts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLActionAlternativeRef }
     *     
     */
    public void setActionAlts(ArrayOfVLActionAlternativeRef value) {
        this.actionAlts = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
