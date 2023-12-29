
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessGatewayNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessGatewayNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ProcessNode"&gt;
 *       &lt;attribute name="GatewayType" use="required" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}GatewayType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessGatewayNode")
@XmlSeeAlso({
    ProcessJoinNode.class,
    ProcessSplitNode.class
})
public abstract class ProcessGatewayNode
    extends ProcessNode
{

    @XmlAttribute(name = "GatewayType", required = true)
    protected GatewayType gatewayType;

    /**
     * Gets the value of the gatewayType property.
     * 
     * @return
     *     possible object is
     *     {@link GatewayType }
     *     
     */
    public GatewayType getGatewayType() {
        return gatewayType;
    }

    /**
     * Sets the value of the gatewayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GatewayType }
     *     
     */
    public void setGatewayType(GatewayType value) {
        this.gatewayType = value;
    }

}
