//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:40:32 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.familyhistory3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.Condition;

/**
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
 *         &lt;element name="condition" type="{urn:com.microsoft.wc.thing.types}condition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relative" type="{urn:com.microsoft.wc.thing.family-history}FamilyHistoryRelative" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "condition", "relative" })
@XmlRootElement(name = "family-history")
public class FamilyHistory {

	protected List<Condition> condition;
	protected FamilyHistoryRelative relative;

	/**
	 * Gets the value of the condition property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the condition property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCondition().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Condition
	 * }
	 * 
	 * 
	 */
	public List<Condition> getCondition() {
		if (condition == null) {
			condition = new ArrayList<Condition>();
		}
		return this.condition;
	}

	/**
	 * Gets the value of the relative property.
	 * 
	 * @return possible object is {@link FamilyHistoryRelative }
	 * 
	 */
	public FamilyHistoryRelative getRelative() {
		return relative;
	}

	/**
	 * Sets the value of the relative property.
	 * 
	 * @param value
	 *            allowed object is {@link FamilyHistoryRelative }
	 * 
	 */
	public void setRelative(FamilyHistoryRelative value) {
		this.relative = value;
	}

}
