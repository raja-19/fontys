
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmisGetDocumentMetadataContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmisGetDocumentMetadataContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropertyMappings" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfCmisPropertyMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="NameMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CmisPropertyMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="IdMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CmisPropertyMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CreatedByMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CmisPropertyMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CreationDateMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CmisPropertyMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="LastModifiedByMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CmisPropertyMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="LastModificationDateMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CmisPropertyMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="VersionMapping" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CmisPropertyMapping" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="TargetInstance" minOccurs="0" form="unqualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="InstanceEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InstanceRelation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InstanceAction" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}InstanceAction" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ObjectType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="PathFilter" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmisGetDocumentMetadataContent", propOrder = {
    "propertyMappings",
    "nameMapping",
    "idMapping",
    "createdByMapping",
    "creationDateMapping",
    "lastModifiedByMapping",
    "lastModificationDateMapping",
    "versionMapping",
    "targetInstance",
    "targetEntity",
    "objectType",
    "pathFilter"
})
public class CmisGetDocumentMetadataContent
    extends ServiceCallContent
{

    @XmlElement(name = "PropertyMappings")
    protected ArrayOfCmisPropertyMapping propertyMappings;
    @XmlElement(name = "NameMapping")
    protected CmisPropertyMapping nameMapping;
    @XmlElement(name = "IdMapping")
    protected CmisPropertyMapping idMapping;
    @XmlElement(name = "CreatedByMapping")
    protected CmisPropertyMapping createdByMapping;
    @XmlElement(name = "CreationDateMapping")
    protected CmisPropertyMapping creationDateMapping;
    @XmlElement(name = "LastModifiedByMapping")
    protected CmisPropertyMapping lastModifiedByMapping;
    @XmlElement(name = "LastModificationDateMapping")
    protected CmisPropertyMapping lastModificationDateMapping;
    @XmlElement(name = "VersionMapping")
    protected CmisPropertyMapping versionMapping;
    @XmlElement(name = "TargetInstance")
    protected CmisGetDocumentMetadataContent.TargetInstance targetInstance;
    @XmlElement(name = "TargetEntity")
    protected String targetEntity;
    @XmlElement(name = "ObjectType")
    protected Expression objectType;
    @XmlElement(name = "PathFilter")
    protected Expression pathFilter;

    /**
     * Gets the value of the propertyMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCmisPropertyMapping }
     *     
     */
    public ArrayOfCmisPropertyMapping getPropertyMappings() {
        return propertyMappings;
    }

    /**
     * Sets the value of the propertyMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCmisPropertyMapping }
     *     
     */
    public void setPropertyMappings(ArrayOfCmisPropertyMapping value) {
        this.propertyMappings = value;
    }

    /**
     * Gets the value of the nameMapping property.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public CmisPropertyMapping getNameMapping() {
        return nameMapping;
    }

    /**
     * Sets the value of the nameMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public void setNameMapping(CmisPropertyMapping value) {
        this.nameMapping = value;
    }

    /**
     * Gets the value of the idMapping property.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public CmisPropertyMapping getIdMapping() {
        return idMapping;
    }

    /**
     * Sets the value of the idMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public void setIdMapping(CmisPropertyMapping value) {
        this.idMapping = value;
    }

    /**
     * Gets the value of the createdByMapping property.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public CmisPropertyMapping getCreatedByMapping() {
        return createdByMapping;
    }

    /**
     * Sets the value of the createdByMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public void setCreatedByMapping(CmisPropertyMapping value) {
        this.createdByMapping = value;
    }

    /**
     * Gets the value of the creationDateMapping property.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public CmisPropertyMapping getCreationDateMapping() {
        return creationDateMapping;
    }

    /**
     * Sets the value of the creationDateMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public void setCreationDateMapping(CmisPropertyMapping value) {
        this.creationDateMapping = value;
    }

    /**
     * Gets the value of the lastModifiedByMapping property.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public CmisPropertyMapping getLastModifiedByMapping() {
        return lastModifiedByMapping;
    }

    /**
     * Sets the value of the lastModifiedByMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public void setLastModifiedByMapping(CmisPropertyMapping value) {
        this.lastModifiedByMapping = value;
    }

    /**
     * Gets the value of the lastModificationDateMapping property.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public CmisPropertyMapping getLastModificationDateMapping() {
        return lastModificationDateMapping;
    }

    /**
     * Sets the value of the lastModificationDateMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public void setLastModificationDateMapping(CmisPropertyMapping value) {
        this.lastModificationDateMapping = value;
    }

    /**
     * Gets the value of the versionMapping property.
     * 
     * @return
     *     possible object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public CmisPropertyMapping getVersionMapping() {
        return versionMapping;
    }

    /**
     * Sets the value of the versionMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisPropertyMapping }
     *     
     */
    public void setVersionMapping(CmisPropertyMapping value) {
        this.versionMapping = value;
    }

    /**
     * Gets the value of the targetInstance property.
     * 
     * @return
     *     possible object is
     *     {@link CmisGetDocumentMetadataContent.TargetInstance }
     *     
     */
    public CmisGetDocumentMetadataContent.TargetInstance getTargetInstance() {
        return targetInstance;
    }

    /**
     * Sets the value of the targetInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisGetDocumentMetadataContent.TargetInstance }
     *     
     */
    public void setTargetInstance(CmisGetDocumentMetadataContent.TargetInstance value) {
        this.targetInstance = value;
    }

    /**
     * Gets the value of the targetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEntity() {
        return targetEntity;
    }

    /**
     * Sets the value of the targetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEntity(String value) {
        this.targetEntity = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setObjectType(Expression value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the pathFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getPathFilter() {
        return pathFilter;
    }

    /**
     * Sets the value of the pathFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setPathFilter(Expression value) {
        this.pathFilter = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="InstanceEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InstanceRelation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InstanceAction" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}InstanceAction" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TargetInstance {

        @XmlAttribute(name = "InstanceEntity")
        protected String instanceEntity;
        @XmlAttribute(name = "InstanceRelation")
        protected String instanceRelation;
        @XmlAttribute(name = "InstanceAction", required = true)
        protected InstanceAction instanceAction;

        /**
         * Gets the value of the instanceEntity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstanceEntity() {
            return instanceEntity;
        }

        /**
         * Sets the value of the instanceEntity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstanceEntity(String value) {
            this.instanceEntity = value;
        }

        /**
         * Gets the value of the instanceRelation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstanceRelation() {
            return instanceRelation;
        }

        /**
         * Sets the value of the instanceRelation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstanceRelation(String value) {
            this.instanceRelation = value;
        }

        /**
         * Gets the value of the instanceAction property.
         * 
         * @return
         *     possible object is
         *     {@link InstanceAction }
         *     
         */
        public InstanceAction getInstanceAction() {
            return instanceAction;
        }

        /**
         * Sets the value of the instanceAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link InstanceAction }
         *     
         */
        public void setInstanceAction(InstanceAction value) {
            this.instanceAction = value;
        }

    }

}
