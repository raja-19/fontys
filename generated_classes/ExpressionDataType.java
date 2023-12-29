
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExpressionDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Entity"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="Number"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Percentage"/&gt;
 *     &lt;enumeration value="Currency"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExpressionDataType")
@XmlEnum
public enum ExpressionDataType {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Entity")
    ENTITY("Entity"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Percentage")
    PERCENTAGE("Percentage"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Integer")
    INTEGER("Integer");
    private final String value;

    ExpressionDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpressionDataType fromValue(String v) {
        for (ExpressionDataType c: ExpressionDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
