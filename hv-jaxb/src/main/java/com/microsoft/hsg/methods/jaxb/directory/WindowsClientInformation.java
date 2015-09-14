//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.microsoft.hsg.methods.jaxb.directory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.directory" xmlns:wc-application="urn:com.microsoft.wc.application" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *           the information required for windows clients in order to detect the device and install the appropriate driver for it.
 *         &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for WindowsClientInformation complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsClientInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device-class" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="hardware-id" type="{urn:com.microsoft.wc.types}stringnz"/>
 *         &lt;element name="installed-hardware-ids" type="{urn:com.microsoft.wc.directory}InstalledHardwareIds"/>
 *         &lt;element name="auto-detect-id" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="driver-package-arguments" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="driver-packages" type="{urn:com.microsoft.wc.directory}DriverPackages"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsClientInformation", propOrder = { "deviceClass", "hardwareId", "installedHardwareIds",
		"autoDetectId", "driverPackageArguments", "driverPackages" })
public class WindowsClientInformation {

	@XmlElement(name = "device-class")
	protected String deviceClass;
	@XmlElement(name = "hardware-id", required = true)
	protected String hardwareId;
	@XmlElement(name = "installed-hardware-ids", required = true)
	protected InstalledHardwareIds installedHardwareIds;
	@XmlElement(name = "auto-detect-id")
	protected String autoDetectId;
	@XmlElement(name = "driver-package-arguments")
	protected String driverPackageArguments;
	@XmlElement(name = "driver-packages", required = true)
	protected DriverPackages driverPackages;

	/**
	 * Gets the value of the deviceClass property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeviceClass() {
		return deviceClass;
	}

	/**
	 * Sets the value of the deviceClass property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeviceClass(String value) {
		this.deviceClass = value;
	}

	/**
	 * Gets the value of the hardwareId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHardwareId() {
		return hardwareId;
	}

	/**
	 * Sets the value of the hardwareId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHardwareId(String value) {
		this.hardwareId = value;
	}

	/**
	 * Gets the value of the installedHardwareIds property.
	 * 
	 * @return possible object is {@link InstalledHardwareIds }
	 * 
	 */
	public InstalledHardwareIds getInstalledHardwareIds() {
		return installedHardwareIds;
	}

	/**
	 * Sets the value of the installedHardwareIds property.
	 * 
	 * @param value
	 *            allowed object is {@link InstalledHardwareIds }
	 * 
	 */
	public void setInstalledHardwareIds(InstalledHardwareIds value) {
		this.installedHardwareIds = value;
	}

	/**
	 * Gets the value of the autoDetectId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAutoDetectId() {
		return autoDetectId;
	}

	/**
	 * Sets the value of the autoDetectId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAutoDetectId(String value) {
		this.autoDetectId = value;
	}

	/**
	 * Gets the value of the driverPackageArguments property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDriverPackageArguments() {
		return driverPackageArguments;
	}

	/**
	 * Sets the value of the driverPackageArguments property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDriverPackageArguments(String value) {
		this.driverPackageArguments = value;
	}

	/**
	 * Gets the value of the driverPackages property.
	 * 
	 * @return possible object is {@link DriverPackages }
	 * 
	 */
	public DriverPackages getDriverPackages() {
		return driverPackages;
	}

	/**
	 * Sets the value of the driverPackages property.
	 * 
	 * @param value
	 *            allowed object is {@link DriverPackages }
	 * 
	 */
	public void setDriverPackages(DriverPackages value) {
		this.driverPackages = value;
	}

}
