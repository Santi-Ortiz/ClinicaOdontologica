package com.clinica.action;

import com.clinica.service.PersonaService;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clinica.model.Persona;

public class PersonaAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private PersonaService personaService;
	
	private Persona persona;
	
	private List<Persona> personas;
	
	public PersonaAction() {
		this.personaService = new PersonaService();
		this.personas = new ArrayList<>();
		this.persona = new Persona();
	}
	
	
	public String crearPersona() throws SQLException {
		
		personaService.crearPersona(persona);
		return SUCCESS;
		
	}
	
	public String obtenerPersonas() throws SQLException {
		
		personaService.obtenerPersonas();
		
		return SUCCESS;
	}

	public PersonaService getPersonaService() {
		return personaService;
	}

	public void setPersonaService(PersonaService personaService) {
		this.personaService = personaService;
	}
	
	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
