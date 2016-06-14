<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css">
<title>Test</title>
</head>
<body>
	<div class="container">
		<div class="row">
		    <h3> Grille de compétences </h3>       
		    <table class="table responsive">
		        <thead>
		            <tr>
		                <th>Compétences</th>
		                <th>Loin</th>
		                <th>Proche</th>
		                <th>Acquis</th>
		                <th>Remarques</th>
		            </tr>
		        </thead>
		        <tbody>
		        	<c:forEach var="nomFamille" items="${FamilleList}">
		        	<tr><th>${nomFamille}</th></tr>
		            <c:forEach var="nomCompetence" items="${FamilleCompetenceList}">
		            <c:if test="${nomCompetence[0] == nomFamille}">
		            <tr>
		                <td>${nomCompetence[1]}</td>
		                <td> <INPUT type="radio" name="${nomCompetence[1]}" value="loin"> </td>
		                <td> <INPUT type="radio" name="${nomCompetence[1]}" value="proche"> </td>
		                <td> <INPUT type="radio" name="${nomCompetence[1]}" value="acquis"> </td>
		                <td> <input type="text" class="form-control" name="comment_${nomCompetence[1]}"> </td>
		            </tr>
		            </c:if>
		            </c:forEach>
		            </c:forEach>
		        </tbody>
		    </table>
		    <form class="navbar-form navbar-right inline-form">
		        <button type="submit" class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-floppy-saved"></span> Sauvegarder</button>
		    </form>
		</div>
	</div>
</body>
</html>