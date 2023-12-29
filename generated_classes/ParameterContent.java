
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterContent")
@XmlSeeAlso({
    DefaultContent.class,
    PortalMessageListenerContent.class,
    InstanceLinkerContent.class,
    WorkListContent.class,
    DcmWorkListContent.class,
    DcmCaseListContent.class,
    AggregateListContent.class,
    CaseListContent.class,
    DashboardFlowWidgetContent.class,
    DashboardTimelineContent.class,
    StatisticProcessContent.class,
    StatisticAggregateContent.class,
    ExternalFlowContent.class
})
public abstract class ParameterContent {


}
