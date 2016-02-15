package org.gs1.source.service.aimi;

import java.io.IOException;

import org.gs1.source.service.type.TSDIndexMaintenanceRequestType;
import org.gs1.source.service.type.TSDIndexMaintenanceResponseType;

public interface AggregatorIndexMaintenanceInterface {

	public TSDIndexMaintenanceResponseType add(TSDIndexMaintenanceRequestType request) throws IOException;
	public TSDIndexMaintenanceResponseType change(TSDIndexMaintenanceRequestType request);
	public TSDIndexMaintenanceResponseType correct(TSDIndexMaintenanceRequestType request);
	public TSDIndexMaintenanceResponseType delete(TSDIndexMaintenanceRequestType request) throws IOException;
	
}
