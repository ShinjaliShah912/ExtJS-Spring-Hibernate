<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>ExtJS - SpringMVC Integration</title>
	<link rel="stylesheet" type="text/css" 
    	href="http://cdn.sencha.com/ext/gpl/4.2.0/resources/css/ext-all.css">
  	<script type="text/javascript" 
    	src="http://cdn.sencha.com/ext/gpl/4.2.0/ext-all.js"></script>
     <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js">  </script>   
     
     
 <script>
	$('#submit').click(function (e) {
		alert('----save');
/*     e.preventDefault(); 
    var element = this;    
    $.ajax({
        url: "/SpringMVC-ExtJS-CRUD/api/book/save",
        type: "POST",
        dataType: "json",
        traditional: true,
        contentType: "application/json; charset=utf-8",
        success: function (data) {
            if (data.title == null) {
                alert("Error");
                $(element).closest("form").submit(); 
            } else {
                alert("Error occurs on the Database level!");
            }
        },
        error: function () {
            alert("An error has occured!!!");
        }
    }); */
});

</script>
     <style>
  		.book-add { background-image:url('resources/images/book_add.png');}
  		div#output {margin:100px;}
  	</style>
  	<script type="text/javascript" src="resources/script/books.js"></script>
</head>
<body>
	<div id="output"></div>
</body>
</html>