//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.record;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.hsg.methods.jaxb.auth.AuthXml;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.record" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.record" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for NonActiveAuthorizationNoIds complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="NonActiveAuthorizationNoIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email-address" type="{urn:com.microsoft.wc.types}EmailAddress"/>
 *         &lt;element name="record-custodian" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="authorized-record-state" type="{urn:com.microsoft.wc.record}AuthorizedRecordState"/>
 *         &lt;element name="record-display-name" type="{urn:com.microsoft.wc.types}string255"/>
 *         &lt;element name="date-auth-expires" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="auth-xml" type="{urn:com.microsoft.wc.auth}AuthXml"/>
 *         &lt;element name="rel-type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date-auth-created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="date-auth-updated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="grantor-name" type="{urn:com.microsoft.wc.types}string255"/>
 *         &lt;element name="grantee-name" type="{urn:com.microsoft.wc.types}string255"/>
 *         &lt;element name="record-authorization-token" type="{urn:com.microsoft.wc.types}base64Sha1" minOccurs="0"/>
 *         &lt;element name="email-text" type="{urn:com.microsoft.wc.types}string1024" minOccurs="0"/>
 *         &lt;element name="can-access-audit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonActiveAuthorizationNoIds", propOrder = { "emailAddress", "recordCustodian", "authorizedRecordState",
		"recordDisplayName", "dateAuthExpires", "authXml", "relType", "dateAuthCreated", "dateAuthUpdated",
		"grantorName", "granteeName", "recordAuthorizationToken", "emailText", "canAccessAudit" })
public class NonActiveAuthorizationNoIds {

	@XmlElement(name = "email-address", required = true)
	protected String emailAddress;
	@XmlElement(name = "record-custodian")
	protected boolean recordCustodian;
	@XmlElement(name = "authorized-record-state", required = true)
	protected AuthorizedRecordState authorizedRecordState;
	@XmlElement(name = "record-display-name", required = true)
	protected String recordDisplayName;
	@XmlElement(name = "date-auth-expires", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar dateAuthExpires;
	@XmlElement(name = "auth-xml", required = true)
	protected AuthXml authXml;
	@XmlElement(name = "rel-type")
	protected int relType;
	@XmlElement(name = "date-auth-created", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar dateAuthCreated;
	@XmlElement(name = "date-auth-updated", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar dateAuthUpdated;
	@XmlElement(name = "grantor-name", required = true)
	protected String grantorName;
	@XmlElement(name = "grantee-name", required = true)
	protected String granteeName;
	@XmlElement(name = "record-authorization-token")
	protected String recordAuthorizationToken;
	@XmlElement(name = "email-text")
	protected String emailText;
	@XmlElement(name = "can-access-audit")
	protected Boolean canAccessAudit;

	/**
	 * Gets the value of the emailAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Sets the value of the emailAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * Gets the value of the recordCustodian property.
	 * 
	 */
	public boolean isRecordCustodian() {
		return recordCustodian;
	}

	/**
	 * Sets the value of the recordCustodian property.
	 * 
	 */
	public void setRecordCustodian(boolean value) {
		this.recordCustodian = value;
	}

	/**
	 * Gets the value of the authorizedRecordState property.
	 * 
	 * @return possible object is {@link AuthorizedRecordState }
	 * 
	 */
	public AuthorizedRecordState getAuthorizedRecordState() {
		return authorizedRecordState;
	}

	/**
	 * Sets the value of the authorizedRecordState property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthorizedRecordState }
	 * 
	 */
	public void setAuthorizedRecordState(AuthorizedRecordState value) {
		this.authorizedRecordState = value;
	}

	/**
	 * Gets the value of the recordDisplayName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecordDisplayName() {
		return recordDisplayName;
	}

	/**
	 * Sets the value of the recordDisplayName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecordDisplayName(String value) {
		this.recordDisplayName = value;
	}

	/**
	 * Gets the value of the dateAuthExpires property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDateAuthExpires() {
		return dateAuthExpires;
	}

	/**
	 * Sets the value of the dateAuthExpires property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDateAuthExpires(XMLGregorianCalendar value) {
		this.dateAuthExpires = value;
	}

	/**
	 * Gets the value of the authXml property.
	 * 
	 * @return possible object is {@link AuthXml }
	 * 
	 */
	public AuthXml getAuthXml() {
		return authXml;
	}

	/**
	 * Sets the value of the authXml property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthXml }
	 * 
	 */
	public void setAuthXml(AuthXml value) {
		this.authXml = value;
	}

	/**
	 * Gets the value of the relType property.
	 * 
	 */
	public int getRelType() {
		return relType;
	}

	/**
	 * Sets the value of the relType property.
	 * 
	 */
	public void setRelType(int value) {
		this.relType = value;
	}

	/**
	 * Gets the value of the dateAuthCreated property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDateAuthCreated() {
		return dateAuthCreated;
	}

	/**
	 * Sets the value of the dateAuthCreated property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDateAuthCreated(XMLGregorianCalendar value) {
		this.dateAuthCreated = value;
	}

	/**
	 * Gets the value of the dateAuthUpdated property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDateAuthUpdated() {
		return dateAuthUpdated;
	}

	/**
	 * Sets the value of the dateAuthUpdated property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDateAuthUpdated(XMLGregorianCalendar value) {
		this.dateAuthUpdated = value;
	}

	/**
	 * Gets the value of the grantorName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGrantorName() {
		return grantorName;
	}

	/**
	 * Sets the value of the grantorName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGrantorName(String value) {
		this.grantorName = value;
	}

	/**
	 * Gets the value of the granteeName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGranteeName() {
		return granteeName;
	}

	/**
	 * Sets the value of the granteeName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGranteeName(String value) {
		this.granteeName = value;
	}

	/**
	 * Gets the value of the recordAuthorizationToken property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecordAuthorizationToken() {
		return recordAuthorizationToken;
	}

	/**
	 * Sets the value of the recordAuthorizationToken property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecordAuthorizationToken(String value) {
		this.recordAuthorizationToken = value;
	}

	/**
	 * Gets the value of the emailText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmailText() {
		return emailText;
	}

	/**
	 * Sets the value of the emailText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmailText(String value) {
		this.emailText = value;
	}

	/**
	 * Gets the value of the canAccessAudit property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCanAccessAudit() {
		return canAccessAudit;
	}

	/**
	 * Sets the value of the canAccessAudit property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCanAccessAudit(Boolean value) {
		this.canAccessAudit = value;
	}

}
