<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="it.epicode.controller.Controller"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Edit Fornitore</title>
</head>
<body>
	<form action="aggiungiFornitore.do " method="post">
	<label> Inserisci l'id del fornitore</label>
	<input type= "number" name = "idFornitore"> <br>
	<label> Inserisci il nome del fornitore</label>
	<input type= "text" name = "nome"> <br>
	<label> Inserisci l'indirizzo del fornitore</label>
	<input type= "text" name = "indirizzo"> <br>
	<label> Inserisci la citta del fornitore</label>
	<input type= "text" name = "citta"> 
	
	<input type="submit" value="inserisci fornitore">
	</form>
	
</body>
</html>