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
 * <p>SizeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SizeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptiveSize" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" minOccurs="0"/>
 *         &lt;element name="sizeCode" type="{urn:gs1:shared:shared_common:xsd:3}SizeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SizeType", propOrder = {
    "descriptiveSize",
    "sizeCode"
})
public class SizeType {

    protected Description80Type descriptiveSize;
    protected SizeCodeType sizeCode;

    /**
     * descriptiveSize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Description80Type }
     *     
     */
    public Description80Type getDescriptiveSize() {
        return descriptiveSize;
    }

    /**
     * descriptiveSize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Description80Type }
     *     
     */
    public void setDescriptiveSize(Description80Type value) {
        this.descriptiveSize = value;
    }

    /**
     * sizeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SizeCodeType }
     *     
     */
    public SizeCodeType getSizeCode() {
        return sizeCode;
    }

    /**
     * sizeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeCodeType }
     *     
     */
    public void setSizeCode(SizeCodeType value) {
        this.sizeCode = value;
    }

}
