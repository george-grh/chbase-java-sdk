//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:42:35 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.problem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.CodableValue;
import com.microsoft.hsg.thing.oxm.jaxb.base.DurationValue;
import com.microsoft.hsg.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:prob="urn:com.microsoft.wc.thing.problem" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Information related to a medical problem (please see remarks).
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:prob="urn:com.microsoft.wc.thing.problem" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Note: 
 *                         We are in the process of merging the problem and condition types, and
 *                         recommend that applications use the condition type instead of the problem type. 
 * 
 *                         This thing type describes the medical problem of a person.
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="diagnosis" type="{urn:com.microsoft.wc.thing.types}codable-value" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="duration" type="{urn:com.microsoft.wc.thing.types}duration-value" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="importance" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{urn:com.microsoft.wc.thing.types}positiveInt">
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "diagnosis", "duration", "importance" })
@XmlRootElement(name = "problem")
public class Problem {

	@XmlElement(required = true)
	protected DateTime when;
	protected List<CodableValue> diagnosis;
	protected List<DurationValue> duration;
	protected Integer importance;

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
	 * Gets the value of the diagnosis property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the diagnosis property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDiagnosis().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodableValue }
	 * 
	 * 
	 */
	public List<CodableValue> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new ArrayList<CodableValue>();
		}
		return this.diagnosis;
	}

	/**
	 * Gets the value of the duration property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the duration property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDuration().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DurationValue }
	 * 
	 * 
	 */
	public List<DurationValue> getDuration() {
		if (duration == null) {
			duration = new ArrayList<DurationValue>();
		}
		return this.duration;
	}

	/**
	 * Gets the value of the importance property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getImportance() {
		return importance;
	}

	/**
	 * Sets the value of the importance property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setImportance(Integer value) {
		this.importance = value;
	}

}
