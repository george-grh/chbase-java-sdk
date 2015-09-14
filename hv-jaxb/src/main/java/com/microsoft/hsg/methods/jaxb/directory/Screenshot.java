//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 10:04:11 PM PDT 
//

package com.microsoft.hsg.methods.jaxb.directory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.types.CultureSpecificString255Nw;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.directory" xmlns:wc-application="urn:com.microsoft.wc.application" xmlns:wc-location="urn:com.microsoft.wc.location" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *           Represents information for screenshot of the directory item. 
 *           The recommended maximum dimensions are 150px by 150px or size of 150K.
 *         &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>
 * Java class for Screenshot complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Screenshot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alt-text" type="{urn:com.microsoft.wc.types}CultureSpecificString255nw" maxOccurs="unbounded"/>
 *         &lt;element name="caption" type="{urn:com.microsoft.wc.types}CultureSpecificString255nw" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="image" type="{urn:com.microsoft.wc.directory}CultureSpecificScreenshotImage" maxOccurs="unbounded"/>
 *         &lt;element name="image-content-type" type="{urn:com.microsoft.wc.types}string255nw"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Screenshot", propOrder = { "altText", "caption", "sequence", "image", "imageContentType" })
public class Screenshot {

	@XmlElement(name = "alt-text", required = true)
	protected List<CultureSpecificString255Nw> altText;
	protected List<CultureSpecificString255Nw> caption;
	@XmlElement(required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger sequence;
	@XmlElement(required = true)
	protected List<CultureSpecificScreenshotImage> image;
	@XmlElement(name = "image-content-type", required = true)
	protected String imageContentType;

	/**
	 * Gets the value of the altText property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the altText property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAltText().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificString255Nw }
	 * 
	 * 
	 */
	public List<CultureSpecificString255Nw> getAltText() {
		if (altText == null) {
			altText = new ArrayList<CultureSpecificString255Nw>();
		}
		return this.altText;
	}

	/**
	 * Gets the value of the caption property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the caption property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCaption().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificString255Nw }
	 * 
	 * 
	 */
	public List<CultureSpecificString255Nw> getCaption() {
		if (caption == null) {
			caption = new ArrayList<CultureSpecificString255Nw>();
		}
		return this.caption;
	}

	/**
	 * Gets the value of the sequence property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getSequence() {
		return sequence;
	}

	/**
	 * Sets the value of the sequence property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setSequence(BigInteger value) {
		this.sequence = value;
	}

	/**
	 * Gets the value of the image property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the image property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getImage().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CultureSpecificScreenshotImage }
	 * 
	 * 
	 */
	public List<CultureSpecificScreenshotImage> getImage() {
		if (image == null) {
			image = new ArrayList<CultureSpecificScreenshotImage>();
		}
		return this.image;
	}

	/**
	 * Gets the value of the imageContentType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImageContentType() {
		return imageContentType;
	}

	/**
	 * Sets the value of the imageContentType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setImageContentType(String value) {
		this.imageContentType = value;
	}

}
