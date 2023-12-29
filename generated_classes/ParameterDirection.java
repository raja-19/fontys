
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParameterDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BiDirectional"/&gt;
 *     &lt;enumeration value="Input"/&gt;
 *     &lt;enumeration value="Output"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterDirection")
@XmlEnum
public enum ParameterDirection {

    @XmlEnumValue("BiDirectional")
    BI_DIRECTIONAL("BiDirectional"),
    @XmlEnumValue("Input")
    INPUT("Input"),
    @XmlEnumValue("Output")
    OUTPUT("Output");
    private final String value;

    ParameterDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterDirection fromValue(String v) {
        for (ParameterDirection c: ParameterDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
