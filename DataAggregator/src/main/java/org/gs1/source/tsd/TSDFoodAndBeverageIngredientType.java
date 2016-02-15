//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_FoodAndBeverageIngredientType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_FoodAndBeverageIngredientType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingredientName" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded"/>
 *         &lt;element name="ingredientSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ingredientContentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ingredientCountryOfOriginCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ingredientCatchZone" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isIngredientHighlighted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subingredient" type="{urn:gs1:tsd:food_and_beverage_information_module:xsd:1}TSD_FoodAndBeverageIngredientType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_FoodAndBeverageIngredientType", namespace = "urn:gs1:tsd:food_and_beverage_information_module:xsd:1", propOrder = {
    "ingredientName",
    "ingredientSequence",
    "ingredientContentPercentage",
    "ingredientCountryOfOriginCode",
    "ingredientCatchZone",
    "isIngredientHighlighted",
    "subingredient",
    "avpList"
})
public class TSDFoodAndBeverageIngredientType {

    @XmlElement(required = true)
    protected List<Description70Type> ingredientName;
    @XmlElement(required = true)
    protected BigInteger ingredientSequence;
    protected BigDecimal ingredientContentPercentage;
    protected List<CountryCodeType> ingredientCountryOfOriginCode;
    protected List<String> ingredientCatchZone;
    protected Boolean isIngredientHighlighted;
    protected List<TSDFoodAndBeverageIngredientType> subingredient;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the ingredientName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getIngredientName() {
        if (ingredientName == null) {
            ingredientName = new ArrayList<Description70Type>();
        }
        return this.ingredientName;
    }

    /**
     * ingredientSequence �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIngredientSequence() {
        return ingredientSequence;
    }

    /**
     * ingredientSequence �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIngredientSequence(BigInteger value) {
        this.ingredientSequence = value;
    }

    /**
     * ingredientContentPercentage �Ӽ��� ���� �����ɴϴ�.
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
     * ingredientContentPercentage �Ӽ��� ���� �����մϴ�.
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
     * Gets the value of the ingredientCatchZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientCatchZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientCatchZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIngredientCatchZone() {
        if (ingredientCatchZone == null) {
            ingredientCatchZone = new ArrayList<String>();
        }
        return this.ingredientCatchZone;
    }

    /**
     * isIngredientHighlighted �Ӽ��� ���� �����ɴϴ�.
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
     * isIngredientHighlighted �Ӽ��� ���� �����մϴ�.
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
     * Gets the value of the subingredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subingredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubingredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDFoodAndBeverageIngredientType }
     * 
     * 
     */
    public List<TSDFoodAndBeverageIngredientType> getSubingredient() {
        if (subingredient == null) {
            subingredient = new ArrayList<TSDFoodAndBeverageIngredientType>();
        }
        return this.subingredient;
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
