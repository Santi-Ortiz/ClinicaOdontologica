package com.clinica.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.clinica.model.Persona;
import com.clinica.persistence.PersonaJpaController;
import com.clinica.persistence.PersonaPersistencia;

public class PersonaService {
	
	private static Logger logger = LoggerFactory.getLogger(PersonaPersistencia.class);
	
	PersonaJpaController personaJPAController = new PersonaJpaController();
	
	public PersonaService() {
		
	}
	
	public void crearPersona(Persona persona) {
		personaJPAController.create(persona);
		logger.atInfo().log("La persona {} fue creada correctamente ", persona);
	}

	public List<Persona> obtenerPersonas() {
		List<Persona> personas = personaJPAController.findPersonaEntities();
		logger.atInfo().log("Se encontraron las siguientes personas: {}.", personas);

		return personas;
	}

	public Persona obtenerPersonaPorId(Long id) {
		Persona persona = personaJPAController.findPersona(id);
		logger.atInfo().log("Se encontro la siguiente persona: {}.", persona);

		return persona;
	}

	public void actualizarPersona(Persona persona) throws Exception {
		personaJPAController.edit(persona);
		logger.atInfo().log("Se actualizo la persona: {}.", persona);
	}

	public void eliminarPersona(Long id) throws Exception {
		personaJPAController.destroy(id);
		logger.atInfo().log("Se elimino la persona con id: {}.", id);
	}

}
