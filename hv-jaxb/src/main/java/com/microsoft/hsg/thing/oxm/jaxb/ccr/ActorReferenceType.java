//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.09 at 11:38:44 PM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.ccr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ActorReferenceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ActorReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActorRole" type="{urn:astm-org:CCR}CodedDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActorReferenceType", propOrder = { "actorID", "actorRole" })
@XmlSeeAlso({ com.microsoft.hsg.thing.oxm.jaxb.ccr.FamilyHistoryType.FamilyMember.class })
public class ActorReferenceType {

	@XmlElement(name = "ActorID")
	protected String actorID;
	@XmlElement(name = "ActorRole")
	protected List<CodedDescriptionType> actorRole;

	/**
	 * Gets the value of the actorID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActorID() {
		return actorID;
	}

	/**
	 * Sets the value of the actorID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActorID(String value) {
		this.actorID = value;
	}

	/**
	 * Gets the value of the actorRole property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the actorRole property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getActorRole().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodedDescriptionType }
	 * 
	 * 
	 */
	public List<CodedDescriptionType> getActorRole() {
		if (actorRole == null) {
			actorRole = new ArrayList<CodedDescriptionType>();
		}
		return this.actorRole;
	}

}
