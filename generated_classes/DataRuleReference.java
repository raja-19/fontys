
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataRuleReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRuleReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}RuleGroupReference"&gt;
 *       &lt;attribute name="DataRule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRuleReference")
public class DataRuleReference
    extends RuleGroupReference
{

    @XmlAttribute(name = "DataRule")
    protected String dataRule;

    /**
     * Gets the value of the dataRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRule() {
        return dataRule;
    }

    /**
     * Sets the value of the dataRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRule(String value) {
        this.dataRule = value;
    }

}
