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

	$('#states').change(function(event) {
		//alert("hello");
        var mystate = $("select#states").val();
        alert(mystate);
        var select = $('#city');
        $.ajax({
					type : "POST",
					url : "/Fleet/CityList.do?state="+mystate+"",
					success : function(data) {
								console.log("SUCCESS: ", data);
								$('#city option').remove();
								$('#city').append("<option value='Select Value'>Select Value</option>");
								for(var i=0;i<data.length;i++)
								{
			    		        	$('<option>').val(data[i]).text(data[i]).appendTo(select);
			
								};
        					}
				});  
			});
	$('#city').change(function(event) {
        var cityid = $("select#city").val();
        var select = $('#loc');
        $.ajax({
					type : "POST",
					url : "/Fleet/LocList.do?cityid="+cityid+"",
					success : function(data) {
								console.log("SUCCESS: ", data);
								$('#loc option').remove();
								$('#loc').append("<option value='Select Value'>Select Value</option>");
								for(var i=0;i<data.length;i++)
								{
			    		        	$('<option>').val(data[i]).text(data[i]).appendTo(select);
			
								};
        					}
				});  
			});
	
	$('#loc').change(function(event) {
        var loc = $("select#loc").val();
       // alert(song);
        var select = $('#loc');
        $.ajax({
					type : "POST",
					url : "/Fleet/final.do?locname="+loc+"",
				});  
			});
}); 
</script>
</head>
<body>
<form:form id="form" method="post" commandName="city">
        Select States:
        
     
        <select id="states">
		<option>Select Value</option>
        <c:forEach items="${stateList}" var="actor">
		<option value="${actor.stateid}">${actor.statename}</option>
    	</c:forEach>	
         </select>
        Select City:
        <select id="city">
                <option>Select Value</option>
        </select>
        Select Location:
        <select id="loc">
                <option>Select Value</option>
        </select>
        
       <br><br>


<input type=submit name="final" value="final"> 
</form:form>
</body>
</html>