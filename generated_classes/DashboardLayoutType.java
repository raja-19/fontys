
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardLayoutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DashboardLayoutType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SingleColumn"/&gt;
 *     &lt;enumeration value="TwoEqualColumns"/&gt;
 *     &lt;enumeration value="LeftSidebar"/&gt;
 *     &lt;enumeration value="RightSidebar"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DashboardLayoutType")
@XmlEnum
public enum DashboardLayoutType {

    @XmlEnumValue("SingleColumn")
    SINGLE_COLUMN("SingleColumn"),
    @XmlEnumValue("TwoEqualColumns")
    TWO_EQUAL_COLUMNS("TwoEqualColumns"),
    @XmlEnumValue("LeftSidebar")
    LEFT_SIDEBAR("LeftSidebar"),
    @XmlEnumValue("RightSidebar")
    RIGHT_SIDEBAR("RightSidebar");
    private final String value;

    DashboardLayoutType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DashboardLayoutType fromValue(String v) {
        for (DashboardLayoutType c: DashboardLayoutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
