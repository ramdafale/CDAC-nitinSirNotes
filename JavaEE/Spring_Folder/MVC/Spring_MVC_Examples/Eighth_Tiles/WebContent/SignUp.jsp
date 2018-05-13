<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="js/jquery-1.8.2.js"></script>
<script src="js/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
<style>
	.error
	{
		color:red;
	}
</style>
</head>
<body>
<h1>Sign Up</h1> 
<form:form method="post" commandName="myuser">

Username:<form:errors path="username" cssClass="error"/><br>
<form:input path="username"/> <br><br>

Password:<form:errors path="password" cssClass="error"/><br><br>
<form:input path="password"/><br><br>

Email:<form:errors path="email" cssClass="error"/><br><br>
<form:input path="email"/><br><br>

First Name:<form:errors path="firstname" cssClass="error"/><br>
<form:input path="firstname"/> <br><br>

Middle Name:<form:errors path="middlename" cssClass="error"/><br><br>
<form:input path="middlename"/><br><br>

Last Name:<form:errors path="lastname" cssClass="error"/><br><br>
<form:input path="lastname"/><br><br>

Gender:<form:errors path="gender" cssClass="error"/><br>
<form:input path="gender"/> <br><br>

Age:<form:errors path="age" cssClass="error"/><br><br>
<form:input path="age"/><br><br>

<!-- Date of Birth:<form:errors path="dateofbirth" cssClass="error"/><br>
<form:input path="dateofbirth"/> <br><br> -->



Contact No:<form:errors path="contact" cssClass="error"/><br><br>
<form:input path="contact"/><br><br>

Flat No:<form:errors path="flatno" cssClass="error"/><br><br>
<form:input path="flatno"/><br><br>

Area:<form:errors path="area" cssClass="error"/><br>
<form:input path="area"/> <br><br>

State:<form:errors path="state" cssClass="error"/><br><br>
<form:input path="state"/><br><br>

City:<form:errors path="city" cssClass="error"/><br>
<form:input path="city"/> <br><br>

Pin Code:<form:errors path="pin" cssClass="error"/><br><br>
<form:input path="pin"/><br><br>

<input type=submit value="Sign Up"/>
</form:form>	
</body>
<script>
$(function() {
$( ".datepicker" ).datepicker({ changeMonth: true, changeYear: true, yearRange: '1990:2000' });
});
</script>
</html>
