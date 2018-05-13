<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>Add/Remove dynamic rows in HTML table</TITLE>
<SCRIPT language="javascript">
	function addRow(tableID) {

		var table = document.getElementById(tableID);

		var rowCount = table.rows.length;
		var row = table.insertRow(rowCount);
		var counts=rowCount-1;
		var cell1 = row.insertCell(0);
		var houseNum = document.createElement("input");
		houseNum.type = "text";
		houseNum.name="passengers["+counts+"].name";
		cell1.appendChild(houseNum);

		var cell2 = row.insertCell(1);
		var city = document.createElement("input");
		city.type = "text";
		city.name="passengers["+counts+"].age";
		cell2.appendChild(city);

		var cell3 = row.insertCell(2);
		var country = document.createElement("input");
		country.type = "text";
		country.name="passengers["+counts+"].gender";
		cell3.appendChild(country);
	}
</SCRIPT>
</HEAD>
<BODY>
<b>
Tour Cost
<br>
	Adult - 5000/-
	<br>
	child( less than 12)- 2000/-
</b>	
   <form:form method="post" commandName="mycustomer">
Customer Name:<br>
<form:input path="name"/> <br><br>
Customer Address:<br>
<form:input path="address"/> <br><br>
  <br><br>
   Passengers :
    <TABLE id="passengerTable" width="350px" border="1">
    	<TR>
		<TD>Name</TD>
		<TD>Age</TD>
		<TD>Gender</TD>
	</TR>
	
	
	<TR>
            <TD><input type=text name="passengers[0].name"/></TD>
            <TD><input type=text name="passengers[0].age"/></TD>
            <TD><input type=text name="passengers[0].gender"/></TD>
	</TR>
	
    </TABLE>
<INPUT type="button" value="Add More" onclick="addRow('passengerTable')" />
<br>
<input type=submit value="Submit"/>
</form:form>
</BODY>
</HTML>