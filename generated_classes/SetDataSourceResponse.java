
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SetDataSourceResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DataSourceInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setDataSourceResult"
})
@XmlRootElement(name = "SetDataSourceResponse")
public class SetDataSourceResponse {

    @XmlElement(name = "SetDataSourceResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected DataSourceInformation setDataSourceResult;

    /**
     * Gets the value of the setDataSourceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceInformation }
     *     
     */
    public DataSourceInformation getSetDataSourceResult() {
        return setDataSourceResult;
    }

    /**
     * Sets the value of the setDataSourceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceInformation }
     *     
     */
    public void setSetDataSourceResult(DataSourceInformation value) {
        this.setDataSourceResult = value;
    }

}
