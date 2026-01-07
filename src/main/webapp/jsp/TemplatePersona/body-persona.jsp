<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<h2> Crear Persona</h2>
	
		<s:form action="registro-personas" >
			<s:submit value="Crear"> </s:submit >
		</s:form>
			
		<h2> Listar todas las Personas</h2>
			
		<s:form action="personas" method="GET">
			<s:submit value="Crear"> </s:submit >
		</s:form>
		
		<h2> Obtener Persona por Id</h2>
			
		<s:form action="buscar-persona" method="GET">
			<s:textfield label="Id de Persona" key="persona_id"></s:textfield>
			<s:submit value="Buscar"> </s:submit >
		</s:form>
		
		<h2>Actualizar Persona</h2>
		
		<s:form action="persona-actualizar-nav" >
			<s:textfield label="Id Persona a Actualizar" key="persona_id" ></s:textfield>
			<s:submit value="Actualizar"/>
		</s:form>
		
		<h2>Eliminar Persona</h2>
		

		<s:form action="eliminar-persona" method="DELETE">
			<s:textfield label="Id de Persona" key="persona_id"/>
			<s:submit value="Eliminar" />
		</s:form> 

</body>
</html>