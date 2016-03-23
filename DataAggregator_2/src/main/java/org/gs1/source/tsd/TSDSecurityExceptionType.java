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
 * <p>TSD_SecurityExceptionType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_SecurityExceptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ExceptionType">
 *       &lt;sequence>
 *         &lt;element name="exceptionContactDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_SecurityExceptionType", namespace = "urn:gs1:tsd:query_by_gtin_response:xsd:1", propOrder = {
    "exceptionContactDescription"
})
public class TSDSecurityExceptionType
    extends TSDExceptionType
{

    protected Description200Type exceptionContactDescription;

    /**
     * exceptionContactDescription �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link Description200Type }
     *     
     */
    public Description200Type getExceptionContactDescription() {
        return exceptionContactDescription;
    }

    /**
     * exceptionContactDescription �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link Description200Type }
     *     
     */
    public void setExceptionContactDescription(Description200Type value) {
        this.exceptionContactDescription = value;
    }

}
