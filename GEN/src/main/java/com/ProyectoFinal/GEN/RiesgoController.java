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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import datos.riesgoDatos;

import modelo.Riesgo;
import datos.riesgoDatos;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RiesgoController {
	
	private static final Logger logger = LoggerFactory.getLogger(RiesgoController.class);	
	
	@RequestMapping(value = "/nuevoRiesgo", method = RequestMethod.GET)
	public String nuevoRiesgo(Model model,HttpSession sesion,@RequestParam(required=false) String modi ) {
		String ir="login";
		if(sesion.getAttribute("usuario")==null) {ir="login";}
		else{
		Riesgo rie= new Riesgo();
		if(modi==null){	
			//nuevo de Riesgo
			}
		else
		{
			//modificaicon de Riesgo
		}
		model.addAttribute("rie",rie);
		}
		return ir;
	}
	
	
	
	
}
