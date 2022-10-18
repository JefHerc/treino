package com.algaworks.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festa.dao.ConvidadoDAO;
import com.algaworks.festa.model.Convidado;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	ConvidadoDAO convidadoDAO;
	
	
	@GetMapping
	public ModelAndView listar(){
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject("convidados", convidadoDAO.listar());
		modelAndView.addObject(new Convidado());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Convidado convidado){
		convidadoDAO.salvar(convidado);
		return "redirect:/convidados";
	}
	
}
