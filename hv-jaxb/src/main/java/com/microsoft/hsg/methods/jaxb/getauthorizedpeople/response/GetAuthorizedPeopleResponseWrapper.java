//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:19:41 PM PST 
//

package com.microsoft.hsg.methods.jaxb.getauthorizedpeople.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetAuthorizedPeople" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *             The element of the response that contains the method
 *             specific return value(s).
 *           &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetAuthorizedPeople" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *             All response schemas contain the info element which
 *             contain the return value of the method. If the method
 *             does not define an info element, the method has no
 *             return value.
 *           &lt;/remarks&gt;
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
 *         &lt;element name="response-results" type="{urn:com.microsoft.wc.methods.response.GetAuthorizedPeople}GetAuthorizedPeopleResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "responseResults" })
@XmlRootElement(name = "info")
public class GetAuthorizedPeopleResponseWrapper {

	@XmlElement(name = "response-results", required = true)
	protected GetAuthorizedPeopleResponse responseResults;

	/**
	 * Gets the value of the responseResults property.
	 * 
	 * @return possible object is {@link GetAuthorizedPeopleResponse }
	 * 
	 */
	public GetAuthorizedPeopleResponse getResponseResults() {
		return responseResults;
	}

	/**
	 * Sets the value of the responseResults property.
	 * 
	 * @param value
	 *            allowed object is {@link GetAuthorizedPeopleResponse }
	 * 
	 */
	public void setResponseResults(GetAuthorizedPeopleResponse value) {
		this.responseResults = value;
	}

}
