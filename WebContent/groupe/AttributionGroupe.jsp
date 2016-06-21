<%@ include file="/imports/importsCss.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<title>Attribution Groupes</title>
</head>
<body>
	<div class="container">
		<%@ include file="/HeaderEtFooter/header.jsp"%>
		<%@ include file="/Menu/MenuResponsable.jsp"%>
		<div class=" accelev col-lg-10 col-sm-10 col-md-10">
			<h1 class="text-center">Attribution des groupes</h1>
		    <div class="col-lg-6 col-sm-6 col-md-6">
		        <h2>Attribution Elèves</h2>
		        <s:form action="assignEleveToGroupe">
		            <sx:autocompleter size="1" list="personnes" listKey="nom" listValue="nom+', '+prenom" name="eleveNomToGroupe" showDownArrow="true" label="Nom de l'élève" autoComplete="true"></sx:autocompleter>
		            <s:select name="eleveToGroupe" list="groupesList" label="Nom du groupe" style="margin-top:6%;"></s:select>
		            <s:submit value="Valider"></s:submit>
		        </s:form>
		        <h2>Groupes</h2>
		        <table class="table responsive" style="background-color: #e9ebee;">
		            <tbody>
		                <c:forEach var="groupes" items="${groupesList}">
		                    <tr> <th>${groupes}</th> </tr>
		                    <c:forEach var="personnesGroupesIn" items="${personnesGroupes}">
		                    <c:if test="${personnesGroupesIn[2] == groupes}">
		                        <tr> <td>${personnesGroupesIn[0]} ${personnesGroupesIn[1]}</td> </tr>
		                    </c:if>
		                    </c:forEach>
		                </c:forEach>
		            </tbody>
		        </table>
		    </div>
		    <div class="col-lg-6 col-sm-6 col-md-6">
		        <h2>Attribution Tuteurs</h2>
		        <s:form action="assignTuteurToGroupe">
		            <sx:autocompleter size="1" list="tuteurs" listKey="nom" listValue="nom+', '+prenom" name="eleveNomToGroupe" showDownArrow="true" label="Nom du tuteur" autoComplete="true"></sx:autocompleter>
		            <s:select name="eleveToGroupe" list="groupesList" label="Nom du groupe" style="margin-top:6%;"></s:select>
		            <s:submit value="Valider"></s:submit>
		        </s:form>
		        <h2>Groupes</h2>
		        <table class="table responsive" style="background-color: #e9ebee;">
		            <tbody>
		                <c:forEach var="groupes" items="${groupesList}">
		                    <tr> <th>${groupes}</th> </tr>
		                    <c:forEach var="tuteursGroupesIn" items="${tuteursGroupes}">
		                    <c:if test="${tuteursGroupesIn[2] == groupes}">
		                        <tr> <td>${tuteursGroupesIn[0]} ${tuteursGroupesIn[1]}</td> </tr>
		                    </c:if>
		                    </c:forEach>
		                </c:forEach>
		            </tbody>
		        </table>
		    </div>
		</div>
		<%@ include file="/HeaderEtFooter/footer.jsp"%>
		<%@ include file="/imports/importsJs.jsp"%>