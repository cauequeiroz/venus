<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada" var="urlEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Venus</title>
</head>
<body>
	<h1>Login</h1>
	
	<form action="${urlEntradaServlet}" method="post">
		<input type="hidden" name="acao" value="Login" />
		
		<p>Login: <input type="text" name="login" /></p>
		<p>Senha: <input type="password" name="password" /></p>
		<p><input type="submit" /></p>
	</form>
	
	<%@ include file="../include/footer.html" %>
</body>
</html>