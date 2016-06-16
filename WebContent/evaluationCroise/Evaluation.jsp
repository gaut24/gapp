<%@ include file="/imports/importsCss.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<title>Evaluation</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuTuteur.jsp" %>
     
          
        
        <div class=" accelev col-sm-10 col-md-10">
        <h1>Evaluation</h1>
		    <table class="table responsive" style="background-color: #e9ebee;">
		        <thead>
		            <tr>
		                <th>Compétences</th>
		                <th>Loin</th>
		                <th>Proche</th>
		                <th>Acquis</th>
		                <th>Remarques</th>
		            </tr>
		        </thead>
		        <tbody>
		        	<c:forEach var="nomFamille" items="${FamilleList}">
		        	<tr><th>${nomFamille}</th></tr>
		            <c:forEach var="nomCompetence" items="${FamilleCompetenceList}">
		            <c:if test="${nomCompetence[0] == nomFamille}">
		            <tr>
		                <td>${nomCompetence[1]}</td>
		                <td> <INPUT type="radio" name="${nomCompetence[1]}" value="loin"> </td>
		                <td> <INPUT type="radio" name="${nomCompetence[1]}" value="proche"> </td>
		                <td> <INPUT type="radio" name="${nomCompetence[1]}" value="acquis"> </td>
		                <td> <input type="text" class="form-control" name="comment_${nomCompetence[1]}"> </td>
		            </tr>
		            </c:if>
		            </c:forEach>
		            </c:forEach>
		        </tbody>
		    </table>
		    <form class="navbar-form navbar-right inline-form">
		        <button type="submit" class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-floppy-saved"></span> Sauvegarder</button>
		    </form>
   
        
       
        </div>
<%@ include file="/HeaderEtFooter/footer.jsp" %> 
<%@ include file="/imports/importsJs.jsp" %>