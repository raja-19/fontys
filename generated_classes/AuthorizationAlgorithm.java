
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationAlgorithm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationAlgorithm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalSource" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="Roles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString1" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="RestrictedUserIds" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationAlgorithm", propOrder = {
    "externalSource",
    "roles",
    "restrictedUserIds"
})
public class AuthorizationAlgorithm
    extends ModuleElement
{

    @XmlElement(name = "ExternalSource")
    protected boolean externalSource;
    @XmlElement(name = "Roles")
    protected ArrayOfString1 roles;
    @XmlElement(name = "RestrictedUserIds")
    protected Expression restrictedUserIds;

    /**
     * Gets the value of the externalSource property.
     * 
     */
    public boolean isExternalSource() {
        return externalSource;
    }

    /**
     * Sets the value of the externalSource property.
     * 
     */
    public void setExternalSource(boolean value) {
        this.externalSource = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setRoles(ArrayOfString1 value) {
        this.roles = value;
    }

    /**
     * Gets the value of the restrictedUserIds property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getRestrictedUserIds() {
        return restrictedUserIds;
    }

    /**
     * Sets the value of the restrictedUserIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setRestrictedUserIds(Expression value) {
        this.restrictedUserIds = value;
    }

}
