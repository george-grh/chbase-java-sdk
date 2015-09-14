//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:43:24 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.weight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.WeightValue;
import com.microsoft.hsg.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:weight="urn:com.microsoft.wc.thing.weight"&gt;
 *                         A single weight measurement.
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
 *         &lt;element name="value" type="{urn:com.microsoft.wc.thing.types}weight-value"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "value" })
@XmlRootElement(name = "weight")
public class Weight {

	@XmlElement(required = true)
	protected DateTime when;
	@XmlElement(required = true)
	protected WeightValue value;

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
	 * @return possible object is {@link WeightValue }
	 * 
	 */
	public WeightValue getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link WeightValue }
	 * 
	 */
	public void setValue(WeightValue value) {
		this.value = value;
	}

}
