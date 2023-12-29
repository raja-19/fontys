
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetRevisionsWithLeveledMergeRevisionsResult" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfRevision" minOccurs="0"/&gt;
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
    "getRevisionsWithLeveledMergeRevisionsResult"
})
@XmlRootElement(name = "GetRevisionsWithLeveledMergeRevisionsResponse")
public class GetRevisionsWithLeveledMergeRevisionsResponse {

    @XmlElement(name = "GetRevisionsWithLeveledMergeRevisionsResult", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ArrayOfRevision getRevisionsWithLeveledMergeRevisionsResult;

    /**
     * Gets the value of the getRevisionsWithLeveledMergeRevisionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRevision }
     *     
     */
    public ArrayOfRevision getGetRevisionsWithLeveledMergeRevisionsResult() {
        return getRevisionsWithLeveledMergeRevisionsResult;
    }

    /**
     * Sets the value of the getRevisionsWithLeveledMergeRevisionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRevision }
     *     
     */
    public void setGetRevisionsWithLeveledMergeRevisionsResult(ArrayOfRevision value) {
        this.getRevisionsWithLeveledMergeRevisionsResult = value;
    }

}
