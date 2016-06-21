<%@ include file="/imports/importsCss.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<title>Attribution Groupes</title>
</head>
<body>
	<div class="container">
		<%@ include file="/HeaderEtFooter/header.jsp"%>
		<%@ include file="/Menu/MenuResponsable.jsp"%>


		<div class=" accelev col-lg-10 col-sm-10 col-md-10">
			<h1>Attribution des groupes</h1>
			<h2>Attribution Elèves</h2>
		<div class="row">
			   <div class="col-md-12">
					<s:form theme="simple" action="assignEleveToGroupe">
				
				 		<div class="col-md-4 ">
							<sx:autocompleter size="1" list="personnes" listKey="nom" listValue="nom+', '+prenom" name="eleveNomToGroupe" showDownArrow="true" label="Nom de l'élève" autoComplete="true"></sx:autocompleter>
						</div>
					 	<div class="col-md-4 ">		
							<label>Nom du groupe : </label> <s:select name="eleveToGroupe" list="groupesList"  style="margin-top:4%;"></s:select>
					    </div>
					    <div class="col-md-4 ">		
							<s:submit value="Valider"></s:submit>
						</div>	
					</s:form>
				</div>
		</div>
		<h2>Groupes</h2>
		<table class="table responsive" style="background-color: #e9ebee;">
		        <tbody>
		        	<c:forEach var="groupes" items="${groupesList}">
		        	<tr>
		        	<th>${groupes}</th>
		        	</tr>
		 		<c:forEach var="personnesGroupesIn" items="${personnesGroupes}">
		            <c:if test="${personnesGroupesIn[2] == groupes}">
		            <tr>
		                <td>${personnesGroupesIn[0]} ${personnesGroupesIn[1]}</td>
		            </tr>
		            </c:if>
		            </c:forEach>
		            </c:forEach>
		        </tbody>
		    </table>
	</div>
		<%@ include file="/HeaderEtFooter/footer.jsp"%>
		<%@ include file="/imports/importsJs.jsp"%>