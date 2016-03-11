package org.gs1.source.service.registration;

import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import org.gs1.source.service.DAOFactory;
import org.gs1.source.service.DataAccessObject;
import org.gs1.source.service.aimi.ZONEUpdator;
import org.gs1.source.service.type.TSDIndexMaintenanceRequestType;
import org.gs1.source.service.util.POJOConvertor;
import org.gs1.source.tsd.TSDQueryByGTINResponseType;

public class Registerar {

	private static final String PROPERTY_PATH = "aggregator.properties";

	public static final int NODATA = 0;
	public static final int NOT_VALID = 1;
	public static final int EXISTED = 2;
	public static final int INSERTED = 3;

	private DAOFactory factory;
	private String DBtype;

	public Registerar(DAOFactory factory, String DBtype) {
		this.factory = factory;
		this.DBtype = DBtype;
	}

	public int register(String xmldata) throws JAXBException, IOException {

		if (xmldata == "") {
			return NODATA;
		}

		XmlValidator validator = new XmlValidator();

		if (validator.xmlValidate(xmldata) == false) {
			return NOT_VALID;
		}

		//Unmarshall productData of xml form
		POJOConvertor convertor = new POJOConvertor();
		TSDQueryByGTINResponseType rs = convertor.unmarshal(xmldata);
		String gtin = rs.getProductData().getGtin();

		DataAccessObject dao = factory.getDAO(DBtype);
		TSDQueryByGTINResponseType rs_check = dao.queryDB(gtin, rs.getProductData().getTargetMarket());

		if(rs_check != null) {
			return EXISTED;
		}

		//ZONE Update
		rs_check = dao.queryDB(gtin);
		
		if(rs_check == null) {

			Properties prop = new Properties();
			prop.load(getClass().getClassLoader().getResourceAsStream(PROPERTY_PATH));
			String aggregatorUrl = prop.getProperty("aggregatorUrl");

			TSDIndexMaintenanceRequestType request = new TSDIndexMaintenanceRequestType();
			request.setGtin(gtin);
			request.setAggregatorUrl(aggregatorUrl);

			ZONEUpdator zoneUpdator = new ZONEUpdator();
			zoneUpdator.add(request);
		}
		
		dao.insertDB(rs);

		return INSERTED;
	}

}
