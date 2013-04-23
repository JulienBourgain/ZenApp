if (typeof jQuery !== 'undefined') {
	
	//Display spinner on ajax request
	(function($) {
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
	})(jQuery);

	//Bind spinner to mouse
	$(document).bind('mousemove', function(e){
	        $('#spinner').css({
	           left:  e.pageX+5,
	           top:   e.pageY+5
	        });
	});
}

//Global AJAX Event
//*****************

//Error Handling (http://api.jquery.com/ajaxError/)
$(document).ajaxError(function(event, jqXHR, ajaxSettings, thrownError) {
	if (jqXHR.status === 404){
		alert('Page inaccessible');
	} else {
		alert('Erreur inattendue: ['+jqXHR.status+'] ' + thrownError);
	}
});