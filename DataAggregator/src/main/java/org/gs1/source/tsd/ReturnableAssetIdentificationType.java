//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.07.30 시간 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReturnableAssetIdentificationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ReturnableAssetIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grai" type="{urn:gs1:shared:shared_common:xsd:3}GRAIType"/>
 *         &lt;element name="additionalReturnableAssetIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalReturnableAssetIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnableAssetIdentificationType", propOrder = {
    "grai",
    "additionalReturnableAssetIdentification"
})
public class ReturnableAssetIdentificationType {

    @XmlElement(required = true)
    protected String grai;
    protected List<AdditionalReturnableAssetIdentificationType> additionalReturnableAssetIdentification;

    /**
     * grai 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrai() {
        return grai;
    }

    /**
     * grai 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrai(String value) {
        this.grai = value;
    }

    /**
     * Gets the value of the additionalReturnableAssetIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalReturnableAssetIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalReturnableAssetIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReturnableAssetIdentificationType }
     * 
     * 
     */
    public List<AdditionalReturnableAssetIdentificationType> getAdditionalReturnableAssetIdentification() {
        if (additionalReturnableAssetIdentification == null) {
            additionalReturnableAssetIdentification = new ArrayList<AdditionalReturnableAssetIdentificationType>();
        }
        return this.additionalReturnableAssetIdentification;
    }

}
