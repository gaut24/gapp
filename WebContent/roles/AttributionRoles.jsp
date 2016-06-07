<%@ include file="/imports/importsCss.jsp" %>
<title>AttributionRôles</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuResponsable.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Attribution des rôles</h1>
       


<table>
	<tr>
		<td>Nom Prénom</td>
		<td>Eleve</td>
		<td>Tuteur</td>
		<td>Responsable Parcours</td>
	</tr>
	<tr>
		<td>Nom Prenom 1</td>
		<td><INPUT type="checkbox" name="choixEleve" value="1"></td>
		<td><INPUT type="checkbox" name="choixTuteur" value="2"></td>
		<td><INPUT type="checkbox" name="choixResponsable" value="3"></td>
	</tr>
	<tr>
		<td>Nom Prenom 2</td>
		<td><INPUT type="checkbox" name="choixEleve" value="1"></td>
		<td><INPUT type="checkbox" name="choixTuteur" value="2"></td>
		<td><INPUT type="checkbox" name="choixResponsable" value="3"></td>
	</tr>
	<tr>
		<td>Nom Prenom 3</td>
		<td><INPUT type="checkbox" name="choixEleve" value="1"></td>
		<td><INPUT type="checkbox" name="choixTuteur" value="2"></td>
		<td><INPUT type="checkbox" name="choixResponsable" value="3"></td>
	</tr>
</table>

</div>
<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>