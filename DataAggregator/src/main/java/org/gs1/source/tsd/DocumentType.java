//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.07.30 �ð� 02:38:18 PM KST 
//


package org.gs1.source.tsd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>DocumentType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="documentStatusCode" type="{urn:gs1:shared:shared_common:xsd:3}DocumentStatusEnumerationType"/>
 *         &lt;element name="documentActionCode" type="{urn:gs1:shared:shared_common:xsd:3}DocumentActionEnumerationType" minOccurs="0"/>
 *         &lt;element name="documentStructureVersion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lastUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="revisionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:gs1:shared:shared_common:xsd:3}ExtensionType" minOccurs="0"/>
 *         &lt;element name="documentEffectiveDate" type="{urn:gs1:shared:shared_common:xsd:3}DateOptionalTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "creationDateTime",
    "documentStatusCode",
    "documentActionCode",
    "documentStructureVersion",
    "lastUpdateDateTime",
    "revisionNumber",
    "extension",
    "documentEffectiveDate"
})
public abstract class DocumentType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DocumentStatusEnumerationType documentStatusCode;
    @XmlSchemaType(name = "string")
    protected DocumentActionEnumerationType documentActionCode;
    protected String documentStructureVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDateTime;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger revisionNumber;
    protected ExtensionType extension;
    protected DateOptionalTimeType documentEffectiveDate;

    /**
     * creationDateTime �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * creationDateTime �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * documentStatusCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatusEnumerationType }
     *     
     */
    public DocumentStatusEnumerationType getDocumentStatusCode() {
        return documentStatusCode;
    }

    /**
     * documentStatusCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatusEnumerationType }
     *     
     */
    public void setDocumentStatusCode(DocumentStatusEnumerationType value) {
        this.documentStatusCode = value;
    }

    /**
     * documentActionCode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link DocumentActionEnumerationType }
     *     
     */
    public DocumentActionEnumerationType getDocumentActionCode() {
        return documentActionCode;
    }

    /**
     * documentActionCode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentActionEnumerationType }
     *     
     */
    public void setDocumentActionCode(DocumentActionEnumerationType value) {
        this.documentActionCode = value;
    }

    /**
     * documentStructureVersion �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentStructureVersion() {
        return documentStructureVersion;
    }

    /**
     * documentStructureVersion �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStructureVersion(String value) {
        this.documentStructureVersion = value;
    }

    /**
     * lastUpdateDateTime �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * lastUpdateDateTime �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDateTime(XMLGregorianCalendar value) {
        this.lastUpdateDateTime = value;
    }

    /**
     * revisionNumber �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * revisionNumber �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRevisionNumber(BigInteger value) {
        this.revisionNumber = value;
    }

    /**
     * extension �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * extension �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

    /**
     * documentEffectiveDate �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public DateOptionalTimeType getDocumentEffectiveDate() {
        return documentEffectiveDate;
    }

    /**
     * documentEffectiveDate �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOptionalTimeType }
     *     
     */
    public void setDocumentEffectiveDate(DateOptionalTimeType value) {
        this.documentEffectiveDate = value;
    }

}
