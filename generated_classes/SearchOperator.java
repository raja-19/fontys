
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SearchOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Equals"/&gt;
 *     &lt;enumeration value="NotEquals"/&gt;
 *     &lt;enumeration value="LessThan"/&gt;
 *     &lt;enumeration value="LessThanOrEqual"/&gt;
 *     &lt;enumeration value="GreaterThan"/&gt;
 *     &lt;enumeration value="GreaterThanOrEqual"/&gt;
 *     &lt;enumeration value="Like"/&gt;
 *     &lt;enumeration value="NotLike"/&gt;
 *     &lt;enumeration value="In"/&gt;
 *     &lt;enumeration value="NotIn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchOperator")
@XmlEnum
public enum SearchOperator {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("NotEquals")
    NOT_EQUALS("NotEquals"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("LessThanOrEqual")
    LESS_THAN_OR_EQUAL("LessThanOrEqual"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("GreaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("GreaterThanOrEqual"),
    @XmlEnumValue("Like")
    LIKE("Like"),
    @XmlEnumValue("NotLike")
    NOT_LIKE("NotLike"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("NotIn")
    NOT_IN("NotIn");
    private final String value;

    SearchOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchOperator fromValue(String v) {
        for (SearchOperator c: SearchOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
