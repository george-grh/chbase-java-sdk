//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:43:06 AM PST 
//

package com.microsoft.hsg.thing.oxm.jaxb.spirometer;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.microsoft.hsg.thing.oxm.jaxb.spirometer package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.microsoft.hsg.thing.oxm.jaxb.spirometer
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link VolumeValue }
	 * 
	 */
	public VolumeValue createVolumeValue() {
		return new VolumeValue();
	}

	/**
	 * Create an instance of {@link Spirometer }
	 * 
	 */
	public Spirometer createSpirometer() {
		return new Spirometer();
	}

}
