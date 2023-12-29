
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitTest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Profiles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProfileReference" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ExpectedValues" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString4" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitTest", propOrder = {
    "profiles",
    "expectedValues"
})
public class UnitTest
    extends ModuleElement
{

    @XmlElement(name = "Profiles")
    protected ArrayOfProfileReference profiles;
    @XmlElement(name = "ExpectedValues")
    protected ArrayOfString4 expectedValues;
    @XmlAttribute(name = "Entity")
    protected String entity;
    @XmlAttribute(name = "Attribute")
    protected String attribute;

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileReference }
     *     
     */
    public ArrayOfProfileReference getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileReference }
     *     
     */
    public void setProfiles(ArrayOfProfileReference value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the expectedValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString4 }
     *     
     */
    public ArrayOfString4 getExpectedValues() {
        return expectedValues;
    }

    /**
     * Sets the value of the expectedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString4 }
     *     
     */
    public void setExpectedValues(ArrayOfString4 value) {
        this.expectedValues = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

}
