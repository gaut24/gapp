<%@ include file="/imports/importsCss.jsp"%>
<title>Mon Profil</title>
</head>
<body>
	<div class="container">
		<%@ include file="/HeaderEtFooter/header.jsp"%>
		<%@ include file="/Menu/menuEleve.jsp"%>

		<div class=" accelev col-sm-10 col-md-10">
		<h1>GAPP</h1>
			<center>
				<h1>Mon profil</h1>
			</center>
			<div class="row">
				<div class="col-md-3">
					<center>Abscences</center>
					<center>
						<div class="pie" style="animation-delay: -32s">32%</div>
					</center>
					</br>



				</div>

				<div class="col-md-4 col-md-offset-1">
					<center>
						Cours</br>
						<div id="datepicker"></div>
				</div>
				</center>
				<div class="col-md-3 col-md-offset-1">
					<center>Tuteur</center>
				</div>
			</div>



		</div>
		<%@ include file="/HeaderEtFooter/footer.jsp"%>
		<%@ include file="/imports/importsJs.jsp"%>