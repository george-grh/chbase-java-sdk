//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:41:29 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.labtestresults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.CodableValue;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:lab="urn:com.microsoft.wc.thing.lab-test-results" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     A range related to a specific test result.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for test-result-range complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="test-result-range">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="text" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="value" type="{urn:com.microsoft.wc.thing.lab-test-results}test-result-range-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test-result-range", propOrder = { "type", "text", "value" })
public class TestResultRange {

	@XmlElement(required = true)
	protected CodableValue type;
	@XmlElement(required = true)
	protected CodableValue text;
	protected TestResultRangeValue value;

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setType(CodableValue value) {
		this.type = value;
	}

	/**
	 * Gets the value of the text property.
	 * 
	 * @return possible object is {@link CodableValue }
	 * 
	 */
	public CodableValue getText() {
		return text;
	}

	/**
	 * Sets the value of the text property.
	 * 
	 * @param value
	 *            allowed object is {@link CodableValue }
	 * 
	 */
	public void setText(CodableValue value) {
		this.text = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link TestResultRangeValue }
	 * 
	 */
	public TestResultRangeValue getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link TestResultRangeValue }
	 * 
	 */
	public void setValue(TestResultRangeValue value) {
		this.value = value;
	}

}
