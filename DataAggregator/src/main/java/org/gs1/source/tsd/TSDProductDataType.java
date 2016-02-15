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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>TSD_ProductDataType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gtin" type="{urn:gs1:shared:shared_common:xsd:3}GTINType"/>
 *         &lt;element name="targetMarket" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType"/>
 *         &lt;element name="informationProviderGLN" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/>
 *         &lt;element name="informationProviderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeToLive" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="productDataRecord" type="{urn:gs1:tsd:product_data:xsd:1}TSD_ProductDataRecordType" maxOccurs="unbounded"/>
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
@XmlType(name = "TSD_ProductDataType", namespace = "urn:gs1:tsd:product_data:xsd:1", propOrder = {
    "gtin",
    "targetMarket",
    "informationProviderGLN",
    "informationProviderName",
    "timeToLive",
    "productDataRecord",
    "avpList"
})
public class TSDProductDataType {

    @XmlElement(required = true)
    protected String gtin;
    @XmlElement(required = true)
    protected CountryCodeType targetMarket;
    @XmlElement(required = true)
    protected String informationProviderGLN;
    @XmlElement(required = true)
    protected String informationProviderName;
    protected Duration timeToLive;
    @XmlElement(required = true)
    protected List<TSDProductDataRecordType> productDataRecord;
    protected TSDAttributeValuePairListType avpList;

    /**
     * gtin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * gtin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtin(String value) {
        this.gtin = value;
    }

    /**
     * targetMarket 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getTargetMarket() {
        return targetMarket;
    }

    /**
     * targetMarket 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setTargetMarket(CountryCodeType value) {
        this.targetMarket = value;
    }

    /**
     * informationProviderGLN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationProviderGLN() {
        return informationProviderGLN;
    }

    /**
     * informationProviderGLN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationProviderGLN(String value) {
        this.informationProviderGLN = value;
    }

    /**
     * informationProviderName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationProviderName() {
        return informationProviderName;
    }

    /**
     * informationProviderName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationProviderName(String value) {
        this.informationProviderName = value;
    }

    /**
     * timeToLive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeToLive() {
        return timeToLive;
    }

    /**
     * timeToLive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeToLive(Duration value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the productDataRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDataRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDataRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDProductDataRecordType }
     * 
     * 
     */
    public List<TSDProductDataRecordType> getProductDataRecord() {
        if (productDataRecord == null) {
            productDataRecord = new ArrayList<TSDProductDataRecordType>();
        }
        return this.productDataRecord;
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
