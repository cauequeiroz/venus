<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/processaEdicao" var="urlEditarEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Venus</title>
</head>
<body>
	<h1>Editar empresa</h1>
	
	<form action="${urlEditarEmpresa}" method="post">
		<input type="hidden" name="id" value="${empresa.id}" />
		
		<p>Nome: <input type="text" name="nome" value="${empresa.nome}" /></p>
		<p><input type="submit" /></p>
	</form>
	
	<%@ include file="../include/footer.html" %>
</body>
</html>