
package com.cet.managementservice;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="StartupTime" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="BuildVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuntimeVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Domainname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerInformation", propOrder = {
    "startedAt",
    "startupTime",
    "buildVersion",
    "buildDate",
    "runtimeVersion",
    "hostname",
    "domainname"
})
public class ServerInformation {

    @XmlElement(name = "StartedAt", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startedAt;
    @XmlElement(name = "StartupTime", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected double startupTime;
    @XmlElement(name = "BuildVersion", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String buildVersion;
    @XmlElement(name = "BuildDate", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String buildDate;
    @XmlElement(name = "RuntimeVersion", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String runtimeVersion;
    @XmlElement(name = "Hostname", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String hostname;
    @XmlElement(name = "Domainname", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String domainname;

    /**
     * Gets the value of the startedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartedAt() {
        return startedAt;
    }

    /**
     * Sets the value of the startedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartedAt(XMLGregorianCalendar value) {
        this.startedAt = value;
    }

    /**
     * Gets the value of the startupTime property.
     * 
     */
    public double getStartupTime() {
        return startupTime;
    }

    /**
     * Sets the value of the startupTime property.
     * 
     */
    public void setStartupTime(double value) {
        this.startupTime = value;
    }

    /**
     * Gets the value of the buildVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildVersion() {
        return buildVersion;
    }

    /**
     * Sets the value of the buildVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildVersion(String value) {
        this.buildVersion = value;
    }

    /**
     * Gets the value of the buildDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * Sets the value of the buildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildDate(String value) {
        this.buildDate = value;
    }

    /**
     * Gets the value of the runtimeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    /**
     * Sets the value of the runtimeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuntimeVersion(String value) {
        this.runtimeVersion = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the domainname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainname() {
        return domainname;
    }

    /**
     * Sets the value of the domainname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainname(String value) {
        this.domainname = value;
    }

}
