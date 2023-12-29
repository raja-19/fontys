
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityNodeLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityNodeLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessNodeLayout"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventKeyPositions" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfProcessEventKeyPosition" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LibraryIcon" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}NodeIcon" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityNodeLayout", propOrder = {
    "eventKeyPositions"
})
public class ActivityNodeLayout
    extends ProcessNodeLayout
{

    @XmlElement(name = "EventKeyPositions")
    protected ArrayOfProcessEventKeyPosition eventKeyPositions;
    @XmlAttribute(name = "LibraryIcon", required = true)
    protected NodeIcon libraryIcon;

    /**
     * Gets the value of the eventKeyPositions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcessEventKeyPosition }
     *     
     */
    public ArrayOfProcessEventKeyPosition getEventKeyPositions() {
        return eventKeyPositions;
    }

    /**
     * Sets the value of the eventKeyPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcessEventKeyPosition }
     *     
     */
    public void setEventKeyPositions(ArrayOfProcessEventKeyPosition value) {
        this.eventKeyPositions = value;
    }

    /**
     * Gets the value of the libraryIcon property.
     * 
     * @return
     *     possible object is
     *     {@link NodeIcon }
     *     
     */
    public NodeIcon getLibraryIcon() {
        return libraryIcon;
    }

    /**
     * Sets the value of the libraryIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeIcon }
     *     
     */
    public void setLibraryIcon(NodeIcon value) {
        this.libraryIcon = value;
    }

}
