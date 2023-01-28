<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuovo cliente</title>
</head>
<body>
		
		
		<!-- 
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String telefono;		
	private String email;
		 -->
		
		<h1>Visualizza cliente</h1>
		
			<div>	${datiCliente.nome } ${datiCliente.cognome}		</div> <!--datiCliente è modelAttribute in view  -->
			<div>	${datiCliente.codiceFiscale} </div>
			<div>	${datiCliente.telefono} </div>
			<div>	${datiCliente.email} </div>
			
		<br>
		<hr>
		<br>
		


</body>
</html>