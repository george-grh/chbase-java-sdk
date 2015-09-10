//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:16:08 PM PST 
//


package com.microsoft.hsg.methods.jaxb.sendinsecuremessagefromapplication.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.types.RcptAddress;
import com.microsoft.hsg.thing.oxm.jaxb.types.RcptPerson;
import com.microsoft.hsg.thing.oxm.jaxb.types.RcptRecord;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.SendInsecureMessageFromApplication" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the request that contains the method
 *                         specific parameters.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.SendInsecureMessageFromApplication" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         All requests contain the info element to pass parameters
 *                         that are specific to each method. If the method does not
 *                         define an info element, the method does not take any
 *                         parameters.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from-mailbox" type="{urn:com.microsoft.wc.methods.SendInsecureMessageFromApplication}FromMailbox"/>
 *         &lt;element name="rcpt-address" type="{urn:com.microsoft.wc.types}RcptAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rcpt-person" type="{urn:com.microsoft.wc.types}RcptPerson" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rcpt-record" type="{urn:com.microsoft.wc.types}RcptRecord" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text-body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="html-body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fromMailbox",
    "rcptAddress",
    "rcptPerson",
    "rcptRecord",
    "subject",
    "textBody",
    "htmlBody"
})
@XmlRootElement(name = "info")
public class SendInsecureMessageFromApplicationRequest {

    @XmlElement(name = "from-mailbox", required = true)
    protected FromMailbox fromMailbox;
    @XmlElement(name = "rcpt-address")
    protected List<RcptAddress> rcptAddress;
    @XmlElement(name = "rcpt-person")
    protected List<RcptPerson> rcptPerson;
    @XmlElement(name = "rcpt-record")
    protected RcptRecord rcptRecord;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(name = "text-body")
    protected String textBody;
    @XmlElement(name = "html-body")
    protected String htmlBody;

    /**
     * Gets the value of the fromMailbox property.
     * 
     * @return
     *     possible object is
     *     {@link FromMailbox }
     *     
     */
    public FromMailbox getFromMailbox() {
        return fromMailbox;
    }

    /**
     * Sets the value of the fromMailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromMailbox }
     *     
     */
    public void setFromMailbox(FromMailbox value) {
        this.fromMailbox = value;
    }

    /**
     * Gets the value of the rcptAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcptAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcptAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RcptAddress }
     * 
     * 
     */
    public List<RcptAddress> getRcptAddress() {
        if (rcptAddress == null) {
            rcptAddress = new ArrayList<RcptAddress>();
        }
        return this.rcptAddress;
    }

    /**
     * Gets the value of the rcptPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcptPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcptPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RcptPerson }
     * 
     * 
     */
    public List<RcptPerson> getRcptPerson() {
        if (rcptPerson == null) {
            rcptPerson = new ArrayList<RcptPerson>();
        }
        return this.rcptPerson;
    }

    /**
     * Gets the value of the rcptRecord property.
     * 
     * @return
     *     possible object is
     *     {@link RcptRecord }
     *     
     */
    public RcptRecord getRcptRecord() {
        return rcptRecord;
    }

    /**
     * Sets the value of the rcptRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link RcptRecord }
     *     
     */
    public void setRcptRecord(RcptRecord value) {
        this.rcptRecord = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the textBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextBody() {
        return textBody;
    }

    /**
     * Sets the value of the textBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextBody(String value) {
        this.textBody = value;
    }

    /**
     * Gets the value of the htmlBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlBody() {
        return htmlBody;
    }

    /**
     * Sets the value of the htmlBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlBody(String value) {
        this.htmlBody = value;
    }

}
