
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDTSourcePath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDTSourcePath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourcePath" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DTSourcePath" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDTSourcePath", propOrder = {
    "sourcePath"
})
public class ArrayOfDTSourcePath {

    @XmlElement(name = "SourcePath")
    protected List<DTSourcePath> sourcePath;

    /**
     * Gets the value of the sourcePath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sourcePath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourcePath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTSourcePath }
     * 
     * 
     */
    public List<DTSourcePath> getSourcePath() {
        if (sourcePath == null) {
            sourcePath = new ArrayList<DTSourcePath>();
        }
        return this.sourcePath;
    }

}