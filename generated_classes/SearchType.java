
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SearchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Branch"/&gt;
 *     &lt;enumeration value="ProjectStructure"/&gt;
 *     &lt;enumeration value="SingleProject"/&gt;
 *     &lt;enumeration value="ModuleScope"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchType")
@XmlEnum
public enum SearchType {

    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("ProjectStructure")
    PROJECT_STRUCTURE("ProjectStructure"),
    @XmlEnumValue("SingleProject")
    SINGLE_PROJECT("SingleProject"),
    @XmlEnumValue("ModuleScope")
    MODULE_SCOPE("ModuleScope");
    private final String value;

    SearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchType fromValue(String v) {
        for (SearchType c: SearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
