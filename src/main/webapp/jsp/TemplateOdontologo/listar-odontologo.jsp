<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import= "java.util.ArrayList" %>
<%@ page import= "java.util.List" %>
<%@ page import= "com.clinica.model.Persona" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pagina de Odontologos</title>
</head>
<body>
    <h1>ODONTOLÓGOS CREADOS</h1>
    
    <s:if test="odontologos != null">
        <ul>
            <s:iterator value="odontologos" var="odontologo">
                <li>
                	Persona Id: <s:property value="#odontologo.personaId"/> <br>
                    Número Identificación: <s:property value="#odontologo.numeroIdentificacion"/> <br>
                    Nombre: <s:property value="#odontologo.nombre"/> <br>
                    Telefono: <s:property value="#odontologo.telefono"/> <br>
                    Fecha Nacimiento: <s:property value="#odontologo.fechaNacimiento"/> <br>
                    <hr>
                </li>
            </s:iterator>
        </ul>
    </s:if>
    
</body>
</html>