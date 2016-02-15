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
 * <p>IndividualAssetIdentificationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IndividualAssetIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giai" type="{urn:gs1:shared:shared_common:xsd:3}GIAIType"/>
 *         &lt;element name="additionalIndividualAssetIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalIndividualAssetIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualAssetIdentificationType", propOrder = {
    "giai",
    "additionalIndividualAssetIdentification"
})
public class IndividualAssetIdentificationType {

    @XmlElement(required = true)
    protected String giai;
    protected List<AdditionalIndividualAssetIdentificationType> additionalIndividualAssetIdentification;

    /**
     * giai 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiai() {
        return giai;
    }

    /**
     * giai 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiai(String value) {
        this.giai = value;
    }

    /**
     * Gets the value of the additionalIndividualAssetIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalIndividualAssetIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalIndividualAssetIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalIndividualAssetIdentificationType }
     * 
     * 
     */
    public List<AdditionalIndividualAssetIdentificationType> getAdditionalIndividualAssetIdentification() {
        if (additionalIndividualAssetIdentification == null) {
            additionalIndividualAssetIdentification = new ArrayList<AdditionalIndividualAssetIdentificationType>();
        }
        return this.additionalIndividualAssetIdentification;
    }

}
