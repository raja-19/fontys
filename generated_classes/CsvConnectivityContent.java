
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CsvConnectivityContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CsvConnectivityContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ServiceCallContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Query" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}CsvQuery" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CsvConnectivityContent", propOrder = {
    "query"
})
public class CsvConnectivityContent
    extends ServiceCallContent
{

    @XmlElement(name = "Query")
    protected CsvQuery query;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link CsvQuery }
     *     
     */
    public CsvQuery getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsvQuery }
     *     
     */
    public void setQuery(CsvQuery value) {
        this.query = value;
    }

}
