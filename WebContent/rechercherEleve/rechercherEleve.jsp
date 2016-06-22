 <%@ include file="/imports/importsCss.jsp" %>
<title>Rechercher un élève</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
   <script src="Project.js"></script>
<sx:head/>

</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuTuteur.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Rechercher un élève</h1>
       </br>
        <s:form  action="searchEleve">
       <sx:autocompleter forceValidOption="true" size="1" list="personnes" listKey="nom" listValue="nom+', '+prenom" name="eleveNom" showDownArrow="false" label="Nom de l'élève" autoComplete="true"></sx:autocompleter>
       <s:submit value="Envoyer"></s:submit>
       </s:form>
       
</div>
<script type="text/javascript">
$(document).ready(function() {
	  $(window).keydown(function(event){
	    if(event.keyCode == 13) {
    	  event.preventDefault();
	      return false;
	    }
	  });
	});
</script>
<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>
 