package ar.edu.unsl.trazar.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ar.edu.unsl.trazar.entity.Persona;
import ar.edu.unsl.trazar.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Resource
	PersonaRepository personaRepository;
	
	@Override
	public Persona createPersona(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public Persona getPersonaById(Integer personaId) {
		return personaRepository.findById(personaId).orElse(null);
	}

}
