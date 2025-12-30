package com.clinica.action;

import com.clinica.service.PersonaService;

import com.clinica.model.Persona;

public class PersonaAction {
	
	PersonaService personaService;
	
	public PersonaAction() {
		this.personaService = new PersonaService();
	}
	
	public Persona execute() {
		
	  	return new Persona();
	}

}
