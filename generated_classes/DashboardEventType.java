
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DashboardEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OpenCase"/&gt;
 *     &lt;enumeration value="StartCase"/&gt;
 *     &lt;enumeration value="StartTask"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DashboardEventType")
@XmlEnum
public enum DashboardEventType {

    @XmlEnumValue("OpenCase")
    OPEN_CASE("OpenCase"),
    @XmlEnumValue("StartCase")
    START_CASE("StartCase"),
    @XmlEnumValue("StartTask")
    START_TASK("StartTask");
    private final String value;

    DashboardEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DashboardEventType fromValue(String v) {
        for (DashboardEventType c: DashboardEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
