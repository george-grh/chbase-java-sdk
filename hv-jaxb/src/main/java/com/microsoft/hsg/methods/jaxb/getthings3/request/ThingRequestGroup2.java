//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 09:50:38 PM PDT 
//

package com.microsoft.hsg.methods.jaxb.getthings3.request;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.thing.ThingKey;

/**
 * <p>
 * Java class for ThingRequestGroup2 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ThingRequestGroup2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="id" type="{urn:com.microsoft.wc.types}guid" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="key" type="{urn:com.microsoft.wc.thing}ThingKey" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="client-thing-id" type="{urn:com.microsoft.wc.types}string255" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="filter" type="{urn:com.microsoft.wc.methods.GetThings}ThingFilterSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="format" type="{urn:com.microsoft.wc.methods.GetThings3}ThingFormatSpec2"/>
 *         &lt;element name="current-version-only" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="max-full" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThingRequestGroup2", propOrder = { "id", "key", "clientThingId", "filter", "format",
		"currentVersionOnly" })
public class ThingRequestGroup2 {

	protected List<String> id;
	protected List<ThingKey> key;
	@XmlElement(name = "client-thing-id")
	protected List<String> clientThingId;
	protected List<ThingFilterSpec> filter;
	@XmlElement(required = true)
	protected ThingFormatSpec2 format;
	@XmlElement(name = "current-version-only")
	protected Boolean currentVersionOnly;
	@XmlAttribute(name = "name")
	protected String name;
	@XmlAttribute(name = "max")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger max;
	@XmlAttribute(name = "max-full")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger maxFull;

	/**
	 * Gets the value of the id property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the id property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getId().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getId() {
		if (id == null) {
			id = new ArrayList<String>();
		}
		return this.id;
	}

	/**
	 * Gets the value of the key property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the key property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getKey().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ThingKey
	 * }
	 * 
	 * 
	 */
	public List<ThingKey> getKey() {
		if (key == null) {
			key = new ArrayList<ThingKey>();
		}
		return this.key;
	}

	/**
	 * Gets the value of the clientThingId property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the clientThingId property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getClientThingId().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getClientThingId() {
		if (clientThingId == null) {
			clientThingId = new ArrayList<String>();
		}
		return this.clientThingId;
	}

	/**
	 * Gets the value of the filter property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the filter property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFilter().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ThingFilterSpec }
	 * 
	 * 
	 */
	public List<ThingFilterSpec> getFilter() {
		if (filter == null) {
			filter = new ArrayList<ThingFilterSpec>();
		}
		return this.filter;
	}

	/**
	 * Gets the value of the format property.
	 * 
	 * @return possible object is {@link ThingFormatSpec2 }
	 * 
	 */
	public ThingFormatSpec2 getFormat() {
		return format;
	}

	/**
	 * Sets the value of the format property.
	 * 
	 * @param value
	 *            allowed object is {@link ThingFormatSpec2 }
	 * 
	 */
	public void setFormat(ThingFormatSpec2 value) {
		this.format = value;
	}

	/**
	 * Gets the value of the currentVersionOnly property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCurrentVersionOnly() {
		return currentVersionOnly;
	}

	/**
	 * Sets the value of the currentVersionOnly property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCurrentVersionOnly(Boolean value) {
		this.currentVersionOnly = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the max property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getMax() {
		return max;
	}

	/**
	 * Sets the value of the max property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setMax(BigInteger value) {
		this.max = value;
	}

	/**
	 * Gets the value of the maxFull property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getMaxFull() {
		return maxFull;
	}

	/**
	 * Sets the value of the maxFull property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setMaxFull(BigInteger value) {
		this.maxFull = value;
	}

}
