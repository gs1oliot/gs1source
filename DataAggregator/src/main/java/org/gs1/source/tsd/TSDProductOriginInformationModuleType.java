//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ProductOriginInformationModuleType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductOriginInformationModuleType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModuleType">
 *       &lt;sequence>
 *         &lt;element name="productOriginStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productProvenanceStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countryOfOrigin" type="{urn:gs1:tsd:product_origin_information_module:xsd:1}TSD_CountryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productActivityDetails" type="{urn:gs1:tsd:product_origin_information_module:xsd:1}TSD_ProductActivityDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_ProductOriginInformationModuleType", namespace = "urn:gs1:tsd:product_origin_information_module:xsd:1", propOrder = {
    "productOriginStatement",
    "productProvenanceStatement",
    "countryOfOrigin",
    "productActivityDetails",
    "avpList"
})
public class TSDProductOriginInformationModuleType
    extends TSDModuleType
{

    protected List<Description200Type> productOriginStatement;
    protected List<Description200Type> productProvenanceStatement;
    protected List<TSDCountryType> countryOfOrigin;
    protected List<TSDProductActivityDetailsType> productActivityDetails;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the productOriginStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOriginStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOriginStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getProductOriginStatement() {
        if (productOriginStatement == null) {
            productOriginStatement = new ArrayList<Description200Type>();
        }
        return this.productOriginStatement;
    }

    /**
     * Gets the value of the productProvenanceStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productProvenanceStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductProvenanceStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getProductProvenanceStatement() {
        if (productProvenanceStatement == null) {
            productProvenanceStatement = new ArrayList<Description200Type>();
        }
        return this.productProvenanceStatement;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDCountryType }
     * 
     * 
     */
    public List<TSDCountryType> getCountryOfOrigin() {
        if (countryOfOrigin == null) {
            countryOfOrigin = new ArrayList<TSDCountryType>();
        }
        return this.countryOfOrigin;
    }

    /**
     * Gets the value of the productActivityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productActivityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductActivityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDProductActivityDetailsType }
     * 
     * 
     */
    public List<TSDProductActivityDetailsType> getProductActivityDetails() {
        if (productActivityDetails == null) {
            productActivityDetails = new ArrayList<TSDProductActivityDetailsType>();
        }
        return this.productActivityDetails;
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
