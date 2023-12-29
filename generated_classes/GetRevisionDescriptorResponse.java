
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
 *         &lt;element name="GetRevisionDescriptorResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Revision" minOccurs="0"/&gt;
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
    "getRevisionDescriptorResult"
})
@XmlRootElement(name = "GetRevisionDescriptorResponse")
public class GetRevisionDescriptorResponse {

    @XmlElement(name = "GetRevisionDescriptorResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected Revision getRevisionDescriptorResult;

    /**
     * Gets the value of the getRevisionDescriptorResult property.
     * 
     * @return
     *     possible object is
     *     {@link Revision }
     *     
     */
    public Revision getGetRevisionDescriptorResult() {
        return getRevisionDescriptorResult;
    }

    /**
     * Sets the value of the getRevisionDescriptorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revision }
     *     
     */
    public void setGetRevisionDescriptorResult(Revision value) {
        this.getRevisionDescriptorResult = value;
    }

}
