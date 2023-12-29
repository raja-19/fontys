
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GatewayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GatewayType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Xor"/&gt;
 *     &lt;enumeration value="Parallel"/&gt;
 *     &lt;enumeration value="InclusiveOr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GatewayType")
@XmlEnum
public enum GatewayType {

    @XmlEnumValue("Xor")
    XOR("Xor"),
    @XmlEnumValue("Parallel")
    PARALLEL("Parallel"),
    @XmlEnumValue("InclusiveOr")
    INCLUSIVE_OR("InclusiveOr");
    private final String value;

    GatewayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GatewayType fromValue(String v) {
        for (GatewayType c: GatewayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
