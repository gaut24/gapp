 <%@ include file="/imports/importsCss.jsp" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<title>Gestion des compétences</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuResponsable.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Gestion des compétences</h1>
         </br>
         <h2>Ajouter une famille de compétences</h2>
         
         <div class="champ_form">
		         <s:form  id ="addFamille" action="addFamille">
		       
			         <s:textfield name="familles.nom" id="ajoutFamille"
							label="Nouvelle famille" labelposition="left" size="20" maxlength="60">
						</s:textfield>
						<s:submit value="Ajouter"></s:submit>
				
				</s:form>
				</br>
		         <h2>Ajouter une compétence</h2>
		         
		        <s:form  action="addCompetences">
		         <label style="margin-left: 22%;">Famille:</label>
		         	<select name="competences.id_famille" style="margin-left: 2%;">
		         		<s:iterator value="famillesList" var="familles">
		         			<option value="<s:property value="id_famille"/>"><s:property value="nom"/></option>
		         	</s:iterator>
		         </select>
			         <s:textfield name="competences.nom" id="ajoutCompetences"
							label="Nouvelle compétence" labelposition="left" size="20" maxlength="60">
					</s:textfield>
					<s:textfield name="competences.coefficient" id="ajoutCoef"
						label="Coefficient" labelposition="left" size="20" maxlength="60">
					</s:textfield>
					<s:submit value="Ajouter"></s:submit>
			</s:form>
		</div>
		
			<table class="table responsive" style="background-color: #e9ebee;">
				<thead>
		            <tr>
		                <th>Grille de compétences</th>
		                <th>Coefficient</th>
		                <th>Supprimer</th>
		            </tr>
		        </thead>
		        <tbody>
		        	<c:forEach var="nomFamille" items="${FamilleList}">
		        	<tr>
		        	<th>${nomFamille[0]}</th>
		        	<th></th>
		        	<th><a href="deleteFamille?id=${nomFamille[1]}">x</a></th>
		        	</tr>
		            <c:forEach var="nomCompetence" items="${FamilleCompetenceList}">
		            <c:if test="${nomCompetence[0] == nomFamille[0]}">
		            <tr>
		                <td style="padding-left: 4%;">${nomCompetence[1]}</td>
		                <td>${nomCompetence[3]}</td>
		                <td><a href="deleteCompetence?id=${nomCompetence[2]}">x</a></td>
		            </tr>
		            </c:if>
		            </c:forEach>
		            </c:forEach>
		        </tbody>
		    </table>
       
</div>

<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>