
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormatContainment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormatContainment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Containment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresentationStyles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfFormatContainmentPresentationStyle" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormatContainment", propOrder = {
    "presentationStyles"
})
@XmlSeeAlso({
    FieldTypeFormatDefinition.class,
    AttributeReference.class,
    InlineFieldReference.class,
    ButtonReference.class,
    ContainerContainment.class,
    ListFormatDefinition.class,
    AggregateListItemReference.class,
    ContainerReference.class,
    RelationReference.class,
    ContentItemReference.class,
    ImageReference.class,
    TextItemReference.class,
    ValueListItemReference.class
})
public abstract class FormatContainment
    extends Containment
{

    @XmlElement(name = "PresentationStyles")
    protected ArrayOfFormatContainmentPresentationStyle presentationStyles;

    /**
     * Gets the value of the presentationStyles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormatContainmentPresentationStyle }
     *     
     */
    public ArrayOfFormatContainmentPresentationStyle getPresentationStyles() {
        return presentationStyles;
    }

    /**
     * Sets the value of the presentationStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormatContainmentPresentationStyle }
     *     
     */
    public void setPresentationStyles(ArrayOfFormatContainmentPresentationStyle value) {
        this.presentationStyles = value;
    }

}
