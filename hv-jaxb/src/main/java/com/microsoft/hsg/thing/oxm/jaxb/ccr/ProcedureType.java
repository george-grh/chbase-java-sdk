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
 * Java class for ProcedureType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ProcedureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="CCRDataObjectID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="DateTime" type="{urn:astm-org:CCR}DateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="IDs" type="{urn:astm-org:CCR}IDType" minOccurs="0"/>
 *           &lt;element ref="{urn:astm-org:CCR}Type" minOccurs="0"/>
 *           &lt;element ref="{urn:astm-org:CCR}Description" minOccurs="0"/>
 *           &lt;element ref="{urn:astm-org:CCR}Status" minOccurs="0"/>
 *           &lt;group ref="{urn:astm-org:CCR}SLRCGroup"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{urn:astm-org:CCR}Locations" minOccurs="0"/>
 *           &lt;element ref="{urn:astm-org:CCR}Practitioners" minOccurs="0"/>
 *           &lt;element name="Frequency" type="{urn:astm-org:CCR}FrequencyType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Interval" type="{urn:astm-org:CCR}IntervalType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Duration" type="{urn:astm-org:CCR}DurationType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{urn:astm-org:CCR}Indications" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{urn:astm-org:CCR}Instructions" minOccurs="0"/>
 *           &lt;element name="Consent" type="{urn:astm-org:CCR}CCRCodedDataObjectType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="Products" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Product" type="{urn:astm-org:CCR}StructuredProductType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Substance" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *           &lt;element name="Method" type="{urn:astm-org:CCR}MethodType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Position" type="{urn:astm-org:CCR}PositionType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Site" type="{urn:astm-org:CCR}SiteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedureType", propOrder = { "ccrDataObjectID", "dateTime", "iDs", "type", "description", "status",
		"source", "internalCCRLink", "referenceID", "commentID", "signature", "locations", "practitioners", "frequency",
		"interval", "duration", "indications", "instructions", "consent", "products", "substance", "method", "position",
		"site" })
public class ProcedureType {

	@XmlElement(name = "CCRDataObjectID", required = true)
	protected String ccrDataObjectID;
	@XmlElement(name = "DateTime")
	protected List<DateTimeType> dateTime;
	@XmlElement(name = "IDs")
	protected IDType iDs;
	@XmlElement(name = "Type")
	protected CodedDescriptionType type;
	@XmlElement(name = "Description")
	protected CodedDescriptionType description;
	@XmlElement(name = "Status")
	protected CodedDescriptionType status;
	@XmlElement(name = "Source", required = true)
	protected List<SourceType> source;
	@XmlElement(name = "InternalCCRLink")
	protected List<InternalCCRLink> internalCCRLink;
	@XmlElement(name = "ReferenceID")
	protected List<String> referenceID;
	@XmlElement(name = "CommentID")
	protected List<String> commentID;
	@XmlElement(name = "Signature")
	protected List<CCRCodedDataObjectType.Signature> signature;
	@XmlElement(name = "Locations")
	protected Locations locations;
	@XmlElement(name = "Practitioners")
	protected Practitioners practitioners;
	@XmlElement(name = "Frequency")
	protected List<FrequencyType> frequency;
	@XmlElement(name = "Interval")
	protected List<IntervalType> interval;
	@XmlElement(name = "Duration")
	protected List<DurationType> duration;
	@XmlElement(name = "Indications")
	protected List<Indications> indications;
	@XmlElement(name = "Instructions")
	protected Instructions instructions;
	@XmlElement(name = "Consent")
	protected CCRCodedDataObjectType consent;
	@XmlElement(name = "Products")
	protected ProcedureType.Products products;
	@XmlElement(name = "Substance")
	protected CodedDescriptionType substance;
	@XmlElement(name = "Method")
	protected List<MethodType> method;
	@XmlElement(name = "Position")
	protected List<PositionType> position;
	@XmlElement(name = "Site")
	protected List<SiteType> site;

	/**
	 * Gets the value of the ccrDataObjectID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCCRDataObjectID() {
		return ccrDataObjectID;
	}

	/**
	 * Sets the value of the ccrDataObjectID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCCRDataObjectID(String value) {
		this.ccrDataObjectID = value;
	}

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
	 * Gets the value of the iDs property.
	 * 
	 * @return possible object is {@link IDType }
	 * 
	 */
	public IDType getIDs() {
		return iDs;
	}

	/**
	 * Sets the value of the iDs property.
	 * 
	 * @param value
	 *            allowed object is {@link IDType }
	 * 
	 */
	public void setIDs(IDType value) {
		this.iDs = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link CodedDescriptionType }
	 * 
	 */
	public CodedDescriptionType getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link CodedDescriptionType }
	 * 
	 */
	public void setType(CodedDescriptionType value) {
		this.type = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link CodedDescriptionType }
	 * 
	 */
	public CodedDescriptionType getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link CodedDescriptionType }
	 * 
	 */
	public void setDescription(CodedDescriptionType value) {
		this.description = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link CodedDescriptionType }
	 * 
	 */
	public CodedDescriptionType getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link CodedDescriptionType }
	 * 
	 */
	public void setStatus(CodedDescriptionType value) {
		this.status = value;
	}

	/**
	 * Gets the value of the source property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the source property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSource().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SourceType }
	 * 
	 * 
	 */
	public List<SourceType> getSource() {
		if (source == null) {
			source = new ArrayList<SourceType>();
		}
		return this.source;
	}

	/**
	 * Gets the value of the internalCCRLink property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the internalCCRLink property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInternalCCRLink().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link InternalCCRLink }
	 * 
	 * 
	 */
	public List<InternalCCRLink> getInternalCCRLink() {
		if (internalCCRLink == null) {
			internalCCRLink = new ArrayList<InternalCCRLink>();
		}
		return this.internalCCRLink;
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

	/**
	 * Gets the value of the signature property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the signature property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSignature().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CCRCodedDataObjectType.Signature }
	 * 
	 * 
	 */
	public List<CCRCodedDataObjectType.Signature> getSignature() {
		if (signature == null) {
			signature = new ArrayList<CCRCodedDataObjectType.Signature>();
		}
		return this.signature;
	}

	/**
	 * Gets the value of the locations property.
	 * 
	 * @return possible object is {@link Locations }
	 * 
	 */
	public Locations getLocations() {
		return locations;
	}

	/**
	 * Sets the value of the locations property.
	 * 
	 * @param value
	 *            allowed object is {@link Locations }
	 * 
	 */
	public void setLocations(Locations value) {
		this.locations = value;
	}

	/**
	 * Gets the value of the practitioners property.
	 * 
	 * @return possible object is {@link Practitioners }
	 * 
	 */
	public Practitioners getPractitioners() {
		return practitioners;
	}

	/**
	 * Sets the value of the practitioners property.
	 * 
	 * @param value
	 *            allowed object is {@link Practitioners }
	 * 
	 */
	public void setPractitioners(Practitioners value) {
		this.practitioners = value;
	}

	/**
	 * Gets the value of the frequency property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the frequency property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFrequency().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link FrequencyType }
	 * 
	 * 
	 */
	public List<FrequencyType> getFrequency() {
		if (frequency == null) {
			frequency = new ArrayList<FrequencyType>();
		}
		return this.frequency;
	}

	/**
	 * Gets the value of the interval property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the interval property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInterval().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link IntervalType }
	 * 
	 * 
	 */
	public List<IntervalType> getInterval() {
		if (interval == null) {
			interval = new ArrayList<IntervalType>();
		}
		return this.interval;
	}

	/**
	 * Gets the value of the duration property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the duration property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDuration().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DurationType }
	 * 
	 * 
	 */
	public List<DurationType> getDuration() {
		if (duration == null) {
			duration = new ArrayList<DurationType>();
		}
		return this.duration;
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
	 * Gets the value of the instructions property.
	 * 
	 * @return possible object is {@link Instructions }
	 * 
	 */
	public Instructions getInstructions() {
		return instructions;
	}

	/**
	 * Sets the value of the instructions property.
	 * 
	 * @param value
	 *            allowed object is {@link Instructions }
	 * 
	 */
	public void setInstructions(Instructions value) {
		this.instructions = value;
	}

	/**
	 * Gets the value of the consent property.
	 * 
	 * @return possible object is {@link CCRCodedDataObjectType }
	 * 
	 */
	public CCRCodedDataObjectType getConsent() {
		return consent;
	}

	/**
	 * Sets the value of the consent property.
	 * 
	 * @param value
	 *            allowed object is {@link CCRCodedDataObjectType }
	 * 
	 */
	public void setConsent(CCRCodedDataObjectType value) {
		this.consent = value;
	}

	/**
	 * Gets the value of the products property.
	 * 
	 * @return possible object is {@link ProcedureType.Products }
	 * 
	 */
	public ProcedureType.Products getProducts() {
		return products;
	}

	/**
	 * Sets the value of the products property.
	 * 
	 * @param value
	 *            allowed object is {@link ProcedureType.Products }
	 * 
	 */
	public void setProducts(ProcedureType.Products value) {
		this.products = value;
	}

	/**
	 * Gets the value of the substance property.
	 * 
	 * @return possible object is {@link CodedDescriptionType }
	 * 
	 */
	public CodedDescriptionType getSubstance() {
		return substance;
	}

	/**
	 * Sets the value of the substance property.
	 * 
	 * @param value
	 *            allowed object is {@link CodedDescriptionType }
	 * 
	 */
	public void setSubstance(CodedDescriptionType value) {
		this.substance = value;
	}

	/**
	 * Gets the value of the method property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the method property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMethod().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link MethodType }
	 * 
	 * 
	 */
	public List<MethodType> getMethod() {
		if (method == null) {
			method = new ArrayList<MethodType>();
		}
		return this.method;
	}

	/**
	 * Gets the value of the position property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the position property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPosition().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PositionType }
	 * 
	 * 
	 */
	public List<PositionType> getPosition() {
		if (position == null) {
			position = new ArrayList<PositionType>();
		}
		return this.position;
	}

	/**
	 * Gets the value of the site property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the site property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSite().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link SiteType
	 * }
	 * 
	 * 
	 */
	public List<SiteType> getSite() {
		if (site == null) {
			site = new ArrayList<SiteType>();
		}
		return this.site;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Product" type="{urn:astm-org:CCR}StructuredProductType" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "product" })
	public static class Products {

		@XmlElement(name = "Product", required = true)
		protected List<StructuredProductType> product;

		/**
		 * Gets the value of the product property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the product property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getProduct().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link StructuredProductType }
		 * 
		 * 
		 */
		public List<StructuredProductType> getProduct() {
			if (product == null) {
				product = new ArrayList<StructuredProductType>();
			}
			return this.product;
		}

	}

}
