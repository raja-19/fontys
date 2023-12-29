
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceActivationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InstanceActivationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Before"/&gt;
 *     &lt;enumeration value="After"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstanceActivationType")
@XmlEnum
public enum InstanceActivationType {

    @XmlEnumValue("Before")
    BEFORE("Before"),
    @XmlEnumValue("After")
    AFTER("After");
    private final String value;

    InstanceActivationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstanceActivationType fromValue(String v) {
        for (InstanceActivationType c: InstanceActivationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
