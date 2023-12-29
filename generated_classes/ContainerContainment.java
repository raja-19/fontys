
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContainerContainment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerContainment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}FormatContainment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadOnly" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Container" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Container" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="RepeatExpression" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SortableRepeatExpression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerContainment", propOrder = {
    "readOnly",
    "container",
    "repeatExpression"
})
public class ContainerContainment
    extends FormatContainment
{

    @XmlElement(name = "ReadOnly")
    protected Expression readOnly;
    @XmlElement(name = "Container")
    protected Container container;
    @XmlElement(name = "RepeatExpression")
    protected SortableRepeatExpression repeatExpression;

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setReadOnly(Expression value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link Container }
     *     
     */
    public Container getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link Container }
     *     
     */
    public void setContainer(Container value) {
        this.container = value;
    }

    /**
     * Gets the value of the repeatExpression property.
     * 
     * @return
     *     possible object is
     *     {@link SortableRepeatExpression }
     *     
     */
    public SortableRepeatExpression getRepeatExpression() {
        return repeatExpression;
    }

    /**
     * Sets the value of the repeatExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortableRepeatExpression }
     *     
     */
    public void setRepeatExpression(SortableRepeatExpression value) {
        this.repeatExpression = value;
    }

}
