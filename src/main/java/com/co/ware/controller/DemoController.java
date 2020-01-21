package com.co.ware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.co.ware.model.Persona;
import com.co.ware.repo.IPersonaRepo;

@Controller
public class DemoController {

	@Autowired
	private IPersonaRepo repo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
       
    	Persona persona = new Persona();
    	persona.setIdPersona(2);
    	persona.setNombre("Pepito");
    	repo.save(persona);
    	
    	model.addAttribute("name", name);
        return "greeting";
    }
    
    @GetMapping("/listar")
    public String listar( Model model) {
      
    	
    	model.addAttribute("personas", repo.findAll() );
        return "greeting";
    }

}
