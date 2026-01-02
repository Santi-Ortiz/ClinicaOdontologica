package com.clinica.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.clinica.dao.jpa.PersonaJpaController;
import com.clinica.model.Persona;

public class PersonaDAO {

	PersonaJpaController personaJPAController = new PersonaJpaController();

	private static Logger logger = LogManager.getLogger(PersonaDAO.class);

	public void crearPersona(Persona persona) {
		personaJPAController.create(persona);
		logger.info("La persona {} fue creada correctamente ", persona);
	}

	public List<Persona> obtenerPersonas() {
		List<Persona> personas = personaJPAController.findPersonaEntities();
		logger.info("Se encontraron las siguientes personas: {}", personas);

		return personas;
	}

	public Persona obtenerPersonaPorId(Long id) {
		Persona persona = personaJPAController.findPersona(id);
		logger.info("Se encontro la siguiente persona: {}", persona);

		return persona;
	}

	public void actualizarPersona(Persona persona) throws Exception {
		personaJPAController.edit(persona);
		logger.info("Se actualizo la persona: {}", persona);
	}

	public void eliminarPersona(Long id) throws Exception {
		personaJPAController.destroy(id);
		logger.info("Se elimino la persona con id: {}", id);
	}

}
