
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
 *         &lt;element name="GetProjectResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Project" minOccurs="0"/&gt;
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
    "getProjectResult"
})
@XmlRootElement(name = "GetProjectResponse")
public class GetProjectResponse {

    @XmlElement(name = "GetProjectResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected Project getProjectResult;

    /**
     * Gets the value of the getProjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getGetProjectResult() {
        return getProjectResult;
    }

    /**
     * Sets the value of the getProjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setGetProjectResult(Project value) {
        this.getProjectResult = value;
    }

}
