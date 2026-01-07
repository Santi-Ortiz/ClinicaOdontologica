<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Persona por Id</title>
</head>
<body>

	<h1>Búsqueda de Persona</h1>
	<h3>Se ha encontrado la siguiente persona: </h3>
	
	<ul>
		<li>
			Número Identificación: <s:property value="persona.numeroIdentificacion"/> <br>
			Nombre: <s:property value="persona.nombre"/> <br>
			Telefono: <s:property value="persona.telefono"/> <br>
			Fecha Nacimiento: <s:property value="persona.fechaNacimiento"/>
		</li>
	</ul>





</body>
</html>