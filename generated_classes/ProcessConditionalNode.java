
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessConditionalNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessConditionalNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Edge" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessConditionEdge" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="IsAdHocNode" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="MyLabel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Label" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessConditionalNode", propOrder = {
    "condition",
    "edge",
    "isAdHocNode",
    "myLabel"
})
public class ProcessConditionalNode
    extends ProcessNode
{

    @XmlElement(name = "Condition")
    protected Expression condition;
    @XmlElement(name = "Edge")
    protected ProcessConditionEdge edge;
    @XmlElement(name = "IsAdHocNode")
    protected boolean isAdHocNode;
    @XmlElement(name = "MyLabel", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ProcessConditionalNode.MyLabel myLabel;
    @XmlAttribute(name = "Label")
    protected String label;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setCondition(Expression value) {
        this.condition = value;
    }

    /**
     * Gets the value of the edge property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessConditionEdge }
     *     
     */
    public ProcessConditionEdge getEdge() {
        return edge;
    }

    /**
     * Sets the value of the edge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessConditionEdge }
     *     
     */
    public void setEdge(ProcessConditionEdge value) {
        this.edge = value;
    }

    /**
     * Gets the value of the isAdHocNode property.
     * 
     */
    public boolean isIsAdHocNode() {
        return isAdHocNode;
    }

    /**
     * Sets the value of the isAdHocNode property.
     * 
     */
    public void setIsAdHocNode(boolean value) {
        this.isAdHocNode = value;
    }

    /**
     * Gets the value of the myLabel property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessConditionalNode.MyLabel }
     *     
     */
    public ProcessConditionalNode.MyLabel getMyLabel() {
        return myLabel;
    }

    /**
     * Sets the value of the myLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessConditionalNode.MyLabel }
     *     
     */
    public void setMyLabel(ProcessConditionalNode.MyLabel value) {
        this.myLabel = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class MyLabel {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
