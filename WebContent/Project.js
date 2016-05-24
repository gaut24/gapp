/**
 * 
 */
$(document).ready(function(){
	
	 $("#formulaire").on("submit", function() {
	      if($("#identifiant").val().length == 0) {
	        $("#loginMissing").removeClass("hidden");
	        console.log("test");
	        return false;
	      }
	      if($("#password").val().length == 0 ){
		    $("#pswdMissing").removeClass("hidden");
		    return false;
	      }
	    });
	 
         $("#search").autocomplete({
         source : function(request, response) {
                 $.ajax({
                         url : "searchAction",
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
	
	
     var joursEvenement = [ [17, 05, 2016], [05, 05, 2016] ]  ;
     
     function creerCalendrier(date) {

         var evenement = false ;
       
         if (joursEvenement != null) {
             for (i = 0; i < joursEvenement.length; i++) {
                 if (date.getMonth() == joursEvenement[i][1] - 1 && date.getDate() == joursEvenement[i][0] && date.getFullYear() == joursEvenement[i][2]) {
                     evenement = true;
                 }
             }
         }  
         if (evenement) return [false, 'css_jour_evenement'] ;
         else return [true, ''] ;
     }
      
     $(document).ready(function(){
         $("#datepicker").datepicker({
     		altField: "#calendrier",
     		closeText: 'Fermer',
     		prevText: 'Précédent',
     		nextText: 'Suivant',
     		currentText: 'Aujourd\'hui',
     		monthNames: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
     		monthNamesShort: ['Janv.', 'Févr.', 'Mars', 'Avril', 'Mai', 'Juin', 'Juil.', 'Août', 'Sept.', 'Oct.', 'Nov.', 'Déc.'],
     		dayNames: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi'],
     		dayNamesShort: ['Dim.', 'Lun.', 'Mar.', 'Mer.', 'Jeu.', 'Ven.', 'Sam.'],
     		dayNamesMin: ['D', 'L', 'M', 'M', 'J', 'V', 'S'],
     		weekHeader: 'Sem.',
     		dateFormat: 'yy-mm-dd',
     		minDate: 0,
             beforeShowDay: creerCalendrier
         });    
     });
      /*
	
	$('.pie').forEach(function(pie) {
		  var p = parseFloat(pie.textContent);
		  pie.style.animationDelay = '-' + p + 's';
		});
	
*/


});



/* Fonction pour la barre de progression de l'export des notes */


/*$('#barre').progressbar({
    value : 0  // remplit 50% de la barre
    
    setTimeout(function(){
        alert('Ceci est une alerte se d�clenchant apr�s 5 secondes.');
    }, 5000);

    // la fonction ex�cutera l'alerte apr�s 5 secondes

function rafraichir(){
    var progress = $('#barre').progressbar('option', 'value'); // r�cup�ration de la valeur actuelle

    if(progress < 100){
        $('#barre').progressbar('option', 'value', progress + 1); // on incr�mente la valeur de 1 si elle est strictement inf�rieure � 100
	setTimeout(rafraichir, 50); // puis on relance la fonction
    }
}

var inputElement = $('#file');

inputElement.change(function(){
    var files = inputElement.attr('files');
    var file = files[0];
    var xhr = new XMLHttpRequest();

    $('#barre').progressbar({ value: 0 }); // on initialise le plugin
				
    xhr.open('POST', 'upload.php');

    xhr.onprogress = function(e){
	var loaded = Math.round((e.loaded / e.total) * 100); // on calcul le pourcentage de progression
	$('#barre').progressbar('value', loaded);
    }
    xhr.onload = function(){
	$('#barre').progressbar('value', 100);
    }
				
    var form = new FormData();
    form.append('file', inputElement.file);

    xhr.send(form);
});
});*/

$('#barre').progressbar();
$('#barre').progressbar({
    value : 50 // remplit 50% (la moiti�) de la barre
});