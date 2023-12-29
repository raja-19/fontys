
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSoapServiceOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSoapServiceOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operation" maxOccurs="unbounded" minOccurs="0" form="unqualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                   &lt;element name="RequestMessage" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SoapServiceMessage" minOccurs="0" form="unqualified"/&gt;
 *                   &lt;element name="ResponseMessage" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SoapServiceMessage" minOccurs="0" form="unqualified"/&gt;
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
@XmlType(name = "ArrayOfSoapServiceOperation", propOrder = {
    "operation"
})
public class ArrayOfSoapServiceOperation {

    @XmlElement(name = "Operation")
    protected List<ArrayOfSoapServiceOperation.Operation> operation;

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
     * {@link ArrayOfSoapServiceOperation.Operation }
     * 
     * 
     */
    public List<ArrayOfSoapServiceOperation.Operation> getOperation() {
        if (operation == null) {
            operation = new ArrayList<ArrayOfSoapServiceOperation.Operation>();
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *         &lt;element name="RequestMessage" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SoapServiceMessage" minOccurs="0" form="unqualified"/&gt;
     *         &lt;element name="ResponseMessage" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SoapServiceMessage" minOccurs="0" form="unqualified"/&gt;
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
        "name",
        "action",
        "requestMessage",
        "responseMessage"
    })
    public static class Operation {

        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "Action")
        protected String action;
        @XmlElement(name = "RequestMessage")
        protected SoapServiceMessage requestMessage;
        @XmlElement(name = "ResponseMessage")
        protected SoapServiceMessage responseMessage;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

        /**
         * Gets the value of the requestMessage property.
         * 
         * @return
         *     possible object is
         *     {@link SoapServiceMessage }
         *     
         */
        public SoapServiceMessage getRequestMessage() {
            return requestMessage;
        }

        /**
         * Sets the value of the requestMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link SoapServiceMessage }
         *     
         */
        public void setRequestMessage(SoapServiceMessage value) {
            this.requestMessage = value;
        }

        /**
         * Gets the value of the responseMessage property.
         * 
         * @return
         *     possible object is
         *     {@link SoapServiceMessage }
         *     
         */
        public SoapServiceMessage getResponseMessage() {
            return responseMessage;
        }

        /**
         * Sets the value of the responseMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link SoapServiceMessage }
         *     
         */
        public void setResponseMessage(SoapServiceMessage value) {
            this.responseMessage = value;
        }

    }

}
