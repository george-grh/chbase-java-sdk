//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:21:09 PM PST 
//

package com.microsoft.hsg.methods.jaxb.getthingtype.response;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetThingType" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     The version information for a single version of a thing type.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetThingType" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for VersionInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VersionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="version-type-id" use="required" type="{urn:com.microsoft.wc.types}guid" />
 *       &lt;attribute name="version-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version-sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionInfo")
public class VersionInfo {

	@XmlAttribute(name = "version-type-id", required = true)
	protected String versionTypeId;
	@XmlAttribute(name = "version-name", required = true)
	protected String versionName;
	@XmlAttribute(name = "version-sequence", required = true)
	protected BigInteger versionSequence;

	/**
	 * Gets the value of the versionTypeId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersionTypeId() {
		return versionTypeId;
	}

	/**
	 * Sets the value of the versionTypeId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersionTypeId(String value) {
		this.versionTypeId = value;
	}

	/**
	 * Gets the value of the versionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersionName() {
		return versionName;
	}

	/**
	 * Sets the value of the versionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersionName(String value) {
		this.versionName = value;
	}

	/**
	 * Gets the value of the versionSequence property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getVersionSequence() {
		return versionSequence;
	}

	/**
	 * Sets the value of the versionSequence property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setVersionSequence(BigInteger value) {
		this.versionSequence = value;
	}

}
