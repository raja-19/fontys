
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Operation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalKey" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElementKey" minOccurs="0"/&gt;
 *         &lt;element name="GlobalElement" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalOperation", propOrder = {
    "project",
    "originalKey",
    "globalElement"
})
public class GlobalOperation
    extends Operation
{

    @XmlElement(name = "Project", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String project;
    @XmlElement(name = "OriginalKey", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected GlobalElementKey originalKey;
    @XmlElement(name = "GlobalElement", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected GlobalElement globalElement;

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject(String value) {
        this.project = value;
    }

    /**
     * Gets the value of the originalKey property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalElementKey }
     *     
     */
    public GlobalElementKey getOriginalKey() {
        return originalKey;
    }

    /**
     * Sets the value of the originalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalElementKey }
     *     
     */
    public void setOriginalKey(GlobalElementKey value) {
        this.originalKey = value;
    }

    /**
     * Gets the value of the globalElement property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalElement }
     *     
     */
    public GlobalElement getGlobalElement() {
        return globalElement;
    }

    /**
     * Sets the value of the globalElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalElement }
     *     
     */
    public void setGlobalElement(GlobalElement value) {
        this.globalElement = value;
    }

}
