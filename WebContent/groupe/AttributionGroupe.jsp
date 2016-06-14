<%@ include file="/imports/importsCss.jsp"%>

<title>AttributionGroupes</title>
</head>
<body>
	<div class="container">
		<%@ include file="/HeaderEtFooter/header.jsp"%>
		<%@ include file="/Menu/MenuResponsable.jsp"%>


		<div class=" accelev col-lg-10 col-sm-10 col-md-10">
			<h1>Attribution des groupes</h1>
			<h2>Attribution Elèves</h2>
			<s:form action="assignEleveToGroupe">
		<sx:autocompleter size="1" list="personnes" listKey="nom" listValue="nom+', '+prenom" name="eleveNomToGroupe" showDownArrow="true" label="Nom de l'élève" autoComplete="true"></sx:autocompleter>
		<s:select name="eleveToGroupe" list="groupesList" label="Nom du groupe"></s:select>
		<s:submit value="Valider"></s:submit>
		</s:form>
		<h2>Groupes</h2>
		<s:iterator value="groupesList2" var="groupes">
		<table>
			<tr>
        		<th name=""><s:property value="num_groupe"/></th>
			</tr>
		</table>
		</s:iterator>
		<s:iterator value="personnesList2" var="personnes">
			<s:property value="prenom"/>
		</s:iterator>
	</div>
		<%@ include file="/HeaderEtFooter/footer.jsp"%>
		<%@ include file="/imports/importsJs.jsp"%>