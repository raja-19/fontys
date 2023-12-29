
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceMatchingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InstanceMatchingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Transfer"/&gt;
 *     &lt;enumeration value="Ignore"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstanceMatchingType")
@XmlEnum
public enum InstanceMatchingType {

    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    InstanceMatchingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstanceMatchingType fromValue(String v) {
        for (InstanceMatchingType c: InstanceMatchingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
