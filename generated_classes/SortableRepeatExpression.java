
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortableRepeatExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortableRepeatExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}RepeatExpression"&gt;
 *       &lt;attribute name="Sorting" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SortingType" /&gt;
 *       &lt;attribute name="OrderByEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OrderByAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortableRepeatExpression")
public class SortableRepeatExpression
    extends RepeatExpression
{

    @XmlAttribute(name = "Sorting")
    protected SortingType sorting;
    @XmlAttribute(name = "OrderByEntity")
    protected String orderByEntity;
    @XmlAttribute(name = "OrderByAttribute")
    protected String orderByAttribute;

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link SortingType }
     *     
     */
    public SortingType getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortingType }
     *     
     */
    public void setSorting(SortingType value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the orderByEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderByEntity() {
        return orderByEntity;
    }

    /**
     * Sets the value of the orderByEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderByEntity(String value) {
        this.orderByEntity = value;
    }

    /**
     * Gets the value of the orderByAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderByAttribute() {
        return orderByAttribute;
    }

    /**
     * Sets the value of the orderByAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderByAttribute(String value) {
        this.orderByAttribute = value;
    }

}
