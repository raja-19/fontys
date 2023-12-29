
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conflicts" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ConflictReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Changes" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ChangedElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeResult", propOrder = {
    "conflicts",
    "changes"
})
public class MergeResult {

    @XmlElement(name = "Conflicts", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected List<ConflictReference> conflicts;
    @XmlElement(name = "Changes", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected List<ChangedElement> changes;

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
     * {@link ChangedElement }
     * 
     * 
     */
    public List<ChangedElement> getChanges() {
        if (changes == null) {
            changes = new ArrayList<ChangedElement>();
        }
        return this.changes;
    }

}
