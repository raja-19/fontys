
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeIcon.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NodeIcon"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Alarm"/&gt;
 *     &lt;enumeration value="Balance"/&gt;
 *     &lt;enumeration value="Bank"/&gt;
 *     &lt;enumeration value="Basket"/&gt;
 *     &lt;enumeration value="Binoculars"/&gt;
 *     &lt;enumeration value="bug1"/&gt;
 *     &lt;enumeration value="bug2"/&gt;
 *     &lt;enumeration value="Calculator"/&gt;
 *     &lt;enumeration value="Calender_Day"/&gt;
 *     &lt;enumeration value="car"/&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="Clock"/&gt;
 *     &lt;enumeration value="Company"/&gt;
 *     &lt;enumeration value="Court"/&gt;
 *     &lt;enumeration value="Credit_Card"/&gt;
 *     &lt;enumeration value="Database_Red"/&gt;
 *     &lt;enumeration value="Database_Yellow"/&gt;
 *     &lt;enumeration value="Delete_2_R"/&gt;
 *     &lt;enumeration value="File"/&gt;
 *     &lt;enumeration value="File_Left"/&gt;
 *     &lt;enumeration value="File_Right"/&gt;
 *     &lt;enumeration value="Filter"/&gt;
 *     &lt;enumeration value="Folder_Yellow3"/&gt;
 *     &lt;enumeration value="Folder_Yellow_Closed"/&gt;
 *     &lt;enumeration value="Ghost"/&gt;
 *     &lt;enumeration value="Home"/&gt;
 *     &lt;enumeration value="Hospital_Building"/&gt;
 *     &lt;enumeration value="information"/&gt;
 *     &lt;enumeration value="Insert_2_Y"/&gt;
 *     &lt;enumeration value="Journal"/&gt;
 *     &lt;enumeration value="Key"/&gt;
 *     &lt;enumeration value="Lens_Blue"/&gt;
 *     &lt;enumeration value="Lock_Secure"/&gt;
 *     &lt;enumeration value="Mail_Send_Receive"/&gt;
 *     &lt;enumeration value="Office_Phone"/&gt;
 *     &lt;enumeration value="owl"/&gt;
 *     &lt;enumeration value="Postcode"/&gt;
 *     &lt;enumeration value="Post_1_G"/&gt;
 *     &lt;enumeration value="Printer"/&gt;
 *     &lt;enumeration value="Productivity"/&gt;
 *     &lt;enumeration value="Receptionist_Man_Black_B"/&gt;
 *     &lt;enumeration value="Recycle_Bin_Empty"/&gt;
 *     &lt;enumeration value="Reports"/&gt;
 *     &lt;enumeration value="Save"/&gt;
 *     &lt;enumeration value="Shipping_Transport_Many"/&gt;
 *     &lt;enumeration value="Spider"/&gt;
 *     &lt;enumeration value="Strongbox"/&gt;
 *     &lt;enumeration value="Thesaurus_2"/&gt;
 *     &lt;enumeration value="Tool_Set"/&gt;
 *     &lt;enumeration value="Traffic_Bulb"/&gt;
 *     &lt;enumeration value="Users"/&gt;
 *     &lt;enumeration value="User_Man"/&gt;
 *     &lt;enumeration value="User_Woman"/&gt;
 *     &lt;enumeration value="WorkStation"/&gt;
 *     &lt;enumeration value="IntermediateMessage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeIcon")
@XmlEnum
public enum NodeIcon {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),
    @XmlEnumValue("Balance")
    BALANCE("Balance"),
    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("Basket")
    BASKET("Basket"),
    @XmlEnumValue("Binoculars")
    BINOCULARS("Binoculars"),
    @XmlEnumValue("bug1")
    BUG_1("bug1"),
    @XmlEnumValue("bug2")
    BUG_2("bug2"),
    @XmlEnumValue("Calculator")
    CALCULATOR("Calculator"),
    @XmlEnumValue("Calender_Day")
    CALENDER_DAY("Calender_Day"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Clock")
    CLOCK("Clock"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Court")
    COURT("Court"),
    @XmlEnumValue("Credit_Card")
    CREDIT_CARD("Credit_Card"),
    @XmlEnumValue("Database_Red")
    DATABASE_RED("Database_Red"),
    @XmlEnumValue("Database_Yellow")
    DATABASE_YELLOW("Database_Yellow"),
    @XmlEnumValue("Delete_2_R")
    DELETE_2_R("Delete_2_R"),
    @XmlEnumValue("File")
    FILE("File"),
    @XmlEnumValue("File_Left")
    FILE_LEFT("File_Left"),
    @XmlEnumValue("File_Right")
    FILE_RIGHT("File_Right"),
    @XmlEnumValue("Filter")
    FILTER("Filter"),
    @XmlEnumValue("Folder_Yellow3")
    FOLDER_YELLOW_3("Folder_Yellow3"),
    @XmlEnumValue("Folder_Yellow_Closed")
    FOLDER_YELLOW_CLOSED("Folder_Yellow_Closed"),
    @XmlEnumValue("Ghost")
    GHOST("Ghost"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Hospital_Building")
    HOSPITAL_BUILDING("Hospital_Building"),
    @XmlEnumValue("information")
    INFORMATION("information"),
    @XmlEnumValue("Insert_2_Y")
    INSERT_2_Y("Insert_2_Y"),
    @XmlEnumValue("Journal")
    JOURNAL("Journal"),
    @XmlEnumValue("Key")
    KEY("Key"),
    @XmlEnumValue("Lens_Blue")
    LENS_BLUE("Lens_Blue"),
    @XmlEnumValue("Lock_Secure")
    LOCK_SECURE("Lock_Secure"),
    @XmlEnumValue("Mail_Send_Receive")
    MAIL_SEND_RECEIVE("Mail_Send_Receive"),
    @XmlEnumValue("Office_Phone")
    OFFICE_PHONE("Office_Phone"),
    @XmlEnumValue("owl")
    OWL("owl"),
    @XmlEnumValue("Postcode")
    POSTCODE("Postcode"),
    @XmlEnumValue("Post_1_G")
    POST_1_G("Post_1_G"),
    @XmlEnumValue("Printer")
    PRINTER("Printer"),
    @XmlEnumValue("Productivity")
    PRODUCTIVITY("Productivity"),
    @XmlEnumValue("Receptionist_Man_Black_B")
    RECEPTIONIST_MAN_BLACK_B("Receptionist_Man_Black_B"),
    @XmlEnumValue("Recycle_Bin_Empty")
    RECYCLE_BIN_EMPTY("Recycle_Bin_Empty"),
    @XmlEnumValue("Reports")
    REPORTS("Reports"),
    @XmlEnumValue("Save")
    SAVE("Save"),
    @XmlEnumValue("Shipping_Transport_Many")
    SHIPPING_TRANSPORT_MANY("Shipping_Transport_Many"),
    @XmlEnumValue("Spider")
    SPIDER("Spider"),
    @XmlEnumValue("Strongbox")
    STRONGBOX("Strongbox"),
    @XmlEnumValue("Thesaurus_2")
    THESAURUS_2("Thesaurus_2"),
    @XmlEnumValue("Tool_Set")
    TOOL_SET("Tool_Set"),
    @XmlEnumValue("Traffic_Bulb")
    TRAFFIC_BULB("Traffic_Bulb"),
    @XmlEnumValue("Users")
    USERS("Users"),
    @XmlEnumValue("User_Man")
    USER_MAN("User_Man"),
    @XmlEnumValue("User_Woman")
    USER_WOMAN("User_Woman"),
    @XmlEnumValue("WorkStation")
    WORK_STATION("WorkStation"),
    @XmlEnumValue("IntermediateMessage")
    INTERMEDIATE_MESSAGE("IntermediateMessage");
    private final String value;

    NodeIcon(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeIcon fromValue(String v) {
        for (NodeIcon c: NodeIcon.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
