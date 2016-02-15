//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_NutrientHeaderType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_NutrientHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preparationStateCode" type="{urn:gs1:tsd:nutritional_product_information_module:xsd:1}TSD_PreparationStateCodeType"/>
 *         &lt;element name="dailyValueIntakeReference" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servingSizeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servingSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nutrientBasisQuantity" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberOfServings" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nutrientDetail" type="{urn:gs1:tsd:nutritional_product_information_module:xsd:1}TSD_NutrientDetailType" maxOccurs="unbounded"/>
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
@XmlType(name = "TSD_NutrientHeaderType", namespace = "urn:gs1:tsd:nutritional_product_information_module:xsd:1", propOrder = {
    "preparationStateCode",
    "dailyValueIntakeReference",
    "servingSizeDescription",
    "servingSize",
    "nutrientBasisQuantity",
    "numberOfServings",
    "nutrientDetail",
    "avpList"
})
public class TSDNutrientHeaderType {

    @XmlElement(required = true)
    protected TSDPreparationStateCodeType preparationStateCode;
    protected List<Description70Type> dailyValueIntakeReference;
    protected List<Description70Type> servingSizeDescription;
    protected List<MeasurementType> servingSize;
    protected List<MeasurementType> nutrientBasisQuantity;
    protected BigDecimal numberOfServings;
    @XmlElement(required = true)
    protected List<TSDNutrientDetailType> nutrientDetail;
    protected TSDAttributeValuePairListType avpList;

    /**
     * preparationStateCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TSDPreparationStateCodeType }
     *     
     */
    public TSDPreparationStateCodeType getPreparationStateCode() {
        return preparationStateCode;
    }

    /**
     * preparationStateCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDPreparationStateCodeType }
     *     
     */
    public void setPreparationStateCode(TSDPreparationStateCodeType value) {
        this.preparationStateCode = value;
    }

    /**
     * Gets the value of the dailyValueIntakeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dailyValueIntakeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailyValueIntakeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getDailyValueIntakeReference() {
        if (dailyValueIntakeReference == null) {
            dailyValueIntakeReference = new ArrayList<Description70Type>();
        }
        return this.dailyValueIntakeReference;
    }

    /**
     * Gets the value of the servingSizeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servingSizeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServingSizeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getServingSizeDescription() {
        if (servingSizeDescription == null) {
            servingSizeDescription = new ArrayList<Description70Type>();
        }
        return this.servingSizeDescription;
    }

    /**
     * Gets the value of the servingSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servingSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServingSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getServingSize() {
        if (servingSize == null) {
            servingSize = new ArrayList<MeasurementType>();
        }
        return this.servingSize;
    }

    /**
     * Gets the value of the nutrientBasisQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrientBasisQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrientBasisQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getNutrientBasisQuantity() {
        if (nutrientBasisQuantity == null) {
            nutrientBasisQuantity = new ArrayList<MeasurementType>();
        }
        return this.nutrientBasisQuantity;
    }

    /**
     * numberOfServings �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfServings() {
        return numberOfServings;
    }

    /**
     * numberOfServings �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfServings(BigDecimal value) {
        this.numberOfServings = value;
    }

    /**
     * Gets the value of the nutrientDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrientDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrientDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDNutrientDetailType }
     * 
     * 
     */
    public List<TSDNutrientDetailType> getNutrientDetail() {
        if (nutrientDetail == null) {
            nutrientDetail = new ArrayList<TSDNutrientDetailType>();
        }
        return this.nutrientDetail;
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
