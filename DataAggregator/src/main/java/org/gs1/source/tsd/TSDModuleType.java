//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ModuleType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_ModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_ModuleType", namespace = "urn:gs1:tsd:tsd_common:xsd:1")
@XmlSeeAlso({
    TSDBasicProductInformationModuleType.class,
    TSDModulesType.class,
    TSDFoodAndBeverageIngredientInformationModuleType.class,
    TSDFoodAndBeveragePreparationInformationModuleType.class,
    TSDNutritionalProductInformationModuleType.class,
    TSDProductAllergenInformationModuleType.class,
    TSDProductClaimsAndEndorsementsModuleType.class,
    TSDProductInstructionsModuleType.class,
    TSDProductOriginInformationModuleType.class,
    TSDProductQuantityInformationModuleType.class
})
public class TSDModuleType {


}
