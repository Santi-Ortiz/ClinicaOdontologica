package servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logica.Persona;
import persistencia.PersistenciaPersona;

@WebServlet("/SvPersona")
public class SvPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PersistenciaPersona persistenciaPersona = new PersistenciaPersona();
       
    public SvPersona() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Persona> personas = new ArrayList<>();
		
		try {
			
			personas = persistenciaPersona.obtenerPersonas();
			
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("personas", personas);
			
			response.sendRedirect("persona.jsp");
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int numeroIdentificacion = Integer.parseInt(request.getParameter("numeroIdentificacion"));
        String nombre = request.getParameter("nombre");
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        Date fechaNacimiento = Date.valueOf(request.getParameter("fechaNacimiento"));
        
        
        Persona persona = new Persona(numeroIdentificacion, nombre, telefono, fechaNacimiento);
        System.out.println("Persona recibida: " + persona);
        
        try {
			persistenciaPersona.crearPersona(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
