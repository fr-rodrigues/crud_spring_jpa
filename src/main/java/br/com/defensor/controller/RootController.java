package br.com.defensor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
	
	/**
	 * Raiz do projeto 
	 * metodo que redireciona para a pagina do formulario
	 * @return
	 */
	@RequestMapping("/")
	public String init(){
		return "redirect:presidiario";
	}

}
