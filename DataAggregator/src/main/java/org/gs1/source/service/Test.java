package org.gs1.source.service;

import java.util.ArrayList;
import java.util.List;

import org.gs1.source.service.aiqi.ONSQuery;
import org.gs1.source.service.util.POJOConvertor;
import org.gs1.source.service.util.ZONEConvertor;
import org.gs1.source.tsd.CountryCodeType;
import org.gs1.source.tsd.Description200Type;
import org.gs1.source.tsd.TSDInvalidGTINExceptionType;
import org.gs1.source.tsd.TSDProductDataType;
import org.gs1.source.tsd.TSDQueryByGTINResponseType;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.SimpleResolver;
import org.xbill.DNS.Type;

public class Test {

	public static void main(String[] args) throws Exception {

		String gsrn = "0.0.3.2.1.0.1.1.1.1.0.0.0.1.0.8.8.gsrn.gs1.id.onsepc.kr";
		
		List<String> res = new ArrayList<String>();
		Record[] result = null;
		
		try {
			Lookup lookup = new Lookup(gsrn, Type.NAPTR);
			//KAIST IP address
			lookup.setResolver(new SimpleResolver("8.8.8.8"));
			lookup.setCache(null);
			result = lookup.run();
			int code = lookup.getResult();
			if (code == Lookup.SUCCESSFUL) {
				for(Record r : result){
					res.add(r.rdataToString());
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(String s : res){
			System.out.println(s);
		}
		
//		CountryCodeType targetMarket = new CountryCodeType();
//		targetMarket.setCodeListVersion("1.1");
//		targetMarket.setValue("410");
//		
//		TSDProductDataType pd = new TSDProductDataType();
//		pd.setGtin(gtin);
//		pd.setTargetMarket(targetMarket);
//		pd.setInformationProviderGLN("gln");
//		pd.setInformationProviderName("name");
//		
//		Description200Type reason = new Description200Type();
//		reason.setLanguageCode("en");
//		reason.setCodeListVersion("1.1");
//		reason.setValue("Invalid GTIN");
//		
//		TSDInvalidGTINExceptionType exception = new TSDInvalidGTINExceptionType();
//		exception.setExceptionReason(reason);
//		
//		TSDQueryByGTINResponseType rs = new TSDQueryByGTINResponseType();
//		//rs.setProductData(pd);
//		rs.setInvalidGTINException(exception);
//
//		POJOConvertor convertor = new POJOConvertor();
//		String str = convertor.marshal(rs);
//		
//		System.out.println(str);
//		

	}

}
