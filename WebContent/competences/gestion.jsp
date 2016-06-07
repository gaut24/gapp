 <%@ include file="/imports/importsCss.jsp" %>
<title>Gestion des compétences</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuResponsable.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Gestion des compétences</h1>
         
         <h2>Ajouter une famille de compétences</h2>
         <s:form  action="addFamille">
         <s:textfield name="familles.nom" id="ajoutFamille"
				label="Nouvelle famille" labelposition="left" size="20" maxlength="60">
			</s:textfield>
			<s:submit value="Ajouter"></s:submit>
		</s:form>
         <h2>Ajouter une compétence</h2>
         <s:form  action="addCompetences">
         <label>Famille</label>
         	<select name="competences.id_famille">
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
         <h2>Grille de compétences</h2>
<table>
<tr>
    <th>Famille</th>
    <th>Supprimer</th>
</tr>
<s:iterator value="famillesList" var="familles">
    <tr>
        <td><s:property value="nom"/></td>
        <td></td>
        <td><a href="delete?id=<s:property value="id_famille"/>">x</a></td>
    </tr> 
</s:iterator>
</table>
       
</div>

<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>