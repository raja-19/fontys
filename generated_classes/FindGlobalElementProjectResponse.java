
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
 *         &lt;element name="FindGlobalElementProjectResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "findGlobalElementProjectResult"
})
@XmlRootElement(name = "FindGlobalElementProjectResponse")
public class FindGlobalElementProjectResponse {

    @XmlElement(name = "FindGlobalElementProjectResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String findGlobalElementProjectResult;

    /**
     * Gets the value of the findGlobalElementProjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindGlobalElementProjectResult() {
        return findGlobalElementProjectResult;
    }

    /**
     * Sets the value of the findGlobalElementProjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindGlobalElementProjectResult(String value) {
        this.findGlobalElementProjectResult = value;
    }

}
