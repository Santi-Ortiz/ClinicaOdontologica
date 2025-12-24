<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import= "java.util.ArrayList" %>
<%@ page import= "java.util.List" %>
<%@ page import= "logica.Persona" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pagina de Personas</title>
</head>
<body>
    <h1>Página Principal de Personas</h1>
    
    <% 
        List<Persona> personas = (List<Persona>) request.getSession().getAttribute("personas");
        if (personas != null) {
    %>
    
        <ul>
        <% for (Persona persona : personas) { %>
            <li> 
	            Identificacion: <%= persona.getNumeroIdentificacion() %> <br>
	            Nombre: <%= persona.getNombre() %> <br>
	            Telefono: <%= persona.getTelefono() %> <br>
	            Fecha Nacimiento: <%= persona.getFechaNacimiento() %> <br>
	            <hr>
            </li>
        <% } %>
        </ul>
        
    <%  } %>
</body>
</html>