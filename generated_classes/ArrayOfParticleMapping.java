
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfParticleMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfParticleMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParticleMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParticleMapping" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfParticleMapping", propOrder = {
    "particleMapping"
})
public class ArrayOfParticleMapping {

    @XmlElement(name = "ParticleMapping")
    protected List<ParticleMapping> particleMapping;

    /**
     * Gets the value of the particleMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the particleMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticleMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticleMapping }
     * 
     * 
     */
    public List<ParticleMapping> getParticleMapping() {
        if (particleMapping == null) {
            particleMapping = new ArrayList<ParticleMapping>();
        }
        return this.particleMapping;
    }

}
