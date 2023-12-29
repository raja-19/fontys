
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DcmWorkListContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcmWorkListContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParameterContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDcmWorkListEntry" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="PresentationStylesLocked" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ListFormatDefinition" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PagingSize" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CaseAggregate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CaseIdTargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CaseIdTargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TaskIdTargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TaskIdTargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShowTasks" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ShowStartedTasks" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GroupByCase" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcmWorkListContent", propOrder = {
    "entries",
    "presentationStylesLocked"
})
public class DcmWorkListContent
    extends ParameterContent
{

    @XmlElement(name = "Entries")
    protected ArrayOfDcmWorkListEntry entries;
    @XmlElement(name = "PresentationStylesLocked")
    protected ListFormatDefinition presentationStylesLocked;
    @XmlAttribute(name = "PagingSize")
    protected String pagingSize;
    @XmlAttribute(name = "CaseAggregate")
    protected String caseAggregate;
    @XmlAttribute(name = "CaseIdTargetEntity")
    protected String caseIdTargetEntity;
    @XmlAttribute(name = "CaseIdTargetAttribute")
    protected String caseIdTargetAttribute;
    @XmlAttribute(name = "TaskIdTargetEntity")
    protected String taskIdTargetEntity;
    @XmlAttribute(name = "TaskIdTargetAttribute")
    protected String taskIdTargetAttribute;
    @XmlAttribute(name = "DisplayText")
    protected String displayText;
    @XmlAttribute(name = "ShowTasks", required = true)
    protected boolean showTasks;
    @XmlAttribute(name = "ShowStartedTasks", required = true)
    protected boolean showStartedTasks;
    @XmlAttribute(name = "GroupByCase", required = true)
    protected boolean groupByCase;

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDcmWorkListEntry }
     *     
     */
    public ArrayOfDcmWorkListEntry getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDcmWorkListEntry }
     *     
     */
    public void setEntries(ArrayOfDcmWorkListEntry value) {
        this.entries = value;
    }

    /**
     * Gets the value of the presentationStylesLocked property.
     * 
     * @return
     *     possible object is
     *     {@link ListFormatDefinition }
     *     
     */
    public ListFormatDefinition getPresentationStylesLocked() {
        return presentationStylesLocked;
    }

    /**
     * Sets the value of the presentationStylesLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListFormatDefinition }
     *     
     */
    public void setPresentationStylesLocked(ListFormatDefinition value) {
        this.presentationStylesLocked = value;
    }

    /**
     * Gets the value of the pagingSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagingSize() {
        return pagingSize;
    }

    /**
     * Sets the value of the pagingSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagingSize(String value) {
        this.pagingSize = value;
    }

    /**
     * Gets the value of the caseAggregate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseAggregate() {
        return caseAggregate;
    }

    /**
     * Sets the value of the caseAggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseAggregate(String value) {
        this.caseAggregate = value;
    }

    /**
     * Gets the value of the caseIdTargetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseIdTargetEntity() {
        return caseIdTargetEntity;
    }

    /**
     * Sets the value of the caseIdTargetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseIdTargetEntity(String value) {
        this.caseIdTargetEntity = value;
    }

    /**
     * Gets the value of the caseIdTargetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseIdTargetAttribute() {
        return caseIdTargetAttribute;
    }

    /**
     * Sets the value of the caseIdTargetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseIdTargetAttribute(String value) {
        this.caseIdTargetAttribute = value;
    }

    /**
     * Gets the value of the taskIdTargetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskIdTargetEntity() {
        return taskIdTargetEntity;
    }

    /**
     * Sets the value of the taskIdTargetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskIdTargetEntity(String value) {
        this.taskIdTargetEntity = value;
    }

    /**
     * Gets the value of the taskIdTargetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskIdTargetAttribute() {
        return taskIdTargetAttribute;
    }

    /**
     * Sets the value of the taskIdTargetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskIdTargetAttribute(String value) {
        this.taskIdTargetAttribute = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
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
     * Gets the value of the showStartedTasks property.
     * 
     */
    public boolean isShowStartedTasks() {
        return showStartedTasks;
    }

    /**
     * Sets the value of the showStartedTasks property.
     * 
     */
    public void setShowStartedTasks(boolean value) {
        this.showStartedTasks = value;
    }

    /**
     * Gets the value of the groupByCase property.
     * 
     */
    public boolean isGroupByCase() {
        return groupByCase;
    }

    /**
     * Sets the value of the groupByCase property.
     * 
     */
    public void setGroupByCase(boolean value) {
        this.groupByCase = value;
    }

}
