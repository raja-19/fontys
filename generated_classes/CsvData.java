
package com.cet.managementservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CsvData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CsvData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ResourceData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ColumnDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="TextQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="Charset" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/&gt;
 *         &lt;element name="Columns" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ArrayOfCsvDataColumn" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ColumnDelimiterType" type="{http://www.everest.nl/aquima/studio/ManagementService/1.0}ColumnDelimiterType" /&gt;
 *       &lt;attribute name="ExternalData" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SkipFirstRow" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CsvData", propOrder = {
    "data",
    "columnDelimiter",
    "textQualifier",
    "charset",
    "columns"
})
public class CsvData
    extends ResourceData
{

    @XmlElement(name = "Data")
    protected byte[] data;
    @XmlElement(name = "ColumnDelimiter")
    protected String columnDelimiter;
    @XmlElement(name = "TextQualifier")
    protected String textQualifier;
    @XmlElement(name = "Charset", required = true, nillable = true)
    protected String charset;
    @XmlElement(name = "Columns")
    protected ArrayOfCsvDataColumn columns;
    @XmlAttribute(name = "ColumnDelimiterType")
    protected ColumnDelimiterType columnDelimiterType;
    @XmlAttribute(name = "ExternalData")
    protected Boolean externalData;
    @XmlAttribute(name = "SkipFirstRow")
    protected Boolean skipFirstRow;
    @XmlAttribute(name = "FileName")
    protected String fileName;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the columnDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnDelimiter() {
        return columnDelimiter;
    }

    /**
     * Sets the value of the columnDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnDelimiter(String value) {
        this.columnDelimiter = value;
    }

    /**
     * Gets the value of the textQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextQualifier() {
        return textQualifier;
    }

    /**
     * Sets the value of the textQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextQualifier(String value) {
        this.textQualifier = value;
    }

    /**
     * Gets the value of the charset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharset() {
        return charset;
    }

    /**
     * Sets the value of the charset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharset(String value) {
        this.charset = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCsvDataColumn }
     *     
     */
    public ArrayOfCsvDataColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCsvDataColumn }
     *     
     */
    public void setColumns(ArrayOfCsvDataColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the columnDelimiterType property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnDelimiterType }
     *     
     */
    public ColumnDelimiterType getColumnDelimiterType() {
        return columnDelimiterType;
    }

    /**
     * Sets the value of the columnDelimiterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnDelimiterType }
     *     
     */
    public void setColumnDelimiterType(ColumnDelimiterType value) {
        this.columnDelimiterType = value;
    }

    /**
     * Gets the value of the externalData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalData() {
        return externalData;
    }

    /**
     * Sets the value of the externalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalData(Boolean value) {
        this.externalData = value;
    }

    /**
     * Gets the value of the skipFirstRow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipFirstRow() {
        return skipFirstRow;
    }

    /**
     * Sets the value of the skipFirstRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipFirstRow(Boolean value) {
        this.skipFirstRow = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
