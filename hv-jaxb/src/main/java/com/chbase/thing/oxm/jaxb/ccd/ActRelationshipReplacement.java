//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.16 at 06:08:59 PM IST 
//


package com.chbase.thing.oxm.jaxb.ccd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActRelationshipReplacement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipReplacement">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RPLC"/>
 *     &lt;enumeration value="SUCC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipReplacement")
@XmlEnum
public enum ActRelationshipReplacement {

    RPLC,
    SUCC;

    public String value() {
        return name();
    }

    public static ActRelationshipReplacement fromValue(String v) {
        return valueOf(v);
    }

}
