<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/processaCadastro" var="urlNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Venus</title>
</head>
<body>
	<h1>Cadastrar nova empresa</h1>
	
	<form action="${urlNovaEmpresa}" method="post">
		<p>Nome: <input type="text" name="nome" /></p>
		<p><input type="submit" /></p>
	</form>
	
	<%@ include file="../include/footer.html" %>
</body>
</html>