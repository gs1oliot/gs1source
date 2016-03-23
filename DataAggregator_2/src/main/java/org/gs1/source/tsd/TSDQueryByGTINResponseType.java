//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_QueryByGTINResponseType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * productData �Ӽ��� ���� �����ɴϴ�.
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
     * productData �Ӽ��� ���� �����մϴ�.
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
     * noDataException �Ӽ��� ���� �����ɴϴ�.
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
     * noDataException �Ӽ��� ���� �����մϴ�.
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
     * invalidGTINException �Ӽ��� ���� �����ɴϴ�.
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
     * invalidGTINException �Ӽ��� ���� �����մϴ�.
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
     * invalidTargetMarketException �Ӽ��� ���� �����ɴϴ�.
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
     * invalidTargetMarketException �Ӽ��� ���� �����մϴ�.
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
     * unsupportedVersionException �Ӽ��� ���� �����ɴϴ�.
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
     * unsupportedVersionException �Ӽ��� ���� �����մϴ�.
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
     * invalidRequestException �Ӽ��� ���� �����ɴϴ�.
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
     * invalidRequestException �Ӽ��� ���� �����մϴ�.
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
     * securityException �Ӽ��� ���� �����ɴϴ�.
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
     * securityException �Ӽ��� ���� �����մϴ�.
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
     * implementationException �Ӽ��� ���� �����ɴϴ�.
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
     * implementationException �Ӽ��� ���� �����մϴ�.
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
