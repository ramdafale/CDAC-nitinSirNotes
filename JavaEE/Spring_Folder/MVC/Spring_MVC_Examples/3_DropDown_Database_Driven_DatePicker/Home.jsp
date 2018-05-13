<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="js/jquery-1.8.2.js"></script>
<script src="js/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
$(function() {
$( ".datepicker" ).datepicker({ changeMonth: true, changeYear: true, yearRange: '1990:2000' });
});
</script>
<style>
div.ui-datepicker
{
 margin-left:180px;
}
</style>
<head>
<title>AJAX in Servlet using JQuery and JSON</title>
<script>
$(document).ready(function() {

	$('#actors').change(function(event) {
        var actors = $("select#actors").val();
       // alert(actors);
        var select = $('#movie');
        $.ajax({
					type : "POST",
					url : "/DropDown/second.do?actorName="+actors+"",
					success : function(data) {
								console.log("SUCCESS: ", data);
								$('#movie option').remove();
								$('#movie').append("<option value='Select Value'>Select Value</option>");
								for(var i=0;i<data.length;i++)
								{
			    		        	$('<option>').val(data[i]).text(data[i]).appendTo(select);
			
								};
        					}
				});  
			});
	$('#movie').change(function(event) {
        var movie = $("select#movie").val();
        var selectrd = $('#song');
        $.ajax({
					type : "POST",
					url : "/DropDown/third.do?movieName="+movie+"",
					success : function(data) {
								console.log("SUCCESS: ", data);
								$('#song option').remove();
								$('#song').append("<option value='Select Value'>Select Value</option>");
								for(var i=0;i<data.length;i++)
								{
			    		        	$('<option>').val(data[i]).text(data[i]).appendTo(selectrd);
			
								};
        					}
				});  
			});
	
	$('#song').change(function(event) {
        var song = $("select#song").val();
       // alert(song);
        var selectrd = $('#song');
        $.ajax({
					type : "POST",
					url : "/DropDown/fourth.do?songName="+song+"",
				});  
			});
}); 
</script>
</head>
<body>
<form:form id="form" method="post" commandName="mvtran">
        Select Actor:
        
     
        <select id="actors">
		<option>Select Value</option>
        <c:forEach items="${mylist}" var="actor">
		<option value="${actor}">${actor}</option>
    	</c:forEach>	
         </select>
        Select Movie:
        <select id="movie">
                <option>Select Value</option>
        </select>
        Select Song:
        <select id="song">
                <option>Select Value</option>
        </select>
        
       <br><br>
DOB 
<form:input path="dob" cssClass="datepicker"/><br><br>
<input type=submit name="final" value="final"> 
</form:form>
</body>
</html>