package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.interfaceServices.IpersonService;
import com.example.demo.modelo.Person;

@Controller
@RequestMapping
public class ControllerClass {
	
	@Autowired
	private IpersonService service;
	
	@GetMapping("/listar")
	public String list(Model model) {
		List<Person> persons = service.listar();
	    model.addAttribute("persons",persons);
		return "index";
		
	}

}
