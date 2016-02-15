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
 * <p>TSD_FoodAndBeverageIngredientInformationModuleType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_FoodAndBeverageIngredientInformationModuleType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModuleType">
 *       &lt;sequence>
 *         &lt;element name="ingredientStatement" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_FormattedDescription5000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additivesStatement" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_FormattedDescription1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="foodAndBeverageIngredient" type="{urn:gs1:tsd:food_and_beverage_information_module:xsd:1}TSD_FoodAndBeverageIngredientType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_FoodAndBeverageIngredientInformationModuleType", namespace = "urn:gs1:tsd:food_and_beverage_information_module:xsd:1", propOrder = {
    "ingredientStatement",
    "additivesStatement",
    "foodAndBeverageIngredient",
    "avpList"
})
public class TSDFoodAndBeverageIngredientInformationModuleType
    extends TSDModuleType
{

    protected List<TSDFormattedDescription5000Type> ingredientStatement;
    protected List<TSDFormattedDescription1000Type> additivesStatement;
    protected List<TSDFoodAndBeverageIngredientType> foodAndBeverageIngredient;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the ingredientStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredientStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredientStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDFormattedDescription5000Type }
     * 
     * 
     */
    public List<TSDFormattedDescription5000Type> getIngredientStatement() {
        if (ingredientStatement == null) {
            ingredientStatement = new ArrayList<TSDFormattedDescription5000Type>();
        }
        return this.ingredientStatement;
    }

    /**
     * Gets the value of the additivesStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additivesStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditivesStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDFormattedDescription1000Type }
     * 
     * 
     */
    public List<TSDFormattedDescription1000Type> getAdditivesStatement() {
        if (additivesStatement == null) {
            additivesStatement = new ArrayList<TSDFormattedDescription1000Type>();
        }
        return this.additivesStatement;
    }

    /**
     * Gets the value of the foodAndBeverageIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodAndBeverageIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodAndBeverageIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDFoodAndBeverageIngredientType }
     * 
     * 
     */
    public List<TSDFoodAndBeverageIngredientType> getFoodAndBeverageIngredient() {
        if (foodAndBeverageIngredient == null) {
            foodAndBeverageIngredient = new ArrayList<TSDFoodAndBeverageIngredientType>();
        }
        return this.foodAndBeverageIngredient;
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
