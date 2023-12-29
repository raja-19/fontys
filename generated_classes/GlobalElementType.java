
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalElementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AssetType"/&gt;
 *     &lt;enumeration value="Channel"/&gt;
 *     &lt;enumeration value="ContainerType"/&gt;
 *     &lt;enumeration value="ContentStyle"/&gt;
 *     &lt;enumeration value="FlowType"/&gt;
 *     &lt;enumeration value="Format"/&gt;
 *     &lt;enumeration value="Mask"/&gt;
 *     &lt;enumeration value="MaskType"/&gt;
 *     &lt;enumeration value="PresentationStyle"/&gt;
 *     &lt;enumeration value="Role"/&gt;
 *     &lt;enumeration value="ProcessType"/&gt;
 *     &lt;enumeration value="Resource"/&gt;
 *     &lt;enumeration value="ServiceType"/&gt;
 *     &lt;enumeration value="ValidationRuleType"/&gt;
 *     &lt;enumeration value="CustomSchemaElement"/&gt;
 *     &lt;enumeration value="Team"/&gt;
 *     &lt;enumeration value="PortalMessage"/&gt;
 *     &lt;enumeration value="Parameter"/&gt;
 *     &lt;enumeration value="FieldType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalElementType")
@XmlEnum
public enum GlobalElementType {

    @XmlEnumValue("AssetType")
    ASSET_TYPE("AssetType"),
    @XmlEnumValue("Channel")
    CHANNEL("Channel"),
    @XmlEnumValue("ContainerType")
    CONTAINER_TYPE("ContainerType"),
    @XmlEnumValue("ContentStyle")
    CONTENT_STYLE("ContentStyle"),
    @XmlEnumValue("FlowType")
    FLOW_TYPE("FlowType"),
    @XmlEnumValue("Format")
    FORMAT("Format"),
    @XmlEnumValue("Mask")
    MASK("Mask"),
    @XmlEnumValue("MaskType")
    MASK_TYPE("MaskType"),
    @XmlEnumValue("PresentationStyle")
    PRESENTATION_STYLE("PresentationStyle"),
    @XmlEnumValue("Role")
    ROLE("Role"),
    @XmlEnumValue("ProcessType")
    PROCESS_TYPE("ProcessType"),
    @XmlEnumValue("Resource")
    RESOURCE("Resource"),
    @XmlEnumValue("ServiceType")
    SERVICE_TYPE("ServiceType"),
    @XmlEnumValue("ValidationRuleType")
    VALIDATION_RULE_TYPE("ValidationRuleType"),
    @XmlEnumValue("CustomSchemaElement")
    CUSTOM_SCHEMA_ELEMENT("CustomSchemaElement"),
    @XmlEnumValue("Team")
    TEAM("Team"),
    @XmlEnumValue("PortalMessage")
    PORTAL_MESSAGE("PortalMessage"),
    @XmlEnumValue("Parameter")
    PARAMETER("Parameter"),
    @XmlEnumValue("FieldType")
    FIELD_TYPE("FieldType");
    private final String value;

    GlobalElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalElementType fromValue(String v) {
        for (GlobalElementType c: GlobalElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
