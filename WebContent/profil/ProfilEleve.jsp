<%@ include file="/imports/importsCss.jsp" %>
<title>Mon Profil</title>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
 <%@ include file="/Menu/menu.jsp" %>
           
         
        
        <div class=" accelev col-sm-10 col-md-10">
        
        <center><h1>Mon profil</h1></center> 
        <div class="row">
        	<div class="col-md-3">
        		<center>Abscences</center>
        		<center><div class="pie" style="animation-delay: -32s">32%</div></center></br>
        		
        		
        		
        	</div>
        	
        	<div class="col-md-4 col-md-offset-1">
        		<center>Cours</br>
        		<div id="datepicker"></div>
        	</div>
        	</center>
        	<div class="col-md-3 col-md-offset-1">
        	<!--   List tuteurList = (List)session.getAttribute("listeClients");
int i; %>-->
        		<center>Tuteur</center>
				<table>
					<tr>
					    <th>Famille</th>
					    <th>Supprimer</th>
					</tr>
					<s:iterator value="tuteurList[0]" var="tuteur">
						
					<!--   for(int i=0; i< tuteurList.size(); i++) { %> -->
					    <tr>
					        <td><s:property value="top" />
					        </td>
					        <td></td>
					        <td>x</td>
					    </tr> 
					  
					</s:iterator>
					<logic:iterate name="tuteurList" id="tlid">
					<p>
					<bean:write name="tlid" property="num_groupe" />
					</p>
					</logic:iterate>
				</table>
        	</div>
        </div>
        
         
                  
        </div>
<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>