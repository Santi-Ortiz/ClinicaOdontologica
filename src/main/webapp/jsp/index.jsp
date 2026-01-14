<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html>
	<head>	
		<meta charset="UTF-8">
		<title>Clínica Odontológica</title>
	</head>
	
	<body>
		
		<tiles:insertTemplate template="main-layout">
		
			<tiles:putAttribute name="title" />
			
			<tiles:putAttribute name="header" />
		
			<tiles:putAttribute name="nav" />
		
			<tiles:putAttribute name="body" />
		
		</tiles:insertTemplate>
		
		
			
		<%-- <h2> Crear Persona</h2>
	
		<s:form action="registroPersona" >
			<s:submit value="Crear"> </s:submit >
		</s:form>
			
		<h2> Listar todas las Personas</h2>
			
		<s:form action="personas" method="GET">
			<s:submit value="Crear"> </s:submit >
		</s:form>
		
		<h2> Obtener Persona por Id</h2>
			
		<s:form action="buscarPersona" method="GET">
			<s:textfield label="Id de Persona" key="persona_id"></s:textfield>
			<s:submit value="Buscar"> </s:submit >
		</s:form>
		
		<h2>Actualizar Persona</h2>
		
		<s:form action="actualizar" >
			<s:textfield label="Id Persona a Actualizar" key="persona_id" ></s:textfield>
			<s:submit value="Actualizar"/>
		</s:form>
		
		<h2>Eliminar Persona</h2>
		

		<s:form action="eliminarPersona" method="DELETE">
			<s:textfield label="Id de Persona" key="persona_id"/>
			<s:submit value="Eliminar" />
		</s:form> --%>
		
		
	</body>
</html>