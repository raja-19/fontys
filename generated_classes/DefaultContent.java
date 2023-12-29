
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParameterValues" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfParameterValue" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Containments" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfContainment" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultContent", propOrder = {
    "parameterValues",
    "containments"
})
public class DefaultContent
    extends ParameterContent
{

    @XmlElement(name = "ParameterValues")
    protected ArrayOfParameterValue parameterValues;
    @XmlElement(name = "Containments")
    protected ArrayOfContainment containments;

    /**
     * Gets the value of the parameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParameterValue }
     *     
     */
    public ArrayOfParameterValue getParameterValues() {
        return parameterValues;
    }

    /**
     * Sets the value of the parameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParameterValue }
     *     
     */
    public void setParameterValues(ArrayOfParameterValue value) {
        this.parameterValues = value;
    }

    /**
     * Gets the value of the containments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContainment }
     *     
     */
    public ArrayOfContainment getContainments() {
        return containments;
    }

    /**
     * Sets the value of the containments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContainment }
     *     
     */
    public void setContainments(ArrayOfContainment value) {
        this.containments = value;
    }

}
