//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.07.30 시간 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_QueryByGTINResponseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_QueryByGTINResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="productData" type="{urn:gs1:tsd:product_data:xsd:1}TSD_ProductDataType"/>
 *           &lt;element name="noDataException" type="{urn:gs1:tsd:query_by_gtin_response:xsd:1}TSD_NoDataExceptionType"/>
 *           &lt;element name="invalidGTINException" type="{urn:gs1:tsd:query_by_gtin_response:xsd:1}TSD_InvalidGTINExceptionType"/>
 *           &lt;element name="invalidTargetMarketException" type="{urn:gs1:tsd:query_by_gtin_response:xsd:1}TSD_InvalidTargetMarketExceptionType"/>
 *           &lt;element name="unsupportedVersionException" type="{urn:gs1:tsd:query_by_gtin_response:xsd:1}TSD_UnsupportedVersionExceptionType"/>
 *           &lt;element name="invalidRequestException" type="{urn:gs1:tsd:query_by_gtin_response:xsd:1}TSD_InvalidRequestExceptionType"/>
 *           &lt;element name="securityException" type="{urn:gs1:tsd:query_by_gtin_response:xsd:1}TSD_SecurityExceptionType"/>
 *           &lt;element name="implementationException" type="{urn:gs1:tsd:query_by_gtin_response:xsd:1}TSD_ImplementationExceptionType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_QueryByGTINResponseType", namespace = "urn:gs1:tsd:query_by_gtin_response:xsd:1", propOrder = {
    "productData",
    "noDataException",
    "invalidGTINException",
    "invalidTargetMarketException",
    "unsupportedVersionException",
    "invalidRequestException",
    "securityException",
    "implementationException"
})
public class TSDQueryByGTINResponseType {

    protected TSDProductDataType productData;
    protected TSDNoDataExceptionType noDataException;
    protected TSDInvalidGTINExceptionType invalidGTINException;
    protected TSDInvalidTargetMarketExceptionType invalidTargetMarketException;
    protected TSDUnsupportedVersionExceptionType unsupportedVersionException;
    protected TSDInvalidRequestExceptionType invalidRequestException;
    protected TSDSecurityExceptionType securityException;
    protected TSDImplementationExceptionType implementationException;

    /**
     * productData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDProductDataType }
     *     
     */
    public TSDProductDataType getProductData() {
        return productData;
    }

    /**
     * productData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDProductDataType }
     *     
     */
    public void setProductData(TSDProductDataType value) {
        this.productData = value;
    }

    /**
     * noDataException 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDNoDataExceptionType }
     *     
     */
    public TSDNoDataExceptionType getNoDataException() {
        return noDataException;
    }

    /**
     * noDataException 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDNoDataExceptionType }
     *     
     */
    public void setNoDataException(TSDNoDataExceptionType value) {
        this.noDataException = value;
    }

    /**
     * invalidGTINException 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDInvalidGTINExceptionType }
     *     
     */
    public TSDInvalidGTINExceptionType getInvalidGTINException() {
        return invalidGTINException;
    }

    /**
     * invalidGTINException 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDInvalidGTINExceptionType }
     *     
     */
    public void setInvalidGTINException(TSDInvalidGTINExceptionType value) {
        this.invalidGTINException = value;
    }

    /**
     * invalidTargetMarketException 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDInvalidTargetMarketExceptionType }
     *     
     */
    public TSDInvalidTargetMarketExceptionType getInvalidTargetMarketException() {
        return invalidTargetMarketException;
    }

    /**
     * invalidTargetMarketException 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDInvalidTargetMarketExceptionType }
     *     
     */
    public void setInvalidTargetMarketException(TSDInvalidTargetMarketExceptionType value) {
        this.invalidTargetMarketException = value;
    }

    /**
     * unsupportedVersionException 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDUnsupportedVersionExceptionType }
     *     
     */
    public TSDUnsupportedVersionExceptionType getUnsupportedVersionException() {
        return unsupportedVersionException;
    }

    /**
     * unsupportedVersionException 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDUnsupportedVersionExceptionType }
     *     
     */
    public void setUnsupportedVersionException(TSDUnsupportedVersionExceptionType value) {
        this.unsupportedVersionException = value;
    }

    /**
     * invalidRequestException 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDInvalidRequestExceptionType }
     *     
     */
    public TSDInvalidRequestExceptionType getInvalidRequestException() {
        return invalidRequestException;
    }

    /**
     * invalidRequestException 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDInvalidRequestExceptionType }
     *     
     */
    public void setInvalidRequestException(TSDInvalidRequestExceptionType value) {
        this.invalidRequestException = value;
    }

    /**
     * securityException 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDSecurityExceptionType }
     *     
     */
    public TSDSecurityExceptionType getSecurityException() {
        return securityException;
    }

    /**
     * securityException 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDSecurityExceptionType }
     *     
     */
    public void setSecurityException(TSDSecurityExceptionType value) {
        this.securityException = value;
    }

    /**
     * implementationException 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDImplementationExceptionType }
     *     
     */
    public TSDImplementationExceptionType getImplementationException() {
        return implementationException;
    }

    /**
     * implementationException 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDImplementationExceptionType }
     *     
     */
    public void setImplementationException(TSDImplementationExceptionType value) {
        this.implementationException = value;
    }

}
