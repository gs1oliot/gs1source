package org.gs1.source.service.aaqi;

import org.gs1.source.service.type.TSDQueryByGTINRequestType;
import org.gs1.source.tsd.TSDQueryByGTINResponseType;

public interface AggregatorAggregatorQueryInterface {
	
	public TSDQueryByGTINResponseType queryByGtin(TSDQueryByGTINRequestType request) throws Exception;

}
