/**
 * 
 */
$(document).ready(function(){
	
	 $("form").on("submit", function() {
	      if($("#identifiant").val().length == 0) {
	        $("div.form-group1").addClass("has-error");
	        $(".form-group1 div.alert").show("slow").delay(4000).hide("slow");
	        return false;
	      }
	      if($("#password").val().length == 0 ){
	    	$("div.form-group2").addClass("has-error");
		    $(" .form-group2 div.alert").show("slow").delay(4000).hide("slow");
		    return false;
	      }
	    });
	
	 
	 var SelectedDates = {};
	 SelectedDates[new Date('2016-05-05')] = new Date('2016-05-05');
	 //SelectedDates[new Date('05-06-2016')] = new Date('05-06-2016');
	 //SelectedDates[new Date('06-07-2016')] = new Date('06-07-2016'); 
	
	$("#calendrier").datepicker({
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
	    beforeShowDay: function(date) {
	           var Highlight = SelectedDates[date];
	            if (Highlight) {
	            	return [true, "Highlighted", Highlight];
	            } else {
	                return [true, '', ''];
	            }

	        }
		
	});
	
	
	$('.pie').forEach(function(pie) {
		  var p = parseFloat(pie.textContent);
		  pie.style.animationDelay = '-' + p + 's';
		});
	



});