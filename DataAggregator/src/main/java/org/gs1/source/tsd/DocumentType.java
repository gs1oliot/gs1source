//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.07.30 시간 02:38:18 PM KST 
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
 * <p>DocumentType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
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
     * creationDateTime 속성의 값을 가져옵니다.
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
     * creationDateTime 속성의 값을 설정합니다.
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
     * documentStatusCode 속성의 값을 가져옵니다.
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
     * documentStatusCode 속성의 값을 설정합니다.
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
     * documentActionCode 속성의 값을 가져옵니다.
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
     * documentActionCode 속성의 값을 설정합니다.
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
     * documentStructureVersion 속성의 값을 가져옵니다.
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
     * documentStructureVersion 속성의 값을 설정합니다.
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
     * lastUpdateDateTime 속성의 값을 가져옵니다.
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
     * lastUpdateDateTime 속성의 값을 설정합니다.
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
     * revisionNumber 속성의 값을 가져옵니다.
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
     * revisionNumber 속성의 값을 설정합니다.
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
     * extension 속성의 값을 가져옵니다.
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
     * extension 속성의 값을 설정합니다.
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
     * documentEffectiveDate 속성의 값을 가져옵니다.
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
     * documentEffectiveDate 속성의 값을 설정합니다.
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
