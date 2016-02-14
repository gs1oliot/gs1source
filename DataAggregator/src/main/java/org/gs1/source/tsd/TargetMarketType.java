//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.07.30 시간 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TargetMarketType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TargetMarketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetMarketCountryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType"/>
 *         &lt;element name="targetMarketSubdivisionCode" type="{urn:gs1:shared:shared_common:xsd:3}CountrySubdivisionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarketType", propOrder = {
    "targetMarketCountryCode",
    "targetMarketSubdivisionCode"
})
public class TargetMarketType {

    @XmlElement(required = true)
    protected CountryCodeType targetMarketCountryCode;
    protected CountrySubdivisionCodeType targetMarketSubdivisionCode;

    /**
     * targetMarketCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getTargetMarketCountryCode() {
        return targetMarketCountryCode;
    }

    /**
     * targetMarketCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setTargetMarketCountryCode(CountryCodeType value) {
        this.targetMarketCountryCode = value;
    }

    /**
     * targetMarketSubdivisionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubdivisionCodeType }
     *     
     */
    public CountrySubdivisionCodeType getTargetMarketSubdivisionCode() {
        return targetMarketSubdivisionCode;
    }

    /**
     * targetMarketSubdivisionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubdivisionCodeType }
     *     
     */
    public void setTargetMarketSubdivisionCode(CountrySubdivisionCodeType value) {
        this.targetMarketSubdivisionCode = value;
    }

}
