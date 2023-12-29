
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseSearchCaseDataEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseSearchCaseDataEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CaseSearchCriteriaEntry"&gt;
 *       &lt;attribute name="CaseDataType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CaseDataType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSearchCaseDataEntry")
public class CaseSearchCaseDataEntry
    extends CaseSearchCriteriaEntry
{

    @XmlAttribute(name = "CaseDataType", required = true)
    protected CaseDataType caseDataType;

    /**
     * Gets the value of the caseDataType property.
     * 
     * @return
     *     possible object is
     *     {@link CaseDataType }
     *     
     */
    public CaseDataType getCaseDataType() {
        return caseDataType;
    }

    /**
     * Sets the value of the caseDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseDataType }
     *     
     */
    public void setCaseDataType(CaseDataType value) {
        this.caseDataType = value;
    }

}
