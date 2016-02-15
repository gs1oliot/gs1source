//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ImageLinkType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_ImageLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *               &lt;maxLength value="2500"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="imageTypeCode" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ImageTypeCodeType"/>
 *         &lt;element name="languageCode" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imagePixelHeight" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="imagePixelWidth" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
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
@XmlType(name = "TSD_ImageLinkType", namespace = "urn:gs1:tsd:tsd_common:xsd:1", propOrder = {
    "url",
    "imageTypeCode",
    "languageCode",
    "imagePixelHeight",
    "imagePixelWidth",
    "fileSize",
    "avpList"
})
public class TSDImageLinkType {

    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected TSDImageTypeCodeType imageTypeCode;
    protected List<LanguageCodeType> languageCode;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger imagePixelHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger imagePixelWidth;
    protected MeasurementType fileSize;
    protected TSDAttributeValuePairListType avpList;

    /**
     * url �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * url �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * imageTypeCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TSDImageTypeCodeType }
     *     
     */
    public TSDImageTypeCodeType getImageTypeCode() {
        return imageTypeCode;
    }

    /**
     * imageTypeCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDImageTypeCodeType }
     *     
     */
    public void setImageTypeCode(TSDImageTypeCodeType value) {
        this.imageTypeCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getLanguageCode() {
        if (languageCode == null) {
            languageCode = new ArrayList<LanguageCodeType>();
        }
        return this.languageCode;
    }

    /**
     * imagePixelHeight �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImagePixelHeight() {
        return imagePixelHeight;
    }

    /**
     * imagePixelHeight �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImagePixelHeight(BigInteger value) {
        this.imagePixelHeight = value;
    }

    /**
     * imagePixelWidth �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImagePixelWidth() {
        return imagePixelWidth;
    }

    /**
     * imagePixelWidth �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImagePixelWidth(BigInteger value) {
        this.imagePixelWidth = value;
    }

    /**
     * fileSize �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getFileSize() {
        return fileSize;
    }

    /**
     * fileSize �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setFileSize(MeasurementType value) {
        this.fileSize = value;
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
