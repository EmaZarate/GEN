package com.ProyectoFinal.GEN;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	/**
	 * Radares
	 */
	
	@RequestMapping(value = "/radares", method = RequestMethod.GET)
	public String radars(Locale locale, Model model) {

		
		return "radares";
	}
	
	@RequestMapping(value = "/nuevoRiesgo", method = RequestMethod.GET)
	public String nuevoRiesgo(Locale locale, Model model) {

		
		return "nuevoRiesgo";
	}
	@RequestMapping(value = "/prueba", method = RequestMethod.GET)
	public String prueba(Locale locale, Model model) {
        
		return "prueba";
	}
	@RequestMapping(value = "/radarMeteorologico", method = RequestMethod.GET)
	public String radarMeteorological(Locale locale, Model model) {

		
		return "radarMeteorologico";
	}
	@RequestMapping(value = "/radarHumedad", method = RequestMethod.GET)
	public String radarHumidity(Locale locale, Model model) {

		
		return "radarHumedad";
	}
	@RequestMapping(value = "/radarIsobara", method = RequestMethod.GET)
	public String radarIsobar(Locale locale, Model model) {

		
		return "radarIsobara";
	}
	@RequestMapping(value = "/radarTormentas", method = RequestMethod.GET)
	public String radarStorm(Locale locale, Model model) {

		
		return "radarTormentas";
	}
	
}
