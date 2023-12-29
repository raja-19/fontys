
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReevaluationEvent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReevaluationEvent"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OnCreation"/&gt;
 *     &lt;enumeration value="OnDomainChange"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReevaluationEvent")
@XmlEnum
public enum ReevaluationEvent {

    @XmlEnumValue("OnCreation")
    ON_CREATION("OnCreation"),
    @XmlEnumValue("OnDomainChange")
    ON_DOMAIN_CHANGE("OnDomainChange");
    private final String value;

    ReevaluationEvent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReevaluationEvent fromValue(String v) {
        for (ReevaluationEvent c: ReevaluationEvent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
