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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ExceptionType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_ExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exceptionReason" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_ExceptionType", namespace = "urn:gs1:tsd:tsd_common:xsd:1", propOrder = {
    "exceptionReason"
})
@XmlSeeAlso({
    TSDUnsupportedVersionExceptionType.class,
    TSDImplementationExceptionType.class,
    TSDInvalidGTINExceptionType.class,
    TSDInvalidRequestExceptionType.class,
    TSDSecurityExceptionType.class,
    TSDInvalidTargetMarketExceptionType.class,
    TSDNoDataExceptionType.class
})
public class TSDExceptionType {

    @XmlElement(required = true)
    protected Description200Type exceptionReason;

    /**
     * exceptionReason �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link Description200Type }
     *     
     */
    public Description200Type getExceptionReason() {
        return exceptionReason;
    }

    /**
     * exceptionReason �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link Description200Type }
     *     
     */
    public void setExceptionReason(Description200Type value) {
        this.exceptionReason = value;
    }

}
