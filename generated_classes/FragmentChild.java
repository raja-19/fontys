
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FragmentChild complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FragmentChild"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fragment" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}Fragment" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FragmentChild", propOrder = {
    "fragment"
})
public class FragmentChild {

    @XmlElement(name = "Fragment")
    protected Fragment fragment;

    /**
     * Gets the value of the fragment property.
     * 
     * @return
     *     possible object is
     *     {@link Fragment }
     *     
     */
    public Fragment getFragment() {
        return fragment;
    }

    /**
     * Sets the value of the fragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fragment }
     *     
     */
    public void setFragment(Fragment value) {
        this.fragment = value;
    }

}
