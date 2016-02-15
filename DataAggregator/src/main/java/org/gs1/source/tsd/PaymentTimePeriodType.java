//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PaymentTimePeriodType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="PaymentTimePeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dayOfMonthDue" type="{http://www.w3.org/2001/XMLSchema}gDay" minOccurs="0"/>
 *         &lt;element name="timePeriodDue" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTimePeriodType", propOrder = {
    "dateDue",
    "dayOfMonthDue",
    "timePeriodDue"
})
public class PaymentTimePeriodType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDue;
    @XmlSchemaType(name = "gDay")
    protected XMLGregorianCalendar dayOfMonthDue;
    protected TimeMeasurementType timePeriodDue;

    /**
     * dateDue �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDue() {
        return dateDue;
    }

    /**
     * dateDue �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDue(XMLGregorianCalendar value) {
        this.dateDue = value;
    }

    /**
     * dayOfMonthDue �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayOfMonthDue() {
        return dayOfMonthDue;
    }

    /**
     * dayOfMonthDue �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayOfMonthDue(XMLGregorianCalendar value) {
        this.dayOfMonthDue = value;
    }

    /**
     * timePeriodDue �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getTimePeriodDue() {
        return timePeriodDue;
    }

    /**
     * timePeriodDue �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setTimePeriodDue(TimeMeasurementType value) {
        this.timePeriodDue = value;
    }

}
