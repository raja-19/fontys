
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TaskDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Assignee"/&gt;
 *     &lt;enumeration value="Description"/&gt;
 *     &lt;enumeration value="TimeoutDate"/&gt;
 *     &lt;enumeration value="Name"/&gt;
 *     &lt;enumeration value="DisplayName"/&gt;
 *     &lt;enumeration value="StartDate"/&gt;
 *     &lt;enumeration value="Status"/&gt;
 *     &lt;enumeration value="Role"/&gt;
 *     &lt;enumeration value="Team"/&gt;
 *     &lt;enumeration value="DueDate"/&gt;
 *     &lt;enumeration value="Priority"/&gt;
 *     &lt;enumeration value="CaseId"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaskDataType")
@XmlEnum
public enum TaskDataType {

    @XmlEnumValue("Assignee")
    ASSIGNEE("Assignee"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("TimeoutDate")
    TIMEOUT_DATE("TimeoutDate"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("DisplayName")
    DISPLAY_NAME("DisplayName"),
    @XmlEnumValue("StartDate")
    START_DATE("StartDate"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Role")
    ROLE("Role"),
    @XmlEnumValue("Team")
    TEAM("Team"),
    @XmlEnumValue("DueDate")
    DUE_DATE("DueDate"),
    @XmlEnumValue("Priority")
    PRIORITY("Priority"),
    @XmlEnumValue("CaseId")
    CASE_ID("CaseId"),
    @XmlEnumValue("Required")
    REQUIRED("Required");
    private final String value;

    TaskDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskDataType fromValue(String v) {
        for (TaskDataType c: TaskDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
