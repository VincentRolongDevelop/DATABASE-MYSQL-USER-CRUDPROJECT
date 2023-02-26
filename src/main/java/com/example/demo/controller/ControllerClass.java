package com.example.demo.controller;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.interfaceServices.IpersonService;
import com.example.demo.modelo.Person;

import jakarta.validation.Valid;

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
	
	@GetMapping("/new")
	public String addNew(Model model) {
		model.addAttribute("person",new Person());
		return "form";
	}      
	
	@PostMapping("/save")
	public String save(@Valid Person p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model model) {
		Optional<Person>person=service.listId(id);
		model.addAttribute("person",person);
		return "form";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
		
	}

}
