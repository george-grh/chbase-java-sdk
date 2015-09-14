//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:38:03 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.aerobicprofile;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.dates.DateTime;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.aerobic-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A summary of a person's aerobic condition.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.aerobic-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A person's aerobic profile is made up of a set of
 *                         measurements that indicate the aerobic capabilities of the person.
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
 *         &lt;element name="max-heartrate" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="resting-heartrate" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="anaerobic-threshold" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="VO2-max" type="{urn:com.microsoft.wc.thing.aerobic-profile}MaxVO2" minOccurs="0"/>
 *         &lt;element name="heartrate-zone-group" type="{urn:com.microsoft.wc.thing.aerobic-profile}HeartrateZoneGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "maxHeartrate", "restingHeartrate", "anaerobicThreshold", "vo2Max",
		"heartrateZoneGroup" })
@XmlRootElement(name = "aerobic-profile")
public class AerobicProfile {

	@XmlElement(required = true)
	protected DateTime when;
	@XmlElement(name = "max-heartrate")
	protected Integer maxHeartrate;
	@XmlElement(name = "resting-heartrate")
	protected Integer restingHeartrate;
	@XmlElement(name = "anaerobic-threshold")
	protected Integer anaerobicThreshold;
	@XmlElement(name = "VO2-max")
	protected MaxVO2 vo2Max;
	@XmlElement(name = "heartrate-zone-group")
	protected List<HeartrateZoneGroup> heartrateZoneGroup;

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
	 * Gets the value of the maxHeartrate property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMaxHeartrate() {
		return maxHeartrate;
	}

	/**
	 * Sets the value of the maxHeartrate property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMaxHeartrate(Integer value) {
		this.maxHeartrate = value;
	}

	/**
	 * Gets the value of the restingHeartrate property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRestingHeartrate() {
		return restingHeartrate;
	}

	/**
	 * Sets the value of the restingHeartrate property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRestingHeartrate(Integer value) {
		this.restingHeartrate = value;
	}

	/**
	 * Gets the value of the anaerobicThreshold property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAnaerobicThreshold() {
		return anaerobicThreshold;
	}

	/**
	 * Sets the value of the anaerobicThreshold property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAnaerobicThreshold(Integer value) {
		this.anaerobicThreshold = value;
	}

	/**
	 * Gets the value of the vo2Max property.
	 * 
	 * @return possible object is {@link MaxVO2 }
	 * 
	 */
	public MaxVO2 getVO2Max() {
		return vo2Max;
	}

	/**
	 * Sets the value of the vo2Max property.
	 * 
	 * @param value
	 *            allowed object is {@link MaxVO2 }
	 * 
	 */
	public void setVO2Max(MaxVO2 value) {
		this.vo2Max = value;
	}

	/**
	 * Gets the value of the heartrateZoneGroup property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the heartrateZoneGroup property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getHeartrateZoneGroup().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link HeartrateZoneGroup }
	 * 
	 * 
	 */
	public List<HeartrateZoneGroup> getHeartrateZoneGroup() {
		if (heartrateZoneGroup == null) {
			heartrateZoneGroup = new ArrayList<HeartrateZoneGroup>();
		}
		return this.heartrateZoneGroup;
	}

}
