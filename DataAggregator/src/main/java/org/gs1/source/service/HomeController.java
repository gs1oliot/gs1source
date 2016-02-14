package org.gs1.source.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;

import javax.servlet.http.HttpServletRequest;

import org.gs1.source.service.aaqi.Authenticator;
import org.gs1.source.service.aaqi.QueryProcessor;
import org.gs1.source.service.aaqi.QueryReceiver;
import org.gs1.source.service.mongo.MongoServerKey;
import org.gs1.source.service.registration.Registerar;
import org.gs1.source.service.util.MacEncode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Data Aggregator home page
	 * @param locale
	 * @param model
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws IOException {

		logger.info("Welcome FSS Data Aggregator! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate );

		return "home";
	}

	/**
	 * Product Data query page
	 * @param gtin
	 * @param targetMarketString
	 * @param dataVersion
	 * @param clientGln
	 * @param mac
	 * @return
	 * @throws Exception
	 */
	@Async
	@RequestMapping(value = "/v1/ProductData/gtin/{gtin:.+}", method = RequestMethod.GET)
	public Callable<ModelAndView> queryByGTIN(@PathVariable("gtin") final String gtin,
			@RequestParam(value = "targetMarket") final String targetMarketValue,
			@RequestParam(value = "dataVersion", defaultValue = "1.1") final String dataVersion,
			@RequestParam(value = "clientGln", defaultValue = "0") final String clientGln,
			@RequestParam(value = "mac", defaultValue = "0") final String mac) throws Exception {

		return new Callable<ModelAndView>() {

			@Override
			public ModelAndView call() throws Exception {

				logger.info("Start query...");

				ModelAndView model = new ModelAndView();
				model.setViewName("queryByGTIN");

				QueryReceiver queryReceiver = new QueryReceiver(gtin, targetMarketValue, dataVersion, clientGln, mac);
				QueryProcessor queryProcessor = queryReceiver.getProcessor();

				String str = queryProcessor.query();
				
				//case 1) AAQI interface
				if(queryProcessor.isAAQI()){

					MongoServerKey server = new MongoServerKey();
					String key = server.queryKey(clientGln);
					MacEncode macEncode = new MacEncode();

					Authenticator authenticator = queryReceiver.getAuthenticator();
					int auth = authenticator.authenticate(macEncode, key);

					if(auth == Authenticator.AUTHENTICATED) {
						String mac_payload = macEncode.encode(key, str);

						model.addObject("ResponseString", str);
						model.addObject("payloadMac", mac_payload);
						
						logger.info("Complete query...(AAQI)");
					} else if(auth == Authenticator.NOT_AUTHENTICATED) {
						model.addObject("ResponseString", "Exception: Not Authenticated");
						model.addObject("payloadMac", "0");

						logger.info("Complete query...(AAQI: Not Authenticated)");
					}
				}
				//case 2) Not AAQI interface, just present product data in web
				else{
					model.addObject("ResponseString", str);
					model.addObject("payloadMac", "0");
					
					logger.info("Complete query...");
				}

				return model;

			}

		};

	}

	/**
	 * Product data register page
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {

		return "register";

	}

	/**
	 * Product data registered page
	 * @param request
	 * @param model
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/registered", method = RequestMethod.POST)
	public String registered(HttpServletRequest request, Model model) throws UnsupportedEncodingException {

		request.setCharacterEncoding("UTF-8");
		return "registered";

	}

	@RequestMapping(value = "/postdata", method = RequestMethod.POST, consumes = "application/xml")
	public ResponseEntity<String> postData(@RequestBody String xmldata) throws Exception {

		//		if (userID.compareTo("kaist") != 0 || password.compareTo("reslresl") != 0) {
		//			System.out.println("Not Authenticated");
		//			return new ResponseEntity<String>(new String("Not Authenticated"), HttpStatus.BAD_REQUEST);
		//		}

		Registerar registerar = new Registerar(new DAOFactory(), "mongo");
		int result = registerar.register(xmldata);

		if (result == Registerar.NODATA) {
			System.out.println("The xmldata is empty.");
			return new ResponseEntity<String>(new String("The xmldata is empty."), HttpStatus.OK);
		} else if (result == Registerar.NOT_VALID) {
			System.out.println("The xmldata is not valid.");
			return new ResponseEntity<String>(new String("The xmldata is not valid."), HttpStatus.OK);
		} else if (result == Registerar.EXISTED) {
			System.out.println("The product is already exists.");
			return new ResponseEntity<String>(new String("The product is already exists."), HttpStatus.OK);
		} else {
			System.out.println("The product is registered at Aggregator.");
			return new ResponseEntity<String>(new String("The product is registered at Aggregator."), HttpStatus.OK);
		}
	}

}
