
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWebServiceConfigurationOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWebServiceConfigurationOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operation" maxOccurs="unbounded" minOccurs="0" form="unqualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                   &lt;element name="Flow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                   &lt;element name="Mapping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                   &lt;element name="Roles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString1" minOccurs="0" form="unqualified"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWebServiceConfigurationOperation", propOrder = {
    "operation"
})
public class ArrayOfWebServiceConfigurationOperation {

    @XmlElement(name = "Operation")
    protected List<ArrayOfWebServiceConfigurationOperation.Operation> operation;

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfWebServiceConfigurationOperation.Operation }
     * 
     * 
     */
    public List<ArrayOfWebServiceConfigurationOperation.Operation> getOperation() {
        if (operation == null) {
            operation = new ArrayList<ArrayOfWebServiceConfigurationOperation.Operation>();
        }
        return this.operation;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *         &lt;element name="Flow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *         &lt;element name="Mapping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *         &lt;element name="Roles" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfString1" minOccurs="0" form="unqualified"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operation",
        "flow",
        "mapping",
        "roles"
    })
    public static class Operation {

        @XmlElement(name = "Operation")
        protected String operation;
        @XmlElement(name = "Flow")
        protected String flow;
        @XmlElement(name = "Mapping")
        protected String mapping;
        @XmlElement(name = "Roles")
        protected ArrayOfString1 roles;

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperation(String value) {
            this.operation = value;
        }

        /**
         * Gets the value of the flow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlow() {
            return flow;
        }

        /**
         * Sets the value of the flow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlow(String value) {
            this.flow = value;
        }

        /**
         * Gets the value of the mapping property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapping() {
            return mapping;
        }

        /**
         * Sets the value of the mapping property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapping(String value) {
            this.mapping = value;
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

    }

}
