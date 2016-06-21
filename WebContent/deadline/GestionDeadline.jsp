<%@ include file="/imports/importsCss.jsp" %>
<title>Gestion des deadlines</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/MenuResponsable.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Gestion des deadlines</h1>
         
         <h2>Nouvelle date de remise de livrable</h2>
         
         <s:form id="addDeadlines" action="addDeadlines">
         	<div class="ttd"><label>Date:</label>
			<input type="date" name="deadlines.date_deadline" style="margin-left: 4%;">
			</div>
			</br>
			<p>Concerne les groupes</p>
			<input id="checkAll" type="checkbox" />Tout cocher
			<div id="checkTest">
			<s:iterator value="groupesList2" var="groupes">
        		<input type="checkbox" name="deadlines.num_groupe" value="<s:property value="num_groupe"/>"><s:property value="num_groupe"/>
			</s:iterator>
			</div>
			</br>
			<div class="ttd">
			<label>Description :</label>
			<input type="text" name="deadlines.nom">
			</div>
			</br>
			<s:submit value="Ajouter"></s:submit>
		</s:form>
		 <h2>Deadlines</h2>
			<table class="table" style="width:100%; background-color: #e9ebee;">
			<tr>
			    <th>Libellé</th>
			    <th>Groupes</th>
			    <th>Date</th>
			</tr>
			<s:iterator value="deadlinesList" var="deadlines">
			    <tr>
			        <td><s:property value="nom"/></td>
			        <td><s:property value="num_groupe"/></td>
			        <td><s:property value="date_deadline"/></td>
			        <td><a href="deleteDeadlines?id=<s:property value="id_deadline"/>">x</a></td>
			    </tr> 
			</s:iterator>
			</table> 
</div>
<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
   <script src="Project.js"></script>
   <script type="text/javascript">
   
   $('#checkAll').click(function() {
  	// on cherche les checkbox à l'intérieur de l'id  'magazine'
  	var check = $("#checkTest").find(':checkbox'); 
  	   if(this.checked){ // si 'checkAll' est coché
  		   check.prop('checked', true); 
  	   }else{ // si on décoche 'checkAll'
  		   check.prop('checked', false);
  	   }          
  	});
   </script>
 