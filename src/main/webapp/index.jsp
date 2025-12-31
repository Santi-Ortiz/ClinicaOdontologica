<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="UTF-8">
		<title>Clínica Odontológica</title>
	</head>
	
	<body>
		<h1> Registro de Personas</h1>
		
		
		<s:form action="registro" method="POST">
		
			<s:textfield label="Número de Identificación" key="persona.numeroIdentificacion"/>
			
			<s:textfield label="Nombre" key="persona.nombre"/>
			
			<s:textfield label="Telefono" key="persona.telefono"/>
			
			<s:textfield label="Fecha de Nacimiento" key="persona.fechaNacimiento"/>
		
			<s:submit />
	
		</s:form>
		
		
		<h1> Mostrar Personas</h1>
			
		<form action="personas" method="GET">
			<button type="submit"> Listar</button>
		</form>
		
	</body>
</html>