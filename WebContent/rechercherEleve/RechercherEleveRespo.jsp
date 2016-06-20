 <%@ include file="/imports/importsCss.jsp" %>
<title>Rechercher un élève</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
   <script src="Project.js"></script>
<sx:head/>

</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuResponsable.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Rechercher un élève</h1>
         
        <s:form  action="searchEleve2">
       <sx:autocompleter size="1" list="personnes" listKey="nom" listValue="nom+', '+prenom" name="eleveNom" showDownArrow="false" label="Nom de l'élève" autoComplete="true"></sx:autocompleter>
       <s:submit value="Envoyer"></s:submit>
       </s:form>
       
</div>
<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>
 