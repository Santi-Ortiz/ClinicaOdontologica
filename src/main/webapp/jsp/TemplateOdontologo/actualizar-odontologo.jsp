<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualización Datos Odontologo</title>
</head>
<body>

	<h1>Actualizar Odontologo</h1>

	<s:form action="actualizar-odontologo" method="PUT">
		<s:hidden name="persona_id"> </s:hidden> 
		<s:textfield label="Número de Identificación" name="odontologo.numeroIdentificacion"/> 
		<s:textfield label="Nombre" name="odontologo.nombre"/> 
		<s:textfield label="Telefono" name="odontologo.telefono"/> 
		<s:textfield label="Fecha de Nacimiento (dd/mm/yyyy)" name="odontologo.fechaNacimiento"/> 
	
		<s:submit value="Actualizar"/>
	</s:form>

</body>
</html>