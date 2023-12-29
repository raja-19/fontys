
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Element"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalElement")
@XmlSeeAlso({
    ContainerType.class,
    PortalMessage.class,
    CustomSchemaElement.class,
    MaskType.class,
    ServiceType.class,
    ValidationRuleType.class,
    Format.class,
    ContentStyle.class,
    Mask.class,
    PresentationStyle.class,
    Channel.class,
    Team.class,
    AssetType.class,
    FlowType.class,
    Role.class,
    ProcessType.class,
    Resource.class,
    GlobalParameter.class,
    FieldType.class
})
public abstract class GlobalElement
    extends Element
{


}
