//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.07.30 시간 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ProductQuantityInformationModuleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductQuantityInformationModuleType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModuleType">
 *       &lt;sequence>
 *         &lt;element name="netContent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="drainedWeight" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
 *         &lt;element name="percentageOfAlcoholByVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="servingQuantityInformation" type="{urn:gs1:tsd:product_quantity_information_module:xsd:1}TSD_ServingQuantityInformationType" minOccurs="0"/>
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
@XmlType(name = "TSD_ProductQuantityInformationModuleType", namespace = "urn:gs1:tsd:product_quantity_information_module:xsd:1", propOrder = {
    "netContent",
    "drainedWeight",
    "percentageOfAlcoholByVolume",
    "servingQuantityInformation",
    "avpList"
})
public class TSDProductQuantityInformationModuleType
    extends TSDModuleType
{

    protected List<MeasurementType> netContent;
    protected MeasurementType drainedWeight;
    protected BigDecimal percentageOfAlcoholByVolume;
    protected TSDServingQuantityInformationType servingQuantityInformation;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the netContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getNetContent() {
        if (netContent == null) {
            netContent = new ArrayList<MeasurementType>();
        }
        return this.netContent;
    }

    /**
     * drainedWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getDrainedWeight() {
        return drainedWeight;
    }

    /**
     * drainedWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setDrainedWeight(MeasurementType value) {
        this.drainedWeight = value;
    }

    /**
     * percentageOfAlcoholByVolume 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageOfAlcoholByVolume() {
        return percentageOfAlcoholByVolume;
    }

    /**
     * percentageOfAlcoholByVolume 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageOfAlcoholByVolume(BigDecimal value) {
        this.percentageOfAlcoholByVolume = value;
    }

    /**
     * servingQuantityInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDServingQuantityInformationType }
     *     
     */
    public TSDServingQuantityInformationType getServingQuantityInformation() {
        return servingQuantityInformation;
    }

    /**
     * servingQuantityInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDServingQuantityInformationType }
     *     
     */
    public void setServingQuantityInformation(TSDServingQuantityInformationType value) {
        this.servingQuantityInformation = value;
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
