
<%@ include file="/imports/importsCss.jsp"%>

<title>Accueil</title>
</head>
<body>
	<div class="container">
		<%@ include file="/HeaderEtFooter/header.jsp"%>
		<%@ include file="/Menu/MenuAdmin.jsp"%>


		<div class=" accelev col-lg-10 col-sm-10 col-md-10">

			<h1>Bienvenue sur GAPP Admin</h1>

		</div>

		<div class=" accelev col-lg-10 col-sm-10 col-md-10">

			<h1>Exporter les Notes</h1>
			<s:submit value="Exporter"></s:submit>
			<input type="file" id="file" />

		</div>

		<%@ include file="/HeaderEtFooter/footer.jsp"%>
		<%@ include file="/imports/importsJs.jsp"%>