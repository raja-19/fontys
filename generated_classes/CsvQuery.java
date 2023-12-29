
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CsvQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CsvQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
 *         &lt;element name="Criteria" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfCsvQueryCriterium" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Goals" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfCsvQueryGoal" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Resource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TargetEntity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CsvQuery", propOrder = {
    "targetInstance",
    "criteria",
    "goals"
})
public class CsvQuery {

    @XmlElement(name = "TargetInstance")
    protected CsvQuery.TargetInstance targetInstance;
    @XmlElement(name = "Criteria")
    protected ArrayOfCsvQueryCriterium criteria;
    @XmlElement(name = "Goals")
    protected ArrayOfCsvQueryGoal goals;
    @XmlAttribute(name = "Resource")
    protected String resource;
    @XmlAttribute(name = "TargetEntity")
    protected String targetEntity;

    /**
     * Gets the value of the targetInstance property.
     * 
     * @return
     *     possible object is
     *     {@link CsvQuery.TargetInstance }
     *     
     */
    public CsvQuery.TargetInstance getTargetInstance() {
        return targetInstance;
    }

    /**
     * Sets the value of the targetInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsvQuery.TargetInstance }
     *     
     */
    public void setTargetInstance(CsvQuery.TargetInstance value) {
        this.targetInstance = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCsvQueryCriterium }
     *     
     */
    public ArrayOfCsvQueryCriterium getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCsvQueryCriterium }
     *     
     */
    public void setCriteria(ArrayOfCsvQueryCriterium value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the goals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCsvQueryGoal }
     *     
     */
    public ArrayOfCsvQueryGoal getGoals() {
        return goals;
    }

    /**
     * Sets the value of the goals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCsvQueryGoal }
     *     
     */
    public void setGoals(ArrayOfCsvQueryGoal value) {
        this.goals = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResource(String value) {
        this.resource = value;
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
