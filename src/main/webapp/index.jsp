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
		
		<s:form action="personas/registro" method="POST">
		
			<s:textfield label="Número de Identificación" key="numero_identificacion"/>
			
			<s:textfield label="Nombre" key="nombre"/>
			
			<s:textfield label="Telefono" key="telefono"/>
			
			<s:textfield label="Fecha de Nacimiento" key="fecha_nacimiento"/>
			
			<s:submit />
	
		</s:form>
		
		
		
		
		
		<form action="personas/registro" method="POST">
			<p>
				<label>Número Identificacion: </label> 
				<input type="text" name="numero_identificacion">
			</p>
			<p>
				<label>Nombre: </label> 
				<input type="text" name="nombre">
			</p>
			<p>
				<label>Telefono: </label>
				<input type="text" name="telefono"> 
			</p>
			<p>
				<label>Fecha Nacimiento: </label> 
				<input type="date" name="fecha_nacimiento">
			</p>
			
			<button type="submit"> Enviar </button>
		</form>
		
		<h1> Mostrar Personas</h1>
			
		<form action="SvPersona" method="GET">
			<button type="submit"> Listar</button>
		</form>
		
	</body>
</html>