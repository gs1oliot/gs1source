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
 * <p>FinancialAccountType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FinancialAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="financialAccountNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="financialAccountNumberTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}FinancialAccountNumberTypeCodeType"/>
 *         &lt;element name="financialAccountName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "FinancialAccountType", propOrder = {
    "financialAccountNumber",
    "financialAccountNumberTypeCode",
    "financialAccountName"
})
public class FinancialAccountType {

    @XmlElement(required = true)
    protected String financialAccountNumber;
    @XmlElement(required = true)
    protected FinancialAccountNumberTypeCodeType financialAccountNumberTypeCode;
    protected String financialAccountName;

    /**
     * financialAccountNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialAccountNumber() {
        return financialAccountNumber;
    }

    /**
     * financialAccountNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialAccountNumber(String value) {
        this.financialAccountNumber = value;
    }

    /**
     * financialAccountNumberTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountNumberTypeCodeType }
     *     
     */
    public FinancialAccountNumberTypeCodeType getFinancialAccountNumberTypeCode() {
        return financialAccountNumberTypeCode;
    }

    /**
     * financialAccountNumberTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountNumberTypeCodeType }
     *     
     */
    public void setFinancialAccountNumberTypeCode(FinancialAccountNumberTypeCodeType value) {
        this.financialAccountNumberTypeCode = value;
    }

    /**
     * financialAccountName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialAccountName() {
        return financialAccountName;
    }

    /**
     * financialAccountName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialAccountName(String value) {
        this.financialAccountName = value;
    }

}
