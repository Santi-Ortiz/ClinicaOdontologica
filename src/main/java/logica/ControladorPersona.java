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
	
	public void actualizarPersona(Persona persona) throws Exception {
		persistenciaPersona.actualizarPersona(persona);
	}
	
	public void eliminarPersona(int id) throws Exception{
		persistenciaPersona.eliminarPersona(id);
	}
	
}

