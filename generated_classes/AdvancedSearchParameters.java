
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvancedSearchParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvancedSearchParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ElementTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsInExposedFlow" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSpecialized" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsFullTextEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SearchDepth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchIn" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SearchLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancedSearchParameters", propOrder = {
    "elementName",
    "elementTypes",
    "isInExposedFlow",
    "isSpecialized",
    "isFullTextEnabled",
    "searchDepth",
    "searchIn"
})
public class AdvancedSearchParameters {

    @XmlElement(name = "ElementName", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true, nillable = true)
    protected String elementName;
    @XmlElement(name = "ElementTypes", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected List<String> elementTypes;
    @XmlElement(name = "IsInExposedFlow", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true, type = Boolean.class, nillable = true)
    protected Boolean isInExposedFlow;
    @XmlElement(name = "IsSpecialized", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true, type = Boolean.class, nillable = true)
    protected Boolean isSpecialized;
    @XmlElement(name = "IsFullTextEnabled", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true, type = Boolean.class, nillable = true)
    protected Boolean isFullTextEnabled;
    @XmlElement(name = "SearchDepth", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true, type = Integer.class, nillable = true)
    protected Integer searchDepth;
    @XmlElement(name = "SearchIn", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected List<SearchLocation> searchIn;

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName(String value) {
        this.elementName = value;
    }

    /**
     * Gets the value of the elementTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the elementTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElementTypes() {
        if (elementTypes == null) {
            elementTypes = new ArrayList<String>();
        }
        return this.elementTypes;
    }

    /**
     * Gets the value of the isInExposedFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInExposedFlow() {
        return isInExposedFlow;
    }

    /**
     * Sets the value of the isInExposedFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInExposedFlow(Boolean value) {
        this.isInExposedFlow = value;
    }

    /**
     * Gets the value of the isSpecialized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecialized() {
        return isSpecialized;
    }

    /**
     * Sets the value of the isSpecialized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecialized(Boolean value) {
        this.isSpecialized = value;
    }

    /**
     * Gets the value of the isFullTextEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFullTextEnabled() {
        return isFullTextEnabled;
    }

    /**
     * Sets the value of the isFullTextEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFullTextEnabled(Boolean value) {
        this.isFullTextEnabled = value;
    }

    /**
     * Gets the value of the searchDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchDepth() {
        return searchDepth;
    }

    /**
     * Sets the value of the searchDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchDepth(Integer value) {
        this.searchDepth = value;
    }

    /**
     * Gets the value of the searchIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the searchIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchLocation }
     * 
     * 
     */
    public List<SearchLocation> getSearchIn() {
        if (searchIn == null) {
            searchIn = new ArrayList<SearchLocation>();
        }
        return this.searchIn;
    }

}
