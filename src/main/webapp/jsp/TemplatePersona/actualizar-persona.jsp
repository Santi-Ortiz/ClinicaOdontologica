<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualización Datos Persona</title>
</head>
<body>

	<h1>Actualizar Persona</h1>

	<s:form action="actualizar-persona" method="PUT">
		<s:hidden name="persona_id"> </s:hidden> 
		<s:textfield label="Número de Identificación" name="persona.numeroIdentificacion"/> 
		<s:textfield label="Nombre" name="persona.nombre"/> 
		<s:textfield label="Telefono" name="persona.telefono"/> 
		<s:textfield label="Fecha de Nacimiento (dd/mm/yyyy)" name="persona.fechaNacimiento"/> 
	
		<s:submit value="Actualizar"/>
	</s:form>
	
	<s:form action="index">
			<s:submit value="Volver a Inicio"></s:submit>
	</s:form>

</body>
</html>