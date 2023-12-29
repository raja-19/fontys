
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchemaForm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SchemaForm"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unqualified"/&gt;
 *     &lt;enumeration value="Qualified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SchemaForm")
@XmlEnum
public enum SchemaForm {

    @XmlEnumValue("Unqualified")
    UNQUALIFIED("Unqualified"),
    @XmlEnumValue("Qualified")
    QUALIFIED("Qualified");
    private final String value;

    SchemaForm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchemaForm fromValue(String v) {
        for (SchemaForm c: SchemaForm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
