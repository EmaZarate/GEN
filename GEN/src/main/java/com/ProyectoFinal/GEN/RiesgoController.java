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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import datos.riesgoDatos;
import modelo.Riesgo;
import modelo.Usuario;


@Controller
public class RiesgoController {
	
	private static final Logger logger = LoggerFactory.getLogger(RiesgoController.class);	
	
	@RequestMapping(value = "/nuevoRiesgo", method = RequestMethod.GET)
	public String nuevoRiesgo(Locale locale, Model model, HttpSession sesion) {
		Riesgo rie=new Riesgo();
		System.out.println("Riesgo Creado");
		model.addAttribute("rie",rie);
		System.out.println("Riesgo Modelado");
		return "nuevoRiesgo";
	}
	
	@RequestMapping(value = "/crearRiesgo", method = RequestMethod.POST)
	public String crearRiesgo(@ModelAttribute("rie") Riesgo rie,
            BindingResult result, HttpSession sesion, Model model) {
		String ir="crearRiesgo";
		if(sesion.getAttribute("usuario")==null) 
			{
				ir="login";
			}
		else {
			Usuario usu=(Usuario)sesion.getAttribute("usuario");
			rie.setId_usuario(usu.getIdusuario());
			riesgoDatos.nuevoRiesgo(rie);
			ir="mapaInteractivo";
		}
		return ir;
	}
	
	
	
}
