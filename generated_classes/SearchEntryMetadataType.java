
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchEntryMetadataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SearchEntryMetadataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CustomMetadata"/&gt;
 *     &lt;enumeration value="StandardMetadata"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchEntryMetadataType")
@XmlEnum
public enum SearchEntryMetadataType {

    @XmlEnumValue("CustomMetadata")
    CUSTOM_METADATA("CustomMetadata"),
    @XmlEnumValue("StandardMetadata")
    STANDARD_METADATA("StandardMetadata");
    private final String value;

    SearchEntryMetadataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchEntryMetadataType fromValue(String v) {
        for (SearchEntryMetadataType c: SearchEntryMetadataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
