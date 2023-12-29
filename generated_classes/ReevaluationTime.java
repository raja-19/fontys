
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReevaluationTime.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReevaluationTime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Never"/&gt;
 *     &lt;enumeration value="EveryWeek"/&gt;
 *     &lt;enumeration value="EveryDay"/&gt;
 *     &lt;enumeration value="EveryHour"/&gt;
 *     &lt;enumeration value="EveryMinute"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReevaluationTime")
@XmlEnum
public enum ReevaluationTime {

    @XmlEnumValue("Never")
    NEVER("Never"),
    @XmlEnumValue("EveryWeek")
    EVERY_WEEK("EveryWeek"),
    @XmlEnumValue("EveryDay")
    EVERY_DAY("EveryDay"),
    @XmlEnumValue("EveryHour")
    EVERY_HOUR("EveryHour"),
    @XmlEnumValue("EveryMinute")
    EVERY_MINUTE("EveryMinute");
    private final String value;

    ReevaluationTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReevaluationTime fromValue(String v) {
        for (ReevaluationTime c: ReevaluationTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
