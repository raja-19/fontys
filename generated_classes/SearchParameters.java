
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}SearchType"/&gt;
 *         &lt;element name="Repository" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Module" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ModuleKey" minOccurs="0"/&gt;
 *         &lt;element name="SearchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SearchInNames" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SearchInDependencies" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeGlobalElements" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeModuleElements" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FullText" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParameters", propOrder = {
    "searchType",
    "repository",
    "branch",
    "project",
    "module",
    "searchString",
    "searchInNames",
    "searchInDependencies",
    "includeGlobalElements",
    "includeModuleElements",
    "fullText",
    "caseSensitive"
})
public class SearchParameters {

    @XmlElement(name = "SearchType", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true)
    @XmlSchemaType(name = "string")
    protected SearchType searchType;
    @XmlElement(name = "Repository", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true, nillable = true)
    protected String repository;
    @XmlElement(name = "Branch", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0", required = true, nillable = true)
    protected String branch;
    @XmlElement(name = "Project", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String project;
    @XmlElement(name = "Module", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected ModuleKey module;
    @XmlElement(name = "SearchString", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected String searchString;
    @XmlElement(name = "SearchInNames", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean searchInNames;
    @XmlElement(name = "SearchInDependencies", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean searchInDependencies;
    @XmlElement(name = "IncludeGlobalElements", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean includeGlobalElements;
    @XmlElement(name = "IncludeModuleElements", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean includeModuleElements;
    @XmlElement(name = "FullText", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean fullText;
    @XmlElement(name = "CaseSensitive", namespace = "http://www.everest.nl/aquima/studio/ManagementService/1.0")
    protected boolean caseSensitive;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchType }
     *     
     */
    public SearchType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType }
     *     
     */
    public void setSearchType(SearchType value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepository(String value) {
        this.repository = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject(String value) {
        this.project = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKey }
     *     
     */
    public ModuleKey getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKey }
     *     
     */
    public void setModule(ModuleKey value) {
        this.module = value;
    }

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

    /**
     * Gets the value of the searchInNames property.
     * 
     */
    public boolean isSearchInNames() {
        return searchInNames;
    }

    /**
     * Sets the value of the searchInNames property.
     * 
     */
    public void setSearchInNames(boolean value) {
        this.searchInNames = value;
    }

    /**
     * Gets the value of the searchInDependencies property.
     * 
     */
    public boolean isSearchInDependencies() {
        return searchInDependencies;
    }

    /**
     * Sets the value of the searchInDependencies property.
     * 
     */
    public void setSearchInDependencies(boolean value) {
        this.searchInDependencies = value;
    }

    /**
     * Gets the value of the includeGlobalElements property.
     * 
     */
    public boolean isIncludeGlobalElements() {
        return includeGlobalElements;
    }

    /**
     * Sets the value of the includeGlobalElements property.
     * 
     */
    public void setIncludeGlobalElements(boolean value) {
        this.includeGlobalElements = value;
    }

    /**
     * Gets the value of the includeModuleElements property.
     * 
     */
    public boolean isIncludeModuleElements() {
        return includeModuleElements;
    }

    /**
     * Sets the value of the includeModuleElements property.
     * 
     */
    public void setIncludeModuleElements(boolean value) {
        this.includeModuleElements = value;
    }

    /**
     * Gets the value of the fullText property.
     * 
     */
    public boolean isFullText() {
        return fullText;
    }

    /**
     * Sets the value of the fullText property.
     * 
     */
    public void setFullText(boolean value) {
        this.fullText = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     */
    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     */
    public void setCaseSensitive(boolean value) {
        this.caseSensitive = value;
    }

}
