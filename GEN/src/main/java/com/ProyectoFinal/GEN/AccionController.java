package com.ProyectoFinal.GEN;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import modelo.Accion;



@Controller
public class AccionController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccionController.class);	
	
	@RequestMapping(value ="/verAccion")
	 public String enviar(Accion accion) {
	 return "verAccion";
	 }

	
	@RequestMapping(value="/formularioAccion")
	 public String formularioPersona(@ModelAttribute Accion accion) {
	 return "formularioAccion";
	 }
	
	
}
