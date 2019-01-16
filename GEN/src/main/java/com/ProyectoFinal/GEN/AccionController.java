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

import datos.tipoAccionDatos;
import modelo.Accion;
import modelo.TipoAccion;
import modelo.Usuario;



@Controller
public class AccionController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccionController.class);	
	
	@RequestMapping(value ="/nuevaAccion")
	public String nuevaAccion(Model model, HttpSession sesion, @RequestParam(required = false) String error) {
	if(sesion.getAttribute("usuario")==null) 
		{
			error="Debe estar logeado para crear una Acción";
			model.addAttribute("error", error);
			model.addAttribute("usu", new Usuario());
			return "login";
		}
	else {
		model.addAttribute("error", error);
		Accion acc = new Accion();
		model.addAttribute("accion", acc);
		return "nuevaAccion";
		}
	}

	
	@RequestMapping(value="/guardarAccion")
	public String formularioPersona(@ModelAttribute Accion accion) {
	return "guardarAccion";
	}
	
	@RequestMapping(value = "/nuevoTipoAccion", method = RequestMethod.GET)
	public String nuevoTipoAccion(Locale locale, Model model, HttpSession sesion, @RequestParam(required = false) String error) {
		String ir="login";
		if(sesion.getAttribute("usuario")==null) 
		{
			error="Debe estar logeado para crear un Tipo de Acción";
			model.addAttribute("error", error);
			model.addAttribute("usu", new Usuario());
			return "login";
		}
		else {
		model.addAttribute("error", error);
		TipoAccion ta=new TipoAccion();
		model.addAttribute("ta",ta);
		ir="nuevoTipoAccion";
		}
		return ir;
	}

	@RequestMapping(value = "/crearTipoAccion", method = RequestMethod.POST)
	public String crearTipoAccion(@ModelAttribute("ta") TipoAccion ta,
            BindingResult result, HttpSession sesion, Model model) {
		String ir="crearTipoAccion";
		if(sesion.getAttribute("usuario")==null) 
			{
				ir="login";
			}
		else {
			Usuario usu=(Usuario)sesion.getAttribute("usuario");
			ta.setUsu_alta_ta(usu.getIdusuario());
			tipoAccionDatos.nuevoTA(ta);
			ir="mapaInteractivo";
		}
		return ir;
	}
}
