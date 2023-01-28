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
		
		<h1>Nuovo cliente</h1>
		
		<form:form  method="POST" action="aggiungi" modelAttribute="datiCliente">		
			<div>  
				<form:label path="nome">nome</form:label>  
				<form:input path="nome"/>  <!-- binding con nome tipo -->
				
				<form:label path="cognome">cognome</form:label>
				<form:input path="cognome"/>
				
				<form:label path="codiceFiscale">codiceFiscale</form:label>
				<form:input path="codiceFiscale"/>
				
				<form:label path="telefono">telefono</form:label>
				<form:input path="telefono"/>
				
				<form:label path="email">email</form:label>
				<form:input path="email"/>			
			</div>
			
			<div>			
				<input type="submit" value="Registrati">
			</div>			
		</form:form>
		
		
		<br>
		<hr>
		<br>
		
		<form method="POST" action="aggiungi" id="datiCliente">	<!-- usare id all'interno della notation @ModelAttribute("datiCliente")-->
			<div>  
				<label for="nome">nome</label>  
				<input type="text"  name="nome" id="nome"/>  <!-- binding con nome tipo -->
				 
				<label path="cognome">cognome</label>
				<input type="text"  name="cognome" id="nome"/> 
				
				<label path="codiceFiscale">codiceFiscale</label>
				<input type="text"  name="codiceFiscale" id="codiceFiscale"/> 
				
				<label path="telefono">telefono</label>
				<input type="text"  name="telefono" id="telefono"/> 
				
				<label path="email">email</label>
				<input type="text"  name="email" id="email"/> 
			</div>
			
			<div>			
				<input type="submit" value="Registrati">
			</div>			
		</form>

</body>
</html>