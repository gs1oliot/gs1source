package org.gs1.source.service;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.gs1.source.tsd.ObjectFactory;
import org.gs1.source.tsd.TSDImplementationExceptionType;
import org.gs1.source.tsd.TSDInvalidGTINExceptionType;
import org.gs1.source.tsd.TSDInvalidRequestExceptionType;
import org.gs1.source.tsd.TSDInvalidTargetMarketExceptionType;
import org.gs1.source.tsd.TSDNoDataExceptionType;
import org.gs1.source.tsd.TSDProductDataType;
import org.gs1.source.tsd.TSDQueryByGTINResponseType;
import org.gs1.source.tsd.TSDSecurityExceptionType;
import org.gs1.source.tsd.TSDUnsupportedVersionExceptionType;

public class ResponseMarshaller {
	private ObjectFactory of;
	private TSDQueryByGTINResponseType rs;


	public ResponseMarshaller() {
		of = new ObjectFactory();
		rs = of.createTSDQueryByGTINResponseType();
	}

	public void make(TSDProductDataType productData) {

		rs.setProductData(productData);
	}
	
	public void make(TSDNoDataExceptionType noDataException) {
		
		rs.setNoDataException(noDataException);
	}
	
	public void make(TSDInvalidGTINExceptionType invalidGTINException) {
		
		rs.setInvalidGTINException(invalidGTINException);
	}
	
	public void make(TSDInvalidTargetMarketExceptionType invalidTargetMarketException) {
		
		rs.setInvalidTargetMarketException(invalidTargetMarketException);
	}
	
	public void make(TSDUnsupportedVersionExceptionType unsupportedVersionException) {
		
		rs.setUnsupportedVersionException(unsupportedVersionException);
	}
	
	public void make(TSDInvalidRequestExceptionType invalidRequestException) {
		
		rs.setInvalidRequestException(invalidRequestException);
	}
	
	public void make(TSDSecurityExceptionType securityException) {
		
		rs.setSecurityException(securityException);
	}
	
	public void make(TSDImplementationExceptionType implementationException) {
		
		rs.setImplementationException(implementationException);
	}

	/**
	 * marshall to xml form string
	 * @return
	 * @throws JAXBException
	 * @throws UnsupportedEncodingException
	 */
	public String marshal() throws JAXBException, UnsupportedEncodingException {

		JAXBElement<TSDQueryByGTINResponseType> r = of.createQueryByGtinResponse(rs);
		JAXBContext jc = JAXBContext.newInstance("org.gs1.source.tsd");
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Writer writer = new StringWriter();
		m.marshal(r, writer);
		String s = writer.toString();

		return s;
	}

}
