
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnDelimiterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ColumnDelimiterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Delimited"/&gt;
 *     &lt;enumeration value="FixedWidth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ColumnDelimiterType")
@XmlEnum
public enum ColumnDelimiterType {

    @XmlEnumValue("Delimited")
    DELIMITED("Delimited"),
    @XmlEnumValue("FixedWidth")
    FIXED_WIDTH("FixedWidth");
    private final String value;

    ColumnDelimiterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColumnDelimiterType fromValue(String v) {
        for (ColumnDelimiterType c: ColumnDelimiterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
