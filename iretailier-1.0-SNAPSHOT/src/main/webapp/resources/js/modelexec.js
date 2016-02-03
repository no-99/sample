$('document').ready(function(){
	$('#exec').click(function() {
		var requestval = $('#request').val();
		$.ajax({
		    url : "exec",
		    type: "POST",
		    data : {id:$('#modelname').text(), 
		    	request:requestval
		    },
		    success: function(data, textStatus, jqXHR)
		    {
		    	$('#result').text(JSON.stringify(data, null, 2));
		    }
		 
		})
	});
});