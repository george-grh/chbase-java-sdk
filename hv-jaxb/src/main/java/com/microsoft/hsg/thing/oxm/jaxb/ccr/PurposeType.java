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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PurposeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PurposeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{urn:astm-org:CCR}DateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:astm-org:CCR}Description" maxOccurs="unbounded"/>
 *         &lt;element name="OrderRequest" type="{urn:astm-org:CCR}PlanOfCareType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:astm-org:CCR}Indications" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommentID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurposeType", propOrder = { "dateTime", "description", "orderRequest", "indications", "referenceID",
		"commentID" })
public class PurposeType {

	@XmlElement(name = "DateTime")
	protected List<DateTimeType> dateTime;
	@XmlElement(name = "Description", required = true)
	protected List<CodedDescriptionType> description;
	@XmlElement(name = "OrderRequest")
	protected List<PlanOfCareType> orderRequest;
	@XmlElement(name = "Indications")
	protected List<Indications> indications;
	@XmlElement(name = "ReferenceID")
	protected List<String> referenceID;
	@XmlElement(name = "CommentID")
	protected List<String> commentID;

	/**
	 * Gets the value of the dateTime property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dateTime property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDateTime().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DateTimeType }
	 * 
	 * 
	 */
	public List<DateTimeType> getDateTime() {
		if (dateTime == null) {
			dateTime = new ArrayList<DateTimeType>();
		}
		return this.dateTime;
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
	 * {@link CodedDescriptionType }
	 * 
	 * 
	 */
	public List<CodedDescriptionType> getDescription() {
		if (description == null) {
			description = new ArrayList<CodedDescriptionType>();
		}
		return this.description;
	}

	/**
	 * Gets the value of the orderRequest property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the orderRequest property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOrderRequest().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PlanOfCareType }
	 * 
	 * 
	 */
	public List<PlanOfCareType> getOrderRequest() {
		if (orderRequest == null) {
			orderRequest = new ArrayList<PlanOfCareType>();
		}
		return this.orderRequest;
	}

	/**
	 * Gets the value of the indications property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the indications property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getIndications().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Indications }
	 * 
	 * 
	 */
	public List<Indications> getIndications() {
		if (indications == null) {
			indications = new ArrayList<Indications>();
		}
		return this.indications;
	}

	/**
	 * Gets the value of the referenceID property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the referenceID property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReferenceID().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getReferenceID() {
		if (referenceID == null) {
			referenceID = new ArrayList<String>();
		}
		return this.referenceID;
	}

	/**
	 * Gets the value of the commentID property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the commentID property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCommentID().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getCommentID() {
		if (commentID == null) {
			commentID = new ArrayList<String>();
		}
		return this.commentID;
	}

}
