
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CaseDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Name"/&gt;
 *     &lt;enumeration value="CreationDate"/&gt;
 *     &lt;enumeration value="DisplayName"/&gt;
 *     &lt;enumeration value="Id"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CaseDataType")
@XmlEnum
public enum CaseDataType {

    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("CreationDate")
    CREATION_DATE("CreationDate"),
    @XmlEnumValue("DisplayName")
    DISPLAY_NAME("DisplayName"),
    @XmlEnumValue("Id")
    ID("Id");
    private final String value;

    CaseDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaseDataType fromValue(String v) {
        for (CaseDataType c: CaseDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
