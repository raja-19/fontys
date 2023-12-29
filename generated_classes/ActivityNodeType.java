
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityNodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ActivityNodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Task"/&gt;
 *     &lt;enumeration value="Process"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActivityNodeType")
@XmlEnum
public enum ActivityNodeType {

    @XmlEnumValue("Task")
    TASK("Task"),
    @XmlEnumValue("Process")
    PROCESS("Process");
    private final String value;

    ActivityNodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityNodeType fromValue(String v) {
        for (ActivityNodeType c: ActivityNodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
