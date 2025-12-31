package com.clinica.service;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.clinica.dao.PersonaDAO;
import com.clinica.dao.jpa.PersonaJpaController;
import com.clinica.model.Persona;

public class PersonaService {
	
	private static Logger logger = LoggerFactory.getLogger(PersonaDAO.class);

	PersonaDAO personaDAO = new PersonaDAO();
	
	public PersonaService() {
		
	}
	
	public void crearPersona(Persona persona) throws SQLException {
		personaDAO.crearPersona(persona);
	}
	
	public List<Persona> obtenerPersonas() throws SQLException {
		return personaDAO.obtenerPersonas();
	}
	
	public Persona obtenerPersonaPorId(Long id) throws SQLException {
		return personaDAO.obtenerPersonaPorId(id);
	}
	
	public void actualizarPersona(Persona persona) throws Exception {
		personaDAO.actualizarPersona(persona);
	}
	
	public void eliminarPersona(Long id) throws Exception{
		personaDAO.eliminarPersona(id);
	}

}
