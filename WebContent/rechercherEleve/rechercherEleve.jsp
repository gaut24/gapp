 <%@ include file="/imports/importsCss.jsp" %>
<title>Rechercher un élève</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
   <script src="Project.js"></script>
   <script>
$(document).ready(function(){
         $("#search").autocomplete({
         source : function(request, response) {
        	 console.log("test");
                 $.ajax({
                         url : "SearchController",
                         type : "GET",
                         data : {
                                 term : request.term
                         },
                         dataType : "json",
                         success : function(jsonResponse) {
                                 response(jsonResponse.list);
                         }
                 });
                 }
         });
         });
</script>
</head>
<body>
<div class="container">
<%@ include file="/HeaderEtFooter/header.jsp" %>
<%@ include file="/Menu/menu.jsp" %>

<div class=" accelev col-lg-10 col-sm-10 col-md-10">
        
         <h1>Rechercher un élève</h1>
         
         <div class="search-container">
                <div class="ui-widget">
                        <s:textfield id="search" name="search" label="Elève"/>
                </div>
        </div>
       
</div>

<%@ include file="/HeaderEtFooter/footer.jsp" %>
 <%@ include file="/imports/importsJs.jsp" %>
 