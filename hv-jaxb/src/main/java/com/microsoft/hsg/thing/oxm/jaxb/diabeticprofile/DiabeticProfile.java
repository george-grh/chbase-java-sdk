//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:39:47 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.diabeticprofile;

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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:g="urn:com.microsoft.wc.thing.diabetic-profile" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A summary of a person's diabetic condition.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:g="urn:com.microsoft.wc.thing.diabetic-profile" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A person's diabetic profile is made up of a set of
 *                         measurements that indicate the diabetic capabilities of the person.
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
 *         &lt;element name="max-HbA1C" type="{urn:com.microsoft.wc.thing.types}percentage" minOccurs="0"/>
 *         &lt;element name="target-glucose-zone-group" type="{urn:com.microsoft.wc.thing.diabetic-profile}TargetGlucoseZoneGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "when", "maxHbA1C", "targetGlucoseZoneGroup" })
@XmlRootElement(name = "diabetic-profile")
public class DiabeticProfile {

	@XmlElement(required = true)
	protected DateTime when;
	@XmlElement(name = "max-HbA1C")
	protected Double maxHbA1C;
	@XmlElement(name = "target-glucose-zone-group")
	protected List<TargetGlucoseZoneGroup> targetGlucoseZoneGroup;

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
	 * Gets the value of the maxHbA1C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getMaxHbA1C() {
		return maxHbA1C;
	}

	/**
	 * Sets the value of the maxHbA1C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setMaxHbA1C(Double value) {
		this.maxHbA1C = value;
	}

	/**
	 * Gets the value of the targetGlucoseZoneGroup property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the targetGlucoseZoneGroup property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTargetGlucoseZoneGroup().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TargetGlucoseZoneGroup }
	 * 
	 * 
	 */
	public List<TargetGlucoseZoneGroup> getTargetGlucoseZoneGroup() {
		if (targetGlucoseZoneGroup == null) {
			targetGlucoseZoneGroup = new ArrayList<TargetGlucoseZoneGroup>();
		}
		return this.targetGlucoseZoneGroup;
	}

}
