package com.example.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.interfaceServices.IpersonService;
import com.example.modelo.Person;

@Controller
@RequestMapping
public class ControllerClass {
	
	@Autowired
	private IpersonService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<Person>persons=service.list();
		model.addAttribute("persons",persons);
		return "index";
		
	}

}
