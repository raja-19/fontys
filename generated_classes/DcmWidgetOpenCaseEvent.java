
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DcmWidgetOpenCaseEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcmWidgetOpenCaseEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DcmWidgetEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseId" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CaseType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="EventData" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfEventDataItem" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcmWidgetOpenCaseEvent", propOrder = {
    "caseId",
    "caseType",
    "eventData"
})
public class DcmWidgetOpenCaseEvent
    extends DcmWidgetEvent
{

    @XmlElement(name = "CaseId")
    protected Expression caseId;
    @XmlElement(name = "CaseType")
    protected Expression caseType;
    @XmlElement(name = "EventData")
    protected ArrayOfEventDataItem eventData;

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
     * Gets the value of the caseType property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getCaseType() {
        return caseType;
    }

    /**
     * Sets the value of the caseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setCaseType(Expression value) {
        this.caseType = value;
    }

    /**
     * Gets the value of the eventData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventDataItem }
     *     
     */
    public ArrayOfEventDataItem getEventData() {
        return eventData;
    }

    /**
     * Sets the value of the eventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventDataItem }
     *     
     */
    public void setEventData(ArrayOfEventDataItem value) {
        this.eventData = value;
    }

}
