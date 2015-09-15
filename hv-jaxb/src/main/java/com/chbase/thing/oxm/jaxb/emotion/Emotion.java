//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:40:02 AM PST 
//

package com.chbase.thing.oxm.jaxb.emotion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.chbase.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:e="urn:com.microsoft.wc.thing.emotion" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A subjective record of an emotional state.
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
 *         &lt;element name="mood" type="{urn:com.microsoft.wc.thing.types}one-to-five" minOccurs="0"/>
 *         &lt;element name="stress" type="{urn:com.microsoft.wc.thing.types}one-to-five" minOccurs="0"/>
 *         &lt;element name="wellbeing" type="{urn:com.microsoft.wc.thing.types}one-to-five" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "mood", "stress", "wellbeing" })
@XmlRootElement(name = "emotion")
public class Emotion {
	public static String typeId = "4b7971d6-e427-427d-bf2c-2fbcf76606b3";

	@XmlElement(required = true)
	protected DateTime when;
	protected Integer mood;
	protected Integer stress;
	protected Integer wellbeing;

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
	 * Gets the value of the mood property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMood() {
		return mood;
	}

	/**
	 * Sets the value of the mood property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMood(Integer value) {
		this.mood = value;
	}

	/**
	 * Gets the value of the stress property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getStress() {
		return stress;
	}

	/**
	 * Sets the value of the stress property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setStress(Integer value) {
		this.stress = value;
	}

	/**
	 * Gets the value of the wellbeing property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getWellbeing() {
		return wellbeing;
	}

	/**
	 * Sets the value of the wellbeing property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setWellbeing(Integer value) {
		this.wellbeing = value;
	}

}
