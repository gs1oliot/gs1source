//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2016.12.10 시간 11:04:32 PM KST 
//


package org.gs1.source.tsd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_NonfoodIngredientType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_NonfoodIngredientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ingredientName" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" minOccurs="0"/&gt;
 *         &lt;element name="ingredientSequence"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ingredientContentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ingredientCountryOfOriginCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isIngredientHighlighted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_NonfoodIngredientType", namespace = "urn:gs1:tsd:nonfood_ingredient_information_module:xsd:1", propOrder = {
    "ingredientName",
    "ingredientSequence",
    "ingredientContentPercentage",
    "ingredientCountryOfOriginCode",
    "isIngredientHighlighted",
    "avpList"
})
public class TSDNonfoodIngredientType {

    protected Description70Type ingredientName;
    @XmlElement(required = true)
    protected String ingredientSequence;
    protected BigDecimal ingredientContentPercentage;
    protected List<CountryCodeType> ingredientCountryOfOriginCode;
    protected Boolean isIngredientHighlighted;
    protected TSDAttributeValuePairListType avpList;

    /**
     * ingredientName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Description70Type }
     *     
     */
    public Description70Type getIngredientName() {
        return ingredientName;
    }

    /**
     * ingredientName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Description70Type }
     *     
     */
    public void setIngredientName(Description70Type value) {
        this.ingredientName = value;
    }

    /**
     * ingredientSequence 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredientSequence() {
        return ingredientSequence;
    }

    /**
     * ingredientSequence 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredientSequence(String value) {
        this.ingredientSequence = value;
    }

    /**
     * ingredientContentPercentage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngredientContentPercentage() {
        return ingredientContentPercentage;
    }

    /**
     * ingredientContentPercentage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngredientContentPercentage(BigDecimal value) {
        this.ingredientContentPercentage = value;
    }

    /**
     * Gets the value of the ingredientCountryOfOriginCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientCountryOfOriginCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientCountryOfOriginCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getIngredientCountryOfOriginCode() {
        if (ingredientCountryOfOriginCode == null) {
            ingredientCountryOfOriginCode = new ArrayList<CountryCodeType>();
        }
        return this.ingredientCountryOfOriginCode;
    }

    /**
     * isIngredientHighlighted 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIngredientHighlighted() {
        return isIngredientHighlighted;
    }

    /**
     * isIngredientHighlighted 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIngredientHighlighted(Boolean value) {
        this.isIngredientHighlighted = value;
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
