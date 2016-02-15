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
 * <p>TSD_AttributeValuePairListType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TSD_AttributeValuePairListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stringAVP" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_StringAttributeValuePairType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_AttributeValuePairListType", namespace = "urn:gs1:tsd:tsd_common:xsd:1", propOrder = {
    "stringAVP"
})
public class TSDAttributeValuePairListType {

    @XmlElement(required = true)
    protected List<TSDStringAttributeValuePairType> stringAVP;

    /**
     * Gets the value of the stringAVP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringAVP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringAVP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDStringAttributeValuePairType }
     * 
     * 
     */
    public List<TSDStringAttributeValuePairType> getStringAVP() {
        if (stringAVP == null) {
            stringAVP = new ArrayList<TSDStringAttributeValuePairType>();
        }
        return this.stringAVP;
    }

}
