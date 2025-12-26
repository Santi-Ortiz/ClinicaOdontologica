package persistencia;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import logica.Persona;

public class PersonaPersistencia {
	
	PersonaJpaController personaJPAController = new PersonaJpaController();
	
	private static Logger logger = LoggerFactory.getLogger(PersonaPersistencia.class);
	
	public void crearPersona(Persona persona) {
		personaJPAController.create(persona);
//		logger.atDebug().log("La persona {}. fue creada correctamente", persona);
//		logger.debug("La persona {}. fue creada correctamente", persona);
		logger.info("La persona {} fue creada correctamente", persona);
	}
	
	public List<Persona> obtenerPersonas(){
		List<Persona> personas = personaJPAController.findPersonaEntities();
		logger.atDebug().log("Se encontraron las siguientes personas: {}.", personas);
		
		return personas;
	}
	
	public Persona obtenerPersonaPorId(Long id){
		Persona persona = personaJPAController.findPersona(id);
		logger.atDebug().log("Se encontro la siguiente persona: {}.", persona);
		
		return persona;
	}
	
	public void actualizarPersona(Persona persona) throws Exception {
		personaJPAController.edit(persona);
		logger.atDebug().log("Se actualizo la persona: {}.", persona);
	}
	
	public void eliminarPersona(Long id) throws Exception{
		personaJPAController.destroy(id);
		logger.atDebug().log("Se elimino la persona con id: {}.", id);
	}

}
