//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_AllergenRelatedInformationType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_AllergenRelatedInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergenStatement" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_FormattedDescription1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allergenSpecificationAgency" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="allergenSpecificationName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="allergen" type="{urn:gs1:tsd:product_allergen_information_module:xsd:1}TSD_AllergenType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_AllergenRelatedInformationType", namespace = "urn:gs1:tsd:product_allergen_information_module:xsd:1", propOrder = {
    "allergenStatement",
    "allergenSpecificationAgency",
    "allergenSpecificationName",
    "allergen",
    "avpList"
})
public class TSDAllergenRelatedInformationType {

    protected List<TSDFormattedDescription1000Type> allergenStatement;
    protected String allergenSpecificationAgency;
    protected String allergenSpecificationName;
    protected List<TSDAllergenType> allergen;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the allergenStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergenStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergenStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDFormattedDescription1000Type }
     * 
     * 
     */
    public List<TSDFormattedDescription1000Type> getAllergenStatement() {
        if (allergenStatement == null) {
            allergenStatement = new ArrayList<TSDFormattedDescription1000Type>();
        }
        return this.allergenStatement;
    }

    /**
     * allergenSpecificationAgency �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergenSpecificationAgency() {
        return allergenSpecificationAgency;
    }

    /**
     * allergenSpecificationAgency �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergenSpecificationAgency(String value) {
        this.allergenSpecificationAgency = value;
    }

    /**
     * allergenSpecificationName �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergenSpecificationName() {
        return allergenSpecificationName;
    }

    /**
     * allergenSpecificationName �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergenSpecificationName(String value) {
        this.allergenSpecificationName = value;
    }

    /**
     * Gets the value of the allergen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDAllergenType }
     * 
     * 
     */
    public List<TSDAllergenType> getAllergen() {
        if (allergen == null) {
            allergen = new ArrayList<TSDAllergenType>();
        }
        return this.allergen;
    }

    /**
     * avpList �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public TSDAttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * avpList �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public void setAvpList(TSDAttributeValuePairListType value) {
        this.avpList = value;
    }

}
