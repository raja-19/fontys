
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalParameterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Primitive"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalParameterType")
@XmlEnum
public enum GlobalParameterType {

    @XmlEnumValue("Primitive")
    PRIMITIVE("Primitive"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    GlobalParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalParameterType fromValue(String v) {
        for (GlobalParameterType c: GlobalParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
