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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ProductInstructionsModuleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductInstructionsModuleType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModuleType">
 *       &lt;sequence>
 *         &lt;element name="consumerUsageInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consumerStorageInstructions" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_ProductInstructionsModuleType", namespace = "urn:gs1:tsd:product_instructions_module:xsd:1", propOrder = {
    "consumerUsageInstructions",
    "consumerStorageInstructions",
    "avpList"
})
public class TSDProductInstructionsModuleType
    extends TSDModuleType
{

    protected List<Description1000Type> consumerUsageInstructions;
    protected List<Description1000Type> consumerStorageInstructions;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the consumerUsageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerUsageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerUsageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getConsumerUsageInstructions() {
        if (consumerUsageInstructions == null) {
            consumerUsageInstructions = new ArrayList<Description1000Type>();
        }
        return this.consumerUsageInstructions;
    }

    /**
     * Gets the value of the consumerStorageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerStorageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerStorageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getConsumerStorageInstructions() {
        if (consumerStorageInstructions == null) {
            consumerStorageInstructions = new ArrayList<Description1000Type>();
        }
        return this.consumerStorageInstructions;
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
