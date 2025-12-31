package com.clinica.action;

import com.clinica.service.PersonaService;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.clinica.model.Persona;

public class PersonaAction extends ActionSupport{
	
	private static final Logger logger = LoggerFactory.getLogger(PersonaAction.class);
	
	private static final long serialVersionUID = 1L;
	
	private Long persona_id;
	
	private PersonaService personaService;
	
	private Persona persona;
	
	private List<Persona> personas;
	
	public PersonaAction() {
		this.personaService = new PersonaService();
		this.personas = new ArrayList<>();
		this.persona = new Persona();
	}
	
	
	/* Métodos para CRUD de Persona*/
	
	public String crearPersona() throws SQLException {
		
		try {
			personaService.crearPersona(persona);
		} catch(SQLException e) {
			logger.atError().log("Excepción de SQL: " + e);
			return ERROR;
		} catch(Exception e) {
			logger.atError().log("Error (LOG): " + e);
			return ERROR;
		}
		
		return SUCCESS;
		
	}
	
	public String obtenerPersonas() throws SQLException {
		
		try {
			personas = personaService.obtenerPersonas();
		} catch(SQLException e) {
			logger.atError().log("Excepción de SQL (LOG): " + e);
			return ERROR;
		} catch(Exception e) {
			logger.atError().log("Error (LOG): " + e);
			return ERROR;
		}
		
		return SUCCESS;
	}
	
	public String obtenerPersonaPorId() throws SQLException {
		
		try {
			persona = personaService.obtenerPersonaPorId(persona_id);
		} catch(SQLException e) {
			logger.atError().log("Excepción de SQL (LOG): " + e);
			return ERROR;
		} catch(Exception e) {
			logger.atError().log("Error (LOG): " + e);
			return ERROR;
		}
		
		return SUCCESS;
	}
	
	public String actualizarPersona() throws SQLException {
		
		try {
			personaService.actualizarPersona(persona);
		} catch(SQLException e) {
			logger.atError().log("Excepción de SQL (LOG): " + e);
			return ERROR;
		} catch(Exception e) {
			logger.atError().log("Error (LOG): " + e);
			return ERROR;
		}
		
		return SUCCESS;
	}
	
	public String eliminarPersona() throws SQLException {
		
		try {
			personaService.eliminarPersona(persona_id);
		} catch(SQLException e) {
			logger.atError().log("Excepción de SQL (LOG): " + e);
			return ERROR;
		} catch(Exception e) {
			logger.atError().log("Error (LOG): " + e);
			return ERROR;
		}
		
		return SUCCESS;
	}
	
	/* Getters y Setters */
	
	
	public PersonaService getPersonaService() {
		return personaService;
	}

	public Long getPersona_id() {
		return persona_id;
	}

	public void setPersona_id(Long persona_id) {
		this.persona_id = persona_id;
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


	public List<Persona> getPersonas() {
		return personas;
	}


	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
}
