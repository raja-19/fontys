
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoapVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SoapVersion"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Soap_1_1"/&gt;
 *     &lt;enumeration value="Soap_1_2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SoapVersion")
@XmlEnum
public enum SoapVersion {

    @XmlEnumValue("Soap_1_1")
    SOAP_1_1("Soap_1_1"),
    @XmlEnumValue("Soap_1_2")
    SOAP_1_2("Soap_1_2");
    private final String value;

    SoapVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoapVersion fromValue(String v) {
        for (SoapVersion c: SoapVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
