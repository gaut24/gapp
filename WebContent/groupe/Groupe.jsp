<%@ include file="/imports/importsCss.jsp" %>
<title>Mon Groupe</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/menuEleve.jsp" %>
     
          
        
        <div class=" accelev col-sm-10 col-md-10">
        
         <center><h1>Mon Groupe : <s:property value="#session.groupe"/></h1></center></br>
         <div class="row">
        	<div class="col-md-3 text-center">
        		 		<center>Membres</center>
        			<table>
				
	
				
				<s:iterator value="membresList" var="membres">
    <tr>
       <td><s:property value="prenom"/> <s:property value="nom"/></td>
        <td></td>
        
    </tr> 
</s:iterator>
				
				</table>
        		
        		
        	</div>
        	
        	<div class="col-md-4 col-md-offset-1">
        		<center>Remarques sur le groupe</center>
        		<table>
				<s:iterator value="remarquesList" var="remarques">
				    <tr>
				       <td><s:property value="text_remarque"/></td>
				    </tr> 
				</s:iterator>
				
				</table>
        	</div>
        	
        	<div class="col-md-3 col-md-offset-1">
        		<center>Évaluation croisée</center>
        		<table>
				<s:iterator value="membresList" var="membres">
    <tr>
       <td><a href="evaluationCroise?id=<s:property value="id_personne"/>">Commencer</a></td>
        <td></td>
    </tr> 
</s:iterator>
				
				</table>
        	</div>
        </div>
        
       
        </div>
<%@ include file="/HeaderEtFooter/footer.jsp" %> 
<%@ include file="/imports/importsJs.jsp" %>