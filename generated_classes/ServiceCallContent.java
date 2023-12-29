
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCallContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCallContent"&gt;
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
@XmlType(name = "ServiceCallContent")
@XmlSeeAlso({
    DefaultServiceCallContent.class,
    ThrowMessageEventContent.class,
    DcmThrowMessageEventContent.class,
    ThrowAsyncMessageEventContent.class,
    DashboardThrowPortalMessageEventContent.class,
    GetTaskInfoContent.class,
    GetCaseInfoContent.class,
    CmisDocumentManagerContent.class,
    CmisGetDocumentMetadataContent.class,
    CsvConnectivityContent.class,
    AggregateCountContent.class,
    AggregateSearchContent.class,
    CaseSearchContent.class,
    InstanceCreateContent.class,
    InstanceUpdateContent.class
})
public abstract class ServiceCallContent {


}
