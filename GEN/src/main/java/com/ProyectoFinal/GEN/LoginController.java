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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import datos.tipoRiesgoDatos;
import datos.usuarioDatos;
import modelo.Usuario;


/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model, @RequestParam(required = false) String error) {
		model.addAttribute("error", error);
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("usu",new Usuario());
		return "login";
	}
	
	@RequestMapping(value = "/validar", method = RequestMethod.POST)
	public String validar(Model model, Usuario usu,HttpSession sesion, @RequestParam(required = false) String error, Boolean admin) {
		String ir="redirect:/?error=1";
		if(usuarioDatos.validarUsuario(usu))
		{
			//crear sesiones
			sesion.setAttribute("usuario", usu);
			int tipoUsu = usu.getTipoUsuario();
			System.out.println(tipoUsu);
			sesion.setAttribute("tipoUsu", tipoUsu);
			ir="redirect:/mapaInteractivo";
		}
		else{model.addAttribute("usu",  new Usuario());
		error="Error de usuario o password";
		model.addAttribute("error", error);
		ir="redirect:/login";}
		
		return ir;
	}
	
	@RequestMapping(value = "/finsesion", method = RequestMethod.GET)
	public String finsesion(Model model, HttpSession sesion) {
		sesion.removeAttribute("usuario");
		model.addAttribute("usu",  new Usuario());
		return "login";
	}
	
	@RequestMapping(value = "/nuevoUsuario", method = RequestMethod.GET)
	public String nuevoUsuario(Locale locale, Model model, HttpSession sesion) {
		Usuario nu=new Usuario();
		model.addAttribute("nu",nu);
		return "registrarse";
	}

	@RequestMapping(value = "/registrarse", method = RequestMethod.POST)
	public String registrarse(@ModelAttribute("nu") Usuario nu,
            BindingResult result, HttpSession sesion, Model model) {
		    String ir="registrarse";
			nu.setHabilitado(false);
			nu.setTipoUsuario(1);
			usuarioDatos.nuevoUsu(nu);
			ir="mapaInteractivo";
		return ir;
	}
	
	@RequestMapping(value = "/habilitarUsuarios", method = RequestMethod.GET)
	public String habilitarUsuarios(Locale locale, Model model, HttpSession sesion, @RequestParam(required = false) String msj) {
		model.addAttribute("usus",usuarioDatos.mostrarInhab());
		model.addAttribute("msj", msj);
		return "habilitarUsuarios";
	}
	
	@RequestMapping(value = "/habilitarUsu", method = RequestMethod.GET)
	public String habilitarUsu(Locale locale, Model model, HttpSession sesion, @RequestParam int id, @RequestParam(required = false) String msj) {
		msj="Usuario Habilitado";
		model.addAttribute("msj", msj);
		usuarioDatos.habilitarUsu(id);
		return "habilitarUsuarios";
	}
	
	@RequestMapping(value = "/deshabilitarUsu", method = RequestMethod.GET)
	public String deshabilitarUsu(Locale locale, Model model, HttpSession sesion,@RequestParam int id, @RequestParam(required = false) String msj) {
		msj="Usuario Deshabilitado";
		model.addAttribute("msj", msj);
		usuarioDatos.deshabilitarUsu(id);
		return "habilitarUsuarios";
	}
	

}
