<%@ include file="/imports/importsCss.jsp" %>
<title>Mon Groupe</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/menuEleve.jsp" %>
     
          
        
        <div class=" accelev col-sm-10 col-md-10">
        
         <center><h1>Mon Groupe : G4 E</h1></center>
         <table style="width:100%;">
         <tr>
         <th style="width:33%;">Membres</th>
         <th style="width:33%;">Evaluation croisé</th>
         <th style="width:33%;">A venir</th>
         </tr>
         <tr>
         <td>Membre 1</td>
         <td><s:a class="eva_croise btn btn-primary" href="%{urlEvaluationCroise}">Commencer</s:a></td>
         <td></td>
         </tr>
         </table>
        </div>
        
       
        </div>
<%@ include file="/HeaderEtFooter/footer.jsp" %> 
<%@ include file="/imports/importsJs.jsp" %>