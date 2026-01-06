<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro Odontológos</title>
</head>
<body>

	<div align="center">
	
		<h2>REGISTRO DE ODONTOLÓGOS</h2>
	
		<s:form action="crear" method="POST" >

			<s:textfield label="Número de Identificación"
				key="odontologo.numeroIdentificacion" />

			<s:textfield label="Nombre" key="odontologo.nombre" />

			<s:textfield label="Telefono" key="odontologo.telefono" />

			<s:textfield label="Fecha de Nacimiento (dd/mm/yyyy)"
				key="odontologo.fechaNacimiento" />
				
			<%--  <s:select name="especialidad" list="status" headerKey="" headerValue="-- Select --" id="status" />--%>

			<s:textfield label="Fecha inicio de Horario" />
			
			<s:textfield label="Fecha fin de Horario" />

			<s:submit value="Crear Odontologo" />

		</s:form>

	</div>



</body>
</html>