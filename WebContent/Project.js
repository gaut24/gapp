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