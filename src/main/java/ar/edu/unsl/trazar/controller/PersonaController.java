package ar.edu.unsl.trazar.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unsl.trazar.entity.Persona;
import ar.edu.unsl.trazar.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Resource
	PersonaService personaService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Persona createPersona(@RequestBody Persona persona) {
		return personaService.createPersona(persona);
	}
	
	@RequestMapping(value = "/{personaId}", method = RequestMethod.GET)
	public Persona getPersonaById(@PathVariable("personaId") Integer personaId) {
		return personaService.getPersonaById(personaId);
	}

}
