
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionNodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ActionNodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Page"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="Flow"/&gt;
 *     &lt;enumeration value="Function"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionNodeType")
@XmlEnum
public enum ActionNodeType {

    @XmlEnumValue("Page")
    PAGE("Page"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Flow")
    FLOW("Flow"),
    @XmlEnumValue("Function")
    FUNCTION("Function");
    private final String value;

    ActionNodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionNodeType fromValue(String v) {
        for (ActionNodeType c: ActionNodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
