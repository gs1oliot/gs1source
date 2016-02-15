//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ProductQuantityInformationModuleType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * drainedWeight �Ӽ��� ���� �����ɴϴ�.
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
     * drainedWeight �Ӽ��� ���� �����մϴ�.
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
     * percentageOfAlcoholByVolume �Ӽ��� ���� �����ɴϴ�.
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
     * percentageOfAlcoholByVolume �Ӽ��� ���� �����մϴ�.
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
     * servingQuantityInformation �Ӽ��� ���� �����ɴϴ�.
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
     * servingQuantityInformation �Ӽ��� ���� �����մϴ�.
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
     * avpList �Ӽ��� ���� �����ɴϴ�.
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
     * avpList �Ӽ��� ���� �����մϴ�.
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
