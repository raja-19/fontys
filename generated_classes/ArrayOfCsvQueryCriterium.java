
package com.cet.managementservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCsvQueryCriterium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCsvQueryCriterium"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Criterium" maxOccurs="unbounded" minOccurs="0" form="unqualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                   &lt;element name="Value" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Operator" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}MappingOperator" /&gt;
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
@XmlType(name = "ArrayOfCsvQueryCriterium", propOrder = {
    "criterium"
})
public class ArrayOfCsvQueryCriterium {

    @XmlElement(name = "Criterium")
    protected List<ArrayOfCsvQueryCriterium.Criterium> criterium;

    /**
     * Gets the value of the criterium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the criterium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCsvQueryCriterium.Criterium }
     * 
     * 
     */
    public List<ArrayOfCsvQueryCriterium.Criterium> getCriterium() {
        if (criterium == null) {
            criterium = new ArrayList<ArrayOfCsvQueryCriterium.Criterium>();
        }
        return this.criterium;
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
     *         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *         &lt;element name="Value" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Operator" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}MappingOperator" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "column",
        "value"
    })
    public static class Criterium {

        @XmlElement(name = "Column")
        protected String column;
        @XmlElement(name = "Value")
        protected Expression value;
        @XmlAttribute(name = "Operator", required = true)
        protected MappingOperator operator;

        /**
         * Gets the value of the column property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumn() {
            return column;
        }

        /**
         * Sets the value of the column property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumn(String value) {
            this.column = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Expression }
         *     
         */
        public Expression getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Expression }
         *     
         */
        public void setValue(Expression value) {
            this.value = value;
        }

        /**
         * Gets the value of the operator property.
         * 
         * @return
         *     possible object is
         *     {@link MappingOperator }
         *     
         */
        public MappingOperator getOperator() {
            return operator;
        }

        /**
         * Sets the value of the operator property.
         * 
         * @param value
         *     allowed object is
         *     {@link MappingOperator }
         *     
         */
        public void setOperator(MappingOperator value) {
            this.operator = value;
        }

    }

}
