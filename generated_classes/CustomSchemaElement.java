
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomSchemaElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSchemaElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfParameter" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="QualifiedName" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}QualifiedName" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Xsd" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSchemaElement", propOrder = {
    "parameters",
    "qualifiedName",
    "xsd"
})
public class CustomSchemaElement
    extends GlobalElement
{

    @XmlElement(name = "Parameters")
    protected ArrayOfParameter parameters;
    @XmlElement(name = "QualifiedName")
    protected QualifiedName qualifiedName;
    @XmlElement(name = "Xsd")
    protected byte[] xsd;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParameter }
     *     
     */
    public ArrayOfParameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParameter }
     *     
     */
    public void setParameters(ArrayOfParameter value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the qualifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedName }
     *     
     */
    public QualifiedName getQualifiedName() {
        return qualifiedName;
    }

    /**
     * Sets the value of the qualifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedName }
     *     
     */
    public void setQualifiedName(QualifiedName value) {
        this.qualifiedName = value;
    }

    /**
     * Gets the value of the xsd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXsd() {
        return xsd;
    }

    /**
     * Sets the value of the xsd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXsd(byte[] value) {
        this.xsd = value;
    }

}
