$(function(){
	$('#newUrl').click(function(){
        $('#myModal').modal('show');
    });
    
    $('#saveBtn').click(function(){
        var url = $('#url').val();
        
        $.post("/regist"
        , {'app':$('#url').val(),'url' : $('#url').val(), _csrf:$("#_csrf").val()}
        , function(result) {
            
            if(result.msg == "ok"){
                alert("Success Saved");
                document.location.href='/info'
            }else {
                alert("Fail");
                
            }
        });
        
    });
    
})


function deleteStalkUser(stalkId){
	$('#deleteId').val(stalkId);
	
	if(confirm("Are you sure?")){
		$("#delForm").submit();
	}
}


            