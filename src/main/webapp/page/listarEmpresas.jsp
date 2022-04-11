<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Venus</title>
</head>
<body>
	<h1>Empresas</h1>
	
	<c:choose>
		<c:when test="${empty empresas}">
			<p>Nenhuma empresa cadastrada.</p>
		</c:when>
		<c:otherwise>
			<p>Listagem das empresas cadastradas no sistema:</p>
			<ul>
				<c:forEach items="${empresas}" var="empresa">
					<li>
						${empresa.nome}
						<a href="/venus/editarEmpresa?id=${empresa.id}">[Editar]</a>
						<a href="/venus/removerEmpresa?id=${empresa.id}">[Remover]</a>
					</li>
				</c:forEach>
			</ul>
		</c:otherwise>
	</c:choose>	
	
	<%@ include file="../include/footer.html" %>
</body>
</html>