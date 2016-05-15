 <%@ include file="/imports/importsCss.jsp" %>
<title>Accueil</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/menu.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Bienvenue sur GAPP Eleve</h1>
       <s:property value="nom"></s:property>
       <s:property value="id_personne"></s:property>
       <s:property value="email"></s:property>
</div>

<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>