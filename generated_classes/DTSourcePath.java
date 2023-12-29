
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTSourcePath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTSourcePath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CondAlts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDTConditionAlternativeRef" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ActionAlts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDTActionAlternativeRef" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="JustificationAsset" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTSourcePath", propOrder = {
    "condAlts",
    "actionAlts"
})
public class DTSourcePath {

    @XmlElement(name = "CondAlts")
    protected ArrayOfDTConditionAlternativeRef condAlts;
    @XmlElement(name = "ActionAlts")
    protected ArrayOfDTActionAlternativeRef actionAlts;
    @XmlAttribute(name = "JustificationAsset")
    protected String justificationAsset;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Gets the value of the condAlts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTConditionAlternativeRef }
     *     
     */
    public ArrayOfDTConditionAlternativeRef getCondAlts() {
        return condAlts;
    }

    /**
     * Sets the value of the condAlts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTConditionAlternativeRef }
     *     
     */
    public void setCondAlts(ArrayOfDTConditionAlternativeRef value) {
        this.condAlts = value;
    }

    /**
     * Gets the value of the actionAlts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTActionAlternativeRef }
     *     
     */
    public ArrayOfDTActionAlternativeRef getActionAlts() {
        return actionAlts;
    }

    /**
     * Sets the value of the actionAlts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTActionAlternativeRef }
     *     
     */
    public void setActionAlts(ArrayOfDTActionAlternativeRef value) {
        this.actionAlts = value;
    }

    /**
     * Gets the value of the justificationAsset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificationAsset() {
        return justificationAsset;
    }

    /**
     * Sets the value of the justificationAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificationAsset(String value) {
        this.justificationAsset = value;
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
