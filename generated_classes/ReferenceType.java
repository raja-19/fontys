
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReferenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Expression"/&gt;
 *     &lt;enumeration value="DynamicText"/&gt;
 *     &lt;enumeration value="Type"/&gt;
 *     &lt;enumeration value="Usage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReferenceType")
@XmlEnum
public enum ReferenceType {

    @XmlEnumValue("Expression")
    EXPRESSION("Expression"),
    @XmlEnumValue("DynamicText")
    DYNAMIC_TEXT("DynamicText"),
    @XmlEnumValue("Type")
    TYPE("Type"),
    @XmlEnumValue("Usage")
    USAGE("Usage");
    private final String value;

    ReferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferenceType fromValue(String v) {
        for (ReferenceType c: ReferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
