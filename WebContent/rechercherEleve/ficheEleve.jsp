<%@ include file="/imports/importsCss.jsp"%>

<title>Accueil</title>
</head>
<body>
	<div class="container">
		<%@ include file="/HeaderEtFooter/header.jsp"%>
		<%@ include file="/Menu/MenuTuteur.jsp"%>


		<div class=" accelev col-lg-10 col-sm-10 col-md-10">
		<h2><s:property value="prenom" /> <s:property value="nom"/></h2>
		<p>Groupe : <s:property value="groupe"/></p></br>
		<a href="evaluation?id=<s:property value="id"/>">Evaluation</a>

		</div>

		<%@ include file="/HeaderEtFooter/footer.jsp"%>
		<%@ include file="/imports/importsJs.jsp"%>