 <html>
 <%@ include file="/imports/importsCss.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<title>Accueil</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/menu.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        <h2>Ajouter une absence</h2>
         <s:form  action="addAbscences">
	         <%-- <s:textfield name="abscences.nom" id="ajoutNom"
					label="Nom de l'élève" labelposition="left" size="20" maxlength="60">
			</s:textfield>
			<s:textfield name="abscences.prenom" id="ajoutPrenom"
				label="Prénom" labelposition="left" size="20" maxlength="60">
			</s:textfield> --%>
			<s:textfield name="abscences.justificatif" id="ajoutJustificatif"
				label="justificatif" labelposition="left" size="20" maxlength="60">
			</s:textfield>
<!-- 			<div id="datepicker"></div> -->
			<s:submit value="Ajouter"></s:submit>
		</s:form>
        
         <h1>Gestion des absences</h1>
         
			<table style="border: 1px solid black">
			<tr>
			<td><b>nom</b></td>
			<td><b>prenom</b></td>
			<td><b>date</b></td>
			<td><b>justificatif</b></td>
			<td><b>supprimer l'absence</b></td>
			</tr>
			
			<c:forEach var="abscencesList" items="${abscencesList}">
			
			<tr>
			<td>
			${abscencesList[0]}
			</td>
			<td>
			${abscencesList[1]}
			</td>
			<td>
			${abscencesList[2]}
			</td>
			<td>
			${abscencesList[3]}
			</td>
			<td>supprimer</td>
			</tr>
			</c:forEach>
			</table>
</div>

<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>
 
 </html>