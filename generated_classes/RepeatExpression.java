
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepeatExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepeatExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression"&gt;
 *       &lt;attribute name="RepeatValueTargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RepeatValueTargetAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepeatExpression")
@XmlSeeAlso({
    SortableRepeatExpression.class
})
public class RepeatExpression
    extends Expression
{

    @XmlAttribute(name = "RepeatValueTargetEntity")
    protected String repeatValueTargetEntity;
    @XmlAttribute(name = "RepeatValueTargetAttribute")
    protected String repeatValueTargetAttribute;

    /**
     * Gets the value of the repeatValueTargetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatValueTargetEntity() {
        return repeatValueTargetEntity;
    }

    /**
     * Sets the value of the repeatValueTargetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatValueTargetEntity(String value) {
        this.repeatValueTargetEntity = value;
    }

    /**
     * Gets the value of the repeatValueTargetAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatValueTargetAttribute() {
        return repeatValueTargetAttribute;
    }

    /**
     * Sets the value of the repeatValueTargetAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatValueTargetAttribute(String value) {
        this.repeatValueTargetAttribute = value;
    }

}
