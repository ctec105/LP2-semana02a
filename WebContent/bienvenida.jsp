<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Adjuntar estilos CSS -->
<link href="estilos/facilito.css" rel="stylesheet" type="text/css">
</head>

<!-- CUERPO DE LA PAGINA-->
<body>
	<% 
		// Recuperamos los datos que llegan del request
		String vusuario = request.getParameter("usuario");
	%>
	<table>
		<tr>
			<!--  CABECERA -->
			<td colspan="2" align="center">
				<jsp:include page="cabecera.jsp" />
			</td>
		</tr>
		<tr>
			<!-- MENÚ -->
			<td><jsp:include page="menu.jsp" /></td>
			<!--  CUERPO -->
			<td>
				<table class="contorl">
					<tr>
						<td colspan="2">Bienvenido estimado usuario, sus datos son:</td>
					</tr>
					<tr>
						<td>Usuario:</td>
						<td><%= vusuario %></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<!--  PIE DE PÁGINA -->
			<td colspan="2" align="center"><jsp:include page="pie.jsp" /></td>
		</tr>
	</table>
</body>
</html>