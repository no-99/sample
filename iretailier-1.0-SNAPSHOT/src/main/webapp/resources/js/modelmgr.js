var publish = function() {
	var publish = $(this);
	$.ajax({
	    url : "publish",
	    type: "POST",
	    data : {id:publish.attr('id')},
	    success: function(data, textStatus, jqXHR)
	    {
	    	publish.hide();
	    	var view = publish.parent().parent().find('.view');
	    	view.find('a').attr('href', 'http://localhost:9080/openscoring-webapp-1.2.0/model/' + view.attr('id'));
	    	view.show();
	    	
	    	var exec = publish.parent().parent().find('.exec');
	    	exec.find('a').attr('href', 'request?id=' + view.attr('id'));
	    	exec.show();
	    	
	    }
	 
	    })
	}
$('document').ready(function(){
	$('.publish').click(publish);
});