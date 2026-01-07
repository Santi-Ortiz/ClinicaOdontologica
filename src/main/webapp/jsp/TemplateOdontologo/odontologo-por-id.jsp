<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Odontologo por Id</title>
</head>
<body>

	<h1>Búsqueda de Odontologo</h1>
	<h3>Se ha encontrado el siguiente odontologo: </h3>
	
	<ul>
		<li>
			Número Identificación: <s:property value="odontologo.numeroIdentificacion"/> <br>
			Nombre: <s:property value="odontologo.nombre"/> <br>
			Telefono: <s:property value="odontologo.telefono"/> <br>
			Fecha Nacimiento: <s:property value="odontologo.fechaNacimiento"/>
		</li>
	</ul>

</body>
</html>