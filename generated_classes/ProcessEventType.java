
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProcessEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Plain"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Timer"/&gt;
 *     &lt;enumeration value="Exception"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessEventType")
@XmlEnum
public enum ProcessEventType {

    @XmlEnumValue("Plain")
    PLAIN("Plain"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Timer")
    TIMER("Timer"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception");
    private final String value;

    ProcessEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessEventType fromValue(String v) {
        for (ProcessEventType c: ProcessEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
