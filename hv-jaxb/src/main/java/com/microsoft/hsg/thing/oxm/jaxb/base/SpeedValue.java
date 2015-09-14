//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;

 *                     A speed measurement.

 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;

 *                     A speed measurement consists of the value in meters per

 *                     second (m/s), which is the base unit of measurement for 

 *                     speed, and an optional display value. The display value 

 *                     is used to store the speed in the user's preference of

 *                     units. This avoids rounding errors when

 *                     converting to and back from m/s.

 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for speed-value complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="speed-value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meters-per-second" type="{urn:com.microsoft.wc.thing.types}positiveDouble"/>
 *         &lt;element name="display" type="{urn:com.microsoft.wc.thing.types}display-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "speed-value", propOrder = { "metersPerSecond", "display" })
public class SpeedValue {

	@XmlElement(name = "meters-per-second")
	protected double metersPerSecond;
	protected DisplayValue display;

	/**
	 * Gets the value of the metersPerSecond property.
	 * 
	 */
	public double getMetersPerSecond() {
		return metersPerSecond;
	}

	/**
	 * Sets the value of the metersPerSecond property.
	 * 
	 */
	public void setMetersPerSecond(double value) {
		this.metersPerSecond = value;
	}

	/**
	 * Gets the value of the display property.
	 * 
	 * @return possible object is {@link DisplayValue }
	 * 
	 */
	public DisplayValue getDisplay() {
		return display;
	}

	/**
	 * Sets the value of the display property.
	 * 
	 * @param value
	 *            allowed object is {@link DisplayValue }
	 * 
	 */
	public void setDisplay(DisplayValue value) {
		this.display = value;
	}

}
