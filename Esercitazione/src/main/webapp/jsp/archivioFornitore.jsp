<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="it.epicode.controller.Controller"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lista Fornitore</title>
</head>
<body>
<p>archivio </p>
<table>
	<tr>
	<th>codice fornitore</th>
	<th>nome </th>
	<th>indirizzo </th>
	<th>citta</th>
	<th> </th>
	</tr>
	
	<c:forEach  var= "fornitore" items= "${CHIAVE_LISTA_FORNITORI}"> 
			<tr> 
			<td>${fornitore.idFornitore}</td> 
			<td>${fornitore.nome} </td> 
			<td>${fornitore.indirizzo} </td> 
			<td>${fornitore.citta} </td> 
			<td> 
				<form method="post" action="cancellaFornitore.do">
					<input type="hidden" name="id" value="${fornitore.idFornitore}">
					<input type="submit" value="elimina">
				</form>
			</td>
			</tr>
	</c:forEach>
	
</table>
	<hr>
	 <a href="formInserimentoFornitore.do"> Inserisci un nuovo fornitore</a> 
 
</body>
</html>