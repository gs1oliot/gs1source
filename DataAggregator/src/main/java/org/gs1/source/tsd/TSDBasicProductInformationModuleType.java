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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_BasicProductInformationModuleType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_BasicProductInformationModuleType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModuleType">
 *       &lt;sequence>
 *         &lt;element name="productName" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded"/>
 *         &lt;element name="consumerMarketingDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description2500Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gpcCategoryCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="regulatedProductName" type="{urn:gs1:shared:shared_common:xsd:3}Description500Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="brandNameInformation" type="{urn:gs1:tsd:basic_product_information_module:xsd:1}TSD_BrandNameInformationType"/>
 *         &lt;element name="productInformationLink" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ProductInformationLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imageLink" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ImageLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="packagingSignatureLine" type="{urn:gs1:tsd:basic_product_information_module:xsd:1}TSD_PackagingSignatureLineType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_BasicProductInformationModuleType", namespace = "urn:gs1:tsd:basic_product_information_module:xsd:1", propOrder = {
    "productName",
    "consumerMarketingDescription",
    "gpcCategoryCode",
    "regulatedProductName",
    "brandNameInformation",
    "productInformationLink",
    "imageLink",
    "packagingSignatureLine",
    "avpList"
})
public class TSDBasicProductInformationModuleType
    extends TSDModuleType
{

    @XmlElement(required = true)
    protected List<Description80Type> productName;
    protected List<Description2500Type> consumerMarketingDescription;
    protected String gpcCategoryCode;
    protected List<Description500Type> regulatedProductName;
    @XmlElement(required = true)
    protected TSDBrandNameInformationType brandNameInformation;
    protected List<TSDProductInformationLinkType> productInformationLink;
    protected List<TSDImageLinkType> imageLink;
    protected List<TSDPackagingSignatureLineType> packagingSignatureLine;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the productName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getProductName() {
        if (productName == null) {
            productName = new ArrayList<Description80Type>();
        }
        return this.productName;
    }

    /**
     * Gets the value of the consumerMarketingDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerMarketingDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerMarketingDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description2500Type }
     * 
     * 
     */
    public List<Description2500Type> getConsumerMarketingDescription() {
        if (consumerMarketingDescription == null) {
            consumerMarketingDescription = new ArrayList<Description2500Type>();
        }
        return this.consumerMarketingDescription;
    }

    /**
     * gpcCategoryCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryCode() {
        return gpcCategoryCode;
    }

    /**
     * gpcCategoryCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryCode(String value) {
        this.gpcCategoryCode = value;
    }

    /**
     * Gets the value of the regulatedProductName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatedProductName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatedProductName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description500Type }
     * 
     * 
     */
    public List<Description500Type> getRegulatedProductName() {
        if (regulatedProductName == null) {
            regulatedProductName = new ArrayList<Description500Type>();
        }
        return this.regulatedProductName;
    }

    /**
     * brandNameInformation �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TSDBrandNameInformationType }
     *     
     */
    public TSDBrandNameInformationType getBrandNameInformation() {
        return brandNameInformation;
    }

    /**
     * brandNameInformation �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDBrandNameInformationType }
     *     
     */
    public void setBrandNameInformation(TSDBrandNameInformationType value) {
        this.brandNameInformation = value;
    }

    /**
     * Gets the value of the productInformationLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformationLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformationLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDProductInformationLinkType }
     * 
     * 
     */
    public List<TSDProductInformationLinkType> getProductInformationLink() {
        if (productInformationLink == null) {
            productInformationLink = new ArrayList<TSDProductInformationLinkType>();
        }
        return this.productInformationLink;
    }

    /**
     * Gets the value of the imageLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDImageLinkType }
     * 
     * 
     */
    public List<TSDImageLinkType> getImageLink() {
        if (imageLink == null) {
            imageLink = new ArrayList<TSDImageLinkType>();
        }
        return this.imageLink;
    }

    /**
     * Gets the value of the packagingSignatureLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingSignatureLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingSignatureLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDPackagingSignatureLineType }
     * 
     * 
     */
    public List<TSDPackagingSignatureLineType> getPackagingSignatureLine() {
        if (packagingSignatureLine == null) {
            packagingSignatureLine = new ArrayList<TSDPackagingSignatureLineType>();
        }
        return this.packagingSignatureLine;
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
