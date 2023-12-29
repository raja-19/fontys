
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ModuleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Interaction"/&gt;
 *     &lt;enumeration value="Configuration"/&gt;
 *     &lt;enumeration value="Process"/&gt;
 *     &lt;enumeration value="Specification"/&gt;
 *     &lt;enumeration value="Contract"/&gt;
 *     &lt;enumeration value="Dashboard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModuleType")
@XmlEnum
public enum ModuleType {

    @XmlEnumValue("Interaction")
    INTERACTION("Interaction"),
    @XmlEnumValue("Configuration")
    CONFIGURATION("Configuration"),
    @XmlEnumValue("Process")
    PROCESS("Process"),
    @XmlEnumValue("Specification")
    SPECIFICATION("Specification"),
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),
    @XmlEnumValue("Dashboard")
    DASHBOARD("Dashboard");
    private final String value;

    ModuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModuleType fromValue(String v) {
        for (ModuleType c: ModuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
