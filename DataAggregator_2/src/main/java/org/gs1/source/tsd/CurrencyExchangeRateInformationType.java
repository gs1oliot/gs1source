//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CurrencyExchangeRateInformationType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="CurrencyExchangeRateInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyConversionFromCode" type="{urn:gs1:shared:shared_common:xsd:3}CurrencyCodeType"/>
 *         &lt;element name="currencyConversionToCode" type="{urn:gs1:shared:shared_common:xsd:3}CurrencyCodeType"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="exchangeRateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchangeRateInformationType", propOrder = {
    "currencyConversionFromCode",
    "currencyConversionToCode",
    "exchangeRate",
    "exchangeRateDateTime"
})
public class CurrencyExchangeRateInformationType {

    @XmlElement(required = true)
    protected CurrencyCodeType currencyConversionFromCode;
    @XmlElement(required = true)
    protected CurrencyCodeType currencyConversionToCode;
    protected Float exchangeRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeRateDateTime;

    /**
     * currencyConversionFromCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyConversionFromCode() {
        return currencyConversionFromCode;
    }

    /**
     * currencyConversionFromCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyConversionFromCode(CurrencyCodeType value) {
        this.currencyConversionFromCode = value;
    }

    /**
     * currencyConversionToCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyConversionToCode() {
        return currencyConversionToCode;
    }

    /**
     * currencyConversionToCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyConversionToCode(CurrencyCodeType value) {
        this.currencyConversionToCode = value;
    }

    /**
     * exchangeRate �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExchangeRate() {
        return exchangeRate;
    }

    /**
     * exchangeRate �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExchangeRate(Float value) {
        this.exchangeRate = value;
    }

    /**
     * exchangeRateDateTime �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateDateTime() {
        return exchangeRateDateTime;
    }

    /**
     * exchangeRateDateTime �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateDateTime(XMLGregorianCalendar value) {
        this.exchangeRateDateTime = value;
    }

}
