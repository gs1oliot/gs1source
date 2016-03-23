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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FinancialAccountType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * financialAccountNumber �Ӽ��� ���� �����ɴϴ�.
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
     * financialAccountNumber �Ӽ��� ���� �����մϴ�.
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
     * financialAccountNumberTypeCode �Ӽ��� ���� �����ɴϴ�.
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
     * financialAccountNumberTypeCode �Ӽ��� ���� �����մϴ�.
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
     * financialAccountName �Ӽ��� ���� �����ɴϴ�.
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
     * financialAccountName �Ӽ��� ���� �����մϴ�.
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
