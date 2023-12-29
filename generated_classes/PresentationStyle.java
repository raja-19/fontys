
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationStyle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentationStyle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement"&gt;
 *       &lt;attribute name="IsAllowedOnDocuments" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsAllowedOnPages" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentationStyle")
public class PresentationStyle
    extends GlobalElement
{

    @XmlAttribute(name = "IsAllowedOnDocuments", required = true)
    protected boolean isAllowedOnDocuments;
    @XmlAttribute(name = "IsAllowedOnPages", required = true)
    protected boolean isAllowedOnPages;

    /**
     * Gets the value of the isAllowedOnDocuments property.
     * 
     */
    public boolean isIsAllowedOnDocuments() {
        return isAllowedOnDocuments;
    }

    /**
     * Sets the value of the isAllowedOnDocuments property.
     * 
     */
    public void setIsAllowedOnDocuments(boolean value) {
        this.isAllowedOnDocuments = value;
    }

    /**
     * Gets the value of the isAllowedOnPages property.
     * 
     */
    public boolean isIsAllowedOnPages() {
        return isAllowedOnPages;
    }

    /**
     * Sets the value of the isAllowedOnPages property.
     * 
     */
    public void setIsAllowedOnPages(boolean value) {
        this.isAllowedOnPages = value;
    }

}
