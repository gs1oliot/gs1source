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
 * <p>ColourType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="ColourType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colourCode" type="{urn:gs1:shared:shared_common:xsd:3}ColourCodeType" minOccurs="0"/>
 *         &lt;element name="colourDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description80Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColourType", propOrder = {
    "colourCode",
    "colourDescription"
})
public class ColourType {

    protected ColourCodeType colourCode;
    protected List<Description80Type> colourDescription;

    /**
     * colourCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ColourCodeType }
     *     
     */
    public ColourCodeType getColourCode() {
        return colourCode;
    }

    /**
     * colourCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourCodeType }
     *     
     */
    public void setColourCode(ColourCodeType value) {
        this.colourCode = value;
    }

    /**
     * Gets the value of the colourDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colourDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColourDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description80Type }
     * 
     * 
     */
    public List<Description80Type> getColourDescription() {
        if (colourDescription == null) {
            colourDescription = new ArrayList<Description80Type>();
        }
        return this.colourDescription;
    }

}
