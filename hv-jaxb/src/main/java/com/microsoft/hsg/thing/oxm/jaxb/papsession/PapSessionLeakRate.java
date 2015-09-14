//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:42:03 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.papsession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.FlowValue;

/**
 * <p>
 * Java class for pap-session-leak-rate complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="pap-session-leak-rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mean" type="{urn:com.microsoft.wc.thing.types}flow-value" minOccurs="0"/>
 *         &lt;element name="median" type="{urn:com.microsoft.wc.thing.types}flow-value" minOccurs="0"/>
 *         &lt;element name="maximum" type="{urn:com.microsoft.wc.thing.types}flow-value" minOccurs="0"/>
 *         &lt;element name="percentile-95th" type="{urn:com.microsoft.wc.thing.types}flow-value" minOccurs="0"/>
 *         &lt;element name="percentile-90th" type="{urn:com.microsoft.wc.thing.types}flow-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pap-session-leak-rate", propOrder = { "mean", "median", "maximum", "percentile95Th",
		"percentile90Th" })
public class PapSessionLeakRate {

	protected FlowValue mean;
	protected FlowValue median;
	protected FlowValue maximum;
	@XmlElement(name = "percentile-95th")
	protected FlowValue percentile95Th;
	@XmlElement(name = "percentile-90th")
	protected FlowValue percentile90Th;

	/**
	 * Gets the value of the mean property.
	 * 
	 * @return possible object is {@link FlowValue }
	 * 
	 */
	public FlowValue getMean() {
		return mean;
	}

	/**
	 * Sets the value of the mean property.
	 * 
	 * @param value
	 *            allowed object is {@link FlowValue }
	 * 
	 */
	public void setMean(FlowValue value) {
		this.mean = value;
	}

	/**
	 * Gets the value of the median property.
	 * 
	 * @return possible object is {@link FlowValue }
	 * 
	 */
	public FlowValue getMedian() {
		return median;
	}

	/**
	 * Sets the value of the median property.
	 * 
	 * @param value
	 *            allowed object is {@link FlowValue }
	 * 
	 */
	public void setMedian(FlowValue value) {
		this.median = value;
	}

	/**
	 * Gets the value of the maximum property.
	 * 
	 * @return possible object is {@link FlowValue }
	 * 
	 */
	public FlowValue getMaximum() {
		return maximum;
	}

	/**
	 * Sets the value of the maximum property.
	 * 
	 * @param value
	 *            allowed object is {@link FlowValue }
	 * 
	 */
	public void setMaximum(FlowValue value) {
		this.maximum = value;
	}

	/**
	 * Gets the value of the percentile95Th property.
	 * 
	 * @return possible object is {@link FlowValue }
	 * 
	 */
	public FlowValue getPercentile95Th() {
		return percentile95Th;
	}

	/**
	 * Sets the value of the percentile95Th property.
	 * 
	 * @param value
	 *            allowed object is {@link FlowValue }
	 * 
	 */
	public void setPercentile95Th(FlowValue value) {
		this.percentile95Th = value;
	}

	/**
	 * Gets the value of the percentile90Th property.
	 * 
	 * @return possible object is {@link FlowValue }
	 * 
	 */
	public FlowValue getPercentile90Th() {
		return percentile90Th;
	}

	/**
	 * Sets the value of the percentile90Th property.
	 * 
	 * @param value
	 *            allowed object is {@link FlowValue }
	 * 
	 */
	public void setPercentile90Th(FlowValue value) {
		this.percentile90Th = value;
	}

}
