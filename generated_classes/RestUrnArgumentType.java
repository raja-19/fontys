
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestUrnArgumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RestUrnArgumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Constant"/&gt;
 *     &lt;enumeration value="Dynamic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RestUrnArgumentType")
@XmlEnum
public enum RestUrnArgumentType {

    @XmlEnumValue("Constant")
    CONSTANT("Constant"),
    @XmlEnumValue("Dynamic")
    DYNAMIC("Dynamic");
    private final String value;

    RestUrnArgumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestUrnArgumentType fromValue(String v) {
        for (RestUrnArgumentType c: RestUrnArgumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
