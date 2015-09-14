//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.microsoft.hsg.methods.jaxb.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.messages" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Indicates that a health statement should be sent to the
 *                     specified user.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.messages" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for HealthStatementMessage complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="HealthStatementMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PseudoPersonId" type="{urn:com.microsoft.wc.types}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthStatementMessage", propOrder = { "pseudoPersonId" })
public class HealthStatementMessage {

	@XmlElement(name = "PseudoPersonId", required = true)
	protected String pseudoPersonId;

	/**
	 * Gets the value of the pseudoPersonId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPseudoPersonId() {
		return pseudoPersonId;
	}

	/**
	 * Sets the value of the pseudoPersonId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPseudoPersonId(String value) {
		this.pseudoPersonId = value;
	}

}
