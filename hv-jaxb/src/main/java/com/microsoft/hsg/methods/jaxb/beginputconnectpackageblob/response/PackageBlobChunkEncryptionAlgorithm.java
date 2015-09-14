//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 09:57:01 PM PDT 
//

package com.microsoft.hsg.methods.jaxb.beginputconnectpackageblob.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PackageBlobChunkEncryptionAlgorithm.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="PackageBlobChunkEncryptionAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aes256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageBlobChunkEncryptionAlgorithm")
@XmlEnum
public enum PackageBlobChunkEncryptionAlgorithm {

	/**
	 * 
	 * <pre>
	 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.BeginPutConnectPackageBlob" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
	 *                             Encrypted using the  AES256 encryption function.
	 *                         &lt;/summary&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlEnumValue("aes256") AES_256("aes256");
	private final String value;

	PackageBlobChunkEncryptionAlgorithm(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static PackageBlobChunkEncryptionAlgorithm fromValue(String v) {
		for (PackageBlobChunkEncryptionAlgorithm c : PackageBlobChunkEncryptionAlgorithm.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
