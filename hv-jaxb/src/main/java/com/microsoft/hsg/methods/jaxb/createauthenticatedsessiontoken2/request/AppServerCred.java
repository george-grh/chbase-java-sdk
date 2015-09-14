//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:11:05 PM PST 
//

package com.microsoft.hsg.methods.jaxb.createauthenticatedsessiontoken2.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.types.Sig;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.CreateAuthenticatedSessionToken2" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Application server credential that is used when an application
 *                     is identifying itself for subsequent calls to Microsoft
 *                     HealthVault.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.CreateAuthenticatedSessionToken2" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     This credential type requires that the content element
 *                     be signed using the application's private key.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for AppServerCred complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AppServerCred">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sig" type="{urn:com.microsoft.wc.types}Sig"/>
 *         &lt;element name="content" type="{urn:com.microsoft.wc.methods.CreateAuthenticatedSessionToken2}AppServerCredInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppServerCred", propOrder = { "sig", "content" })
public class AppServerCred {

	@XmlElement(required = true)
	protected Sig sig;
	@XmlElement(required = true)
	protected AppServerCredInfo content;

	/**
	 * Gets the value of the sig property.
	 * 
	 * @return possible object is {@link Sig }
	 * 
	 */
	public Sig getSig() {
		return sig;
	}

	/**
	 * Sets the value of the sig property.
	 * 
	 * @param value
	 *            allowed object is {@link Sig }
	 * 
	 */
	public void setSig(Sig value) {
		this.sig = value;
	}

	/**
	 * Gets the value of the content property.
	 * 
	 * @return possible object is {@link AppServerCredInfo }
	 * 
	 */
	public AppServerCredInfo getContent() {
		return content;
	}

	/**
	 * Sets the value of the content property.
	 * 
	 * @param value
	 *            allowed object is {@link AppServerCredInfo }
	 * 
	 */
	public void setContent(AppServerCredInfo value) {
		this.content = value;
	}

}
