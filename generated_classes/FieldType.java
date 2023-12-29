
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GlobalElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Output" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FieldTypeOutput" form="unqualified"/&gt;
 *         &lt;element name="AttributeDataType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DataType" form="unqualified"/&gt;
 *         &lt;element name="PreconditionAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="ReadonlyAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="RequiredAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="RefreshAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="LengthAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="PresentationStyles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FieldTypeFormatDefinition" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Parameters" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfGlobalParameterReferenceListGlobalParameterReference" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldType", propOrder = {
    "output",
    "attributeDataType",
    "preconditionAvailable",
    "readonlyAvailable",
    "requiredAvailable",
    "refreshAvailable",
    "lengthAvailable",
    "presentationStyles",
    "parameters"
})
public class FieldType
    extends GlobalElement
{

    @XmlElement(name = "Output", required = true)
    @XmlSchemaType(name = "string")
    protected FieldTypeOutput output;
    @XmlElement(name = "AttributeDataType", required = true)
    @XmlSchemaType(name = "string")
    protected DataType attributeDataType;
    @XmlElement(name = "PreconditionAvailable")
    protected boolean preconditionAvailable;
    @XmlElement(name = "ReadonlyAvailable")
    protected boolean readonlyAvailable;
    @XmlElement(name = "RequiredAvailable")
    protected boolean requiredAvailable;
    @XmlElement(name = "RefreshAvailable")
    protected boolean refreshAvailable;
    @XmlElement(name = "LengthAvailable")
    protected boolean lengthAvailable;
    @XmlElement(name = "PresentationStyles")
    protected FieldTypeFormatDefinition presentationStyles;
    @XmlElement(name = "Parameters")
    protected ArrayOfGlobalParameterReferenceListGlobalParameterReference parameters;

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link FieldTypeOutput }
     *     
     */
    public FieldTypeOutput getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTypeOutput }
     *     
     */
    public void setOutput(FieldTypeOutput value) {
        this.output = value;
    }

    /**
     * Gets the value of the attributeDataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getAttributeDataType() {
        return attributeDataType;
    }

    /**
     * Sets the value of the attributeDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setAttributeDataType(DataType value) {
        this.attributeDataType = value;
    }

    /**
     * Gets the value of the preconditionAvailable property.
     * 
     */
    public boolean isPreconditionAvailable() {
        return preconditionAvailable;
    }

    /**
     * Sets the value of the preconditionAvailable property.
     * 
     */
    public void setPreconditionAvailable(boolean value) {
        this.preconditionAvailable = value;
    }

    /**
     * Gets the value of the readonlyAvailable property.
     * 
     */
    public boolean isReadonlyAvailable() {
        return readonlyAvailable;
    }

    /**
     * Sets the value of the readonlyAvailable property.
     * 
     */
    public void setReadonlyAvailable(boolean value) {
        this.readonlyAvailable = value;
    }

    /**
     * Gets the value of the requiredAvailable property.
     * 
     */
    public boolean isRequiredAvailable() {
        return requiredAvailable;
    }

    /**
     * Sets the value of the requiredAvailable property.
     * 
     */
    public void setRequiredAvailable(boolean value) {
        this.requiredAvailable = value;
    }

    /**
     * Gets the value of the refreshAvailable property.
     * 
     */
    public boolean isRefreshAvailable() {
        return refreshAvailable;
    }

    /**
     * Sets the value of the refreshAvailable property.
     * 
     */
    public void setRefreshAvailable(boolean value) {
        this.refreshAvailable = value;
    }

    /**
     * Gets the value of the lengthAvailable property.
     * 
     */
    public boolean isLengthAvailable() {
        return lengthAvailable;
    }

    /**
     * Sets the value of the lengthAvailable property.
     * 
     */
    public void setLengthAvailable(boolean value) {
        this.lengthAvailable = value;
    }

    /**
     * Gets the value of the presentationStyles property.
     * 
     * @return
     *     possible object is
     *     {@link FieldTypeFormatDefinition }
     *     
     */
    public FieldTypeFormatDefinition getPresentationStyles() {
        return presentationStyles;
    }

    /**
     * Sets the value of the presentationStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTypeFormatDefinition }
     *     
     */
    public void setPresentationStyles(FieldTypeFormatDefinition value) {
        this.presentationStyles = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGlobalParameterReferenceListGlobalParameterReference }
     *     
     */
    public ArrayOfGlobalParameterReferenceListGlobalParameterReference getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGlobalParameterReferenceListGlobalParameterReference }
     *     
     */
    public void setParameters(ArrayOfGlobalParameterReferenceListGlobalParameterReference value) {
        this.parameters = value;
    }

}
