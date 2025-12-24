package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	private static final String URL = "jdbc:postgresql://localhost:5432/ClinicaOdontologica";
	
	private static final String USER = "postgres";
	
	private static final String PASSWORD = "inetum0501";
	
	public static Connection getConnection() throws Exception {
		Connection connection = null;
		
		try {
			// Se carga el Driver de JDBC 
			Class.forName("org.postgresql.Driver");
			// Se realiza la conexión a la base de datos con autenticación
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("--- Conexión exitosa a la BD ---");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void closeConnection(Connection connection) throws SQLException {
		if(connection != null) {
			connection.close();
			System.out.println("--- Se ha cerrado la conexión a la BD ---");
		}
	}
	
}
