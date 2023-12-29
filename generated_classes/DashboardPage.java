
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardPage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Columns" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DashboardColumn" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="EventContext" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString2" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Event" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DashboardEventType" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Layout" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DashboardLayoutType" /&gt;
 *       &lt;attribute name="Menu" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardPage", propOrder = {
    "columns",
    "eventContext",
    "event"
})
public class DashboardPage
    extends ModuleElement
{

    @XmlElement(name = "Columns")
    protected List<DashboardColumn> columns;
    @XmlElement(name = "EventContext")
    protected ArrayOfString2 eventContext;
    @XmlElement(name = "Event", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected DashboardEventType event;
    @XmlAttribute(name = "Layout", required = true)
    protected DashboardLayoutType layout;
    @XmlAttribute(name = "Menu")
    protected String menu;

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DashboardColumn }
     * 
     * 
     */
    public List<DashboardColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<DashboardColumn>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the eventContext property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getEventContext() {
        return eventContext;
    }

    /**
     * Sets the value of the eventContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setEventContext(ArrayOfString2 value) {
        this.eventContext = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardEventType }
     *     
     */
    public DashboardEventType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardEventType }
     *     
     */
    public void setEvent(DashboardEventType value) {
        this.event = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardLayoutType }
     *     
     */
    public DashboardLayoutType getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardLayoutType }
     *     
     */
    public void setLayout(DashboardLayoutType value) {
        this.layout = value;
    }

    /**
     * Gets the value of the menu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenu() {
        return menu;
    }

    /**
     * Sets the value of the menu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenu(String value) {
        this.menu = value;
    }

}
