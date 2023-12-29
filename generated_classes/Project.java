
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Project"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Configuration" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProjectConfiguration" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Languages" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProjectLanguage" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
    "configuration",
    "languages"
})
public class Project
    extends Element
{

    @XmlElement(name = "Configuration")
    protected ProjectConfiguration configuration;
    @XmlElement(name = "Languages")
    protected ArrayOfProjectLanguage languages;

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectConfiguration }
     *     
     */
    public ProjectConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectConfiguration }
     *     
     */
    public void setConfiguration(ProjectConfiguration value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProjectLanguage }
     *     
     */
    public ArrayOfProjectLanguage getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProjectLanguage }
     *     
     */
    public void setLanguages(ArrayOfProjectLanguage value) {
        this.languages = value;
    }

}
