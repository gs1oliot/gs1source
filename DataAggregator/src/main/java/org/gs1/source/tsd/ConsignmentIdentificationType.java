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
 * <p>ConsignmentIdentificationType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ginc" type="{urn:gs1:shared:shared_common:xsd:3}GINCType"/>
 *         &lt;element name="additionalConsignmentIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalConsignmentIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentIdentificationType", propOrder = {
    "ginc",
    "additionalConsignmentIdentification"
})
public class ConsignmentIdentificationType {

    @XmlElement(required = true)
    protected String ginc;
    protected List<AdditionalConsignmentIdentificationType> additionalConsignmentIdentification;

    /**
     * ginc �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGinc() {
        return ginc;
    }

    /**
     * ginc �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGinc(String value) {
        this.ginc = value;
    }

    /**
     * Gets the value of the additionalConsignmentIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalConsignmentIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalConsignmentIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalConsignmentIdentificationType }
     * 
     * 
     */
    public List<AdditionalConsignmentIdentificationType> getAdditionalConsignmentIdentification() {
        if (additionalConsignmentIdentification == null) {
            additionalConsignmentIdentification = new ArrayList<AdditionalConsignmentIdentificationType>();
        }
        return this.additionalConsignmentIdentification;
    }

}
