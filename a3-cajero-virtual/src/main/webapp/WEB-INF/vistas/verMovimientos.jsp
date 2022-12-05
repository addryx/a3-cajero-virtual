<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movimientos de la cuenta</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Cantidad</th>
				<th scope="col">Fecha</th>
				<th scope="col">Tipo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ele" items="${listamovimientos}">
				<tr>
					<td>${ele.cantidad}</td>
					<td>${ele.fecha}</td>
					<td>${ele.operacion}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button type="button"><a href="/opcionesCajero"><i>Volver</i></a></button>
</body>
</html>