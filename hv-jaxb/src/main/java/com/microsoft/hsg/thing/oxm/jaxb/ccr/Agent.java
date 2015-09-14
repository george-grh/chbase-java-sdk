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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="Products" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Product" type="{urn:astm-org:CCR}StructuredProductType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EnvironmentalAgents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EnvironmentalAgent" type="{urn:astm-org:CCR}CCRCodedDataObjectType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Problems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Problem" type="{urn:astm-org:CCR}ProblemType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{urn:astm-org:CCR}Procedures" minOccurs="0"/>
 *         &lt;element name="Results" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Result" type="{urn:astm-org:CCR}ResultType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "products", "environmentalAgents", "problems", "procedures", "results" })
@XmlRootElement(name = "Agent")
public class Agent {

	@XmlElement(name = "Products")
	protected Agent.Products products;
	@XmlElement(name = "EnvironmentalAgents")
	protected Agent.EnvironmentalAgents environmentalAgents;
	@XmlElement(name = "Problems")
	protected Agent.Problems problems;
	@XmlElement(name = "Procedures")
	protected Procedures procedures;
	@XmlElement(name = "Results")
	protected Agent.Results results;

	/**
	 * Gets the value of the products property.
	 * 
	 * @return possible object is {@link Agent.Products }
	 * 
	 */
	public Agent.Products getProducts() {
		return products;
	}

	/**
	 * Sets the value of the products property.
	 * 
	 * @param value
	 *            allowed object is {@link Agent.Products }
	 * 
	 */
	public void setProducts(Agent.Products value) {
		this.products = value;
	}

	/**
	 * Gets the value of the environmentalAgents property.
	 * 
	 * @return possible object is {@link Agent.EnvironmentalAgents }
	 * 
	 */
	public Agent.EnvironmentalAgents getEnvironmentalAgents() {
		return environmentalAgents;
	}

	/**
	 * Sets the value of the environmentalAgents property.
	 * 
	 * @param value
	 *            allowed object is {@link Agent.EnvironmentalAgents }
	 * 
	 */
	public void setEnvironmentalAgents(Agent.EnvironmentalAgents value) {
		this.environmentalAgents = value;
	}

	/**
	 * Gets the value of the problems property.
	 * 
	 * @return possible object is {@link Agent.Problems }
	 * 
	 */
	public Agent.Problems getProblems() {
		return problems;
	}

	/**
	 * Sets the value of the problems property.
	 * 
	 * @param value
	 *            allowed object is {@link Agent.Problems }
	 * 
	 */
	public void setProblems(Agent.Problems value) {
		this.problems = value;
	}

	/**
	 * Gets the value of the procedures property.
	 * 
	 * @return possible object is {@link Procedures }
	 * 
	 */
	public Procedures getProcedures() {
		return procedures;
	}

	/**
	 * Sets the value of the procedures property.
	 * 
	 * @param value
	 *            allowed object is {@link Procedures }
	 * 
	 */
	public void setProcedures(Procedures value) {
		this.procedures = value;
	}

	/**
	 * Gets the value of the results property.
	 * 
	 * @return possible object is {@link Agent.Results }
	 * 
	 */
	public Agent.Results getResults() {
		return results;
	}

	/**
	 * Sets the value of the results property.
	 * 
	 * @param value
	 *            allowed object is {@link Agent.Results }
	 * 
	 */
	public void setResults(Agent.Results value) {
		this.results = value;
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
	 *         &lt;element name="EnvironmentalAgent" type="{urn:astm-org:CCR}CCRCodedDataObjectType" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "environmentalAgent" })
	public static class EnvironmentalAgents {

		@XmlElement(name = "EnvironmentalAgent", required = true)
		protected List<CCRCodedDataObjectType> environmentalAgent;

		/**
		 * Gets the value of the environmentalAgent property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the environmentalAgent property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getEnvironmentalAgent().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link CCRCodedDataObjectType }
		 * 
		 * 
		 */
		public List<CCRCodedDataObjectType> getEnvironmentalAgent() {
			if (environmentalAgent == null) {
				environmentalAgent = new ArrayList<CCRCodedDataObjectType>();
			}
			return this.environmentalAgent;
		}

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
	 *         &lt;element name="Problem" type="{urn:astm-org:CCR}ProblemType" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "problem" })
	public static class Problems {

		@XmlElement(name = "Problem", required = true)
		protected List<ProblemType> problem;

		/**
		 * Gets the value of the problem property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the problem property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getProblem().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link ProblemType }
		 * 
		 * 
		 */
		public List<ProblemType> getProblem() {
			if (problem == null) {
				problem = new ArrayList<ProblemType>();
			}
			return this.problem;
		}

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
	 *         &lt;element name="Result" type="{urn:astm-org:CCR}ResultType" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "result" })
	public static class Results {

		@XmlElement(name = "Result", required = true)
		protected List<ResultType> result;

		/**
		 * Gets the value of the result property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the result property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getResult().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link ResultType }
		 * 
		 * 
		 */
		public List<ResultType> getResult() {
			if (result == null) {
				result = new ArrayList<ResultType>();
			}
			return this.result;
		}

	}

}
