//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:38:07 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.aerobicweekly;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.AerobicSession;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:aw="urn:com.microsoft.wc.thing.aerobic-weekly" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Defines a weekly goal for aerobic exercise.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:aw="urn:com.microsoft.wc.thing.aerobic-weekly" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         The thing's effective_date metadata implies the date on which
 *                         this goal was initiated, for purposes of graphing, etc.
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
 *         &lt;element name="session" type="{urn:com.microsoft.wc.thing.types}aerobic-session"/>
 *         &lt;element name="recurrence" type="{urn:com.microsoft.wc.thing.types}positiveInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "session", "recurrence" })
@XmlRootElement(name = "aerobic-weekly")
public class AerobicWeekly {

	@XmlElement(required = true)
	protected AerobicSession session;
	protected int recurrence;

	/**
	 * Gets the value of the session property.
	 * 
	 * @return possible object is {@link AerobicSession }
	 * 
	 */
	public AerobicSession getSession() {
		return session;
	}

	/**
	 * Sets the value of the session property.
	 * 
	 * @param value
	 *            allowed object is {@link AerobicSession }
	 * 
	 */
	public void setSession(AerobicSession value) {
		this.session = value;
	}

	/**
	 * Gets the value of the recurrence property.
	 * 
	 */
	public int getRecurrence() {
		return recurrence;
	}

	/**
	 * Sets the value of the recurrence property.
	 * 
	 */
	public void setRecurrence(int value) {
		this.recurrence = value;
	}

}
