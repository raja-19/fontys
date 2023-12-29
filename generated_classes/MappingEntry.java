
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfEventMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Task" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Flow" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DataMapping" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingEntry", propOrder = {
    "eventMappings"
})
public class MappingEntry {

    @XmlElement(name = "EventMappings")
    protected ArrayOfEventMapping eventMappings;
    @XmlAttribute(name = "Task")
    protected String task;
    @XmlAttribute(name = "Flow")
    protected String flow;
    @XmlAttribute(name = "DataMapping")
    protected String dataMapping;

    /**
     * Gets the value of the eventMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventMapping }
     *     
     */
    public ArrayOfEventMapping getEventMappings() {
        return eventMappings;
    }

    /**
     * Sets the value of the eventMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventMapping }
     *     
     */
    public void setEventMappings(ArrayOfEventMapping value) {
        this.eventMappings = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTask(String value) {
        this.task = value;
    }

    /**
     * Gets the value of the flow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlow() {
        return flow;
    }

    /**
     * Sets the value of the flow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlow(String value) {
        this.flow = value;
    }

    /**
     * Gets the value of the dataMapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMapping() {
        return dataMapping;
    }

    /**
     * Sets the value of the dataMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMapping(String value) {
        this.dataMapping = value;
    }

}
