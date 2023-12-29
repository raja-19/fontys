
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conditions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLCondition" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Actions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLAction" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="SourcePaths" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLSourcePath" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Layout" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}VLDecisionTableLayout" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DataType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DataType" /&gt;
 *       &lt;attribute name="External" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Conditional" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueList", propOrder = {
    "conditions",
    "actions",
    "sourcePaths",
    "layout"
})
public class ValueList
    extends ModuleElement
{

    @XmlElement(name = "Conditions")
    protected ArrayOfVLCondition conditions;
    @XmlElement(name = "Actions")
    protected ArrayOfVLAction actions;
    @XmlElement(name = "SourcePaths")
    protected ArrayOfVLSourcePath sourcePaths;
    @XmlElement(name = "Layout")
    protected VLDecisionTableLayout layout;
    @XmlAttribute(name = "DataType", required = true)
    protected DataType dataType;
    @XmlAttribute(name = "External", required = true)
    protected boolean external;
    @XmlAttribute(name = "Conditional", required = true)
    protected boolean conditional;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLCondition }
     *     
     */
    public ArrayOfVLCondition getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLCondition }
     *     
     */
    public void setConditions(ArrayOfVLCondition value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLAction }
     *     
     */
    public ArrayOfVLAction getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLAction }
     *     
     */
    public void setActions(ArrayOfVLAction value) {
        this.actions = value;
    }

    /**
     * Gets the value of the sourcePaths property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLSourcePath }
     *     
     */
    public ArrayOfVLSourcePath getSourcePaths() {
        return sourcePaths;
    }

    /**
     * Sets the value of the sourcePaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLSourcePath }
     *     
     */
    public void setSourcePaths(ArrayOfVLSourcePath value) {
        this.sourcePaths = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link VLDecisionTableLayout }
     *     
     */
    public VLDecisionTableLayout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link VLDecisionTableLayout }
     *     
     */
    public void setLayout(VLDecisionTableLayout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the external property.
     * 
     */
    public boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     */
    public void setExternal(boolean value) {
        this.external = value;
    }

    /**
     * Gets the value of the conditional property.
     * 
     */
    public boolean isConditional() {
        return conditional;
    }

    /**
     * Sets the value of the conditional property.
     * 
     */
    public void setConditional(boolean value) {
        this.conditional = value;
    }

}
