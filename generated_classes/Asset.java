
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormatValues" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfFormatValue" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AssetType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Metadata" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "formatValues"
})
public class Asset
    extends ModuleElement
{

    @XmlElement(name = "FormatValues")
    protected ArrayOfFormatValue formatValues;
    @XmlAttribute(name = "AssetType")
    protected String assetType;
    @XmlAttribute(name = "Metadata")
    protected String metadata;

    /**
     * Gets the value of the formatValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormatValue }
     *     
     */
    public ArrayOfFormatValue getFormatValues() {
        return formatValues;
    }

    /**
     * Sets the value of the formatValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormatValue }
     *     
     */
    public void setFormatValues(ArrayOfFormatValue value) {
        this.formatValues = value;
    }

    /**
     * Gets the value of the assetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * Sets the value of the assetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetType(String value) {
        this.assetType = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata(String value) {
        this.metadata = value;
    }

}
