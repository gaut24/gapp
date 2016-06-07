<%@ include file="/imports/importsCss.jsp"%>

<title>AttributionGroupes</title>
</head>
<body>
	<div class="container">
		<%@ include file="/HeaderEtFooter/header.jsp"%>
		<%@ include file="/Menu/MenuResponsable.jsp"%>


		<div class=" accelev col-lg-10 col-sm-10 col-md-10">
			<h1>Attribution des groupes</h1>
		

		<div>
			<s:a href="%{urlRecherche}"><button name="button">Eleves</button></s:a>
			<s:a href="%{urlRecherche}"><button name="button">Tuteurs</button></s:a>
		</div>


		<table>
			<tr>
				<td>Ajouter</td>
				<td>Barre de Recherche de Gauthier</td>
				<td>Au Groupe</td>
				<td><select>
  						<option value="G1A">G1A</option>
  						<option value="G1B">G1B</option>
  						<option value="G2A">G2A</option>
  						<option value="G2B">G2B</option>
				</select></td>
				<td><button name="button">Soumettre</button></td>
			</tr>
		</table>

		<table>
			<tr>
				<td>G1A</td>
				<td>G1B</td>
				<td>G2A</td>
				<td>G2B</td>
			</tr>
			<tr>
				<td>Eleve 1</td>
				<td>Eleve 1</td>
				<td>Eleve 1</td>
				<td>Eleve 1</td>
			</tr>
			<tr>
				<td>Eleve 2</td>
				<td>Eleve 2</td>
				<td>Eleve 2</td>
				<td>Eleve 2</td>
			</tr>
			<tr>
				<td>Eleve 3</td>
				<td>Eleve 3</td>
				<td>Eleve 3</td>
				<td>Eleve 3</td>
			</tr>
		</table>

</div>
		<%@ include file="/HeaderEtFooter/footer.jsp"%>
		<%@ include file="/imports/importsJs.jsp"%>