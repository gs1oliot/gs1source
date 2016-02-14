package org.gs1.source.service.util;

import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.gs1.source.service.ResponseMarshaller;
import org.gs1.source.tsd.ObjectFactory;
import org.gs1.source.tsd.TSDQueryByGTINResponseType;

public class POJOConvertor {

	public String marshal(TSDQueryByGTINResponseType rs) throws UnsupportedEncodingException, JAXBException {

		ResponseMarshaller responseMarshaller = new ResponseMarshaller();
		
		if(rs.getProductData() != null) {
			responseMarshaller.make(rs.getProductData());
		} else if(rs.getNoDataException() != null) {
			responseMarshaller.make(rs.getNoDataException());
		} else if(rs.getInvalidGTINException() != null) {
			responseMarshaller.make(rs.getInvalidGTINException());
		} else if(rs.getInvalidTargetMarketException() != null) {
			responseMarshaller.make(rs.getInvalidTargetMarketException());
		} else if(rs.getUnsupportedVersionException() != null) {
			responseMarshaller.make(rs.getUnsupportedVersionException());
		} else if(rs.getInvalidRequestException() != null) {
			responseMarshaller.make(rs.getInvalidRequestException());
		} else if(rs.getSecurityException() != null) {
			responseMarshaller.make(rs.getSecurityException());
		} else if(rs.getImplementationException() != null) {
			responseMarshaller.make(rs.getImplementationException());
		}
		
		String str = responseMarshaller.marshal();

		return str;

	}

	@SuppressWarnings("unchecked")
	public TSDQueryByGTINResponseType unmarshal(String xmldata) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		StringReader reader = new StringReader(xmldata);
		JAXBElement<TSDQueryByGTINResponseType> r = (JAXBElement<TSDQueryByGTINResponseType>) jaxbUnmarshaller.unmarshal(reader);

		TSDQueryByGTINResponseType rs = (TSDQueryByGTINResponseType) r.getValue();

		return rs;

	}

}
