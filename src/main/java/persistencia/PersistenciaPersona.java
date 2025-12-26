package persistencia;

import java.util.List;

import logica.Persona;

public class PersistenciaPersona {
	
	PersonaJPAController personaJPAController = new PersonaJPAController();
	
	public void crearPersona(Persona persona) {
		personaJPAController.create(persona);
	}
	
	public List<Persona> obtenerPersonas(){
		return personaJPAController.findPersonaEntities();
	}
	
	public Persona obtenerPersonaPorId(Long id){
		return personaJPAController.findPersona(id);
	}
	
	public void actualizarPersona(Persona persona) throws Exception {
		personaJPAController.edit(persona);
	}
	
	public void eliminarPersona(Long id) throws Exception{
		personaJPAController.destroy(id);
	}

}
