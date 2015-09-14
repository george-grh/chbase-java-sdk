//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.microsoft.hsg.methods.jaxb.directory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.types.CultureSpecificUrl;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.directory" xmlns:wc-application="urn:com.microsoft.wc.application" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *           Information on the driver package.
 *         &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for DriverPackage complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DriverPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="platforms" type="{urn:com.microsoft.wc.directory}Platforms"/>
 *         &lt;element name="driver-package-url" type="{urn:com.microsoft.wc.types}CultureSpecificUrl" maxOccurs="unbounded"/>
 *         &lt;element name="default-arguments" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="instructions-url" type="{urn:com.microsoft.wc.types}CultureSpecificUrl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="validation-code" type="{urn:com.microsoft.wc.types}string255nw" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverPackage", propOrder = { "platforms", "driverPackageUrl", "defaultArguments", "instructionsUrl",
		"validationCode" })
public class DriverPackage {

	@XmlElement(required = true)
	protected Platforms platforms;
	@XmlElement(name = "driver-package-url", required = true)
	protected List<CultureSpecificUrl> driverPackageUrl;
	@XmlElement(name = "default-arguments")
	protected String defaultArguments;
	@XmlElement(name = "instructions-url")
	protected List<CultureSpecificUrl> instructionsUrl;
	@XmlElement(name = "validation-code")
	protected String validationCode;

	/**
	 * Gets the value of the platforms property.
	 * 
	 * @return possible object is {@link Platforms }
	 * 
	 */
	public Platforms getPlatforms() {
		return platforms;
	}

	/**
	 * Sets the value of the platforms property.
	 * 
	 * @param value
	 *            allowed object is {@link Platforms }
	 * 
	 */
	public void setPlatforms(Platforms value) {
		this.platforms = value;
	}

	/**
	 * Gets the value of the driverPackageUrl property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the driverPackageUrl property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDriverPackageUrl().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificUrl }
	 * 
	 * 
	 */
	public List<CultureSpecificUrl> getDriverPackageUrl() {
		if (driverPackageUrl == null) {
			driverPackageUrl = new ArrayList<CultureSpecificUrl>();
		}
		return this.driverPackageUrl;
	}

	/**
	 * Gets the value of the defaultArguments property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefaultArguments() {
		return defaultArguments;
	}

	/**
	 * Sets the value of the defaultArguments property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDefaultArguments(String value) {
		this.defaultArguments = value;
	}

	/**
	 * Gets the value of the instructionsUrl property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the instructionsUrl property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInstructionsUrl().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificUrl }
	 * 
	 * 
	 */
	public List<CultureSpecificUrl> getInstructionsUrl() {
		if (instructionsUrl == null) {
			instructionsUrl = new ArrayList<CultureSpecificUrl>();
		}
		return this.instructionsUrl;
	}

	/**
	 * Gets the value of the validationCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidationCode() {
		return validationCode;
	}

	/**
	 * Sets the value of the validationCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidationCode(String value) {
		this.validationCode = value;
	}

}
