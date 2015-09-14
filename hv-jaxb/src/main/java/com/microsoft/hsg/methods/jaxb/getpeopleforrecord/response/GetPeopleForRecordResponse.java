//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.11 at 04:22:28 PM IST 
//

package com.microsoft.hsg.methods.jaxb.getpeopleforrecord.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:wc-record="urn:com.microsoft.wc.record" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element that contains the method
 *                         specific response.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:wc-record="urn:com.microsoft.wc.record" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         All responses contain the info element to return data
 *                         that are specific to each method. If the method does not
 *                         define an info element, the method does not expect any
 *                         data for the response.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
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
 *         &lt;element name="active-person-authorization" type="{urn:com.microsoft.wc.record}ActivePersonAuthorizationNoIds" maxOccurs="unbounded"/>
 *         &lt;element name="non-active-authorization" type="{urn:com.microsoft.wc.record}NonActiveAuthorizationNoIds" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "activePersonAuthorization", "nonActiveAuthorization" })
@XmlRootElement(name = "info")
public class GetPeopleForRecordResponse {

	@XmlElement(name = "active-person-authorization", required = true)
	protected List<ActivePersonAuthorizationNoIds> activePersonAuthorization;
	@XmlElement(name = "non-active-authorization")
	protected List<NonActiveAuthorizationNoIds> nonActiveAuthorization;

	/**
	 * Gets the value of the activePersonAuthorization property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the activePersonAuthorization property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getActivePersonAuthorization().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ActivePersonAuthorizationNoIds }
	 * 
	 * 
	 */
	public List<ActivePersonAuthorizationNoIds> getActivePersonAuthorization() {
		if (activePersonAuthorization == null) {
			activePersonAuthorization = new ArrayList<ActivePersonAuthorizationNoIds>();
		}
		return this.activePersonAuthorization;
	}

	/**
	 * Gets the value of the nonActiveAuthorization property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the nonActiveAuthorization property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNonActiveAuthorization().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link NonActiveAuthorizationNoIds }
	 * 
	 * 
	 */
	public List<NonActiveAuthorizationNoIds> getNonActiveAuthorization() {
		if (nonActiveAuthorization == null) {
			nonActiveAuthorization = new ArrayList<NonActiveAuthorizationNoIds>();
		}
		return this.nonActiveAuthorization;
	}

}
