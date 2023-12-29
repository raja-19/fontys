
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalMessageNodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExternalMessageNodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Outgoing"/&gt;
 *     &lt;enumeration value="Incoming"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalMessageNodeType")
@XmlEnum
public enum ExternalMessageNodeType {

    @XmlEnumValue("Outgoing")
    OUTGOING("Outgoing"),
    @XmlEnumValue("Incoming")
    INCOMING("Incoming");
    private final String value;

    ExternalMessageNodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalMessageNodeType fromValue(String v) {
        for (ExternalMessageNodeType c: ExternalMessageNodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
