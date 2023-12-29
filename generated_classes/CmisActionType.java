
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmisActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CmisActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Store"/&gt;
 *     &lt;enumeration value="Update"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CmisActionType")
@XmlEnum
public enum CmisActionType {

    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("Update")
    UPDATE("Update");
    private final String value;

    CmisActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CmisActionType fromValue(String v) {
        for (CmisActionType c: CmisActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
