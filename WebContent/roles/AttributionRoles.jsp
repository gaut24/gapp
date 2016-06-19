<%@ include file="/imports/importsCss.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<title>AttributionRôles</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuResponsable.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Attribution des rôles</h1>
       
<table style="width:100%;">
	<tr>
		<td>Nom Prénom</td>
		<td>Eleve</td>
		<td>Tuteur</td>
		<td>Responsable Parcours</td>
	</tr>
	<s:iterator value="personnesList" var="personnes">
	<tr>
		<td><s:property value="nom"/> <s:property value="prenom"/> <s:property value="droit"/></td>
		<td><input type="radio" name="droit<s:property value="id_personne"/>" value="1"></td>
		<td><input type="radio" name="droit<s:property value="id_personne"/>" value="2"></td>
		<td><input type="radio" name="droit<s:property value="id_personne"/>" value="4"></td>
	</tr>
	</s:iterator>
</table>

</div>
<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>