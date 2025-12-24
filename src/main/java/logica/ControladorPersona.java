package logica;

import java.sql.SQLException;
import java.util.List;

import persistencia.PersistenciaPersona;

public class ControladorPersona {
	
	PersistenciaPersona persistenciaPersona = new PersistenciaPersona();
	
	public void crearPersona(Persona persona) throws SQLException {
		persistenciaPersona.crearPersona(persona);
	}
	
	public List<Persona> obtenerPersonas() throws SQLException {
		return persistenciaPersona.obtenerPersonas();
	}
	
	public Persona obtenerPersonaPorId(int id) throws SQLException {
		return persistenciaPersona.obtenerPersonaPorId(id);
	}
	
}
