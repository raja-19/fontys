
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VLDecisionTableLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VLDecisionTableLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourcePathLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLSourcePathLayout" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ConditionLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLConditionLayout" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ActionLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfVLActionLayout" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="QuestionColumnWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VLDecisionTableLayout", propOrder = {
    "sourcePathLayouts",
    "conditionLayouts",
    "actionLayouts"
})
public class VLDecisionTableLayout {

    @XmlElement(name = "SourcePathLayouts")
    protected ArrayOfVLSourcePathLayout sourcePathLayouts;
    @XmlElement(name = "ConditionLayouts")
    protected ArrayOfVLConditionLayout conditionLayouts;
    @XmlElement(name = "ActionLayouts")
    protected ArrayOfVLActionLayout actionLayouts;
    @XmlAttribute(name = "QuestionColumnWidth", required = true)
    protected int questionColumnWidth;

    /**
     * Gets the value of the sourcePathLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLSourcePathLayout }
     *     
     */
    public ArrayOfVLSourcePathLayout getSourcePathLayouts() {
        return sourcePathLayouts;
    }

    /**
     * Sets the value of the sourcePathLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLSourcePathLayout }
     *     
     */
    public void setSourcePathLayouts(ArrayOfVLSourcePathLayout value) {
        this.sourcePathLayouts = value;
    }

    /**
     * Gets the value of the conditionLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLConditionLayout }
     *     
     */
    public ArrayOfVLConditionLayout getConditionLayouts() {
        return conditionLayouts;
    }

    /**
     * Sets the value of the conditionLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLConditionLayout }
     *     
     */
    public void setConditionLayouts(ArrayOfVLConditionLayout value) {
        this.conditionLayouts = value;
    }

    /**
     * Gets the value of the actionLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVLActionLayout }
     *     
     */
    public ArrayOfVLActionLayout getActionLayouts() {
        return actionLayouts;
    }

    /**
     * Sets the value of the actionLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVLActionLayout }
     *     
     */
    public void setActionLayouts(ArrayOfVLActionLayout value) {
        this.actionLayouts = value;
    }

    /**
     * Gets the value of the questionColumnWidth property.
     * 
     */
    public int getQuestionColumnWidth() {
        return questionColumnWidth;
    }

    /**
     * Sets the value of the questionColumnWidth property.
     * 
     */
    public void setQuestionColumnWidth(int value) {
        this.questionColumnWidth = value;
    }

}
