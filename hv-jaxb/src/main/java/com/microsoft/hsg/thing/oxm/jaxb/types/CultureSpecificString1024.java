//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:43:24 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
 *                     The CultureSpecific... classes are intended for use with data that can
 *                     be localized for one or more languages and cultures.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
 *                     The CultureSpecific... classes should be upward compatibile with the
 *                     base types.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for CultureSpecificString1024 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CultureSpecificString1024">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:com.microsoft.wc.types>string1024">
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CultureSpecificString1024", propOrder = { "value" })
public class CultureSpecificString1024 {

	@XmlValue
	protected String value;
	@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
	protected String lang;

	/**
	 * Instantiates a new culture specific string1024.
	 */
	public CultureSpecificString1024() {
	}

	/**
	 * Instantiates a new culture specific string1024 with the default value.
	 *
	 * @param value
	 *            the value
	 */
	public CultureSpecificString1024(String value) {
		this.value = value;
	}

	/**
	 * Instantiates a new culture specific string1024.
	 *
	 * @param value
	 *            the value
	 * @param lang
	 *            the lang
	 */
	public CultureSpecificString1024(String value, String lang) {
		this.value = value;
		this.lang = lang;
	}

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"/&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
	 *                                 This represents the language and culture of the data in the
	 *                                 element, such as "en-us" or "fr-ca".
	 *                             &lt;/summary&gt;
	 * </pre>
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
	 *                                 In a typical use, an instance of an element with no xml:lang
	 *                                 attribute specified is treated as the default entry. Only one
	 *                                 default entry is typically allowed.
	 *                             &lt;/remarks&gt;
	 * </pre>
	 * 
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Sets the value of the lang property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLang(String value) {
		this.lang = value;
	}

}
