//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.07.30 시간 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_PreparationMethodType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_PreparationMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preparationTypeCode" type="{urn:gs1:tsd:food_and_beverage_preparation_information_module:xsd:1}TSD_PreparationTypeCodeType" minOccurs="0"/>
 *         &lt;element name="preparationInstructions" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_FormattedDescription2500Type" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_PreparationMethodType", namespace = "urn:gs1:tsd:food_and_beverage_preparation_information_module:xsd:1", propOrder = {
    "preparationTypeCode",
    "preparationInstructions",
    "avpList"
})
public class TSDPreparationMethodType {

    protected TSDPreparationTypeCodeType preparationTypeCode;
    protected List<TSDFormattedDescription2500Type> preparationInstructions;
    protected TSDAttributeValuePairListType avpList;

    /**
     * preparationTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDPreparationTypeCodeType }
     *     
     */
    public TSDPreparationTypeCodeType getPreparationTypeCode() {
        return preparationTypeCode;
    }

    /**
     * preparationTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDPreparationTypeCodeType }
     *     
     */
    public void setPreparationTypeCode(TSDPreparationTypeCodeType value) {
        this.preparationTypeCode = value;
    }

    /**
     * Gets the value of the preparationInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preparationInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreparationInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDFormattedDescription2500Type }
     * 
     * 
     */
    public List<TSDFormattedDescription2500Type> getPreparationInstructions() {
        if (preparationInstructions == null) {
            preparationInstructions = new ArrayList<TSDFormattedDescription2500Type>();
        }
        return this.preparationInstructions;
    }

    /**
     * avpList 속성의 값을 가져옵니다.
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
     * avpList 속성의 값을 설정합니다.
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
