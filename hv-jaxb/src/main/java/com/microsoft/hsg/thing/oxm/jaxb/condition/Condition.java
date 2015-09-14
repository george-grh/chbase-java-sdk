//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:39:28 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.condition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.CodableValue;
import com.microsoft.hsg.thing.oxm.jaxb.dates.ApproxDateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:c="urn:com.microsoft.wc.thing.condition" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Defines a single health or medical issue/problem.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:c="urn:com.microsoft.wc.thing.condition" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         CCR qualifiers and other notes should go in the
 *                         common/note section of the thing.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="onset-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="stop-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="stop-reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name", "onsetDate", "status", "stopDate", "stopReason" })
@XmlRootElement(name = "condition")
public class Condition {

	@XmlElement(required = true)
	protected CodableValue name;
	@XmlElement(name = "onset-date")
	protected ApproxDateTime onsetDate;
	protected CodableValue status;
	@XmlElement(name = "stop-date")
	protected ApproxDateTime stopDate;
	@XmlElement(name = "stop-reason")
	protected String stopReason;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setName(CodableValue value) {
		this.name = value;
	}

	/**
	 * Gets the value of the onsetDate property.
	 * 
	 * @return possible object is {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime getOnsetDate() {
		return onsetDate;
	}

	/**
	 * Sets the value of the onsetDate property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDateTime }
	 * 
	 */
	public void setOnsetDate(ApproxDateTime value) {
		this.onsetDate = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setStatus(CodableValue value) {
		this.status = value;
	}

	/**
	 * Gets the value of the stopDate property.
	 * 
	 * @return possible object is {@link ApproxDateTime }
	 * 
	 */
	public ApproxDateTime getStopDate() {
		return stopDate;
	}

	/**
	 * Sets the value of the stopDate property.
	 * 
	 * @param value
	 *            allowed object is {@link ApproxDateTime }
	 * 
	 */
	public void setStopDate(ApproxDateTime value) {
		this.stopDate = value;
	}

	/**
	 * Gets the value of the stopReason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStopReason() {
		return stopReason;
	}

	/**
	 * Sets the value of the stopReason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStopReason(String value) {
		this.stopReason = value;
	}

}
