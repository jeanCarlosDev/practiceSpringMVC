package br.com.firstMVC.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("Entrou no servidor.");
		
		return "home";
		
	}
	
	
}
