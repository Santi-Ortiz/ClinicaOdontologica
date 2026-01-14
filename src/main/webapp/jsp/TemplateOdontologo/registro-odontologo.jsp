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

		<s:form action="crear-odontologo" method="POST">

			<s:textfield label="Número de Identificación"
				name="odontologo.numeroIdentificacion" />

			<s:textfield label="Nombre" name="odontologo.nombre" />

			<s:textfield label="Telefono" name="odontologo.telefono" />

			<s:textfield label="Fecha de Nacimiento (dd/mm/yyyy)"
				key="odontologo.fechaNacimiento" />

			<s:select name="especialidad_id" label="Especialidad"
				list="especialidades" listKey="especialidadId" listValue="especialidad"
				headerKey="" headerValue="Seleccione una especialidad" />

			<s:textfield label="Fecha inicio de Horario" name="fechaInicio" />

			<s:textfield label="Fecha fin de Horario" name="fechaFin" />

			<s:submit value="Crear Odontologo" />

		</s:form>

	</div>



</body>
</html>