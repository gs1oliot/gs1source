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
 * <p>TSD_ProductClaimsAndEndorsementsModuleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductClaimsAndEndorsementsModuleType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModuleType">
 *       &lt;sequence>
 *         &lt;element name="regulatoryComplianceCode" type="{urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1}TSD_RegulatoryComplianceCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="warningStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nutritionalClaimCode" type="{urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1}TSD_NutritionalClaimCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nutritionalClaimStatement" type="{urn:gs1:shared:shared_common:xsd:3}Description5000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="healthClaimDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dietaryClaimCode" type="{urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1}TSD_DietaryClaimCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accreditationInformation" type="{urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1}TSD_AccreditationInformationType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_ProductClaimsAndEndorsementsModuleType", namespace = "urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1", propOrder = {
    "regulatoryComplianceCode",
    "warningStatement",
    "nutritionalClaimCode",
    "nutritionalClaimStatement",
    "healthClaimDescription",
    "dietaryClaimCode",
    "accreditationInformation",
    "avpList"
})
public class TSDProductClaimsAndEndorsementsModuleType
    extends TSDModuleType
{

    protected List<TSDRegulatoryComplianceCodeType> regulatoryComplianceCode;
    protected List<Description1000Type> warningStatement;
    protected List<TSDNutritionalClaimCodeType> nutritionalClaimCode;
    protected List<Description5000Type> nutritionalClaimStatement;
    protected List<Description1000Type> healthClaimDescription;
    protected List<TSDDietaryClaimCodeType> dietaryClaimCode;
    protected List<TSDAccreditationInformationType> accreditationInformation;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the regulatoryComplianceCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatoryComplianceCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatoryComplianceCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDRegulatoryComplianceCodeType }
     * 
     * 
     */
    public List<TSDRegulatoryComplianceCodeType> getRegulatoryComplianceCode() {
        if (regulatoryComplianceCode == null) {
            regulatoryComplianceCode = new ArrayList<TSDRegulatoryComplianceCodeType>();
        }
        return this.regulatoryComplianceCode;
    }

    /**
     * Gets the value of the warningStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getWarningStatement() {
        if (warningStatement == null) {
            warningStatement = new ArrayList<Description1000Type>();
        }
        return this.warningStatement;
    }

    /**
     * Gets the value of the nutritionalClaimCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionalClaimCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionalClaimCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDNutritionalClaimCodeType }
     * 
     * 
     */
    public List<TSDNutritionalClaimCodeType> getNutritionalClaimCode() {
        if (nutritionalClaimCode == null) {
            nutritionalClaimCode = new ArrayList<TSDNutritionalClaimCodeType>();
        }
        return this.nutritionalClaimCode;
    }

    /**
     * Gets the value of the nutritionalClaimStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionalClaimStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionalClaimStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description5000Type }
     * 
     * 
     */
    public List<Description5000Type> getNutritionalClaimStatement() {
        if (nutritionalClaimStatement == null) {
            nutritionalClaimStatement = new ArrayList<Description5000Type>();
        }
        return this.nutritionalClaimStatement;
    }

    /**
     * Gets the value of the healthClaimDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthClaimDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthClaimDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getHealthClaimDescription() {
        if (healthClaimDescription == null) {
            healthClaimDescription = new ArrayList<Description1000Type>();
        }
        return this.healthClaimDescription;
    }

    /**
     * Gets the value of the dietaryClaimCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dietaryClaimCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDietaryClaimCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDDietaryClaimCodeType }
     * 
     * 
     */
    public List<TSDDietaryClaimCodeType> getDietaryClaimCode() {
        if (dietaryClaimCode == null) {
            dietaryClaimCode = new ArrayList<TSDDietaryClaimCodeType>();
        }
        return this.dietaryClaimCode;
    }

    /**
     * Gets the value of the accreditationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accreditationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccreditationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDAccreditationInformationType }
     * 
     * 
     */
    public List<TSDAccreditationInformationType> getAccreditationInformation() {
        if (accreditationInformation == null) {
            accreditationInformation = new ArrayList<TSDAccreditationInformationType>();
        }
        return this.accreditationInformation;
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
