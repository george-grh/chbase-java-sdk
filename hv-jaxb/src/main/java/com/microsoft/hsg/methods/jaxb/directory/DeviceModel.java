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
import com.microsoft.hsg.thing.oxm.jaxb.types.CultureSpecificString255Nw;
import com.microsoft.hsg.thing.oxm.jaxb.types.CultureSpecificUrl;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.directory" xmlns:wc-application="urn:com.microsoft.wc.application" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *           The device model information.
 *         &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for DeviceModel complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="screenshots" type="{urn:com.microsoft.wc.directory}Screenshots" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.types}stringz128" minOccurs="0"/>
 *         &lt;element name="display-name" type="{urn:com.microsoft.wc.types}CultureSpecificString255nw" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purchase-url" type="{urn:com.microsoft.wc.types}CultureSpecificUrl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="windows-client-information" type="{urn:com.microsoft.wc.directory}WindowsClientInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceModel", propOrder = { "screenshots", "name", "displayName", "purchaseUrl",
		"windowsClientInformation" })
public class DeviceModel {

	protected Screenshots screenshots;
	protected String name;
	@XmlElement(name = "display-name")
	protected List<CultureSpecificString255Nw> displayName;
	@XmlElement(name = "purchase-url")
	protected List<CultureSpecificUrl> purchaseUrl;
	@XmlElement(name = "windows-client-information")
	protected WindowsClientInformation windowsClientInformation;

	/**
	 * Gets the value of the screenshots property.
	 * 
	 * @return possible object is {@link Screenshots }
	 * 
	 */
	public Screenshots getScreenshots() {
		return screenshots;
	}

	/**
	 * Sets the value of the screenshots property.
	 * 
	 * @param value
	 *            allowed object is {@link Screenshots }
	 * 
	 */
	public void setScreenshots(Screenshots value) {
		this.screenshots = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the displayName property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the displayName property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDisplayName().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificString255Nw }
	 * 
	 * 
	 */
	public List<CultureSpecificString255Nw> getDisplayName() {
		if (displayName == null) {
			displayName = new ArrayList<CultureSpecificString255Nw>();
		}
		return this.displayName;
	}

	/**
	 * Gets the value of the purchaseUrl property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the purchaseUrl property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPurchaseUrl().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificUrl }
	 * 
	 * 
	 */
	public List<CultureSpecificUrl> getPurchaseUrl() {
		if (purchaseUrl == null) {
			purchaseUrl = new ArrayList<CultureSpecificUrl>();
		}
		return this.purchaseUrl;
	}

	/**
	 * Gets the value of the windowsClientInformation property.
	 * 
	 * @return possible object is {@link WindowsClientInformation }
	 * 
	 */
	public WindowsClientInformation getWindowsClientInformation() {
		return windowsClientInformation;
	}

	/**
	 * Sets the value of the windowsClientInformation property.
	 * 
	 * @param value
	 *            allowed object is {@link WindowsClientInformation }
	 * 
	 */
	public void setWindowsClientInformation(WindowsClientInformation value) {
		this.windowsClientInformation = value;
	}

}
