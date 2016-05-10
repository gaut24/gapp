<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Connexion</title>

 <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">@import url(Project.css);</style>

</head>
<body>
<div class="container">


<center><h1>Bienvenue sur GAPP</h1>

	<div id="formulaire">
		<s:form  action="login">
		
	
			<s:textfield name="personnes.login" id="identifiant"
				label="Identifiant" labelposition="left" size="20" maxlength="60">
			</s:textfield>
			
			
			<s:password name="personnes.password" id="password"
				label="Password" labelposition="left">
			</s:password>
			<s:submit value="Envoyer"></s:submit>
		
		</s:form>
		
		<p id="loginMissing" class="hidden alertMissing">Veuillez saisir votre identifiant</p>
		<p id="pswdMissing" class="hidden alertMissing">Veuillez saisir votre mot de passe</p>
    
	</div>
	
</center>


</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="Bootstrap/js/bootstrap.min.js"></script>
   <script src="Project.js">
</script>
</body>
</html>
