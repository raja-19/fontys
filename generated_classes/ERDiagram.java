
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ERDiagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ERDiagram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityReferences" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfEntityReference" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="RelationReferences" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfERRelationReference" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="InheritanceConnections" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfInheritanceConnection" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DiagramGroups" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfDiagramGroup" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ERDiagram", propOrder = {
    "entityReferences",
    "relationReferences",
    "inheritanceConnections",
    "diagramGroups"
})
public class ERDiagram
    extends ModuleElement
{

    @XmlElement(name = "EntityReferences")
    protected ArrayOfEntityReference entityReferences;
    @XmlElement(name = "RelationReferences")
    protected ArrayOfERRelationReference relationReferences;
    @XmlElement(name = "InheritanceConnections")
    protected ArrayOfInheritanceConnection inheritanceConnections;
    @XmlElement(name = "DiagramGroups")
    protected ArrayOfDiagramGroup diagramGroups;

    /**
     * Gets the value of the entityReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityReference }
     *     
     */
    public ArrayOfEntityReference getEntityReferences() {
        return entityReferences;
    }

    /**
     * Sets the value of the entityReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityReference }
     *     
     */
    public void setEntityReferences(ArrayOfEntityReference value) {
        this.entityReferences = value;
    }

    /**
     * Gets the value of the relationReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfERRelationReference }
     *     
     */
    public ArrayOfERRelationReference getRelationReferences() {
        return relationReferences;
    }

    /**
     * Sets the value of the relationReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfERRelationReference }
     *     
     */
    public void setRelationReferences(ArrayOfERRelationReference value) {
        this.relationReferences = value;
    }

    /**
     * Gets the value of the inheritanceConnections property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInheritanceConnection }
     *     
     */
    public ArrayOfInheritanceConnection getInheritanceConnections() {
        return inheritanceConnections;
    }

    /**
     * Sets the value of the inheritanceConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInheritanceConnection }
     *     
     */
    public void setInheritanceConnections(ArrayOfInheritanceConnection value) {
        this.inheritanceConnections = value;
    }

    /**
     * Gets the value of the diagramGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiagramGroup }
     *     
     */
    public ArrayOfDiagramGroup getDiagramGroups() {
        return diagramGroups;
    }

    /**
     * Sets the value of the diagramGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiagramGroup }
     *     
     */
    public void setDiagramGroups(ArrayOfDiagramGroup value) {
        this.diagramGroups = value;
    }

}
