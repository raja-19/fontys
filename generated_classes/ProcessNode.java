
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="PersistencyId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessNode")
@XmlSeeAlso({
    ProcessActivityNode.class,
    ProcessConditionalNode.class,
    ProcessEndNode.class,
    ProcessExternalMessageNode.class,
    ProcessGatewayNode.class,
    ProcessStartNode.class,
    ProcessEventStartNode.class,
    ProcessTimerNode.class
})
public abstract class ProcessNode {

    @XmlAttribute(name = "Id", required = true)
    protected int id;
    @XmlAttribute(name = "PersistencyId")
    protected String persistencyId;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the persistencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistencyId() {
        return persistencyId;
    }

    /**
     * Sets the value of the persistencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistencyId(String value) {
        this.persistencyId = value;
    }

}
