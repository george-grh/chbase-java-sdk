//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.07 at 02:22:05 PM PDT 
//

package com.microsoft.hsg.thing.oxm.jaxb.medicalimagestudy2;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.microsoft.hsg.thing.oxm.jaxb.medicalimagestudy2 package.
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
	 * com.microsoft.hsg.thing.oxm.jaxb.medicalimagestudy2
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link MedicalImageStudy }
	 * 
	 */
	public MedicalImageStudy createMedicalImageStudy() {
		return new MedicalImageStudy();
	}

	/**
	 * Create an instance of {@link MedicalImageStudySeries }
	 * 
	 */
	public MedicalImageStudySeries createMedicalImageStudySeries() {
		return new MedicalImageStudySeries();
	}

	/**
	 * Create an instance of {@link MedicalImageStudySeriesImage }
	 * 
	 */
	public MedicalImageStudySeriesImage createMedicalImageStudySeriesImage() {
		return new MedicalImageStudySeriesImage();
	}

}
