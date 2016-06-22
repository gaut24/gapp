<%@ include file="/imports/importsCss.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<title>Evaluation Croise</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/menuEleve.jsp" %>
     
          
        
        <div class=" accelev col-sm-10 col-md-10">
        <h1>Evaluation croisée</h1>
		    <s:form action="notationCroise">
        <input type="text" name="releves_notes.id_personne" class="hidden" value='<%=request.getParameter("id")%>'/>
		    <table class="table2 responsive" style="background-color: #e9ebee;">
		        <thead>
		            <tr>
		                <th style="text-align:left;padding-left:1%;">Compétences</th>
		                <th>Neutre</th>
		                <th>Loin</th>
		                <th>Proche</th>
		                <th>Acquis</th>
		                <th>Remarques</th>
		            </tr>
		        </thead>
		        <tbody>
		        	<c:forEach var="nomFamille" items="${FamilleList}">
		        	<tr><th style="text-align:left;padding-left:1%;">${nomFamille[0]}</th></tr>
		            <c:forEach var="nomCompetence" items="${FamilleCompetenceList}">
		            <c:if test="${nomCompetence[0] == nomFamille[0]}">
		            <tr id="${nomCompetence[2]}">
		                <td style="text-align:left;padding-left:3%;">${nomCompetence[1]}</td>
		                <td> <input type="checkbox" class="${nomCompetence[2]}" name="releves_notes.resultat" value="neutre" checked="true" onclick="CheckRadio(this);"> </td>
		                <td> <input type="checkbox" class="${nomCompetence[2]}" name="releves_notes.resultat" value="loin" onclick="CheckRadio(this);"> </td>
		                <td> <input type="checkbox" class="${nomCompetence[2]}" name="releves_notes.resultat" value="proche" onclick="CheckRadio(this);"> </td>
		                <td> <input type="checkbox" class="${nomCompetence[2]}" name="releves_notes.resultat" value="acquis" onclick="CheckRadio(this);"> </td>
		                <td> <textarea class="form-control" name="releves_notes.commentaire">Pas de commentaire</textarea></td>
		                <td class="hidden"> <input type="text" class="hidden" name="id_personneNote" value="${nomCompetence[2]}"> </td>
		            </tr>
		            </c:if>
		            </c:forEach>
		            </c:forEach>
		        </tbody>
		    </table>
		        <button type="submit" class="btn btn-primary btn-sm btn_ev"><span class="glyphicon glyphicon-floppy-saved"></span> Sauvegarder</button>
		    </s:form>
   
        
       
        </div>
<%@ include file="/HeaderEtFooter/footer.jsp" %> 
<%@ include file="/imports/importsJs.jsp" %>
<script type="text/javascript">
  function CheckRadio(obj){
    var tab=document.getElementsByClassName(obj.className);
    var cnt=tab.length;
    for(x=0;x<cnt;x++)
      if(tab[x].name=='releves_notes.resultat')
        if(tab[x]!=obj) tab[x].checked='';
        else tab[x].checked='checked';
  }
</script>