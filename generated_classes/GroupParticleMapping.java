
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupParticleMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupParticleMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ParticleMapping"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParticleMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfParticleMapping" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Sequence"/&gt;
 *             &lt;enumeration value="Choice"/&gt;
 *             &lt;enumeration value="All"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupParticleMapping", propOrder = {
    "particleMappings"
})
public class GroupParticleMapping
    extends ParticleMapping
{

    @XmlElement(name = "ParticleMappings")
    protected ArrayOfParticleMapping particleMappings;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Relation")
    protected String relation;

    /**
     * Gets the value of the particleMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParticleMapping }
     *     
     */
    public ArrayOfParticleMapping getParticleMappings() {
        return particleMappings;
    }

    /**
     * Sets the value of the particleMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParticleMapping }
     *     
     */
    public void setParticleMappings(ArrayOfParticleMapping value) {
        this.particleMappings = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

}
