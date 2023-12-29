
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommunicationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Xsd"/&gt;
 *     &lt;enumeration value="DomainSchema"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommunicationType")
@XmlEnum
public enum CommunicationType {

    @XmlEnumValue("Xsd")
    XSD("Xsd"),
    @XmlEnumValue("DomainSchema")
    DOMAIN_SCHEMA("DomainSchema");
    private final String value;

    CommunicationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationType fromValue(String v) {
        for (CommunicationType c: CommunicationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
