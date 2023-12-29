
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Revision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Revision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RevisionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Committer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MergeParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Revision", propOrder = {
    "commitTime",
    "revisionId",
    "message",
    "committer",
    "tags",
    "parent",
    "mergeParent"
})
public class Revision {

    @XmlElement(name = "CommitTime", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commitTime;
    @XmlElement(name = "RevisionId", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String revisionId;
    @XmlElement(name = "Message", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String message;
    @XmlElement(name = "Committer", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String committer;
    @XmlElement(name = "Tags", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected List<String> tags;
    @XmlElement(name = "Parent", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String parent;
    @XmlElement(name = "MergeParent", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String mergeParent;

    /**
     * Gets the value of the commitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitTime() {
        return commitTime;
    }

    /**
     * Sets the value of the commitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitTime(XMLGregorianCalendar value) {
        this.commitTime = value;
    }

    /**
     * Gets the value of the revisionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * Sets the value of the revisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionId(String value) {
        this.revisionId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the committer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitter() {
        return committer;
    }

    /**
     * Sets the value of the committer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitter(String value) {
        this.committer = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTags() {
        if (tags == null) {
            tags = new ArrayList<String>();
        }
        return this.tags;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent(String value) {
        this.parent = value;
    }

    /**
     * Gets the value of the mergeParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergeParent() {
        return mergeParent;
    }

    /**
     * Sets the value of the mergeParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergeParent(String value) {
        this.mergeParent = value;
    }

}
