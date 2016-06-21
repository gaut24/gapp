<%@ include file="/imports/importsCss.jsp"%>

<title>AttributionGroupes</title>
</head>
<body>
	<div class="container">
		<%@ include file="/HeaderEtFooter/header.jsp"%>
		<%@ include file="/Menu/MenuTuteur.jsp"%>


		<div class=" accelev col-lg-10 col-sm-10 col-md-10">
			<h1>Remarques</h1>
			<s:form  theme="simple" action="addRemarques">
			<p>Concerne les groupes</p>
			<input id="checkAll2" type="checkbox" />Tout cocher
			<div id="checkTest2">
			<s:iterator value="groupesList2" var="groupes">
        		<input type="checkbox" name="remarques.id_to" value="<s:property value="num_groupe"/>"><s:property value="num_groupe"/>
			</s:iterator>
			</div>
			<p>Remarque :</p>
			<textarea id="rq_textaera" name="remarques.text_remarque" style="width:100%;margin-bottom: 2%;"></textarea>
			<s:submit value="Ajouter"></s:submit>
		</s:form>
	</div>
		<%@ include file="/HeaderEtFooter/footer.jsp"%>
		<%@ include file="/imports/importsJs.jsp"%>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	   <script src="Project.js"></script>
	   <script type="text/javascript">
   $('#checkAll2').click(function() {
  	// on cherche les checkbox à l'intérieur de l'id  'magazine'
  	var check = $("#checkTest2").find(':checkbox'); 
  	   if(this.checked){ // si 'checkAll' est coché
  		   check.prop('checked', true); 
  	   }else{ // si on décoche 'checkAll'
  		   check.prop('checked', false);
  	   }          
  	});
   </script>