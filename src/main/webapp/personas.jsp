<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import= "java.util.ArrayList" %>
<%@ page import= "java.util.List" %>
<%@ page import= "com.clinica.model.Persona" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pagina de Personas</title>
</head>
<body>
    <h1>PERSONAS CREADAS</h1>
    
    <s:if test="personas != null">
        <ul>
            <s:iterator value="personas" var="persona">
                <li>
                	Persona Id: <s:property value="#persona.personaId"/> <br>
                    Número Identificación: <s:property value="#persona.numeroIdentificacion"/> <br>
                    Nombre: <s:property value="#persona.nombre"/> <br>
                    Telefono: <s:property value="#persona.telefono"/> <br>
                    Fecha Nacimiento: <s:property value="#persona.fechaNacimiento"/> <br>
                    <hr>
                </li>
            </s:iterator>
        </ul>
    </s:if>
    
    
	<s:form action="index">
		<s:submit value="Volver a Inicio"></s:submit>
	</s:form>
</body>
</html>