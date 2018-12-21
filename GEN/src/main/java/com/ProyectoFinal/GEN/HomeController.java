package com.ProyectoFinal.GEN;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import modelo.Usuario;

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
	public String home(Locale locale, Model model,HttpSession sesion) {
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
	
	@RequestMapping(value = "/mapaInteractivo", method = RequestMethod.GET)
	public String mapaInteractivo(Locale locale, Model model, HttpSession sesion) {
		String ir="mapaInteractivo";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir;
	}
	
	@RequestMapping(value = "/nuevoRiesgo", method = RequestMethod.GET)
	public String nuevoRiesgo(Locale locale, Model model, HttpSession sesion) {
		String ir="nuevoRiesgo";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir;
	}
	
	@RequestMapping(value = "/radarMeteorologico", method = RequestMethod.GET)
	public String radarMeteorological(Locale locale, Model model, HttpSession sesion) {
		String ir="radarMeteorologico";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir;
	}
	@RequestMapping(value = "/radarHumedad", method = RequestMethod.GET)
	public String radarHumidity(Locale locale, Model model, HttpSession sesion) {
		String ir="radarHumedad";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir;
	}
	@RequestMapping(value = "/radarIsobara", method = RequestMethod.GET)
	public String radarIsobar(Locale locale, Model model, HttpSession sesion) {
		String ir="radarIsobara";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir;
		}
	@RequestMapping(value = "/radarTormentas", method = RequestMethod.GET)
	public String radarStorm(Locale locale, Model model, HttpSession sesion) {
		String ir="radarTormentas";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir;
	}
	@RequestMapping(value = "/prueba", method = RequestMethod.GET)
	public String prueba(Locale locale, Model model, HttpSession sesion) {
		String ir="prueba";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir;
	}
	
	@RequestMapping(value = "/aviacion", method = RequestMethod.GET)
	public String aviacion(Locale locale, Model model, HttpSession sesion) {
		String ir="aviacion";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir;
	}
	@RequestMapping(value = "/anomalas", method = RequestMethod.GET)
	public String anomalas(Locale locale, Model model, HttpSession sesion) {
		String ir="anomalas";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir; 
	}
	@RequestMapping(value = "/micuenta", method = RequestMethod.GET)
	public String micuenta(Locale locale, Model model, HttpSession sesion) {
		String ir="micuenta";
		if(sesion.getAttribute("usuario")==null) 
		{ir="login";model.addAttribute("usu", new Usuario());}	
		return ir; 
	}
}
