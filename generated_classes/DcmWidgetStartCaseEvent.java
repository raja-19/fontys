
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DcmWidgetStartCaseEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcmWidgetStartCaseEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}DcmWidgetEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Expression" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcmWidgetStartCaseEvent", propOrder = {
    "caseType"
})
public class DcmWidgetStartCaseEvent
    extends DcmWidgetEvent
{

    @XmlElement(name = "CaseType")
    protected Expression caseType;

    /**
     * Gets the value of the caseType property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getCaseType() {
        return caseType;
    }

    /**
     * Sets the value of the caseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setCaseType(Expression value) {
        this.caseType = value;
    }

}