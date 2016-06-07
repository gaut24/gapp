<%@ include file="/imports/importsCss.jsp" %>
<title>Gestion des deadlines</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuResponsable.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Gestion des deadlines</h1>
         
         <h2>Nouvelle date de remise de livrable</h2>
         
         <s:form  action="addlivrable">
         	<label>Date</label>
			<input type="date" name="date">
			<p>Concerne les groupes</p>
			<INPUT type="checkbox" name="choixGroupe" value="1">G1A
			<INPUT type="checkbox" name="choixGroupe" value="1">G1B
			<INPUT type="checkbox" name="choixGroupe" value="1">G2A
			<INPUT type="checkbox" name="choixGroupe" value="1">G2B
			<p>Description :</p>
			<input type="text" name="description">
			<s:submit value="Ajouter"></s:submit>
		</s:form>
		
       
</div>

<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>