
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Formats" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfAssetFormat" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetType", propOrder = {
    "formats"
})
public class AssetType
    extends GlobalElement
{

    @XmlElement(name = "Formats")
    protected ArrayOfAssetFormat formats;

    /**
     * Gets the value of the formats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetFormat }
     *     
     */
    public ArrayOfAssetFormat getFormats() {
        return formats;
    }

    /**
     * Sets the value of the formats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetFormat }
     *     
     */
    public void setFormats(ArrayOfAssetFormat value) {
        this.formats = value;
    }

}
