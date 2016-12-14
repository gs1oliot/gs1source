package org.gs1.source.service.registration;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XmlValidator {

	/**
	 * Validate xml data
	 * @param xmldata
	 * @return
	 */
	public boolean xmlValidate(String xmldata){
		try{
			
			String xsdFilePath = File.separator+"org"+File.separator+"gs1"+File.separator+"source"+File.separator+"schema"+File.separator+"tsd"+File.separator;
			StringReader reader = new StringReader(xmldata);
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

			Source[] xsds = new Source[] {new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(File.separator+"org"+File.separator+"gs1"+File.separator+"source"+File.separator+"schema"+File.separator+"shared"+File.separator+"SharedCommon.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "TSDCommon.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "BasicProductInformationModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "FoodAndBeverageIngredientInformationModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "FoodAndBeveragePreparationInformationModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "NutritionalProductInformationModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "ProductAllergenInformationModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "ProductClaimsAndEndorsementsModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "ProductData.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "ProductInstructionsModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "ProductOriginInformationModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "ProductQuantityInformationModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "QueryByGtinResponse.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "NonfoodIngredientInformationModule.xsd")),
					new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream(xsdFilePath + "ProductUsageAndSafetyModule.xsd"))
			};

			Schema schema = schemaFactory.newSchema(xsds);		
			Validator validator = schema.newValidator();

			validator.validate(new StreamSource(reader));
			return true;
		} catch(SAXException e){
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
