$(function () {
    $('#fileupload').fileupload({
        dataType: 'json',
        
        done: function (e, data) {
        	$("#uploaded-files tr:has(td)").remove();
            $.each(data.result, function (index, file) {
            	
            	var tr = 
            		$('<tr/>')
            		.append($('<td/>').text(file.uuid))
            		.append($('<td/>').text(file.modelName))
            		.append($('<td/>').text(file.modelDesc))
            		.append($('<td/>').text(file.effectDate))
            		.append($('<td/>').text(file.fileName))
            		.append($('<td/>').text(file.fileSize))
            		.append($('<td/>').text(file.fileType))
            		.append($('<td/>').html("<a href='../../rest/controller/get/"+file.uuid+"'>Click</a>"));
            	if(file.status == 'PUBLISHED') {
                	tr
                		.append($('<td><div class="publish" id="' + file.uuid + '" style="display:none">发布</div></td>'))
                		.append($('<td><div class="exec" id="' + file.modelName + '" style="display:block"><a target="_blank" href="request?id=' + file.modelName +'">调用</a></div></td>'))
                		.append($('<td><div class="view" id="' + file.modelName + '" style="display:block"><a target="_blank" href="http://localhost:9080/openscoring-webapp-1.2.0/model/' + file.modelName + '">查看</a></div></td>'));
                } else {
                	tr
            		.append($('<td><div class="publish" id="' + file.uuid + '" style="display:block">发布</div></td>'))
            		.append($('<td><div class="exec" id="' + file.modelName + '" style="display:none"><a target="_blank" href="#">调用</a></div></td>'))
            		.append($('<td><div class="view" id="' + file.modelName + '" style="display:none"><a target="_blank" href="#">查看</a></div></td>'));
                }
            	tr.find('.publish').click(publish);
            	
                $("#uploaded-files").append(tr)//end $("#uploaded-files").append()
                
            }); 
        },
        
        progressall: function (e, data) {
	        var progress = parseInt(data.loaded / data.total * 100, 10);
	        $('#progress .bar').css(
	            'width',
	            progress + '%'
	        );
   		},
   		
		dropZone: $('#dropzone')
    });
});