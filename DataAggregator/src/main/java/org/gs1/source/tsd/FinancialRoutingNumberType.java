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
 * <p>FinancialRoutingNumberType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="FinancialRoutingNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="financialRoutingNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="financialRoutingNumberTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}FinancialRoutingNumberTypeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRoutingNumberType", propOrder = {
    "financialRoutingNumber",
    "financialRoutingNumberTypeCode"
})
public class FinancialRoutingNumberType {

    @XmlElement(required = true)
    protected String financialRoutingNumber;
    @XmlElement(required = true)
    protected FinancialRoutingNumberTypeCodeType financialRoutingNumberTypeCode;

    /**
     * financialRoutingNumber �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialRoutingNumber() {
        return financialRoutingNumber;
    }

    /**
     * financialRoutingNumber �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialRoutingNumber(String value) {
        this.financialRoutingNumber = value;
    }

    /**
     * financialRoutingNumberTypeCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRoutingNumberTypeCodeType }
     *     
     */
    public FinancialRoutingNumberTypeCodeType getFinancialRoutingNumberTypeCode() {
        return financialRoutingNumberTypeCode;
    }

    /**
     * financialRoutingNumberTypeCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRoutingNumberTypeCodeType }
     *     
     */
    public void setFinancialRoutingNumberTypeCode(FinancialRoutingNumberTypeCodeType value) {
        this.financialRoutingNumberTypeCode = value;
    }

}
