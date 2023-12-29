
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkingRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Commitable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Conflicts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ConflictReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Changes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ElementChange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MergeRevisions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Revision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchStatus", propOrder = {
    "tipRevision",
    "workingRevision",
    "commitable",
    "conflicts",
    "changes",
    "mergeRevisions"
})
public class BranchStatus {

    @XmlElement(name = "TipRevision", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String tipRevision;
    @XmlElement(name = "WorkingRevision", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String workingRevision;
    @XmlElement(name = "Commitable", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean commitable;
    @XmlElement(name = "Conflicts", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected List<ConflictReference> conflicts;
    @XmlElement(name = "Changes", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected List<ElementChange> changes;
    @XmlElement(name = "MergeRevisions", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected List<Revision> mergeRevisions;

    /**
     * Gets the value of the tipRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipRevision() {
        return tipRevision;
    }

    /**
     * Sets the value of the tipRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipRevision(String value) {
        this.tipRevision = value;
    }

    /**
     * Gets the value of the workingRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingRevision() {
        return workingRevision;
    }

    /**
     * Sets the value of the workingRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingRevision(String value) {
        this.workingRevision = value;
    }

    /**
     * Gets the value of the commitable property.
     * 
     */
    public boolean isCommitable() {
        return commitable;
    }

    /**
     * Sets the value of the commitable property.
     * 
     */
    public void setCommitable(boolean value) {
        this.commitable = value;
    }

    /**
     * Gets the value of the conflicts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the conflicts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConflicts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConflictReference }
     * 
     * 
     */
    public List<ConflictReference> getConflicts() {
        if (conflicts == null) {
            conflicts = new ArrayList<ConflictReference>();
        }
        return this.conflicts;
    }

    /**
     * Gets the value of the changes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the changes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementChange }
     * 
     * 
     */
    public List<ElementChange> getChanges() {
        if (changes == null) {
            changes = new ArrayList<ElementChange>();
        }
        return this.changes;
    }

    /**
     * Gets the value of the mergeRevisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mergeRevisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMergeRevisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Revision }
     * 
     * 
     */
    public List<Revision> getMergeRevisions() {
        if (mergeRevisions == null) {
            mergeRevisions = new ArrayList<Revision>();
        }
        return this.mergeRevisions;
    }

}
