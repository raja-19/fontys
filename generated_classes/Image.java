
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Type" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ImageType" form="unqualified"/&gt;
 *         &lt;element name="QRCodeContent" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContentType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ImageContentType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "data",
    "type",
    "qrCodeContent"
})
public class Image
    extends ModuleElement
{

    @XmlElement(name = "Data")
    protected byte[] data;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected ImageType type;
    @XmlElement(name = "QRCodeContent")
    protected Expression qrCodeContent;
    @XmlAttribute(name = "ContentType", required = true)
    protected ImageContentType contentType;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setType(ImageType value) {
        this.type = value;
    }

    /**
     * Gets the value of the qrCodeContent property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getQRCodeContent() {
        return qrCodeContent;
    }

    /**
     * Sets the value of the qrCodeContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setQRCodeContent(Expression value) {
        this.qrCodeContent = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link ImageContentType }
     *     
     */
    public ImageContentType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageContentType }
     *     
     */
    public void setContentType(ImageContentType value) {
        this.contentType = value;
    }

}
