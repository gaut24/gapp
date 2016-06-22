 <html>
 <%@ include file="/imports/importsCss.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<title>Absences</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuTuteur.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        <h2>Ajouter une absence</h2>
         <div class="col-md-12">
	        <div class="row">
         <s:form theme="simple" action="addAbscences">
	         <%-- <s:textfield name="abscences.nom" id="ajoutNom"
					label="Nom de l'élève" labelposition="left" size="20" maxlength="60">
			</s:textfield>
			<s:textfield name="abscences.prenom" id="ajoutPrenom"
				label="Prénom" labelposition="left" size="20" maxlength="60">
			</s:textfield> --%>
			<div class="col-md-5 ">
			<sx:autocompleter size="1" list="personnes" listKey="id_personne" listValue="nom+' '+prenom+', '+id_groupe" name="abscences.id_personne" showDownArrow="true" label="Nom de l'élève" autoComplete="true"></sx:autocompleter>
			</div>
			<div class="col-md-3 ">
			<label>Date :</label>

			<input type="date" name="abscences.date_abscence">
			</div>
			<div class="col-md-4 ">
			<label>Justificatif :</label> <s:textfield name="abscences.justificatif" id="ajoutJustificatif"
				label="Justificatif" labelposition="left" size="20" maxlength="60">
			</s:textfield>
			</div>
<!-- 			<div id="datepicker"></div> -->
			<s:submit value="Ajouter"></s:submit>
		</s:form>
        </div>
        </div>
         <h1>Gestion des absences</h1>
         
			<table class="table_abs">
			<tr>
			<td><b>Nom</b></td>
			<td><b>Prénom</b></td>
			<td><b>Date</b></td>
			<td><b>Justificatif</b></td>
			<td><b>Supprimer l'absence</b></td>
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
			<td><a href="deleteAbsence?id=${abscencesList[4]}">x</a></td>
			</tr>
			</c:forEach>
			</table>
</div>

<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>
 
 </html>