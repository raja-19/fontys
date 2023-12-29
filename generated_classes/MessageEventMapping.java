
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageEventMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageEventMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldMapping" maxOccurs="unbounded" minOccurs="0" form="unqualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Field" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MessageEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetInstance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MatchOn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageEventMapping", propOrder = {
    "fieldMapping"
})
@XmlSeeAlso({
    IntermediateMessageEventMapping.class
})
public class MessageEventMapping {

    @XmlElement(name = "FieldMapping")
    protected List<MessageEventMapping.FieldMapping> fieldMapping;
    @XmlAttribute(name = "MessageEvent")
    protected String messageEvent;
    @XmlAttribute(name = "TargetInstance")
    protected String targetInstance;
    @XmlAttribute(name = "MatchOn")
    protected String matchOn;

    /**
     * Gets the value of the fieldMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageEventMapping.FieldMapping }
     * 
     * 
     */
    public List<MessageEventMapping.FieldMapping> getFieldMapping() {
        if (fieldMapping == null) {
            fieldMapping = new ArrayList<MessageEventMapping.FieldMapping>();
        }
        return this.fieldMapping;
    }

    /**
     * Gets the value of the messageEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageEvent() {
        return messageEvent;
    }

    /**
     * Sets the value of the messageEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageEvent(String value) {
        this.messageEvent = value;
    }

    /**
     * Gets the value of the targetInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetInstance() {
        return targetInstance;
    }

    /**
     * Sets the value of the targetInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetInstance(String value) {
        this.targetInstance = value;
    }

    /**
     * Gets the value of the matchOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchOn() {
        return matchOn;
    }

    /**
     * Sets the value of the matchOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchOn(String value) {
        this.matchOn = value;
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
     *       &lt;attribute name="Field" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FieldMapping {

        @XmlAttribute(name = "Field")
        protected String field;
        @XmlAttribute(name = "Entity")
        protected String entity;
        @XmlAttribute(name = "Attribute")
        protected String attribute;

        /**
         * Gets the value of the field property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getField() {
            return field;
        }

        /**
         * Sets the value of the field property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setField(String value) {
            this.field = value;
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

}
