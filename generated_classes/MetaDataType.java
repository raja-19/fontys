
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MetaDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="Name"/&gt;
 *     &lt;enumeration value="DisplayName"/&gt;
 *     &lt;enumeration value="CreationDate"/&gt;
 *     &lt;enumeration value="CreatedByUsername"/&gt;
 *     &lt;enumeration value="CreatedByID"/&gt;
 *     &lt;enumeration value="LastUpdated"/&gt;
 *     &lt;enumeration value="LastUpdatedByID"/&gt;
 *     &lt;enumeration value="LastUpdatedByUsername"/&gt;
 *     &lt;enumeration value="Version"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MetaDataType")
@XmlEnum
public enum MetaDataType {

    ID("ID"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("DisplayName")
    DISPLAY_NAME("DisplayName"),
    @XmlEnumValue("CreationDate")
    CREATION_DATE("CreationDate"),
    @XmlEnumValue("CreatedByUsername")
    CREATED_BY_USERNAME("CreatedByUsername"),
    @XmlEnumValue("CreatedByID")
    CREATED_BY_ID("CreatedByID"),
    @XmlEnumValue("LastUpdated")
    LAST_UPDATED("LastUpdated"),
    @XmlEnumValue("LastUpdatedByID")
    LAST_UPDATED_BY_ID("LastUpdatedByID"),
    @XmlEnumValue("LastUpdatedByUsername")
    LAST_UPDATED_BY_USERNAME("LastUpdatedByUsername"),
    @XmlEnumValue("Version")
    VERSION("Version");
    private final String value;

    MetaDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetaDataType fromValue(String v) {
        for (MetaDataType c: MetaDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
