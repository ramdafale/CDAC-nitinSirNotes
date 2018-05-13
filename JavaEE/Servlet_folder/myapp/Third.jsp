<%@page import="java.util.*" errorPage="somepage" isErrorPage="false"%>

<%
List mylist=new ArrayList();
mylist.add("hello");
out.println(mylist);
%>