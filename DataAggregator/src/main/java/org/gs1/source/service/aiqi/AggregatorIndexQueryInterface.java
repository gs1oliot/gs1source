package org.gs1.source.service.aiqi;

import java.io.IOException;

import org.gs1.source.service.type.TSDQueryIndexByGTINRequestType;
import org.gs1.source.service.type.TSDQueryIndexByGTINResponseType;

public interface AggregatorIndexQueryInterface {
	
	public TSDQueryIndexByGTINResponseType queryByGtin(TSDQueryIndexByGTINRequestType request) throws IOException;

}
