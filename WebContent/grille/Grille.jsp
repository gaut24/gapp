<%@ include file="/imports/importsCss.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<title>Grille de Compétences</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/menuEleve.jsp" %>
     
          
        
        <div class=" accelev col-sm-10 col-md-10">
        
         <h1>Grille de compétences</h1>
		    <table class="table responsive" style="background-color: #e9ebee;">
		        <thead>
		            <tr>
		                <th>Compétences</th>
		                <th>Evaluation</th>
		                <th>Remarques</th>
		            </tr>
		        </thead>
		        <tbody>
		        	<c:forEach var="nomFamille" items="${FamilleList}">
		        	<tr><th>${nomFamille[0]}</th></tr>
		            <c:forEach var="nomCompetence" items="${FamilleCompetenceList}">
		            <c:if test="${nomCompetence[0] == nomFamille[0]}">
		            <tr id="${nomCompetence[2]}">
		                <td>${nomCompetence[1]}</td>
		                <c:forEach var="note" items="${releves_notesList}">        
		                <c:if test="${nomCompetence[2] == note[1]}">
		                <td>${note[2]}</td>
		                <td>${note[3]}</td>
		                </c:if>
		                </c:forEach>
		                <td class="hidden"> <input type="text" class="hidden" name="id_personneNote" value="${nomCompetence[2]}"></td>
		                
		            </tr>
		            </c:if>
		            </c:forEach>
		            </c:forEach>
		 
		        </tbody>
		    </table>
        </div>
<%@ include file="/HeaderEtFooter/footer.jsp" %> 
<%@ include file="/imports/importsJs.jsp" %>
