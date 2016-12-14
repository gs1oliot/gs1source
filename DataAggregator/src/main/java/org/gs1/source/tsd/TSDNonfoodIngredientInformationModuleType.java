//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.11 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2016.12.10 �ð� 11:04:32 PM KST 
//


package org.gs1.source.tsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_NonfoodIngredientInformationModuleType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_NonfoodIngredientInformationModuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModuleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonfoodIngredientStatement" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_FormattedDescription5000Type" minOccurs="0"/&gt;
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/&gt;
 *         &lt;element name="nonfoodIngredient" type="{urn:gs1:tsd:nonfood_ingredient_information_module:xsd:1}TSD_NonfoodIngredientType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_NonfoodIngredientInformationModuleType", namespace = "urn:gs1:tsd:nonfood_ingredient_information_module:xsd:1", propOrder = {
    "nonfoodIngredientStatement",
    "avpList",
    "nonfoodIngredient"
})
public class TSDNonfoodIngredientInformationModuleType
    extends TSDModuleType
{

    protected TSDFormattedDescription5000Type nonfoodIngredientStatement;
    protected TSDAttributeValuePairListType avpList;
    protected List<TSDNonfoodIngredientType> nonfoodIngredient;

    /**
     * nonfoodIngredientStatement �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TSDFormattedDescription5000Type }
     *     
     */
    public TSDFormattedDescription5000Type getNonfoodIngredientStatement() {
        return nonfoodIngredientStatement;
    }

    /**
     * nonfoodIngredientStatement �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDFormattedDescription5000Type }
     *     
     */
    public void setNonfoodIngredientStatement(TSDFormattedDescription5000Type value) {
        this.nonfoodIngredientStatement = value;
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

    /**
     * Gets the value of the nonfoodIngredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonfoodIngredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonfoodIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDNonfoodIngredientType }
     * 
     * 
     */
    public List<TSDNonfoodIngredientType> getNonfoodIngredient() {
        if (nonfoodIngredient == null) {
            nonfoodIngredient = new ArrayList<TSDNonfoodIngredientType>();
        }
        return this.nonfoodIngredient;
    }

}
