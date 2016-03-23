package org.gs1.source.service.util;

import org.gs1.source.tsd.Description200Type;
import org.gs1.source.tsd.TSDExceptionType;
import org.gs1.source.tsd.TSDSecurityExceptionType;

public class TSDExceptionGenerator {

	private TSDExceptionType exception;
	
	public TSDExceptionGenerator() {
		
		exception = new TSDExceptionType();
	}

	public TSDExceptionType generateUnsupportedVersionException() {

		Description200Type reason = new Description200Type();
		reason.setLanguageCode("en");
		reason.setCodeListVersion("1.1");
		reason.setValue("Unsupported Version");
		
		exception.setExceptionReason(reason);
		
		return exception;
	}

	public TSDExceptionType generateImplementationException() {

		return exception;
	}

	public TSDExceptionType generateInvalidGTINException() {

		Description200Type reason = new Description200Type();
		reason.setLanguageCode("en");
		reason.setCodeListVersion("1.1");
		reason.setValue("Invalid GTIN");

		exception.setExceptionReason(reason);

		return exception;
	}

	public TSDExceptionType generateInvalidRequestException() {
		
		Description200Type reason = new Description200Type();
		reason.setLanguageCode("en");
		reason.setCodeListVersion("1.1");
		reason.setValue("Invalid Request (No GTIN, No TargetMarket or No DataVersion)");
		
		exception.setExceptionReason(reason);

		return exception;
	}

	public TSDExceptionType generateSecurityException() {
		
		TSDSecurityExceptionType securityException = new TSDSecurityExceptionType();
		
		Description200Type reason = new Description200Type();
		reason.setLanguageCode("en");
		reason.setCodeListVersion("1.1");
		reason.setValue("Security (Not Authenticated)");

		Description200Type contactDescription = new Description200Type();
		contactDescription.setLanguageCode("en");
		contactDescription.setCodeListVersion("1.1");
		contactDescription.setValue("Check Client Key from peer Data Aggregator URL.");
		
		securityException.setExceptionReason(reason);
		securityException.setExceptionContactDescription(contactDescription);

		return securityException;
	}

	public TSDExceptionType generateInvalidTargetMarketException() {
		
		Description200Type reason = new Description200Type();
		reason.setLanguageCode("en");
		reason.setCodeListVersion("1.1");
		reason.setValue("Invalid TargetMarket");
		
		exception.setExceptionReason(reason);

		return exception;
	}

	public TSDExceptionType generateNoDataException() {
		
		Description200Type reason = new Description200Type();
		reason.setLanguageCode("en");
		reason.setCodeListVersion("1.1");
		reason.setValue("No Data in GS1 Source");

		exception.setExceptionReason(reason);
		
		return exception;
	}

}
