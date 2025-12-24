package persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

import java.util.ArrayList;
import java.util.List;

import logica.Persona;

public class PersistenciaPersona {
	
	Connection conexion = null;
    Statement consulta = null;
    ResultSet resultado = null;
	
	public PersistenciaPersona() {
		
	}
	
	public Persona obtenerPersonaPorId(int id) throws SQLException {
		
	    try {
	    	conexion = ConexionBD.getConnection(); // Conexión a BD
	    	consulta = conexion.createStatement(); // Generación de consulta (query)
	    	resultado = consulta.executeQuery("SELECT * FROM PERSONA WHERE idPersona = " + id); // Ejecución de la consulta
	    	
	    	while (resultado.next()) {
                int numeroIdentificacion = resultado.getInt("numeroIdentificacion");
                String nombre = resultado.getString("nombre");
                int telefono = resultado.getInt("telefono");
                Date fechaNacimiento = resultado.getDate("fechaNacimiento");
                
                // Se retorna la persona

	    		ConexionBD.closeConnection(conexion);
                return new Persona(numeroIdentificacion, nombre, telefono, fechaNacimiento);
            }
	   
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }

		ConexionBD.closeConnection(conexion);
	    return null;
	}
	
	
	
	public List<Persona> obtenerPersonas() throws SQLException {
		
	    List<Persona> personas = new ArrayList<>();
	    
	    try {
	    	conexion = ConexionBD.getConnection(); // Conexión a BD
	    	consulta = conexion.createStatement(); // Generación de consulta (query)
	    	resultado = consulta.executeQuery("SELECT * FROM PERSONA"); // Ejecución de la consulta
	    	
	    	// Mientras que el resultado de la consulta tenga registros, se agrega a la lista de personas
	    	while (resultado.next()) {
                int numeroIdentificacion = resultado.getInt("numeroIdentificacion");
                String nombre = resultado.getString("nombre");
                int telefono = resultado.getInt("telefono");
                Date fechaNacimiento = resultado.getDate("fechaNacimiento");
                
                System.out.println("NI: " + numeroIdentificacion);
                System.out.println("Telefono: " + telefono);
                
                // Se añade la persona
                personas.add(new Persona(numeroIdentificacion, nombre, telefono, fechaNacimiento));
            }
	    	
    		ConexionBD.closeConnection(conexion);
	    	return personas;
	   
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }

		ConexionBD.closeConnection(conexion);
	    return personas;
		
	}
	
	public boolean crearPersona(Persona persona) throws SQLException {
		
		Connection conexion = null;
	    Statement consulta = null;
	    
	    try {
	    	conexion = ConexionBD.getConnection(); // Conexión a BD
	    	consulta = conexion.createStatement(); // Generación de consulta (query)
	    
	    	// Ejecución de la consulta
	    	consulta.executeUpdate("INSERT INTO PERSONA (numeroIdentificacion, nombre, telefono, fechanacimiento) "
	    			+ "VALUES (" + persona.getNumeroIdentificacion() + ",'" +  persona.getNombre() 
	    			+ "'," + persona.getTelefono() + ",'" +persona.getFechaNacimiento() + "');"); 
	    	
	    	return true;
	    	
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }

		ConexionBD.closeConnection(conexion);
	    return false;
		
	}
	
	
}
