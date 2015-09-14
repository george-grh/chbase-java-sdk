//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:41:02 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.heartrate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.CodableValue;
import com.microsoft.hsg.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.heart-rate"&gt;
 *                         A measurement of the record owner's heart rate.
 *                     &lt;/summary&gt;
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="value" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt"/>
 *         &lt;element name="measurement-method" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="measurement-conditions" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="measurement-flags" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "value", "measurementMethod", "measurementConditions", "measurementFlags" })
@XmlRootElement(name = "heart-rate")
public class HeartRate {

	@XmlElement(required = true)
	protected DateTime when;
	protected int value;
	@XmlElement(name = "measurement-method")
	protected CodableValue measurementMethod;
	@XmlElement(name = "measurement-conditions")
	protected CodableValue measurementConditions;
	@XmlElement(name = "measurement-flags")
	protected CodableValue measurementFlags;

	/**
	 * Gets the value of the when property.
	 * 
	 * @return possible object is {@link DateTime }
	 * 
	 */
	public DateTime getWhen() {
		return when;
	}

	/**
	 * Sets the value of the when property.
	 * 
	 * @param value
	 *            allowed object is {@link DateTime }
	 * 
	 */
	public void setWhen(DateTime value) {
		this.when = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Gets the value of the measurementMethod property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getMeasurementMethod() {
		return measurementMethod;
	}

	/**
	 * Sets the value of the measurementMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setMeasurementMethod(CodableValue value) {
		this.measurementMethod = value;
	}

	/**
	 * Gets the value of the measurementConditions property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getMeasurementConditions() {
		return measurementConditions;
	}

	/**
	 * Sets the value of the measurementConditions property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setMeasurementConditions(CodableValue value) {
		this.measurementConditions = value;
	}

	/**
	 * Gets the value of the measurementFlags property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getMeasurementFlags() {
		return measurementFlags;
	}

	/**
	 * Sets the value of the measurementFlags property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setMeasurementFlags(CodableValue value) {
		this.measurementFlags = value;
	}

}
