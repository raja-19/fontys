
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRuleReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRuleReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}RuleGroupReference"&gt;
 *       &lt;attribute name="ExternalRule" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRuleReference")
public class ExternalRuleReference
    extends RuleGroupReference
{

    @XmlAttribute(name = "ExternalRule")
    protected String externalRule;

    /**
     * Gets the value of the externalRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRule() {
        return externalRule;
    }

    /**
     * Sets the value of the externalRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRule(String value) {
        this.externalRule = value;
    }

}
