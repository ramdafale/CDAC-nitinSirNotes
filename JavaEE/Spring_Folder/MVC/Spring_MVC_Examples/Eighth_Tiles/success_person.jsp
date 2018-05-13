<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome to success jsp <br>

<h1>Person Details</h1>
	<table border="1">
	<tr>
		<th align="left">Person Name</th>
		<th align="left">Age</th>
	</tr>
		<tr>
			<td> ${person.name}</td>
			<td> ${person.age}</td>
		</tr>
	</table>
	<br><br><br>
	<a href="contact.do">Add More Person</a>
</body>
</html>




