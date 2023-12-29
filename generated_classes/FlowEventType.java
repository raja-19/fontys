
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FlowEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Commit"/&gt;
 *     &lt;enumeration value="Rollback"/&gt;
 *     &lt;enumeration value="CommitSkipValidate"/&gt;
 *     &lt;enumeration value="Exception"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlowEventType")
@XmlEnum
public enum FlowEventType {

    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Rollback")
    ROLLBACK("Rollback"),
    @XmlEnumValue("CommitSkipValidate")
    COMMIT_SKIP_VALIDATE("CommitSkipValidate"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception");
    private final String value;

    FlowEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowEventType fromValue(String v) {
        for (FlowEventType c: FlowEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
