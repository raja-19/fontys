
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecisionTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conditions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDTCondition" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Actions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDTAction" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="SourcePaths" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDTSourcePath" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Layout" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DecisionTableLayout" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionTable", propOrder = {
    "conditions",
    "actions",
    "sourcePaths",
    "layout"
})
public class DecisionTable
    extends ModuleElement
{

    @XmlElement(name = "Conditions")
    protected ArrayOfDTCondition conditions;
    @XmlElement(name = "Actions")
    protected ArrayOfDTAction actions;
    @XmlElement(name = "SourcePaths")
    protected ArrayOfDTSourcePath sourcePaths;
    @XmlElement(name = "Layout")
    protected DecisionTableLayout layout;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTCondition }
     *     
     */
    public ArrayOfDTCondition getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTCondition }
     *     
     */
    public void setConditions(ArrayOfDTCondition value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTAction }
     *     
     */
    public ArrayOfDTAction getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTAction }
     *     
     */
    public void setActions(ArrayOfDTAction value) {
        this.actions = value;
    }

    /**
     * Gets the value of the sourcePaths property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTSourcePath }
     *     
     */
    public ArrayOfDTSourcePath getSourcePaths() {
        return sourcePaths;
    }

    /**
     * Sets the value of the sourcePaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTSourcePath }
     *     
     */
    public void setSourcePaths(ArrayOfDTSourcePath value) {
        this.sourcePaths = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionTableLayout }
     *     
     */
    public DecisionTableLayout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionTableLayout }
     *     
     */
    public void setLayout(DecisionTableLayout value) {
        this.layout = value;
    }

}
