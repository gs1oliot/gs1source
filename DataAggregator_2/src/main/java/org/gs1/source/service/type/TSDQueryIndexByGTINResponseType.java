package org.gs1.source.service.type;

import org.gs1.source.tsd.TSDImplementationExceptionType;
import org.gs1.source.tsd.TSDInvalidGTINExceptionType;
import org.gs1.source.tsd.TSDInvalidRequestExceptionType;
import org.gs1.source.tsd.TSDInvalidTargetMarketExceptionType;
import org.gs1.source.tsd.TSDSecurityExceptionType;

public class TSDQueryIndexByGTINResponseType {
	
	protected TSDIndexEntryType indexEntry;
    protected TSDInvalidGTINExceptionType invalidGTINException;
    protected TSDInvalidTargetMarketExceptionType invalidTargetMarketException;
    protected TSDInvalidRequestExceptionType invalidRequestException;
    protected TSDSecurityExceptionType securityException;
    protected TSDImplementationExceptionType implementationException;
    
    public TSDIndexEntryType getIndexEntry() {
    	
    	return indexEntry;
    }
    
    public void setIndexEntry(TSDIndexEntryType value) {
    	
    	this.indexEntry = value;
    }
    
    public TSDInvalidGTINExceptionType getInvalidGTINException() {
        return invalidGTINException;
    }
    
    public void setInvalidGTINException(TSDInvalidGTINExceptionType value) {
        this.invalidGTINException = value;
    }
    
    public TSDInvalidTargetMarketExceptionType getInvalidTargetMarketException() {
        return invalidTargetMarketException;
    }
    
    public void setInvalidTargetMarketException(TSDInvalidTargetMarketExceptionType value) {
        this.invalidTargetMarketException = value;
    }
    
    public TSDInvalidRequestExceptionType getInvalidRequestException() {
        return invalidRequestException;
    }
    
    public void setInvalidRequestException(TSDInvalidRequestExceptionType value) {
        this.invalidRequestException = value;
    }
    
    public TSDSecurityExceptionType getSecurityException() {
        return securityException;
    }
    
    public void setSecurityException(TSDSecurityExceptionType value) {
        this.securityException = value;
    }
    
    public TSDImplementationExceptionType getImplementationException() {
        return implementationException;
    }
    
    public void setImplementationException(TSDImplementationExceptionType value) {
        this.implementationException = value;
    }

}
