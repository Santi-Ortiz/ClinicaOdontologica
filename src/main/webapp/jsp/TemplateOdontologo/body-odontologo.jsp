<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

	<h2>Crear Odontologo</h2>

	<s:form action="registro-odontologo">
		<s:submit value="Crear" />
	</s:form>

	<h2>Listar todos Odontologos</h2>

	<s:form action="listar-odontologo" method="GET">
		<s:submit value="Crear"/>
	</s:form>

	<h2>Obtener Odontologo por Id</h2>

	<s:form action="" method="GET">
		<s:textfield label="Id de Odontologo" key="odontologo_id"></s:textfield>
		<s:submit value="Buscar" />
	</s:form>

	<h2>Actualizar Odontologo</h2>

	<s:form action="">
		<s:textfield label="Id Odontologo a Actualizar" key="odontologo_id"></s:textfield>
		<s:submit value="Actualizar" />
	</s:form>

	<h2>Eliminar Odontologo</h2>


	<s:form action="" method="DELETE">
		<s:textfield label="Id de Odontologo" key="odontologo_id" />
		<s:submit value="Eliminar" />
	</s:form>


</body>
</html>