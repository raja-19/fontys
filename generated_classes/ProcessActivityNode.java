
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessActivityNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessActivityNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Edges" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProcessActivityEdge" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="AdHocNodeConfiguration" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}AdHocNodeConfiguration" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActivityType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ActivityNodeType" /&gt;
 *       &lt;attribute name="Task" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Process" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessActivityNode", propOrder = {
    "edges",
    "adHocNodeConfiguration"
})
public class ProcessActivityNode
    extends ProcessNode
{

    @XmlElement(name = "Edges")
    protected ArrayOfProcessActivityEdge edges;
    @XmlElement(name = "AdHocNodeConfiguration", required = true, nillable = true)
    protected AdHocNodeConfiguration adHocNodeConfiguration;
    @XmlAttribute(name = "ActivityType", required = true)
    protected ActivityNodeType activityType;
    @XmlAttribute(name = "Task")
    protected String task;
    @XmlAttribute(name = "Process")
    protected String process;

    /**
     * Gets the value of the edges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessActivityEdge }
     *     
     */
    public ArrayOfProcessActivityEdge getEdges() {
        return edges;
    }

    /**
     * Sets the value of the edges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessActivityEdge }
     *     
     */
    public void setEdges(ArrayOfProcessActivityEdge value) {
        this.edges = value;
    }

    /**
     * Gets the value of the adHocNodeConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link AdHocNodeConfiguration }
     *     
     */
    public AdHocNodeConfiguration getAdHocNodeConfiguration() {
        return adHocNodeConfiguration;
    }

    /**
     * Sets the value of the adHocNodeConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdHocNodeConfiguration }
     *     
     */
    public void setAdHocNodeConfiguration(AdHocNodeConfiguration value) {
        this.adHocNodeConfiguration = value;
    }

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityNodeType }
     *     
     */
    public ActivityNodeType getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityNodeType }
     *     
     */
    public void setActivityType(ActivityNodeType value) {
        this.activityType = value;
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
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcess(String value) {
        this.process = value;
    }

}
