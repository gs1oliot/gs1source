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
 * <p>TSD_PackagingSignatureLineType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_PackagingSignatureLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyContactRoleCode" type="{urn:gs1:tsd:basic_product_information_module:xsd:1}TSD_PartyContactRoleCodeType"/>
 *         &lt;element name="partyContactName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="partyContactAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="gln" type="{urn:gs1:shared:shared_common:xsd:3}GLNType" minOccurs="0"/>
 *         &lt;element name="communicationChannel" type="{urn:gs1:shared:shared_common:xsd:3}CommunicationChannelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_PackagingSignatureLineType", namespace = "urn:gs1:tsd:basic_product_information_module:xsd:1", propOrder = {
    "partyContactRoleCode",
    "partyContactName",
    "partyContactAddress",
    "gln",
    "communicationChannel",
    "avpList"
})
public class TSDPackagingSignatureLineType {

    @XmlElement(required = true)
    protected TSDPartyContactRoleCodeType partyContactRoleCode;
    protected String partyContactName;
    protected String partyContactAddress;
    protected String gln;
    protected List<CommunicationChannelType> communicationChannel;
    protected TSDAttributeValuePairListType avpList;

    /**
     * partyContactRoleCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDPartyContactRoleCodeType }
     *     
     */
    public TSDPartyContactRoleCodeType getPartyContactRoleCode() {
        return partyContactRoleCode;
    }

    /**
     * partyContactRoleCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDPartyContactRoleCodeType }
     *     
     */
    public void setPartyContactRoleCode(TSDPartyContactRoleCodeType value) {
        this.partyContactRoleCode = value;
    }

    /**
     * partyContactName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyContactName() {
        return partyContactName;
    }

    /**
     * partyContactName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyContactName(String value) {
        this.partyContactName = value;
    }

    /**
     * partyContactAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyContactAddress() {
        return partyContactAddress;
    }

    /**
     * partyContactAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyContactAddress(String value) {
        this.partyContactAddress = value;
    }

    /**
     * gln 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGln() {
        return gln;
    }

    /**
     * gln 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGln(String value) {
        this.gln = value;
    }

    /**
     * Gets the value of the communicationChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationChannelType }
     * 
     * 
     */
    public List<CommunicationChannelType> getCommunicationChannel() {
        if (communicationChannel == null) {
            communicationChannel = new ArrayList<CommunicationChannelType>();
        }
        return this.communicationChannel;
    }

    /**
     * avpList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public TSDAttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * avpList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public void setAvpList(TSDAttributeValuePairListType value) {
        this.avpList = value;
    }

}
