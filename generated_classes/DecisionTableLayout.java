
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionTableLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionTableLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourcePathLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDTSourcePathLayout" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ConditionLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDTConditionLayout" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ActionLayouts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDTActionLayout" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="QuestionColumnWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="JustificationHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionTableLayout", propOrder = {
    "sourcePathLayouts",
    "conditionLayouts",
    "actionLayouts"
})
public class DecisionTableLayout {

    @XmlElement(name = "SourcePathLayouts")
    protected ArrayOfDTSourcePathLayout sourcePathLayouts;
    @XmlElement(name = "ConditionLayouts")
    protected ArrayOfDTConditionLayout conditionLayouts;
    @XmlElement(name = "ActionLayouts")
    protected ArrayOfDTActionLayout actionLayouts;
    @XmlAttribute(name = "QuestionColumnWidth", required = true)
    protected int questionColumnWidth;
    @XmlAttribute(name = "JustificationHeight", required = true)
    protected int justificationHeight;

    /**
     * Gets the value of the sourcePathLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTSourcePathLayout }
     *     
     */
    public ArrayOfDTSourcePathLayout getSourcePathLayouts() {
        return sourcePathLayouts;
    }

    /**
     * Sets the value of the sourcePathLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTSourcePathLayout }
     *     
     */
    public void setSourcePathLayouts(ArrayOfDTSourcePathLayout value) {
        this.sourcePathLayouts = value;
    }

    /**
     * Gets the value of the conditionLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTConditionLayout }
     *     
     */
    public ArrayOfDTConditionLayout getConditionLayouts() {
        return conditionLayouts;
    }

    /**
     * Sets the value of the conditionLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTConditionLayout }
     *     
     */
    public void setConditionLayouts(ArrayOfDTConditionLayout value) {
        this.conditionLayouts = value;
    }

    /**
     * Gets the value of the actionLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTActionLayout }
     *     
     */
    public ArrayOfDTActionLayout getActionLayouts() {
        return actionLayouts;
    }

    /**
     * Sets the value of the actionLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTActionLayout }
     *     
     */
    public void setActionLayouts(ArrayOfDTActionLayout value) {
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

    /**
     * Gets the value of the justificationHeight property.
     * 
     */
    public int getJustificationHeight() {
        return justificationHeight;
    }

    /**
     * Sets the value of the justificationHeight property.
     * 
     */
    public void setJustificationHeight(int value) {
        this.justificationHeight = value;
    }

}
