<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transferencia</title>
</head>
<body>
	<p>${fallo}</p>
	<form action="/transferencia" method="post">
		<label for="cantidad" class="form-label">Introduce cantidad:</label><br>
		<input type="number" step="0.01" min="1" name="cantidad" id="cantidad" required><br>
		<br>
		<label for="idCuenta" class="form-label">Introduce destino (ID Cuenta):</label><br>
		<input type="number" name="idCuenta" id="idCuenta" required><br>
		<br>
		<button type="submit" class="btn btn-primary">Transferir</button>
	</form>
</body>
</html>