
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmisDocumentManagerContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmisDocumentManagerContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entries" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfCmisCustomMetaDataEntry" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ActionType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CmisActionType" form="unqualified"/&gt;
 *         &lt;element name="Id" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ObjectType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Name" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Path" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="FileId" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="DeleteAllVersions" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="RemoveFromScope" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="OutputIdEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="OutputIdAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="OutputIdTargetInstance" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmisDocumentManagerContent", propOrder = {
    "entries",
    "actionType",
    "id",
    "objectType",
    "name",
    "path",
    "fileId",
    "connection",
    "deleteAllVersions",
    "removeFromScope",
    "outputIdEntity",
    "outputIdAttribute",
    "outputIdTargetInstance"
})
public class CmisDocumentManagerContent
    extends ServiceCallContent
{

    @XmlElement(name = "Entries")
    protected ArrayOfCmisCustomMetaDataEntry entries;
    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected CmisActionType actionType;
    @XmlElement(name = "Id")
    protected Expression id;
    @XmlElement(name = "ObjectType")
    protected Expression objectType;
    @XmlElement(name = "Name")
    protected Expression name;
    @XmlElement(name = "Path")
    protected Expression path;
    @XmlElement(name = "FileId")
    protected Expression fileId;
    @XmlElement(name = "Connection")
    protected String connection;
    @XmlElement(name = "DeleteAllVersions")
    protected boolean deleteAllVersions;
    @XmlElement(name = "RemoveFromScope")
    protected boolean removeFromScope;
    @XmlElement(name = "OutputIdEntity")
    protected String outputIdEntity;
    @XmlElement(name = "OutputIdAttribute")
    protected String outputIdAttribute;
    @XmlElement(name = "OutputIdTargetInstance")
    protected Expression outputIdTargetInstance;

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCmisCustomMetaDataEntry }
     *     
     */
    public ArrayOfCmisCustomMetaDataEntry getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCmisCustomMetaDataEntry }
     *     
     */
    public void setEntries(ArrayOfCmisCustomMetaDataEntry value) {
        this.entries = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link CmisActionType }
     *     
     */
    public CmisActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmisActionType }
     *     
     */
    public void setActionType(CmisActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setId(Expression value) {
        this.id = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setName(Expression value) {
        this.name = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setPath(Expression value) {
        this.path = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setFileId(Expression value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnection(String value) {
        this.connection = value;
    }

    /**
     * Gets the value of the deleteAllVersions property.
     * 
     */
    public boolean isDeleteAllVersions() {
        return deleteAllVersions;
    }

    /**
     * Sets the value of the deleteAllVersions property.
     * 
     */
    public void setDeleteAllVersions(boolean value) {
        this.deleteAllVersions = value;
    }

    /**
     * Gets the value of the removeFromScope property.
     * 
     */
    public boolean isRemoveFromScope() {
        return removeFromScope;
    }

    /**
     * Sets the value of the removeFromScope property.
     * 
     */
    public void setRemoveFromScope(boolean value) {
        this.removeFromScope = value;
    }

    /**
     * Gets the value of the outputIdEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputIdEntity() {
        return outputIdEntity;
    }

    /**
     * Sets the value of the outputIdEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputIdEntity(String value) {
        this.outputIdEntity = value;
    }

    /**
     * Gets the value of the outputIdAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputIdAttribute() {
        return outputIdAttribute;
    }

    /**
     * Sets the value of the outputIdAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputIdAttribute(String value) {
        this.outputIdAttribute = value;
    }

    /**
     * Gets the value of the outputIdTargetInstance property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getOutputIdTargetInstance() {
        return outputIdTargetInstance;
    }

    /**
     * Sets the value of the outputIdTargetInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setOutputIdTargetInstance(Expression value) {
        this.outputIdTargetInstance = value;
    }

}
