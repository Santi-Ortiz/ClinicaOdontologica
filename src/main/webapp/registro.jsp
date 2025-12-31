<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro Personas</title>
</head>
<body>

		<h1>REGISTRO DE PERSONAS</h1>

		<s:form action="crear" method="POST">
		
			<s:textfield label="Número de Identificación" key="persona.numeroIdentificacion"/>
			
			<s:textfield label="Nombre" key="persona.nombre"/>
			
			<s:textfield label="Telefono" key="persona.telefono"/>
			
			<s:textfield label="Fecha de Nacimiento (dd/mm/yyyy)" key="persona.fechaNacimiento"/>
		
			<s:submit />
	
		</s:form>
		
		<s:form action="index">
			<s:submit value="Volver a Inicio"></s:submit>
		</s:form>

</body>
</html>