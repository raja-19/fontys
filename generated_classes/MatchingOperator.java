
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchingOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MatchingOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Equal"/&gt;
 *     &lt;enumeration value="NotEqual"/&gt;
 *     &lt;enumeration value="GreaterThan"/&gt;
 *     &lt;enumeration value="LessThan"/&gt;
 *     &lt;enumeration value="LessOrEqualThan"/&gt;
 *     &lt;enumeration value="GreaterOrEqualThan"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MatchingOperator")
@XmlEnum
public enum MatchingOperator {

    @XmlEnumValue("Equal")
    EQUAL("Equal"),
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("LessOrEqualThan")
    LESS_OR_EQUAL_THAN("LessOrEqualThan"),
    @XmlEnumValue("GreaterOrEqualThan")
    GREATER_OR_EQUAL_THAN("GreaterOrEqualThan");
    private final String value;

    MatchingOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchingOperator fromValue(String v) {
        for (MatchingOperator c: MatchingOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
