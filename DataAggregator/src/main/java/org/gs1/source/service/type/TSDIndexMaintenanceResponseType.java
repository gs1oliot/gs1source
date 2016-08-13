package org.gs1.source.service.type;

import org.gs1.source.tsd.TSDImplementationExceptionType;
import org.gs1.source.tsd.TSDInvalidGTINExceptionType;
import org.gs1.source.tsd.TSDInvalidRequestExceptionType;
import org.gs1.source.tsd.TSDInvalidTargetMarketExceptionType;
import org.gs1.source.tsd.TSDSecurityExceptionType;

public class TSDIndexMaintenanceResponseType {
	
	protected TSDIndexMaintenanceRequestSuccessType indexMaintenanceRequestSuccess;
	protected TSDDuplicateEntryExceptionType duplicateEntryException;
	protected TSDNoSuchEntryExceptionType noSuchEntryException;
	protected TSDInvalidGTINExceptionType invalidGTINException;
    protected TSDInvalidTargetMarketExceptionType invalidTargetMarketException;
    protected TSDInvalidServiceURLExceptionType invalidServiceURLException;
    protected TSDInvalidRequestExceptionType invalidRequestException;
    protected TSDSecurityExceptionType securityException;
    protected TSDImplementationExceptionType implementationException;
    
    public TSDIndexMaintenanceRequestSuccessType getIndexMaintenanceRequestSuccess() {
    	return indexMaintenanceRequestSuccess;
    }
    
    public void setIndexMaintenanceRequestSuccess(TSDIndexMaintenanceRequestSuccessType value) {
    	this.indexMaintenanceRequestSuccess = value;
    }
    
    public TSDDuplicateEntryExceptionType getDuplicateEntryException() {
    	return duplicateEntryException;
    }
    
    public void setDuplicateEntryException(TSDDuplicateEntryExceptionType value) {
    	this.duplicateEntryException = value;
    }
    
    public TSDNoSuchEntryExceptionType getNoSuchEntryException() {
    	return noSuchEntryException;
    }
    
    public void setNoSuchEntryException(TSDNoSuchEntryExceptionType value) {
    	this.noSuchEntryException = value;
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
    
    public TSDInvalidServiceURLExceptionType getInvalidServiceURLException() {
    	return invalidServiceURLException;
    }
    
    public void setInvalidServiceURLException(TSDInvalidServiceURLExceptionType value) {
    	this.invalidServiceURLException = value;
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
