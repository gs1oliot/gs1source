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
 * <p>TSD_NutrientDetailType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_NutrientDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nutrientTypeCode" type="{urn:gs1:tsd:nutritional_product_information_module:xsd:1}TSD_NutrientTypeCodeType"/>
 *         &lt;element name="dailyValueIntakePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="measurementPrecision" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_MeasurementPrecisionCodeType" minOccurs="0"/>
 *         &lt;element name="quantityContained" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_NutrientDetailType", namespace = "urn:gs1:tsd:nutritional_product_information_module:xsd:1", propOrder = {
    "nutrientTypeCode",
    "dailyValueIntakePercent",
    "measurementPrecision",
    "quantityContained",
    "avpList"
})
public class TSDNutrientDetailType {

    @XmlElement(required = true)
    protected TSDNutrientTypeCodeType nutrientTypeCode;
    protected BigDecimal dailyValueIntakePercent;
    protected TSDMeasurementPrecisionCodeType measurementPrecision;
    protected List<MeasurementType> quantityContained;
    protected TSDAttributeValuePairListType avpList;

    /**
     * nutrientTypeCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TSDNutrientTypeCodeType }
     *     
     */
    public TSDNutrientTypeCodeType getNutrientTypeCode() {
        return nutrientTypeCode;
    }

    /**
     * nutrientTypeCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDNutrientTypeCodeType }
     *     
     */
    public void setNutrientTypeCode(TSDNutrientTypeCodeType value) {
        this.nutrientTypeCode = value;
    }

    /**
     * dailyValueIntakePercent �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDailyValueIntakePercent() {
        return dailyValueIntakePercent;
    }

    /**
     * dailyValueIntakePercent �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDailyValueIntakePercent(BigDecimal value) {
        this.dailyValueIntakePercent = value;
    }

    /**
     * measurementPrecision �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TSDMeasurementPrecisionCodeType }
     *     
     */
    public TSDMeasurementPrecisionCodeType getMeasurementPrecision() {
        return measurementPrecision;
    }

    /**
     * measurementPrecision �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDMeasurementPrecisionCodeType }
     *     
     */
    public void setMeasurementPrecision(TSDMeasurementPrecisionCodeType value) {
        this.measurementPrecision = value;
    }

    /**
     * Gets the value of the quantityContained property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityContained property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityContained().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getQuantityContained() {
        if (quantityContained == null) {
            quantityContained = new ArrayList<MeasurementType>();
        }
        return this.quantityContained;
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
