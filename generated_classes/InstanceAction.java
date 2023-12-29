
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstanceAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InstanceAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Clear"/&gt;
 *     &lt;enumeration value="NoClear"/&gt;
 *     &lt;enumeration value="Merge"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstanceAction")
@XmlEnum
public enum InstanceAction {

    @XmlEnumValue("Clear")
    CLEAR("Clear"),
    @XmlEnumValue("NoClear")
    NO_CLEAR("NoClear"),
    @XmlEnumValue("Merge")
    MERGE("Merge");
    private final String value;

    InstanceAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstanceAction fromValue(String v) {
        for (InstanceAction c: InstanceAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
