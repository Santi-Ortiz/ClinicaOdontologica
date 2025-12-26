package logica;

import java.sql.SQLException;
import java.util.List;

import persistencia.PersonaPersistencia;

public class ControladorPersona {
	
	PersonaPersistencia persistenciaPersona = new PersonaPersistencia();
	
	public void crearPersona(Persona persona) throws SQLException {
		persistenciaPersona.crearPersona(persona);
	}
	
	public List<Persona> obtenerPersonas() throws SQLException {
		return persistenciaPersona.obtenerPersonas();
	}
	
	public Persona obtenerPersonaPorId(Long id) throws SQLException {
		return persistenciaPersona.obtenerPersonaPorId(id);
	}
	
	public void actualizarPersona(Persona persona) throws Exception {
		persistenciaPersona.actualizarPersona(persona);
	}
	
	public void eliminarPersona(Long id) throws Exception{
		persistenciaPersona.eliminarPersona(id);
	}
	
}

