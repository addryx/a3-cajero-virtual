<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido al cajero</title>
</head>
<body>
	<div class="container">
		<div>
			<h2>Bienvenido a tu cuenta bancaria</h2>
			<h4>
				<i>Número de cuenta: ${cuenta.idCuenta}</i><br>
				<i>Tipo de cuenta: ${cuenta.tipoCuenta}</i><br>
				<i>Saldo actual: ${cuenta.saldo}</i>
			</h4>
			<h4>
				<span>${error}</span>
			</h4>
		</div>
		<nav>
			<ul>
				<li><a href="/ingresar"><i>Ingresar</i></a></li>
				<li><a href="/extraer"><i>Extraer</i></a></li>
				<li><a href="/verMovimientos"><i>Ver Movimientos</i></a></li>
				<li><a href="/transferencia"><i>Transferencia</i></a></li>
				<li><a href="/logout"><i>Cerrar Sesión</i></a></li>
			</ul>
		</nav>
	</div>
</body>
</html>