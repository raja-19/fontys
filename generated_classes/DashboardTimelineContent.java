
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardTimelineContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardTimelineContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseId" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DisplayPeriod" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Connections" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString10" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="UserId" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ShowCases" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShowTasks" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShowMessageEvents" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShowDocuments" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShowEntriesForUnknownConnections" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardTimelineContent", propOrder = {
    "caseId",
    "displayPeriod",
    "connections",
    "userId"
})
public class DashboardTimelineContent
    extends ParameterContent
{

    @XmlElement(name = "CaseId")
    protected Expression caseId;
    @XmlElement(name = "DisplayPeriod")
    protected Expression displayPeriod;
    @XmlElement(name = "Connections")
    protected ArrayOfString10 connections;
    @XmlElement(name = "UserId")
    protected Expression userId;
    @XmlAttribute(name = "ShowCases", required = true)
    protected boolean showCases;
    @XmlAttribute(name = "ShowTasks", required = true)
    protected boolean showTasks;
    @XmlAttribute(name = "ShowMessageEvents", required = true)
    protected boolean showMessageEvents;
    @XmlAttribute(name = "ShowDocuments", required = true)
    protected boolean showDocuments;
    @XmlAttribute(name = "ShowEntriesForUnknownConnections", required = true)
    protected boolean showEntriesForUnknownConnections;

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setCaseId(Expression value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the displayPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getDisplayPeriod() {
        return displayPeriod;
    }

    /**
     * Sets the value of the displayPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setDisplayPeriod(Expression value) {
        this.displayPeriod = value;
    }

    /**
     * Gets the value of the connections property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString10 }
     *     
     */
    public ArrayOfString10 getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString10 }
     *     
     */
    public void setConnections(ArrayOfString10 value) {
        this.connections = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setUserId(Expression value) {
        this.userId = value;
    }

    /**
     * Gets the value of the showCases property.
     * 
     */
    public boolean isShowCases() {
        return showCases;
    }

    /**
     * Sets the value of the showCases property.
     * 
     */
    public void setShowCases(boolean value) {
        this.showCases = value;
    }

    /**
     * Gets the value of the showTasks property.
     * 
     */
    public boolean isShowTasks() {
        return showTasks;
    }

    /**
     * Sets the value of the showTasks property.
     * 
     */
    public void setShowTasks(boolean value) {
        this.showTasks = value;
    }

    /**
     * Gets the value of the showMessageEvents property.
     * 
     */
    public boolean isShowMessageEvents() {
        return showMessageEvents;
    }

    /**
     * Sets the value of the showMessageEvents property.
     * 
     */
    public void setShowMessageEvents(boolean value) {
        this.showMessageEvents = value;
    }

    /**
     * Gets the value of the showDocuments property.
     * 
     */
    public boolean isShowDocuments() {
        return showDocuments;
    }

    /**
     * Sets the value of the showDocuments property.
     * 
     */
    public void setShowDocuments(boolean value) {
        this.showDocuments = value;
    }

    /**
     * Gets the value of the showEntriesForUnknownConnections property.
     * 
     */
    public boolean isShowEntriesForUnknownConnections() {
        return showEntriesForUnknownConnections;
    }

    /**
     * Sets the value of the showEntriesForUnknownConnections property.
     * 
     */
    public void setShowEntriesForUnknownConnections(boolean value) {
        this.showEntriesForUnknownConnections = value;
    }

}
