//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 09:55:36 PM PDT 
//

package com.microsoft.hsg.methods.jaxb.updateapplication.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.microsoft.hsg.methods.jaxb.JaxbRequest;
import com.microsoft.hsg.methods.jaxb.application.AppLargeLogoInfo;
import com.microsoft.hsg.methods.jaxb.application.AppPersistentTokens;
import com.microsoft.hsg.methods.jaxb.application.AppSmallLogoInfo;
import com.microsoft.hsg.methods.jaxb.application.ApplicationAttributes;
import com.microsoft.hsg.methods.jaxb.application.PublicKeys;
import com.microsoft.hsg.methods.jaxb.application.StatementInfo;
import com.microsoft.hsg.methods.jaxb.auth.AuthXml;
import com.microsoft.hsg.methods.jaxb.location.SupportedInstanceList;
import com.microsoft.hsg.methods.jaxb.location.SupportedLocationList;
import com.microsoft.hsg.methods.jaxb.vocab.VocabularyAuthorizations;
import com.microsoft.hsg.thing.oxm.jaxb.types.CultureSpecificString255;
import com.microsoft.hsg.thing.oxm.jaxb.types.CultureSpecificStringnz;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:wc-app="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"&gt;
 *                         The element of the response that contains the method
 *                         specific return value(s).
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:wc-app="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types" xmlns:wc-vocab="urn:com.microsoft.wc.vocab"&gt;
 *                         All response schemas contain the info element which
 *                         contain the return value of the method. If the method
 *                         does not define an info element, the method has no
 *                         return value.
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
 *         &lt;element name="id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.types}CultureSpecificString255" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="public-keys" type="{urn:com.microsoft.wc.application}PublicKeys" minOccurs="0"/>
 *         &lt;element name="person-online-base-auth" type="{urn:com.microsoft.wc.auth}AuthXml" minOccurs="0"/>
 *         &lt;element name="person-offline-base-auth" type="{urn:com.microsoft.wc.auth}AuthXml" minOccurs="0"/>
 *         &lt;element name="methods" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="action-url" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:com.microsoft.wc.types}CultureSpecificStringnz" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auth-reason" type="{urn:com.microsoft.wc.types}CultureSpecificStringnz" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="domain-name" type="{urn:com.microsoft.wc.types}string255" minOccurs="0"/>
 *         &lt;element name="large-logo" type="{urn:com.microsoft.wc.application}AppLargeLogoInfo" minOccurs="0"/>
 *         &lt;element name="small-logo" type="{urn:com.microsoft.wc.application}AppSmallLogoInfo" minOccurs="0"/>
 *         &lt;element name="persistent-tokens" type="{urn:com.microsoft.wc.application}AppPersistentTokens" minOccurs="0"/>
 *         &lt;element name="app-type" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *         &lt;element name="privacy-statement" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="terms-of-use" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="app-auth-required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="restrict-app-users" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="is-published" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dtc-success-message" type="{urn:com.microsoft.wc.application}StatementInfo" minOccurs="0"/>
 *         &lt;element name="app-attributes" type="{urn:com.microsoft.wc.application}ApplicationAttributes" minOccurs="0"/>
 *         &lt;element name="valid-ip-prefixes" type="{urn:com.microsoft.wc.types}string255nw" minOccurs="0"/>
 *         &lt;element name="vocabulary-authorizations" type="{urn:com.microsoft.wc.vocab}VocabularyAuthorizations" minOccurs="0"/>
 *         &lt;element name="supported-record-locations" type="{urn:com.microsoft.wc.location}SupportedLocationList" minOccurs="0"/>
 *         &lt;element name="supported-instances" type="{urn:com.microsoft.wc.location}SupportedInstanceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@JaxbRequest(methodName = "UpdateApplication", methodVersion = "1", responseNS = "urn:com.microsoft.wc.methods.response.UpdateApplication")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "name", "publicKeys", "personOnlineBaseAuth", "personOfflineBaseAuth",
		"methods", "actionUrl", "description", "authReason", "domainName", "largeLogo", "smallLogo", "persistentTokens",
		"appType", "privacyStatement", "termsOfUse", "appAuthRequired", "restrictAppUsers", "isPublished",
		"dtcSuccessMessage", "appAttributes", "validIpPrefixes", "vocabularyAuthorizations", "supportedRecordLocations",
		"supportedInstances" })
@XmlRootElement(name = "info")
public class UpdateApplicationRequest {

	@XmlElement(required = true)
	protected String id;
	protected List<CultureSpecificString255> name;
	@XmlElement(name = "public-keys")
	protected PublicKeys publicKeys;
	@XmlElement(name = "person-online-base-auth")
	protected AuthXml personOnlineBaseAuth;
	@XmlElement(name = "person-offline-base-auth")
	protected AuthXml personOfflineBaseAuth;
	protected String methods;
	@XmlElement(name = "action-url")
	protected String actionUrl;
	protected List<CultureSpecificStringnz> description;
	@XmlElement(name = "auth-reason")
	protected List<CultureSpecificStringnz> authReason;
	@XmlElement(name = "domain-name")
	protected String domainName;
	@XmlElement(name = "large-logo")
	protected AppLargeLogoInfo largeLogo;
	@XmlElement(name = "small-logo")
	protected AppSmallLogoInfo smallLogo;
	@XmlElement(name = "persistent-tokens")
	protected AppPersistentTokens persistentTokens;
	@XmlElement(name = "app-type")
	protected String appType;
	@XmlElement(name = "privacy-statement")
	protected StatementInfo privacyStatement;
	@XmlElement(name = "terms-of-use")
	protected StatementInfo termsOfUse;
	@XmlElement(name = "app-auth-required")
	protected Boolean appAuthRequired;
	@XmlElement(name = "restrict-app-users")
	protected Boolean restrictAppUsers;
	@XmlElement(name = "is-published")
	protected Boolean isPublished;
	@XmlElement(name = "dtc-success-message")
	protected StatementInfo dtcSuccessMessage;
	@XmlElement(name = "app-attributes")
	protected ApplicationAttributes appAttributes;
	@XmlElement(name = "valid-ip-prefixes")
	protected String validIpPrefixes;
	@XmlElement(name = "vocabulary-authorizations")
	protected VocabularyAuthorizations vocabularyAuthorizations;
	@XmlElement(name = "supported-record-locations")
	protected SupportedLocationList supportedRecordLocations;
	@XmlElement(name = "supported-instances")
	protected SupportedInstanceList supportedInstances;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the name property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getName().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificString255 }
	 * 
	 * 
	 */
	public List<CultureSpecificString255> getName() {
		if (name == null) {
			name = new ArrayList<CultureSpecificString255>();
		}
		return this.name;
	}

	/**
	 * Gets the value of the publicKeys property.
	 * 
	 * @return possible object is {@link PublicKeys }
	 * 
	 */
	public PublicKeys getPublicKeys() {
		return publicKeys;
	}

	/**
	 * Sets the value of the publicKeys property.
	 * 
	 * @param value
	 *            allowed object is {@link PublicKeys }
	 * 
	 */
	public void setPublicKeys(PublicKeys value) {
		this.publicKeys = value;
	}

	/**
	 * Gets the value of the personOnlineBaseAuth property.
	 * 
	 * @return possible object is {@link AuthXml }
	 * 
	 */
	public AuthXml getPersonOnlineBaseAuth() {
		return personOnlineBaseAuth;
	}

	/**
	 * Sets the value of the personOnlineBaseAuth property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthXml }
	 * 
	 */
	public void setPersonOnlineBaseAuth(AuthXml value) {
		this.personOnlineBaseAuth = value;
	}

	/**
	 * Gets the value of the personOfflineBaseAuth property.
	 * 
	 * @return possible object is {@link AuthXml }
	 * 
	 */
	public AuthXml getPersonOfflineBaseAuth() {
		return personOfflineBaseAuth;
	}

	/**
	 * Sets the value of the personOfflineBaseAuth property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthXml }
	 * 
	 */
	public void setPersonOfflineBaseAuth(AuthXml value) {
		this.personOfflineBaseAuth = value;
	}

	/**
	 * Gets the value of the methods property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMethods() {
		return methods;
	}

	/**
	 * Sets the value of the methods property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMethods(String value) {
		this.methods = value;
	}

	/**
	 * Gets the value of the actionUrl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActionUrl() {
		return actionUrl;
	}

	/**
	 * Sets the value of the actionUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActionUrl(String value) {
		this.actionUrl = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the description property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDescription().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificStringnz }
	 * 
	 * 
	 */
	public List<CultureSpecificStringnz> getDescription() {
		if (description == null) {
			description = new ArrayList<CultureSpecificStringnz>();
		}
		return this.description;
	}

	/**
	 * Gets the value of the authReason property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the authReason property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAuthReason().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificStringnz }
	 * 
	 * 
	 */
	public List<CultureSpecificStringnz> getAuthReason() {
		if (authReason == null) {
			authReason = new ArrayList<CultureSpecificStringnz>();
		}
		return this.authReason;
	}

	/**
	 * Gets the value of the domainName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Sets the value of the domainName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDomainName(String value) {
		this.domainName = value;
	}

	/**
	 * Gets the value of the largeLogo property.
	 * 
	 * @return possible object is {@link AppLargeLogoInfo }
	 * 
	 */
	public AppLargeLogoInfo getLargeLogo() {
		return largeLogo;
	}

	/**
	 * Sets the value of the largeLogo property.
	 * 
	 * @param value
	 *            allowed object is {@link AppLargeLogoInfo }
	 * 
	 */
	public void setLargeLogo(AppLargeLogoInfo value) {
		this.largeLogo = value;
	}

	/**
	 * Gets the value of the smallLogo property.
	 * 
	 * @return possible object is {@link AppSmallLogoInfo }
	 * 
	 */
	public AppSmallLogoInfo getSmallLogo() {
		return smallLogo;
	}

	/**
	 * Sets the value of the smallLogo property.
	 * 
	 * @param value
	 *            allowed object is {@link AppSmallLogoInfo }
	 * 
	 */
	public void setSmallLogo(AppSmallLogoInfo value) {
		this.smallLogo = value;
	}

	/**
	 * Gets the value of the persistentTokens property.
	 * 
	 * @return possible object is {@link AppPersistentTokens }
	 * 
	 */
	public AppPersistentTokens getPersistentTokens() {
		return persistentTokens;
	}

	/**
	 * Sets the value of the persistentTokens property.
	 * 
	 * @param value
	 *            allowed object is {@link AppPersistentTokens }
	 * 
	 */
	public void setPersistentTokens(AppPersistentTokens value) {
		this.persistentTokens = value;
	}

	/**
	 * Gets the value of the appType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAppType() {
		return appType;
	}

	/**
	 * Sets the value of the appType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAppType(String value) {
		this.appType = value;
	}

	/**
	 * Gets the value of the privacyStatement property.
	 * 
	 * @return possible object is {@link StatementInfo }
	 * 
	 */
	public StatementInfo getPrivacyStatement() {
		return privacyStatement;
	}

	/**
	 * Sets the value of the privacyStatement property.
	 * 
	 * @param value
	 *            allowed object is {@link StatementInfo }
	 * 
	 */
	public void setPrivacyStatement(StatementInfo value) {
		this.privacyStatement = value;
	}

	/**
	 * Gets the value of the termsOfUse property.
	 * 
	 * @return possible object is {@link StatementInfo }
	 * 
	 */
	public StatementInfo getTermsOfUse() {
		return termsOfUse;
	}

	/**
	 * Sets the value of the termsOfUse property.
	 * 
	 * @param value
	 *            allowed object is {@link StatementInfo }
	 * 
	 */
	public void setTermsOfUse(StatementInfo value) {
		this.termsOfUse = value;
	}

	/**
	 * Gets the value of the appAuthRequired property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isAppAuthRequired() {
		return appAuthRequired;
	}

	/**
	 * Sets the value of the appAuthRequired property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAppAuthRequired(Boolean value) {
		this.appAuthRequired = value;
	}

	/**
	 * Gets the value of the restrictAppUsers property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRestrictAppUsers() {
		return restrictAppUsers;
	}

	/**
	 * Sets the value of the restrictAppUsers property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRestrictAppUsers(Boolean value) {
		this.restrictAppUsers = value;
	}

	/**
	 * Gets the value of the isPublished property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsPublished() {
		return isPublished;
	}

	/**
	 * Sets the value of the isPublished property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsPublished(Boolean value) {
		this.isPublished = value;
	}

	/**
	 * Gets the value of the dtcSuccessMessage property.
	 * 
	 * @return possible object is {@link StatementInfo }
	 * 
	 */
	public StatementInfo getDtcSuccessMessage() {
		return dtcSuccessMessage;
	}

	/**
	 * Sets the value of the dtcSuccessMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link StatementInfo }
	 * 
	 */
	public void setDtcSuccessMessage(StatementInfo value) {
		this.dtcSuccessMessage = value;
	}

	/**
	 * Gets the value of the appAttributes property.
	 * 
	 * @return possible object is {@link ApplicationAttributes }
	 * 
	 */
	public ApplicationAttributes getAppAttributes() {
		return appAttributes;
	}

	/**
	 * Sets the value of the appAttributes property.
	 * 
	 * @param value
	 *            allowed object is {@link ApplicationAttributes }
	 * 
	 */
	public void setAppAttributes(ApplicationAttributes value) {
		this.appAttributes = value;
	}

	/**
	 * Gets the value of the validIpPrefixes property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidIpPrefixes() {
		return validIpPrefixes;
	}

	/**
	 * Sets the value of the validIpPrefixes property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidIpPrefixes(String value) {
		this.validIpPrefixes = value;
	}

	/**
	 * Gets the value of the vocabularyAuthorizations property.
	 * 
	 * @return possible object is {@link VocabularyAuthorizations }
	 * 
	 */
	public VocabularyAuthorizations getVocabularyAuthorizations() {
		return vocabularyAuthorizations;
	}

	/**
	 * Sets the value of the vocabularyAuthorizations property.
	 * 
	 * @param value
	 *            allowed object is {@link VocabularyAuthorizations }
	 * 
	 */
	public void setVocabularyAuthorizations(VocabularyAuthorizations value) {
		this.vocabularyAuthorizations = value;
	}

	/**
	 * Gets the value of the supportedRecordLocations property.
	 * 
	 * @return possible object is {@link SupportedLocationList }
	 * 
	 */
	public SupportedLocationList getSupportedRecordLocations() {
		return supportedRecordLocations;
	}

	/**
	 * Sets the value of the supportedRecordLocations property.
	 * 
	 * @param value
	 *            allowed object is {@link SupportedLocationList }
	 * 
	 */
	public void setSupportedRecordLocations(SupportedLocationList value) {
		this.supportedRecordLocations = value;
	}

	/**
	 * Gets the value of the supportedInstances property.
	 * 
	 * @return possible object is {@link SupportedInstanceList }
	 * 
	 */
	public SupportedInstanceList getSupportedInstances() {
		return supportedInstances;
	}

	/**
	 * Sets the value of the supportedInstances property.
	 * 
	 * @param value
	 *            allowed object is {@link SupportedInstanceList }
	 * 
	 */
	public void setSupportedInstances(SupportedInstanceList value) {
		this.supportedInstances = value;
	}

}
