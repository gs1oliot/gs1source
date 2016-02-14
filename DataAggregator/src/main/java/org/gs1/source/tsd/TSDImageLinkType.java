//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.07.30 시간 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ImageLinkType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_ImageLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *               &lt;maxLength value="2500"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="imageTypeCode" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ImageTypeCodeType"/>
 *         &lt;element name="languageCode" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imagePixelHeight" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="imagePixelWidth" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
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
@XmlType(name = "TSD_ImageLinkType", namespace = "urn:gs1:tsd:tsd_common:xsd:1", propOrder = {
    "url",
    "imageTypeCode",
    "languageCode",
    "imagePixelHeight",
    "imagePixelWidth",
    "fileSize",
    "avpList"
})
public class TSDImageLinkType {

    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected TSDImageTypeCodeType imageTypeCode;
    protected List<LanguageCodeType> languageCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger imagePixelHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger imagePixelWidth;
    protected MeasurementType fileSize;
    protected TSDAttributeValuePairListType avpList;

    /**
     * url 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * url 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * imageTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDImageTypeCodeType }
     *     
     */
    public TSDImageTypeCodeType getImageTypeCode() {
        return imageTypeCode;
    }

    /**
     * imageTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDImageTypeCodeType }
     *     
     */
    public void setImageTypeCode(TSDImageTypeCodeType value) {
        this.imageTypeCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getLanguageCode() {
        if (languageCode == null) {
            languageCode = new ArrayList<LanguageCodeType>();
        }
        return this.languageCode;
    }

    /**
     * imagePixelHeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImagePixelHeight() {
        return imagePixelHeight;
    }

    /**
     * imagePixelHeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImagePixelHeight(BigInteger value) {
        this.imagePixelHeight = value;
    }

    /**
     * imagePixelWidth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImagePixelWidth() {
        return imagePixelWidth;
    }

    /**
     * imagePixelWidth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImagePixelWidth(BigInteger value) {
        this.imagePixelWidth = value;
    }

    /**
     * fileSize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getFileSize() {
        return fileSize;
    }

    /**
     * fileSize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setFileSize(MeasurementType value) {
        this.fileSize = value;
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
