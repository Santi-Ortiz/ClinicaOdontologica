<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro Personas</title>
</head>
<body>

	

	<div align="center">
	
		<h2>REGISTRO DE PERSONAS</h2>
	
		<s:form action="crear" method="POST" >

			<s:textfield label="Número de Identificación"
				key="persona.numeroIdentificacion" />

			<s:textfield label="Nombre" key="persona.nombre" />

			<s:textfield label="Telefono" key="persona.telefono" />

			<s:textfield label="Fecha de Nacimiento (dd/mm/yyyy)"
				key="persona.fechaNacimiento" />

			<s:submit value="Crear Persona" />

		</s:form>

	</div>



</body>
</html>