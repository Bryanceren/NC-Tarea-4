package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Producto;

@Controller
public class MainController {
	
	@RequestMapping("/producto")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("index");
		return mav;
	}
	
	
	@RequestMapping("/procesar")
	public ModelAndView procesar2(@Valid @ModelAttribute Producto product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) { //Hay errores, redirigimos a la pantalla del formulario
			mav.setViewName("index");
		}
		else { //Si no hay, flujo normal
			mav.addObject("CodigoUniversal", product.getCodigo());
			mav.addObject("nombre", product.getNombre());
			mav.addObject("marca", product.getMarca());
			mav.addObject("descripcion", product.getDescripcion());
			mav.addObject("existencias", product.getExistencias());
			mav.addObject("fecha", product.getFecha());
			mav.setViewName("resultado");
		}
		return mav;
	}

}
