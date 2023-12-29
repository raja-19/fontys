
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomaticConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomaticConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailRepeatInterval" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/&gt;
 *         &lt;element name="FailRepeatExpression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomaticConfiguration", propOrder = {
    "failRepeatInterval",
    "failRepeatExpression"
})
public class AutomaticConfiguration {

    @XmlElement(name = "FailRepeatInterval")
    protected int failRepeatInterval;
    @XmlElement(name = "FailRepeatExpression")
    protected Expression failRepeatExpression;

    /**
     * Gets the value of the failRepeatInterval property.
     * 
     */
    public int getFailRepeatInterval() {
        return failRepeatInterval;
    }

    /**
     * Sets the value of the failRepeatInterval property.
     * 
     */
    public void setFailRepeatInterval(int value) {
        this.failRepeatInterval = value;
    }

    /**
     * Gets the value of the failRepeatExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getFailRepeatExpression() {
        return failRepeatExpression;
    }

    /**
     * Sets the value of the failRepeatExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setFailRepeatExpression(Expression value) {
        this.failRepeatExpression = value;
    }

}
