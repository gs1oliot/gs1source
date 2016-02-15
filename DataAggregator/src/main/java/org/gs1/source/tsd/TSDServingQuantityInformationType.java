//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ServingQuantityInformationType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_ServingQuantityInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfServingsPerPackage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="measurementPrecisionCode" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_MeasurementPrecisionCodeType" minOccurs="0"/>
 *         &lt;element name="numberOfServingsRangeDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" minOccurs="0"/>
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
@XmlType(name = "TSD_ServingQuantityInformationType", namespace = "urn:gs1:tsd:product_quantity_information_module:xsd:1", propOrder = {
    "numberOfServingsPerPackage",
    "measurementPrecisionCode",
    "numberOfServingsRangeDescription",
    "avpList"
})
public class TSDServingQuantityInformationType {

    protected BigDecimal numberOfServingsPerPackage;
    protected TSDMeasurementPrecisionCodeType measurementPrecisionCode;
    protected Description70Type numberOfServingsRangeDescription;
    protected TSDAttributeValuePairListType avpList;

    /**
     * numberOfServingsPerPackage �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfServingsPerPackage() {
        return numberOfServingsPerPackage;
    }

    /**
     * numberOfServingsPerPackage �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfServingsPerPackage(BigDecimal value) {
        this.numberOfServingsPerPackage = value;
    }

    /**
     * measurementPrecisionCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TSDMeasurementPrecisionCodeType }
     *     
     */
    public TSDMeasurementPrecisionCodeType getMeasurementPrecisionCode() {
        return measurementPrecisionCode;
    }

    /**
     * measurementPrecisionCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDMeasurementPrecisionCodeType }
     *     
     */
    public void setMeasurementPrecisionCode(TSDMeasurementPrecisionCodeType value) {
        this.measurementPrecisionCode = value;
    }

    /**
     * numberOfServingsRangeDescription �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link Description70Type }
     *     
     */
    public Description70Type getNumberOfServingsRangeDescription() {
        return numberOfServingsRangeDescription;
    }

    /**
     * numberOfServingsRangeDescription �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link Description70Type }
     *     
     */
    public void setNumberOfServingsRangeDescription(Description70Type value) {
        this.numberOfServingsRangeDescription = value;
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
